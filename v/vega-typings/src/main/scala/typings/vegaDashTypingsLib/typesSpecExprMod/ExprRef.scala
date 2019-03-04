package typings
package vegaDashTypingsLib.typesSpecExprMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExprRef
  extends vegaDashTypingsLib.typesSpecTransformMod.TransformField
     with vegaDashTypingsLib.typesSpecOnDashEventsMod._Update {
  var expr: Expr
}

object ExprRef {
  @scala.inline
  def apply(expr: Expr): ExprRef = {
    val __obj = js.Dynamic.literal(expr = expr)
  
    __obj.asInstanceOf[ExprRef]
  }
}

