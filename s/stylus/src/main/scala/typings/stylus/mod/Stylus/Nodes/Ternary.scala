package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ternary
  extends StObject
     with Node {
  
  var falseExpr: Expression
  
  var op: java.lang.String
  
  var trueExpr: Expression
}
object Ternary {
  
  @scala.inline
  def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    falseExpr: Expression,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    op: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column,
    trueExpr: Expression
  ): Ternary = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), falseExpr = falseExpr.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON), trueExpr = trueExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ternary]
  }
  
  @scala.inline
  implicit class TernaryMutableBuilder[Self <: Ternary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFalseExpr(value: Expression): Self = StObject.set(x, "falseExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: java.lang.String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueExpr(value: Expression): Self = StObject.set(x, "trueExpr", value.asInstanceOf[js.Any])
  }
}
