package typings.stripejs.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSClearAttributes extends StyleAttributes {
  var display: js.UndefOr[String] = js.undefined
}

object MSClearAttributes {
  @scala.inline
  def apply(
    `Colon-webkit-autofill`: StyleAttributes = null,
    `ColonColon-ms-clear`: MSClearAttributes = null,
    ColonColonplaceholder: StyleAttributes = null,
    ColonColonselection: StyleAttributes = null,
    Colondisabled: StyleAttributes = null,
    Colonfocus: StyleAttributes = null,
    Colonhover: StyleAttributes = null,
    color: String = null,
    display: String = null,
    fontFamily: String = null,
    fontSize: String = null,
    fontSmoothing: String = null,
    fontStyle: String = null,
    fontVariant: js.Any = null,
    iconColor: String = null,
    letterSpacing: String = null,
    lineHeight: String = null,
    padding: String = null,
    textAlign: String = null,
    textDecoration: String = null,
    textShadow: String = null,
    textTransform: String = null
  ): MSClearAttributes = {
    val __obj = js.Dynamic.literal()
    if (`Colon-webkit-autofill` != null) __obj.updateDynamic(":-webkit-autofill")(`Colon-webkit-autofill`.asInstanceOf[js.Any])
    if (`ColonColon-ms-clear` != null) __obj.updateDynamic("::-ms-clear")(`ColonColon-ms-clear`.asInstanceOf[js.Any])
    if (ColonColonplaceholder != null) __obj.updateDynamic("::placeholder")(ColonColonplaceholder.asInstanceOf[js.Any])
    if (ColonColonselection != null) __obj.updateDynamic("::selection")(ColonColonselection.asInstanceOf[js.Any])
    if (Colondisabled != null) __obj.updateDynamic(":disabled")(Colondisabled.asInstanceOf[js.Any])
    if (Colonfocus != null) __obj.updateDynamic(":focus")(Colonfocus.asInstanceOf[js.Any])
    if (Colonhover != null) __obj.updateDynamic(":hover")(Colonhover.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSmoothing != null) __obj.updateDynamic("fontSmoothing")(fontSmoothing.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSClearAttributes]
  }
}

