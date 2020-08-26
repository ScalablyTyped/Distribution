package typings.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileRegion extends js.Object {
  /**
    * The two-letter code defined in ISO 3166 for the country/region.
    */
  var code: String = js.native
  /**
    * Localized country/region name
    */
  var name: String = js.native
}

object ProfileRegion {
  @scala.inline
  def apply(code: String, name: String): ProfileRegion = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileRegion]
  }
  @scala.inline
  implicit class ProfileRegionOps[Self <: ProfileRegion] (val x: Self) extends AnyVal {
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
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

