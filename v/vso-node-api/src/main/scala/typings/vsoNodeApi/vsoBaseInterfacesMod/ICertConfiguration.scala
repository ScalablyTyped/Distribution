package typings.vsoNodeApi.vsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICertConfiguration extends js.Object {
  var caFile: js.UndefOr[String] = js.native
  var certFile: js.UndefOr[String] = js.native
  var keyFile: js.UndefOr[String] = js.native
  var passphrase: js.UndefOr[String] = js.native
}

object ICertConfiguration {
  @scala.inline
  def apply(): ICertConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICertConfiguration]
  }
  @scala.inline
  implicit class ICertConfigurationOps[Self <: ICertConfiguration] (val x: Self) extends AnyVal {
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
    def setCaFile(value: String): Self = this.set("caFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaFile: Self = this.set("caFile", js.undefined)
    @scala.inline
    def setCertFile(value: String): Self = this.set("certFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertFile: Self = this.set("certFile", js.undefined)
    @scala.inline
    def setKeyFile(value: String): Self = this.set("keyFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyFile: Self = this.set("keyFile", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
  }
  
}

