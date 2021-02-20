package typings.twitterForWeb

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The interface for an object representing the event is passed to your JavaScript callback.
  */
@js.native
trait TwitterIntentEvent extends StObject {
  
  /**
    * Key/value pairs relevant to the Web Intent just actioned.
    */
  var data: TwitterIntentEventData = js.native
  
  /**
    * Extended detail indicating where in a widget a user clicked. For example, button, count, or screen name portions of Tweet button or Follow button integrations, or tweet actions within embedded Tweets.
    */
  var region: String = js.native
  
  /**
    * The DOM node where the widget is instantiated. Most like an iframe, but may also be the original embed code element if the widget failed to initialize, or another sandboxed element. Use this value to differentiate between different intents or buttons on the same page.
    */
  var target: HTMLElement = js.native
  
  /**
    * The type of the event.
    */
  var `type`: String = js.native
}
object TwitterIntentEvent {
  
  @scala.inline
  def apply(data: TwitterIntentEventData, region: String, target: HTMLElement, `type`: String): TwitterIntentEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterIntentEvent]
  }
  
  @scala.inline
  implicit class TwitterIntentEventMutableBuilder[Self <: TwitterIntentEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: TwitterIntentEventData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
