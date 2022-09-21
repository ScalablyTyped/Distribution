package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node args
  */
trait INodeArgs extends StObject {
  
  var node: Any
  
  var section: Any
}
object INodeArgs {
  
  inline def apply(node: Any, section: Any): INodeArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeArgs]
  }
  
  extension [Self <: INodeArgs](x: Self) {
    
    inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setSection(value: Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
  }
}
