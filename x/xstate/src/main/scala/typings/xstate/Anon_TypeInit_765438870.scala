package typings.xstate

import typings.xstate.libTypesMod.ActionTypes.Init
import typings.xstate.libTypesMod.BuiltInEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeInit_765438870
  extends BuiltInEvent[js.Any] {
  var `type`: Init
}

object Anon_TypeInit_765438870 {
  @scala.inline
  def apply(`type`: Init): Anon_TypeInit_765438870 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TypeInit_765438870]
  }
}

