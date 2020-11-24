package typings.webscopeioReactTextareaAutocomplete.mod

import typings.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingType[TItem] extends js.Object {
  
  /**
    * Show autocomplete only if it's preceded by whitespace. Cannot be combined with allowWhitespace.
    * @default false
    */
  var afterWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * Set this to true if you want to provide autocomplete for words (tokens) containing whitespace.
    * @default false
    */
  var allowWhitespace: js.UndefOr[Boolean] = js.native
  
  /**
    * The component for rendering the item in suggestion list. It has selected and entity props provided by React Textarea Autocomplete.
    */
  var component: SFC[ItemComponentProps[TItem]] = js.native
  
  /**
    * Called after each keystroke to get data what the suggestion list should display (array or promise resolving array).
    */
  var dataProvider: DataProviderType[TItem] = js.native
  
  /**
    * (Optional for string based item. If the item is an object this method is required) This function defines text
    * which will be placed into textarea after the user makes a selection.
    *
    * You can also specify the behavior of caret if you return object {text: "item", caretPosition: "start"} the caret
    * will be before the word once the user confirms their selection. Other possible value are "next", "end" and number,
    * which is absolute number in contex of textarea (0 is equal position before the first char). Defaults to "next"
    * which is space after the injected word.
    *
    * The default behavior for string based item is a string: <TRIGGER><ITEM><TRIGGER>). This method should always
    * return a unique string, otherwise, you have to use object notation and specify your own key or return object
    * from dataProvider with key property.
    */
  var output: js.UndefOr[
    js.Function2[/* item */ TItem, /* trigger */ js.UndefOr[String], TextToReplaceType | String]
  ] = js.native
}
object SettingType {
  
  @scala.inline
  def apply[TItem](
    component: SFC[ItemComponentProps[TItem]],
    dataProvider: /* token */ String => js.Promise[js.Array[TItem]] | js.Array[TItem]
  ): SettingType[TItem] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dataProvider = js.Any.fromFunction1(dataProvider))
    __obj.asInstanceOf[SettingType[TItem]]
  }
  
  @scala.inline
  implicit class SettingTypeOps[Self <: SettingType[_], TItem] (val x: Self with SettingType[TItem]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponent(value: SFC[ItemComponentProps[TItem]]): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataProvider(value: /* token */ String => js.Promise[js.Array[TItem]] | js.Array[TItem]): Self = this.set("dataProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAfterWhitespace(value: Boolean): Self = this.set("afterWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterWhitespace: Self = this.set("afterWhitespace", js.undefined)
    
    @scala.inline
    def setAllowWhitespace(value: Boolean): Self = this.set("allowWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowWhitespace: Self = this.set("allowWhitespace", js.undefined)
    
    @scala.inline
    def setOutput(value: (/* item */ TItem, /* trigger */ js.UndefOr[String]) => TextToReplaceType | String): Self = this.set("output", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
}
