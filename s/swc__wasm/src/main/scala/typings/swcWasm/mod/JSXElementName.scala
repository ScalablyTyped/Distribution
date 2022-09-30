package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.Identifier
  - typings.swcWasm.mod.JSXMemberExpression
  - typings.swcWasm.mod.JSXNamespacedName
*/
trait JSXElementName extends StObject
object JSXElementName {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typings.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcWasm.mod.Identifier]
  }
  
  inline def JSXMemberExpression(`object`: JSXObject, property: Identifier): typings.swcWasm.mod.JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXMemberExpression]
  }
  
  inline def JSXNamespacedName(name: Identifier, namespace: Identifier): typings.swcWasm.mod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXNamespacedName]
  }
}
