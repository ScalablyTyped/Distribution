package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node args
  */
trait INodeArgs extends StObject {
  
  var node: js.Any
  
  var section: js.Any
}
object INodeArgs {
  
  @scala.inline
  def apply(node: js.Any, section: js.Any): INodeArgs = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[INodeArgs]
  }
  
  @scala.inline
  implicit class INodeArgsMutableBuilder[Self <: INodeArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSection(value: js.Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
  }
}
