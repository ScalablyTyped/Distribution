package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeNullEvent
  extends xstateLib.esTypesMod.BuiltInEvent[js.Any] {
  var `type`: xstateLib.esTypesMod.ActionTypes.NullEvent
}

object Anon_TypeNullEvent {
  @scala.inline
  def apply(`type`: xstateLib.esTypesMod.ActionTypes.NullEvent): Anon_TypeNullEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeNullEvent]
  }
}

