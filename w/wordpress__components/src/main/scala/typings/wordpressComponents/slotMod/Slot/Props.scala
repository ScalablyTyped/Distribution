package typings.wordpressComponents.slotMod.Slot

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Changes event bubbling behavior.
    *
    * If `false`, events will bubble to their parents on the DOM
    * hierarchy (native event bubbling).
    *
    * If `true`, events will bubble to their virtual parent in the React
    * elements hierarchy.
    *
    * @defaultValue false
    */
  var bubblesVirtually: js.UndefOr[Boolean] = js.undefined
  /**
    * Optional render function which takes a reference to the slot's
    * `Fill`s as a param. It allows to perform additional processing and
    * wrap `fills` conditionally.
    */
  var children: js.UndefOr[js.Function1[/* fills */ js.Array[js.Array[Element]], Element | Null]] = js.undefined
  /**
    * Props to pass into the first child of the <Fill /> component.
    */
  var fillProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Both `Slot` and `Fill` accept a `name` string prop, where a `Slot`
    * with a given `name` will render the `children` of any associated
    * `Fill`s.
    */
  var name: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    bubblesVirtually: js.UndefOr[Boolean] = js.undefined,
    children: /* fills */ js.Array[js.Array[Element]] => Element | Null = null,
    fillProps: StringDictionary[js.Any] = null,
    name: String = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubblesVirtually)) __obj.updateDynamic("bubblesVirtually")(bubblesVirtually.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (fillProps != null) __obj.updateDynamic("fillProps")(fillProps.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

