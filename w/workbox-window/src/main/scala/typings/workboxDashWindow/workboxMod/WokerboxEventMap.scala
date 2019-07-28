package typings.workboxDashWindow.workboxMod

import typings.workboxDashWindow.utilsWorkboxEventMod.WorkboxEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WokerboxEventMap extends js.Object {
  var activated: WorkboxUpdatableEvent
  var controlling: WorkboxEvent
  var externalactivated: WorkboxExtendableEvent
  var externalinstalled: WorkboxExtendableEvent
  var externalwaiting: WorkboxExtendableEvent
  var installed: WorkboxEvent
  var message: WorkboxMessageEvent
  var redundant: WorkboxEvent
  var waiting: WorkboxWaitingEvent
}

object WokerboxEventMap {
  @scala.inline
  def apply(
    activated: WorkboxUpdatableEvent,
    controlling: WorkboxEvent,
    externalactivated: WorkboxExtendableEvent,
    externalinstalled: WorkboxExtendableEvent,
    externalwaiting: WorkboxExtendableEvent,
    installed: WorkboxEvent,
    message: WorkboxMessageEvent,
    redundant: WorkboxEvent,
    waiting: WorkboxWaitingEvent
  ): WokerboxEventMap = {
    val __obj = js.Dynamic.literal(activated = activated, controlling = controlling, externalactivated = externalactivated, externalinstalled = externalinstalled, externalwaiting = externalwaiting, installed = installed, message = message, redundant = redundant, waiting = waiting)
  
    __obj.asInstanceOf[WokerboxEventMap]
  }
}

