package typings.three

import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFunc extends js.Object {
  var slices: Double
  var stacks: Double
  def func(u: Double, v: Double, dest: Vector3): Unit
}

object AnonFunc {
  @scala.inline
  def apply(func: (Double, Double, Vector3) => Unit, slices: Double, stacks: Double): AnonFunc = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), slices = slices.asInstanceOf[js.Any], stacks = stacks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFunc]
  }
}

