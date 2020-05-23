package typings.wordpressBlockEditor.anon

import typings.wordpressBlockEditor.mod.EditorColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/block-editor.@wordpress/block-editor/components/color-palette/with-color-context.withColorContext.Props> */
trait PartialProps extends js.Object {
  var colors: js.UndefOr[js.Array[EditorColor]] = js.undefined
  var disableCustomColors: js.UndefOr[Boolean] = js.undefined
  var hasColorsToChoose: js.UndefOr[Boolean] = js.undefined
}

object PartialProps {
  @scala.inline
  def apply(
    colors: js.Array[EditorColor] = null,
    disableCustomColors: js.UndefOr[Boolean] = js.undefined,
    hasColorsToChoose: js.UndefOr[Boolean] = js.undefined
  ): PartialProps = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCustomColors)) __obj.updateDynamic("disableCustomColors")(disableCustomColors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasColorsToChoose)) __obj.updateDynamic("hasColorsToChoose")(hasColorsToChoose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialProps]
  }
}

