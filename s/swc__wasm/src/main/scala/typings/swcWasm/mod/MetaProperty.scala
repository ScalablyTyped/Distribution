package typings.swcWasm.mod

import typings.swcWasm.swcWasmStrings.importDotmeta
import typings.swcWasm.swcWasmStrings.newDottarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaProperty
  extends StObject
     with Node
     with HasSpan
     with Expression {
  
  var kind: newDottarget | importDotmeta
  
  @JSName("type")
  var type_MetaProperty: typings.swcWasm.swcWasmStrings.MetaProperty
}
object MetaProperty {
  
  inline def apply(kind: newDottarget | importDotmeta, span: Span): MetaProperty = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("MetaProperty")
    __obj.asInstanceOf[MetaProperty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaProperty] (val x: Self) extends AnyVal {
    
    inline def setKind(value: newDottarget | importDotmeta): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.MetaProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
