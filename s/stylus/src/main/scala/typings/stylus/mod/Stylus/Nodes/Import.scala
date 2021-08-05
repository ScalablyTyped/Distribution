package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import
  extends StObject
     with Node {
  
  var once: scala.Boolean
  
  var path: Expression
}
object Import {
  
  inline def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    lineno: Double,
    nodeName: java.lang.String,
    once: scala.Boolean,
    operate: (java.lang.String, Node) => Node,
    path: Expression,
    shouldCoerce: java.lang.String => scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): Import = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], once = once.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), path = path.asInstanceOf[js.Any], shouldCoerce = js.Any.fromFunction1(shouldCoerce), toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Import]
  }
  
  extension [Self <: Import](x: Self) {
    
    inline def setOnce(value: scala.Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Expression): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
