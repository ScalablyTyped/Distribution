package typings.viewporter

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewporter_ extends js.Object {
  var ACTIVE: Boolean
  var READY: Boolean
  var forceDetection: Boolean
  var preventPageScroll: Boolean
  def change(callback: EventListener): Unit
  def isLandscape(): Boolean
  def ready(callback: EventListener): Unit
  def refresh(): Unit
}

object Viewporter_ {
  @scala.inline
  def apply(
    ACTIVE: Boolean,
    READY: Boolean,
    change: EventListener => Unit,
    forceDetection: Boolean,
    isLandscape: () => Boolean,
    preventPageScroll: Boolean,
    ready: EventListener => Unit,
    refresh: () => Unit
  ): Viewporter_ = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], change = js.Any.fromFunction1(change), forceDetection = forceDetection.asInstanceOf[js.Any], isLandscape = js.Any.fromFunction0(isLandscape), preventPageScroll = preventPageScroll.asInstanceOf[js.Any], ready = js.Any.fromFunction1(ready), refresh = js.Any.fromFunction0(refresh))
  
    __obj.asInstanceOf[Viewporter_]
  }
}

