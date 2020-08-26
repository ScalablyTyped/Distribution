package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon extends js.Object {
  /**
    * (ID of a file) An icon for the account. Must be square and at
    * least 128px x 128px.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * (ID of a file) A logo for the account that will be used in
    * Checkout instead of the icon and without the account’s name next to it
    * if provided. Must be at least 128px x 128px. This can be unset by
    * updating the value to null and then saving.
    */
  var logo: js.UndefOr[String] = js.native
  /**
    * A CSS hex color value representing the primary branding color for this account.
    */
  var primary_color: js.UndefOr[String] = js.native
}

object Icon {
  @scala.inline
  def apply(): Icon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
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
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogo: Self = this.set("logo", js.undefined)
    @scala.inline
    def setPrimary_color(value: String): Self = this.set("primary_color", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimary_color: Self = this.set("primary_color", js.undefined)
  }
  
}

