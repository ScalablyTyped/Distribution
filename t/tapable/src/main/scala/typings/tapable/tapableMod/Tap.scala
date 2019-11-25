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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tap]
  }
}

