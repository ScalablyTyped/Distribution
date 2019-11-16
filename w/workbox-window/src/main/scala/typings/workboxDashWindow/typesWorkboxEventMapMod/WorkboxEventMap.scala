package typings.workboxDashWindow.typesWorkboxEventMapMod

import typings.workboxDashWindow.typesWorkboxEventMod.WorkboxEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkboxEventMap extends js.Object {
  var activated: WorkboxUpdatableEvent
  var controlling: WorkboxEvent
  var externalactivated: WorkboxExtendableEvent
  var externalinstalled: WorkboxExtendableEvent
  var externalwaiting: WorkboxExtendableEvent
  var installed: WorkboxUpdatableEvent
  var message: WorkboxMessageEvent
  var redundant: WorkboxEvent
  var waiting: WorkboxWaitingEvent
}

object WorkboxEventMap {
  @scala.inline
  def apply(
    activated: WorkboxUpdatableEvent,
    controlling: WorkboxEvent,
    externalactivated: WorkboxExtendableEvent,
    externalinstalled: WorkboxExtendableEvent,
    externalwaiting: WorkboxExtendableEvent,
    installed: WorkboxUpdatableEvent,
    message: WorkboxMessageEvent,
    redundant: WorkboxEvent,
    waiting: WorkboxWaitingEvent
  ): WorkboxEventMap = {
    val __obj = js.Dynamic.literal(activated = activated, controlling = controlling, externalactivated = externalactivated, externalinstalled = externalinstalled, externalwaiting = externalwaiting, installed = installed, message = message, redundant = redundant, waiting = waiting)
  
    __obj.asInstanceOf[WorkboxEventMap]
  }
}

