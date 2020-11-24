package typings.universalAnalytics.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenviewParams
  extends /* key */ StringDictionary[js.Any] {
  
  /**
    * Application ID
    *
    * Application identifier.
    *
    * Max length: 150 Bytes
    *
    * Example value: `com.company.app`
    */
  var aid: js.UndefOr[String] = js.native
  
  /**
    * Application Installer ID
    *
    * Application installer identifier.
    *
    * Max length: 150 Bytes
    *
    * Example value: `com.platform.vending`
    */
  var aiid: js.UndefOr[String] = js.native
  
  /**
    * Application Name
    *
    * Specifies the application name. This field is required for any hit that has app related data
    * (i.e., app version, app ID, or app installer ID). For hits sent to web properties, this field is optional.
    *
    * Max length: 100 Bytes
    *
    * Example value: `My App`
    */
  var an: js.UndefOr[String] = js.native
  
  /**
    * Application Version
    *
    * Specifies the application version.
    *
    * Max length: 100 Bytes
    *
    * Example value: `1.2`
    */
  var av: js.UndefOr[String] = js.native
  
  /**
    * Screen Name
    *
    * This parameter is optional on web properties, and required on mobile properties for screenview hits,
    * where it is used for the 'Screen Name' of the screenview hit.
    *
    * Max length: 2048 Bytes
    *
    * Example value: `High Scores`
    */
  var cd: js.UndefOr[String] = js.native
}
object ScreenviewParams {
  
  @scala.inline
  def apply(): ScreenviewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenviewParams]
  }
  
  @scala.inline
  implicit class ScreenviewParamsOps[Self <: ScreenviewParams] (val x: Self) extends AnyVal {
    
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
    def setAid(value: String): Self = this.set("aid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAid: Self = this.set("aid", js.undefined)
    
    @scala.inline
    def setAiid(value: String): Self = this.set("aiid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAiid: Self = this.set("aiid", js.undefined)
    
    @scala.inline
    def setAn(value: String): Self = this.set("an", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAn: Self = this.set("an", js.undefined)
    
    @scala.inline
    def setAv(value: String): Self = this.set("av", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAv: Self = this.set("av", js.undefined)
    
    @scala.inline
    def setCd(value: String): Self = this.set("cd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCd: Self = this.set("cd", js.undefined)
  }
}
