package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type
  extends xstateLib.libTypesMod.BuiltInEvent[js.Any] {
  var `type`: xstateLib.libTypesMod.ActionTypes
}

object Anon_Type {
  @scala.inline
  def apply(`type`: xstateLib.libTypesMod.ActionTypes): Anon_Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

