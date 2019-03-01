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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("context")(context)
    __obj.updateDynamic("fn")(fn)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("stage")(stage)
    __obj.asInstanceOf[Tap]
  }
}

