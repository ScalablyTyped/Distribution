package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.WebView.addUserScript> method.
  */
@js.native
trait UserScriptParams extends js.Object {
  
  /**
    * The time when the script should be injected into the webpage.
    */
  var injectionTime: js.UndefOr[Double] = js.native
  
  /**
    * A Boolean value indicating whether the script should be injected only into the
    * main frame (true) or into all frames (false).
    */
  var mainFrameOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * A script that can be injected into a webpage.
    */
  var source: js.UndefOr[String] = js.native
}
object UserScriptParams {
  
  @scala.inline
  def apply(): UserScriptParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserScriptParams]
  }
  
  @scala.inline
  implicit class UserScriptParamsOps[Self <: UserScriptParams] (val x: Self) extends AnyVal {
    
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
    def setInjectionTime(value: Double): Self = this.set("injectionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInjectionTime: Self = this.set("injectionTime", js.undefined)
    
    @scala.inline
    def setMainFrameOnly(value: Boolean): Self = this.set("mainFrameOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainFrameOnly: Self = this.set("mainFrameOnly", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
}
