package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Icon extends js.Object {
  /**
    * (ID of a file upload) An icon for the account. Must be square and at
    * least 128px x 128px.
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * (ID of a file upload) A logo for the account that will be used in
    * Checkout instead of the icon and without the account’s name next to it
    * if provided. Must be at least 128px x 128px. This can be unset by
    * updating the value to null and then saving.
    */
  var logo: js.UndefOr[String] = js.undefined
  /**
    * A CSS hex color value representing the primary branding color for this account.
    */
  var primary_color: js.UndefOr[String] = js.undefined
}

object Anon_Icon {
  @scala.inline
  def apply(icon: String = null, logo: String = null, primary_color: String = null): Anon_Icon = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (logo != null) __obj.updateDynamic("logo")(logo)
    if (primary_color != null) __obj.updateDynamic("primary_color")(primary_color)
    __obj.asInstanceOf[Anon_Icon]
  }
}

