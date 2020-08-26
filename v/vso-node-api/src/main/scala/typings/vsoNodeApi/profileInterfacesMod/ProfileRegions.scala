package typings.vsoNodeApi.profileInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileRegions extends js.Object {
  /**
    * List of country/region code with contact consent requirement type of notice
    */
  var noticeContactConsentRequirementRegions: js.Array[String] = js.native
  /**
    * List of country/region code with contact consent requirement type of opt-out
    */
  var optOutContactConsentRequirementRegions: js.Array[String] = js.native
  /**
    * List of country/regions
    */
  var regions: js.Array[ProfileRegion] = js.native
}

object ProfileRegions {
  @scala.inline
  def apply(
    noticeContactConsentRequirementRegions: js.Array[String],
    optOutContactConsentRequirementRegions: js.Array[String],
    regions: js.Array[ProfileRegion]
  ): ProfileRegions = {
    val __obj = js.Dynamic.literal(noticeContactConsentRequirementRegions = noticeContactConsentRequirementRegions.asInstanceOf[js.Any], optOutContactConsentRequirementRegions = optOutContactConsentRequirementRegions.asInstanceOf[js.Any], regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileRegions]
  }
  @scala.inline
  implicit class ProfileRegionsOps[Self <: ProfileRegions] (val x: Self) extends AnyVal {
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
    def setNoticeContactConsentRequirementRegionsVarargs(value: String*): Self = this.set("noticeContactConsentRequirementRegions", js.Array(value :_*))
    @scala.inline
    def setNoticeContactConsentRequirementRegions(value: js.Array[String]): Self = this.set("noticeContactConsentRequirementRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptOutContactConsentRequirementRegionsVarargs(value: String*): Self = this.set("optOutContactConsentRequirementRegions", js.Array(value :_*))
    @scala.inline
    def setOptOutContactConsentRequirementRegions(value: js.Array[String]): Self = this.set("optOutContactConsentRequirementRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegionsVarargs(value: ProfileRegion*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[ProfileRegion]): Self = this.set("regions", value.asInstanceOf[js.Any])
  }
  
}

