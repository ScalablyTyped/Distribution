package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResetDeviceParams extends CommonParams {
  var label: js.UndefOr[String] = js.native
  var noBackup: js.UndefOr[Boolean] = js.native
  var passphraseProtection: js.UndefOr[Boolean] = js.native
  var pinProtection: js.UndefOr[Boolean] = js.native
  var skipBackup: js.UndefOr[Boolean] = js.native
  var strength: js.UndefOr[Double] = js.native
  var u2fCounter: js.UndefOr[Double] = js.native
}

object ResetDeviceParams {
  @scala.inline
  def apply(): ResetDeviceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDeviceParams]
  }
  @scala.inline
  implicit class ResetDeviceParamsOps[Self <: ResetDeviceParams] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setNoBackup(value: Boolean): Self = this.set("noBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoBackup: Self = this.set("noBackup", js.undefined)
    @scala.inline
    def setPassphraseProtection(value: Boolean): Self = this.set("passphraseProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphraseProtection: Self = this.set("passphraseProtection", js.undefined)
    @scala.inline
    def setPinProtection(value: Boolean): Self = this.set("pinProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinProtection: Self = this.set("pinProtection", js.undefined)
    @scala.inline
    def setSkipBackup(value: Boolean): Self = this.set("skipBackup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipBackup: Self = this.set("skipBackup", js.undefined)
    @scala.inline
    def setStrength(value: Double): Self = this.set("strength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrength: Self = this.set("strength", js.undefined)
    @scala.inline
    def setU2fCounter(value: Double): Self = this.set("u2fCounter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteU2fCounter: Self = this.set("u2fCounter", js.undefined)
  }
  
}

