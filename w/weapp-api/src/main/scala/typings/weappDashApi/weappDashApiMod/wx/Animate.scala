package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animate extends js.Object {
  var args: js.Array[_]
  var `type`: String
}

object Animate {
  @scala.inline
  def apply(args: js.Array[_], `type`: String): Animate = {
    val __obj = js.Dynamic.literal(args = args)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Animate]
  }
}

