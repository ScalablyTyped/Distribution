package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeOptions extends StObject {
  
  var attributes: js.UndefOr[js.Any] = js.undefined
  
  var legalNodes: js.Array[String]
  
  var name: String
  
  var text: js.UndefOr[String] = js.undefined
  
  var topLevel: js.UndefOr[Boolean] = js.undefined
}
object NodeOptions {
  
  inline def apply(legalNodes: js.Array[String], name: String): NodeOptions = {
    val __obj = js.Dynamic.literal(legalNodes = legalNodes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions]
  }
  
  extension [Self <: NodeOptions](x: Self) {
    
    inline def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setLegalNodes(value: js.Array[String]): Self = StObject.set(x, "legalNodes", value.asInstanceOf[js.Any])
    
    inline def setLegalNodesVarargs(value: String*): Self = StObject.set(x, "legalNodes", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTopLevel(value: Boolean): Self = StObject.set(x, "topLevel", value.asInstanceOf[js.Any])
    
    inline def setTopLevelUndefined: Self = StObject.set(x, "topLevel", js.undefined)
  }
}
