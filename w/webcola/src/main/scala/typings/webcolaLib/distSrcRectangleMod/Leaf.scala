package typings
package webcolaLib.distSrcRectangleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leaf extends js.Object {
  var bounds: Rectangle
  var variable: webcolaLib.distSrcVpscMod.Variable
}

object Leaf {
  @scala.inline
  def apply(bounds: Rectangle, variable: webcolaLib.distSrcVpscMod.Variable): Leaf = {
    val __obj = js.Dynamic.literal(bounds = bounds, variable = variable)
  
    __obj.asInstanceOf[Leaf]
  }
}

