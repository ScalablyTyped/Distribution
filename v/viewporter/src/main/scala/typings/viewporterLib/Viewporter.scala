package typings
package viewporterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Viewporter extends js.Object {
  var ACTIVE: scala.Boolean
  var READY: scala.Boolean
  var forceDetection: scala.Boolean
  var preventPageScroll: scala.Boolean
  def change(callback: stdLib.EventListener): scala.Unit
  def isLandscape(): scala.Boolean
  def ready(callback: stdLib.EventListener): scala.Unit
  def refresh(): scala.Unit
}

object Viewporter {
  @scala.inline
  def apply(
    ACTIVE: scala.Boolean,
    READY: scala.Boolean,
    change: stdLib.EventListener => scala.Unit,
    forceDetection: scala.Boolean,
    isLandscape: () => scala.Boolean,
    preventPageScroll: scala.Boolean,
    ready: stdLib.EventListener => scala.Unit,
    refresh: () => scala.Unit
  ): Viewporter = {
    val __obj = js.Dynamic.literal(ACTIVE = ACTIVE, READY = READY, change = js.Any.fromFunction1(change), forceDetection = forceDetection, isLandscape = js.Any.fromFunction0(isLandscape), preventPageScroll = preventPageScroll, ready = js.Any.fromFunction1(ready), refresh = js.Any.fromFunction0(refresh))
  
    __obj.asInstanceOf[Viewporter]
  }
}

