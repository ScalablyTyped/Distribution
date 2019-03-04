package typings
package tapableLib.tapableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tap extends js.Object {
  var context: scala.Boolean
  var fn: js.Function
  var name: java.lang.String
  var stage: scala.Double
  var `type`: tapableLib.TapType
}

object Tap {
  @scala.inline
  def apply(
    context: scala.Boolean,
    fn: js.Function,
    name: java.lang.String,
    stage: scala.Double,
    `type`: tapableLib.TapType
  ): Tap = {
    val __obj = js.Dynamic.literal(context = context, fn = fn, name = name, stage = stage)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Tap]
  }
}

