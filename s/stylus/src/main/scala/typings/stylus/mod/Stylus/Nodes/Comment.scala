package typings.stylus.mod.Stylus.Nodes

import typings.stylus.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment
  extends StObject
     with Node {
  
  var `inline`: scala.Boolean
  
  var str: java.lang.String
  
  var suppress: scala.Boolean
}
object Comment {
  
  inline def apply(
    coerce: Node => Node,
    column: Double,
    eval: () => Node,
    filename: java.lang.String,
    first: Node,
    hash: java.lang.String,
    `inline`: scala.Boolean,
    lineno: Double,
    nodeName: java.lang.String,
    operate: (java.lang.String, Node) => Node,
    shouldCoerce: java.lang.String => scala.Boolean,
    str: java.lang.String,
    suppress: scala.Boolean,
    toBoolean: () => Boolean,
    toExpression: () => Expression,
    toJSON: () => Column
  ): Comment = {
    val __obj = js.Dynamic.literal(coerce = js.Any.fromFunction1(coerce), column = column.asInstanceOf[js.Any], eval = js.Any.fromFunction0(eval), filename = filename.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any], nodeName = nodeName.asInstanceOf[js.Any], operate = js.Any.fromFunction2(operate), shouldCoerce = js.Any.fromFunction1(shouldCoerce), str = str.asInstanceOf[js.Any], suppress = suppress.asInstanceOf[js.Any], toBoolean = js.Any.fromFunction0(toBoolean), toExpression = js.Any.fromFunction0(toExpression), toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setInline(value: scala.Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setStr(value: java.lang.String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
    
    inline def setSuppress(value: scala.Boolean): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
  }
}
