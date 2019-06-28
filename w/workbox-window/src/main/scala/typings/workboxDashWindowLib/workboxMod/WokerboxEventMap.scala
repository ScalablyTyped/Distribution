package typings
package workboxDashWindowLib.workboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WokerboxEventMap extends js.Object {
  var activated: WorkboxUpdatableEvent
  var controlling: workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent
  var externalactivated: WorkboxExtendableEvent
  var externalinstalled: WorkboxExtendableEvent
  var externalwaiting: WorkboxExtendableEvent
  var installed: workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent
  var message: WorkboxMessageEvent
  var redundant: workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent
  var waiting: WorkboxWaitingEvent
}

object WokerboxEventMap {
  @scala.inline
  def apply(
    activated: WorkboxUpdatableEvent,
    controlling: workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent,
    externalactivated: WorkboxExtendableEvent,
    externalinstalled: WorkboxExtendableEvent,
    externalwaiting: WorkboxExtendableEvent,
    installed: workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent,
    message: WorkboxMessageEvent,
    redundant: workboxDashWindowLib.utilsWorkboxEventMod.WorkboxEvent,
    waiting: WorkboxWaitingEvent
  ): WokerboxEventMap = {
    val __obj = js.Dynamic.literal(activated = activated, controlling = controlling, externalactivated = externalactivated, externalinstalled = externalinstalled, externalwaiting = externalwaiting, installed = installed, message = message, redundant = redundant, waiting = waiting)
  
    __obj.asInstanceOf[WokerboxEventMap]
  }
}

