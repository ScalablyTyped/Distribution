package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXNamespacedName
  extends StObject
     with Node
     with Expression
     with JSXAttributeName
     with JSXElementName {
  
  var name: Identifier
  
  var namespace: Identifier
  
  @JSName("type")
  var type_JSXNamespacedName: typings.swcCore.swcCoreStrings.JSXNamespacedName
}
object JSXNamespacedName {
  
  inline def apply(name: Identifier, namespace: Identifier): JSXNamespacedName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXNamespacedName")
    __obj.asInstanceOf[JSXNamespacedName]
  }
  
  extension [Self <: JSXNamespacedName](x: Self) {
    
    inline def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Identifier): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.JSXNamespacedName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
