package typings.xstate

import typings.xstate.esTypesMod.ActionTypes.Init
import typings.xstate.esTypesMod.BuiltInEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeInit
  extends BuiltInEvent[js.Any] {
  var `type`: Init
}

object Anon_TypeInit {
  @scala.inline
  def apply(`type`: Init): Anon_TypeInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeInit]
  }
}

