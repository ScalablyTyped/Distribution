package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Import
  extends StObject
     with Node
     with HasSpan {
  
  @JSName("type")
  var type_Import: typings.swcCore.swcCoreStrings.Import
}
object Import {
  
  inline def apply(span: Span): Import = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Import")
    __obj.asInstanceOf[Import]
  }
  
  extension [Self <: Import](x: Self) {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.Import): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
