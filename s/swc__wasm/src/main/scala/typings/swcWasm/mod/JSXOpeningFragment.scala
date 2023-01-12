package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXOpeningFragment
  extends StObject
     with Node
     with HasSpan {
  
  @JSName("type")
  var type_JSXOpeningFragment: typings.swcWasm.swcWasmStrings.JSXOpeningFragment
}
object JSXOpeningFragment {
  
  inline def apply(span: Span): JSXOpeningFragment = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningFragment")
    __obj.asInstanceOf[JSXOpeningFragment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXOpeningFragment] (val x: Self) extends AnyVal {
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.JSXOpeningFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
