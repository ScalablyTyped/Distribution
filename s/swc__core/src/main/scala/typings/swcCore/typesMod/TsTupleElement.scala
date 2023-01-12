package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTupleElement
  extends StObject
     with Node
     with HasSpan {
  
  var label: js.UndefOr[Pattern] = js.undefined
  
  var ty: TsType
  
  @JSName("type")
  var type_TsTupleElement: typings.swcCore.swcCoreStrings.TsTupleElement
}
object TsTupleElement {
  
  inline def apply(span: Span, ty: TsType): TsTupleElement = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], ty = ty.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsTupleElement")
    __obj.asInstanceOf[TsTupleElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsTupleElement] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: Pattern): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTy(value: TsType): Self = StObject.set(x, "ty", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsTupleElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
