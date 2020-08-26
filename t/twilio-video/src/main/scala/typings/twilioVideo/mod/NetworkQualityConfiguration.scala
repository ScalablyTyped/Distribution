package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkQualityConfiguration extends js.Object {
  var local: js.UndefOr[NetworkQualityVerbosity] = js.native
  var remote: js.UndefOr[NetworkQualityVerbosity] = js.native
}

object NetworkQualityConfiguration {
  @scala.inline
  def apply(): NetworkQualityConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkQualityConfiguration]
  }
  @scala.inline
  implicit class NetworkQualityConfigurationOps[Self <: NetworkQualityConfiguration] (val x: Self) extends AnyVal {
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
    def setLocal(value: NetworkQualityVerbosity): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setRemote(value: NetworkQualityVerbosity): Self = this.set("remote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemote: Self = this.set("remote", js.undefined)
  }
  
}

