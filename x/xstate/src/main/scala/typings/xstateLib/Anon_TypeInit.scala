package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeInit
  extends xstateLib.esTypesMod.BuiltInEvent[js.Any] {
  var `type`: xstateLib.esTypesMod.ActionTypes.Init
}

object Anon_TypeInit {
  @scala.inline
  def apply(`type`: xstateLib.esTypesMod.ActionTypes.Init): Anon_TypeInit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeInit]
  }
}

