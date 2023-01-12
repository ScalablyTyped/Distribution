package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreakStatement
  extends StObject
     with Node
     with HasSpan
     with Statement {
  
  var label: js.UndefOr[Identifier] = js.undefined
  
  @JSName("type")
  var type_BreakStatement: typings.swcCore.swcCoreStrings.BreakStatement
}
object BreakStatement {
  
  inline def apply(span: Span): BreakStatement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BreakStatement")
    __obj.asInstanceOf[BreakStatement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BreakStatement] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: Identifier): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setType(value: typings.swcCore.swcCoreStrings.BreakStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
