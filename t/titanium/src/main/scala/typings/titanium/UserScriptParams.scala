package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.WebView.addUserScript> method.
  */
@js.native
trait UserScriptParams extends StObject {
  
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
  implicit class UserScriptParamsMutableBuilder[Self <: UserScriptParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInjectionTime(value: Double): Self = StObject.set(x, "injectionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInjectionTimeUndefined: Self = StObject.set(x, "injectionTime", js.undefined)
    
    @scala.inline
    def setMainFrameOnly(value: Boolean): Self = StObject.set(x, "mainFrameOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMainFrameOnlyUndefined: Self = StObject.set(x, "mainFrameOnly", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
