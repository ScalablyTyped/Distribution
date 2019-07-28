package typings.vegaDashTypings.typesSpecExprMod

import typings.vegaDashTypings.typesSpecOnDashEventsMod._Update
import typings.vegaDashTypings.typesSpecTransformMod.TransformField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExprRef
  extends TransformField
     with _Update {
  var expr: Expr
}

object ExprRef {
  @scala.inline
  def apply(expr: Expr): ExprRef = {
    val __obj = js.Dynamic.literal(expr = expr)
  
    __obj.asInstanceOf[ExprRef]
  }
}

