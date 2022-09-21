package typings.typeformEmbed

import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object setupGoogleAnalyticsInstanceMod {
  
  @JSImport("@typeform/embed/types/utils/setup-google-analytics-instance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendGaIdMessage(embedId: String, gaClientId: String, iframe: HTMLIFrameElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendGaIdMessage")(embedId.asInstanceOf[js.Any], gaClientId.asInstanceOf[js.Any], iframe.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setupGaInstance(iframe: HTMLIFrameElement, embedId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupGaInstance")(iframe.asInstanceOf[js.Any], embedId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setupGaInstance(iframe: HTMLIFrameElement, embedId: String, shareGaInstance: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupGaInstance")(iframe.asInstanceOf[js.Any], embedId.asInstanceOf[js.Any], shareGaInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setupGaInstance(iframe: HTMLIFrameElement, embedId: String, shareGaInstance: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupGaInstance")(iframe.asInstanceOf[js.Any], embedId.asInstanceOf[js.Any], shareGaInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object global {
    
    trait Window extends StObject {
      
      var GoogleAnalyticsObject: String
    }
    object Window {
      
      inline def apply(GoogleAnalyticsObject: String): Window = {
        val __obj = js.Dynamic.literal(GoogleAnalyticsObject = GoogleAnalyticsObject.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setGoogleAnalyticsObject(value: String): Self = StObject.set(x, "GoogleAnalyticsObject", value.asInstanceOf[js.Any])
      }
    }
  }
}
