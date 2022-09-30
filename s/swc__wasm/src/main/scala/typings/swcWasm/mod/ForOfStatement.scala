package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForOfStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  /**
    *  Span of the await token.
    *
    *  es2018 for-await-of statements, e.g., `for await (const x of xs) {`
    */
  var await: js.UndefOr[Span] = js.undefined
  
  var body: Statement
  
  var left: VariableDeclaration | Pattern
  
  var right: Expression
  
  @JSName("type")
  var type_ForOfStatement: typings.swcWasm.swcWasmStrings.ForOfStatement
}
object ForOfStatement {
  
  inline def apply(body: Statement, left: VariableDeclaration | Pattern, right: Expression, span: Span): ForOfStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ForOfStatement")
    __obj.asInstanceOf[ForOfStatement]
  }
  
  extension [Self <: ForOfStatement](x: Self) {
    
    inline def setAwait(value: Span): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
    
    inline def setAwaitUndefined: Self = StObject.set(x, "await", js.undefined)
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: VariableDeclaration | Pattern): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: Expression): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
