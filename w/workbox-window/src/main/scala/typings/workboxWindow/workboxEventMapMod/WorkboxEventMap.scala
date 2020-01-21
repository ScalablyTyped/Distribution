package typings.workboxWindow.workboxEventMapMod

import typings.workboxWindow.workboxEventMod.WorkboxEvent
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
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], controlling = controlling.asInstanceOf[js.Any], externalactivated = externalactivated.asInstanceOf[js.Any], externalinstalled = externalinstalled.asInstanceOf[js.Any], externalwaiting = externalwaiting.asInstanceOf[js.Any], installed = installed.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], redundant = redundant.asInstanceOf[js.Any], waiting = waiting.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkboxEventMap]
  }
}

