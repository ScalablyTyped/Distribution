package typings.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTypeTEventType[TEventType /* <: String */] extends js.Object {
  var `type`: TEventType
}

object AnonTypeTEventType {
  @scala.inline
  def apply[TEventType /* <: String */](`type`: TEventType): AnonTypeTEventType[TEventType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTypeTEventType[TEventType]]
  }
}

