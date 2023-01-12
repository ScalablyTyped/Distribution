package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabeledStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  var body: Statement
  
  var label: Identifier
  
  @JSName("type")
  var type_LabeledStatement: typings.swcCore.swcCoreStrings.LabeledStatement
}
object LabeledStatement {
  
  inline def apply(body: Statement, label: Identifier, span: Span): LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("LabeledStatement")
    __obj.asInstanceOf[LabeledStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabeledStatement] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Statement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.LabeledStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
