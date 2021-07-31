package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoardReference extends StObject {
  
  /**
    * Id of the resource
    */
  var id: String
  
  /**
    * Name of the resource
    */
  var name: String
  
  /**
    * Full http link to the resource
    */
  var url: String
}
object BoardReference {
  
  @scala.inline
  def apply(id: String, name: String, url: String): BoardReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardReference]
  }
  
  @scala.inline
  implicit class BoardReferenceMutableBuilder[Self <: BoardReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
