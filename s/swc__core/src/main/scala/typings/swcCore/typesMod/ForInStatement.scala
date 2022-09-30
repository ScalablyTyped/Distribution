package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForInStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  var body: Statement
  
  var left: VariableDeclaration | Pattern
  
  var right: Expression
  
  @JSName("type")
  var type_ForInStatement: typings.swcCore.swcCoreStrings.ForInStatement
}
object ForInStatement {
  
  inline def apply(body: Statement, left: VariableDeclaration | Pattern, right: Expression, span: Span): ForInStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForInStatement")
    __obj.asInstanceOf[ForInStatement]
  }
  
  extension [Self <: ForInStatement](x: Self) {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: VariableDeclaration | Pattern): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ForInStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
