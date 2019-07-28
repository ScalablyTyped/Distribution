package typings.xstate

import typings.xstate.libTypesMod.ActionTypes.Init
import typings.xstate.libTypesMod.BuiltInEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeInit_203355696
  extends BuiltInEvent[js.Any] {
  var `type`: Init
}

object Anon_TypeInit_203355696 {
  @scala.inline
  def apply(`type`: Init): Anon_TypeInit_203355696 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeInit_203355696]
  }
}

