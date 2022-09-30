package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.Identifier
  - typings.swcCore.typesMod.JSXNamespacedName
*/
trait JSXAttributeName extends StObject
object JSXAttributeName {
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typings.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.Identifier]
  }
  
  inline def JSXNamespacedName(name: Identifier, namespace: Identifier): typings.swcCore.typesMod.JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[typings.swcCore.typesMod.JSXNamespacedName]
  }
}
