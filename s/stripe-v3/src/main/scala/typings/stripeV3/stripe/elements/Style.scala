package typings.stripeV3.stripe.elements

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Style extends StyleOptions {
  @JSName(":-webkit-autofill")
  var `Colon-webkit-autofill`: js.UndefOr[StyleOptions] = js.undefined
  @JSName("::-ms-clear")
  var `ColonColon-ms-clear`: js.UndefOr[StyleOptions] = js.undefined
  @JSName("::placeholder")
  var ColonColonplaceholder: js.UndefOr[StyleOptions] = js.undefined
  @JSName("::selection")
  var ColonColonselection: js.UndefOr[StyleOptions] = js.undefined
  @JSName(":disabled")
  var Colondisabled: js.UndefOr[StyleOptions] = js.undefined
  @JSName(":focus")
  var Colonfocus: js.UndefOr[StyleOptions] = js.undefined
  @JSName(":hover")
  var Colonhover: js.UndefOr[StyleOptions] = js.undefined
}

object Style {
  @scala.inline
  def apply(
    `Colon-webkit-autofill`: StyleOptions = null,
    `ColonColon-ms-clear`: StyleOptions = null,
    ColonColonplaceholder: StyleOptions = null,
    ColonColonselection: StyleOptions = null,
    Colondisabled: StyleOptions = null,
    Colonfocus: StyleOptions = null,
    Colonhover: StyleOptions = null,
    color: String = null,
    fontFamily: String = null,
    fontSize: String = null,
    fontSmoothing: String = null,
    fontStyle: String = null,
    fontVariant: String = null,
    fontWeight: String | Double = null,
    iconColor: String = null,
    letterSpacing: String = null,
    lineHeight: String = null,
    textAlign: String = null,
    textDecoration: String = null,
    textShadow: String = null,
    textTransform: String = null
  ): Style = {
    val __obj = js.Dynamic.literal()
    if (`Colon-webkit-autofill` != null) __obj.updateDynamic(":-webkit-autofill")(`Colon-webkit-autofill`.asInstanceOf[js.Any])
    if (`ColonColon-ms-clear` != null) __obj.updateDynamic("::-ms-clear")(`ColonColon-ms-clear`.asInstanceOf[js.Any])
    if (ColonColonplaceholder != null) __obj.updateDynamic("::placeholder")(ColonColonplaceholder.asInstanceOf[js.Any])
    if (ColonColonselection != null) __obj.updateDynamic("::selection")(ColonColonselection.asInstanceOf[js.Any])
    if (Colondisabled != null) __obj.updateDynamic(":disabled")(Colondisabled.asInstanceOf[js.Any])
    if (Colonfocus != null) __obj.updateDynamic(":focus")(Colonfocus.asInstanceOf[js.Any])
    if (Colonhover != null) __obj.updateDynamic(":hover")(Colonhover.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontSmoothing != null) __obj.updateDynamic("fontSmoothing")(fontSmoothing.asInstanceOf[js.Any])
    if (fontStyle != null) __obj.updateDynamic("fontStyle")(fontStyle.asInstanceOf[js.Any])
    if (fontVariant != null) __obj.updateDynamic("fontVariant")(fontVariant.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    if (iconColor != null) __obj.updateDynamic("iconColor")(iconColor.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (lineHeight != null) __obj.updateDynamic("lineHeight")(lineHeight.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (textDecoration != null) __obj.updateDynamic("textDecoration")(textDecoration.asInstanceOf[js.Any])
    if (textShadow != null) __obj.updateDynamic("textShadow")(textShadow.asInstanceOf[js.Any])
    if (textTransform != null) __obj.updateDynamic("textTransform")(textTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
}

