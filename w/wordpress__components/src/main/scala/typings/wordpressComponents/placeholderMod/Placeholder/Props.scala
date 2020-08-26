package typings.wordpressComponents.placeholderMod.Placeholder

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.wordpressComponents.iconMod.Icon.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  /**
    * If provided, renders an icon next to the label.
    */
  var icon: js.UndefOr[IconType[js.Object]] = js.native
  /**
    * Renders instruction text below label.
    */
  var instructions: js.UndefOr[String] = js.native
  /**
    * Changes placeholder children layout from `flex-row` to
    * `flex-column`.
    */
  var isColumnLayout: js.UndefOr[Boolean] = js.native
  /**
    * Optionally pass in `noticeUI` obtained from `withNotices` HOC.
    */
  var notices: js.UndefOr[Element] = js.native
  /**
    * Used internally to display a preview.
    * See {@link https://github.com/WordPress/gutenberg/tree/master/packages/block-editor/src/components/media-placeholder | MediaPlaceholder}
    */
  var preview: js.UndefOr[Element] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setIcon(value: IconType[js.Object]): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setInstructions(value: String): Self = this.set("instructions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstructions: Self = this.set("instructions", js.undefined)
    @scala.inline
    def setIsColumnLayout(value: Boolean): Self = this.set("isColumnLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsColumnLayout: Self = this.set("isColumnLayout", js.undefined)
    @scala.inline
    def setNotices(value: Element): Self = this.set("notices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotices: Self = this.set("notices", js.undefined)
    @scala.inline
    def setPreview(value: Element): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
  }
  
}

