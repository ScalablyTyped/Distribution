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
  
  inline def apply(alias: String, id: String): SecureFileReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureFileReference]
  }
  
  extension [Self <: SecureFileReference](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
