package typings.webcola.distSrcRectangleMod

import typings.webcola.distSrcVpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leaf extends js.Object {
  var bounds: Rectangle
  var variable: Variable
}

object Leaf {
  @scala.inline
  def apply(bounds: Rectangle, variable: Variable): Leaf = {
    val __obj = js.Dynamic.literal(bounds = bounds, variable = variable)
  
    __obj.asInstanceOf[Leaf]
  }
}

