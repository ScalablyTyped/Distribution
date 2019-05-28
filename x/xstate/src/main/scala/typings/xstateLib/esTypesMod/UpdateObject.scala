package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateObject extends EventObject {
  @JSName("id")
  var id_UpdateObject: java.lang.String | scala.Double
  var state: xstateLib.esStateMod.State[_, _]
}

object UpdateObject {
  @scala.inline
  def apply(
    id: java.lang.String | scala.Double,
    state: xstateLib.esStateMod.State[_, _],
    `type`: java.lang.String
  ): UpdateObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateObject]
  }
}

