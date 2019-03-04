package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Twitter extends js.Object {
  /**
    * Twitter events.
    */
  var events: TwitterEvents
  /**
    * Twitter widgets.
    */
  var widgets: TwitterWidgets
  /**
    * All JavaScript code depending on widgets.js should execute on or after this function.
    *
    * @param callback A callback function which will be invoked when widgets.js is ready.
    */
  def ready(callback: js.Function1[/* twttr */ this.type, scala.Unit]): scala.Unit
}

object Twitter {
  @scala.inline
  def apply(
    events: TwitterEvents,
    ready: js.Function1[js.Function1[Twitter, scala.Unit], scala.Unit],
    widgets: TwitterWidgets
  ): Twitter = {
    val __obj = js.Dynamic.literal(events = events, ready = ready, widgets = widgets)
  
    __obj.asInstanceOf[Twitter]
  }
}

