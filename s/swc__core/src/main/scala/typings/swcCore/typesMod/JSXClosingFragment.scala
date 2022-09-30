package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingFragment
  extends StObject
     with Node
     with HasSpan {
  
  @JSName("type")
  var type_JSXClosingFragment: typings.swcCore.swcCoreStrings.JSXClosingFragment
}
object JSXClosingFragment {
  
  inline def apply(span: Span): JSXClosingFragment = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingFragment")
    __obj.asInstanceOf[JSXClosingFragment]
  }
  
  extension [Self <: JSXClosingFragment](x: Self) {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.JSXClosingFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
