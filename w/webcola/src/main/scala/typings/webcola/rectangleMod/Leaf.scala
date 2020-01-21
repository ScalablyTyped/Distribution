package typings.webcola.rectangleMod

import typings.webcola.vpscMod.Variable
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
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Leaf]
  }
}

