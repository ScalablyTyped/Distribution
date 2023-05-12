package typings.umami

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Based on https://umami.is/docs/tracker-functions
object umami {
  
  @js.native
  trait umami extends StObject {
    
    def apply(event_value: String): Unit = js.native
    
    def trackEvent(event_value: String): Unit = js.native
    def trackEvent(event_value: String, event_type: StringDictionary[String | Double]): Unit = js.native
    def trackEvent(event_value: String, event_type: StringDictionary[String | Double], url: String): Unit = js.native
    def trackEvent(
      event_value: String,
      event_type: StringDictionary[String | Double],
      url: String,
      website_id: String
    ): Unit = js.native
    def trackEvent(event_value: String, event_type: StringDictionary[String | Double], url: Unit, website_id: String): Unit = js.native
    def trackEvent(event_value: String, event_type: Unit, url: String): Unit = js.native
    def trackEvent(event_value: String, event_type: Unit, url: String, website_id: String): Unit = js.native
    def trackEvent(event_value: String, event_type: Unit, url: Unit, website_id: String): Unit = js.native
    
    def trackView(url: String): Unit = js.native
    def trackView(url: String, referrer: String): Unit = js.native
    def trackView(url: String, referrer: String, website_id: String): Unit = js.native
    def trackView(url: String, referrer: Unit, website_id: String): Unit = js.native
  }
}
