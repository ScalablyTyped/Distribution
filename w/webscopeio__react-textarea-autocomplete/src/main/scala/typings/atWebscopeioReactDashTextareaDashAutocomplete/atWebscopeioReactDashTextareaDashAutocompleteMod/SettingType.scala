package typings.atWebscopeioReactDashTextareaDashAutocomplete.atWebscopeioReactDashTextareaDashAutocompleteMod

import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SettingType[TItem] extends js.Object {
  /**
    * Show autocomplete only if it's preceded by whitespace. Cannot be combined with allowWhitespace.
    * @default false
    */
  var afterWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
    * Set this to true if you want to provide autocomplete for words (tokens) containing whitespace.
    * @default false
    */
  var allowWhitespace: js.UndefOr[Boolean] = js.undefined
  /**
    * The component for rendering the item in suggestion list. It has selected and entity props provided by React Textarea Autocomplete.
    */
  var component: SFC[ItemComponentProps[TItem]]
  /**
    * Called after each keystroke to get data what the suggestion list should display (array or promise resolving array).
    */
  var dataProvider: DataProviderType[TItem]
  /**
    * (Optional for string based item. If the item is an object this method is required) This function defines text
    * which will be placed into textarea after the user makes a selection.
    *
    * You can also specify the behavior of caret if you return object {text: "item", caretPosition: "start"} the caret
    * will be before the word once the user confirms his selection. Other possible value are "next", "end" and number,
    * which is absolute number in contex of textarea (0 is equal position before the first char). Defaults to "next"
    * which is space after the injected word.
    *
    * The default behavior for string based item is a string: <TRIGGER><ITEM><TRIGGER>). This method should always
    * return a unique string, otherwise, you have to use object notation and specify your own key or return object
    * from dataProvider with key property.
    */
  var output: js.UndefOr[
    js.Function2[/* item */ TItem, /* trigger */ js.UndefOr[String], TextToReplaceType | String]
  ] = js.undefined
}

object SettingType {
  @scala.inline
  def apply[TItem](
    component: SFC[ItemComponentProps[TItem]],
    dataProvider: DataProviderType[TItem],
    afterWhitespace: js.UndefOr[Boolean] = js.undefined,
    allowWhitespace: js.UndefOr[Boolean] = js.undefined,
    output: (/* item */ TItem, /* trigger */ js.UndefOr[String]) => TextToReplaceType | String = null
  ): SettingType[TItem] = {
    val __obj = js.Dynamic.literal(component = component, dataProvider = dataProvider)
    if (!js.isUndefined(afterWhitespace)) __obj.updateDynamic("afterWhitespace")(afterWhitespace)
    if (!js.isUndefined(allowWhitespace)) __obj.updateDynamic("allowWhitespace")(allowWhitespace)
    if (output != null) __obj.updateDynamic("output")(js.Any.fromFunction2(output))
    __obj.asInstanceOf[SettingType[TItem]]
  }
}

