package typings.wordpressComponents.placeholderMod.Placeholder

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.wordpressComponents.iconMod.Icon.IconType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  /**
    * If provided, renders an icon next to the label.
    */
  var icon: js.UndefOr[IconType[js.Object]] = js.undefined
  /**
    * Renders instruction text below label.
    */
  var instructions: js.UndefOr[String] = js.undefined
  /**
    * Changes placeholder children layout from `flex-row` to
    * `flex-column`.
    */
  var isColumnLayout: js.UndefOr[Boolean] = js.undefined
  /**
    * Optionally pass in `noticeUI` obtained from `withNotices` HOC.
    */
  var notices: js.UndefOr[Element] = js.undefined
  /**
    * Used internally to display a preview.
    * See {@link https://github.com/WordPress/gutenberg/tree/master/packages/block-editor/src/components/media-placeholder | MediaPlaceholder}
    */
  var preview: js.UndefOr[Element] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    icon: IconType[js.Object] = null,
    instructions: String = null,
    isColumnLayout: js.UndefOr[Boolean] = js.undefined,
    notices: Element = null,
    preview: Element = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (instructions != null) __obj.updateDynamic("instructions")(instructions.asInstanceOf[js.Any])
    if (!js.isUndefined(isColumnLayout)) __obj.updateDynamic("isColumnLayout")(isColumnLayout.get.asInstanceOf[js.Any])
    if (notices != null) __obj.updateDynamic("notices")(notices.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

