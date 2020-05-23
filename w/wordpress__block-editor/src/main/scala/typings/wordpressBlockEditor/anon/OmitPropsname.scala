package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<@wordpress/components.@wordpress/components.Slot.Props, 'name'> */
trait OmitPropsname extends js.Object {
  var bubblesVirtually: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[js.Function1[/* fills */ js.Array[js.Array[Element]], Element | Null]] = js.undefined
  var fillProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object OmitPropsname {
  @scala.inline
  def apply(
    bubblesVirtually: js.UndefOr[Boolean] = js.undefined,
    children: /* fills */ js.Array[js.Array[Element]] => Element | Null = null,
    fillProps: StringDictionary[js.Any] = null
  ): OmitPropsname = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bubblesVirtually)) __obj.updateDynamic("bubblesVirtually")(bubblesVirtually.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (fillProps != null) __obj.updateDynamic("fillProps")(fillProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitPropsname]
  }
}

