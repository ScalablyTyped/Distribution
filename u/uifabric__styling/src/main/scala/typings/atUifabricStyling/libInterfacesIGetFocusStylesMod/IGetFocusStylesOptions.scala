package typings.atUifabricStyling.libInterfacesIGetFocusStylesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IRawStyle
import typings.atUifabricStyling.atUifabricStylingStrings.absolute
import typings.atUifabricStyling.atUifabricStylingStrings.relative
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGetFocusStylesOptions extends js.Object {
  /**
    * Color of the border.
    * @defaultvalue theme.palette.white
    */
  var borderColor: js.UndefOr[String] = js.undefined
  /**
    * Style for high contrast mode.
    */
  var highContrastStyle: js.UndefOr[IRawStyle] = js.undefined
  /**
    * The number of pixels to inset the border.
    * @defaultvalue 0
    */
  var inset: js.UndefOr[Double] = js.undefined
  /**
    * If the styles should apply on `:focus` pseudo element.
    * @defaultvalue true
    */
  var isFocusedOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Color of the outline.
    * @defaultvalue theme.palette.neutralSecondary
    */
  var outlineColor: js.UndefOr[String] = js.undefined
  /**
    * The positioning applied to the container.
    * Must be 'relative' or 'absolute' so that the focus border can live around it.
    * @defaultvalue 'relative'
    */
  var position: js.UndefOr[relative | absolute] = js.undefined
  /**
    * The width of the border in pixels.
    * @defaultvalue 1
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IGetFocusStylesOptions {
  @scala.inline
  def apply(
    borderColor: String = null,
    highContrastStyle: IRawStyle = null,
    inset: Int | Double = null,
    isFocusedOnly: js.UndefOr[Boolean] = js.undefined,
    outlineColor: String = null,
    position: relative | absolute = null,
    width: Int | Double = null
  ): IGetFocusStylesOptions = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor)
    if (highContrastStyle != null) __obj.updateDynamic("highContrastStyle")(highContrastStyle)
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (!js.isUndefined(isFocusedOnly)) __obj.updateDynamic("isFocusedOnly")(isFocusedOnly)
    if (outlineColor != null) __obj.updateDynamic("outlineColor")(outlineColor)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGetFocusStylesOptions]
  }
}

