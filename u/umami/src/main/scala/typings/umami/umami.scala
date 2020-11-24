package typings.umami

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Based on https://umami.is/docs/tracker-functions
@JSGlobal("umami")
@js.native
object umami extends js.Object {
  
  @js.native
  trait umami extends js.Object {
    
    def apply(event_value: String): Unit = js.native
    
    def trackEvent(event_value: String, event_type: String): Unit = js.native
    def trackEvent(event_value: String, event_type: String, url: js.UndefOr[scala.Nothing], website_id: String): Unit = js.native
    def trackEvent(event_value: String, event_type: String, url: String): Unit = js.native
    def trackEvent(event_value: String, event_type: String, url: String, website_id: String): Unit = js.native
    
    def trackView(url: String): Unit = js.native
    def trackView(url: String, referrer: js.UndefOr[scala.Nothing], website_id: String): Unit = js.native
    def trackView(url: String, referrer: String): Unit = js.native
    def trackView(url: String, referrer: String, website_id: String): Unit = js.native
  }
}
