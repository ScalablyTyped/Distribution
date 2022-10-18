package typings.vsoNodeApi.interfacesWorkInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldReference extends StObject {
  
  /**
    * fieldRefName for the field
    */
  var referenceName: String
  
  /**
    * Full http link to more information about the field
    */
  var url: String
}
object FieldReference {
  
  inline def apply(referenceName: String, url: String): FieldReference = {
    val __obj = js.Dynamic.literal(referenceName = referenceName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldReference]
  }
  
  extension [Self <: FieldReference](x: Self) {
    
    inline def setReferenceName(value: String): Self = StObject.set(x, "referenceName", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
