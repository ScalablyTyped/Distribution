package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TypeActionTypes
  extends xstateLib.libTypesMod.BuiltInEvent[js.Any] {
  var `type`: xstateLib.libTypesMod.ActionTypes
}

object Anon_TypeActionTypes {
  @scala.inline
  def apply(`type`: xstateLib.libTypesMod.ActionTypes): Anon_TypeActionTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_TypeActionTypes]
  }
}

