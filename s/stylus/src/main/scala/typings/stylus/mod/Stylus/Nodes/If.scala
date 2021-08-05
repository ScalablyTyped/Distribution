package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait If
  extends StObject
     with Node {
  
  var block: Block
  
  var cond: Expression
  
  var elses: js.Array[Expression]
  
  var negate: scala.Boolean
}
object If {
  
  inline def apply(
    block: Block,
    coerce: Node => Node,
    column: Double,
    cond: Expression,
    elses: js.Array[Expression],
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    negate: scala.Boolean,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): If = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], cond = cond.asInstanceOf[js.Any], elses = elses.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], negate = negate.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[If]
  }
  
  extension [Self <: If](x: Self) {
    
    inline def setBlock(value: Block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setCond(value: Expression): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setElses(value: js.Array[Expression]): Self = StObject.set(x, "elses", value.asInstanceOf[js.Any])
    
    inline def setElsesVarargs(value: Expression*): Self = StObject.set(x, "elses", js.Array(value :_*))
    
    inline def setNegate(value: scala.Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
  }
}
