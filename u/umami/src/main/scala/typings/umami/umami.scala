package typings.umami

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Based on https://umami.is/docs/tracker-functions
object umami {
  
  @js.native
  trait umami extends StObject {
    
    def apply(event_value: String): Unit = js.native
    
    def trackEvent(event_value: String, event_type: String): Unit = js.native
    def trackEvent(event_value: String, event_type: String, url: String): Unit = js.native
    def trackEvent(event_value: String, event_type: String, url: String, website_id: String): Unit = js.native
    def trackEvent(event_value: String, event_type: String, url: Unit, website_id: String): Unit = js.native
    
    def trackView(url: String): Unit = js.native
    def trackView(url: String, referrer: String): Unit = js.native
    def trackView(url: String, referrer: String, website_id: String): Unit = js.native
    def trackView(url: String, referrer: Unit, website_id: String): Unit = js.native
  }
}
