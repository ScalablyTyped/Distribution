package typings.twitterDashForDashWeb

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for an object representing the event is passed to your JavaScript callback.
  */
trait TwitterIntentEvent extends js.Object {
  /**
    * Key/value pairs relevant to the Web Intent just actioned.
    */
  var data: TwitterIntentEventData
  /**
    * Extended detail indicating where in a widget a user clicked. For example, button, count, or screen name portions of Tweet button or Follow button integrations, or tweet actions within embedded Tweets.
    */
  var region: String
  /**
    * The DOM node where the widget is instantiated. Most like an iframe, but may also be the original embed code element if the widget failed to initialize, or another sandboxed element. Use this value to differentiate between different intents or buttons on the same page.
    */
  var target: HTMLElement
  /**
    * The type of the event.
    */
  var `type`: String
}

object TwitterIntentEvent {
  @scala.inline
  def apply(data: TwitterIntentEventData, region: String, target: HTMLElement, `type`: String): TwitterIntentEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterIntentEvent]
  }
}

