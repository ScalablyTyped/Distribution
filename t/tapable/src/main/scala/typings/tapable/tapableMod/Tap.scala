package typings.tapable.tapableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tap extends js.Object {
  var context: Boolean
  var fn: js.Function
  var name: String
  var stage: Double
  var `type`: TapType
}

object Tap {
  @scala.inline
  def apply(context: Boolean, fn: js.Function, name: String, stage: Double, `type`: TapType): Tap = {
    val __obj = js.Dynamic.literal(context = context, fn = fn, name = name, stage = stage)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Tap]
  }
}

