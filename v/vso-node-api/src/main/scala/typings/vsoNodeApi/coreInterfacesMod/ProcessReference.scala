package typings.vsoNodeApi.coreInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessReference extends StObject {
  
  var name: String
  
  var url: String
}
object ProcessReference {
  
  @scala.inline
  def apply(name: String, url: String): ProcessReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessReference]
  }
  
  @scala.inline
  implicit class ProcessReferenceMutableBuilder[Self <: ProcessReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
