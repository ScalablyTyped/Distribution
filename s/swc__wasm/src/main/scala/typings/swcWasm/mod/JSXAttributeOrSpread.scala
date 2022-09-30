package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.JSXAttribute
  - typings.swcWasm.mod.SpreadElement
*/
trait JSXAttributeOrSpread extends StObject
object JSXAttributeOrSpread {
  
  inline def JSXAttribute(name: JSXAttributeName, span: Span): typings.swcWasm.mod.JSXAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXAttribute")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXAttribute]
  }
  
  inline def SpreadElement(arguments: Expression, spread: Span): typings.swcWasm.mod.SpreadElement = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], spread = spread.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SpreadElement")
    __obj.asInstanceOf[typings.swcWasm.mod.SpreadElement]
  }
}
