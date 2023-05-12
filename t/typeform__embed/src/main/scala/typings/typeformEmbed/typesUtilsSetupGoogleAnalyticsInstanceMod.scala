package typings.typeformEmbed

import typings.std.HTMLIFrameElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsSetupGoogleAnalyticsInstanceMod {
  
  @JSImport("@typeform/embed/types/utils/setup-google-analytics-instance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sendGaIdMessage(embedId: String, gaClientId: String, iframe: HTMLIFrameElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendGaIdMessage")(embedId.asInstanceOf[js.Any], gaClientId.asInstanceOf[js.Any], iframe.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setupGaInstance(iframe: HTMLIFrameElement, embedId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupGaInstance")(iframe.asInstanceOf[js.Any], embedId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setupGaInstance(iframe: HTMLIFrameElement, embedId: String, shareGaInstance: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupGaInstance")(iframe.asInstanceOf[js.Any], embedId.asInstanceOf[js.Any], shareGaInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setupGaInstance(iframe: HTMLIFrameElement, embedId: String, shareGaInstance: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupGaInstance")(iframe.asInstanceOf[js.Any], embedId.asInstanceOf[js.Any], shareGaInstance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait GoogleAnalyticsObject extends StObject {
    
    def getAll(): js.Array[GoogleAnalyticsTracker]
  }
  object GoogleAnalyticsObject {
    
    inline def apply(getAll: () => js.Array[GoogleAnalyticsTracker]): GoogleAnalyticsObject = {
      val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction0(getAll))
      __obj.asInstanceOf[GoogleAnalyticsObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoogleAnalyticsObject] (val x: Self) extends AnyVal {
      
      inline def setGetAll(value: () => js.Array[GoogleAnalyticsTracker]): Self = StObject.set(x, "getAll", js.Any.fromFunction0(value))
    }
  }
  
  trait GoogleAnalyticsTracker extends StObject {
    
    def get(value: String): String
  }
  object GoogleAnalyticsTracker {
    
    inline def apply(get: String => String): GoogleAnalyticsTracker = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[GoogleAnalyticsTracker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GoogleAnalyticsTracker] (val x: Self) extends AnyVal {
      
      inline def setGet(value: String => String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var ga: GoogleAnalyticsObject
      
      var gtag: js.Function
    }
    object Window {
      
      inline def apply(ga: GoogleAnalyticsObject, gtag: js.Function): Window = {
        val __obj = js.Dynamic.literal(ga = ga.asInstanceOf[js.Any], gtag = gtag.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setGa(value: GoogleAnalyticsObject): Self = StObject.set(x, "ga", value.asInstanceOf[js.Any])
        
        inline def setGtag(value: js.Function): Self = StObject.set(x, "gtag", value.asInstanceOf[js.Any])
      }
    }
  }
}
