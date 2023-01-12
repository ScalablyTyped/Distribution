package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXMemberExpression
  extends StObject
     with Node
     with Expression
     with JSXElementName
     with JSXObject {
  
  var `object`: JSXObject
  
  var property: Identifier
  
  @JSName("type")
  var type_JSXMemberExpression: typings.swcCore.swcCoreStrings.JSXMemberExpression
}
object JSXMemberExpression {
  
  inline def apply(`object`: JSXObject, property: Identifier): JSXMemberExpression = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXMemberExpression")
    __obj.asInstanceOf[JSXMemberExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXMemberExpression] (val x: Self) extends AnyVal {
    
    inline def setObject(value: JSXObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Identifier): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.JSXMemberExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
