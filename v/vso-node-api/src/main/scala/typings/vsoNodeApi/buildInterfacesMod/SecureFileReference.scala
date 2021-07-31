package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecureFileReference
  extends StObject
     with ResourceReference {
  
  /**
    * The ID of the secure file.
    */
  var id: String
}
object SecureFileReference {
  
  @scala.inline
  def apply(alias: String, id: String): SecureFileReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureFileReference]
  }
  
  @scala.inline
  implicit class SecureFileReferenceMutableBuilder[Self <: SecureFileReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
