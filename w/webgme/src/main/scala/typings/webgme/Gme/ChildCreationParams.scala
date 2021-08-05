package typings.webgme.Gme

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildCreationParams extends StObject {
  
  var baseId: String
  
  var parentId: String
}
object ChildCreationParams {
  
  inline def apply(baseId: String, parentId: String): ChildCreationParams = {
    val __obj = js.Dynamic.literal(baseId = baseId.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildCreationParams]
  }
  
  extension [Self <: ChildCreationParams](x: Self) {
    
    inline def setBaseId(value: String): Self = StObject.set(x, "baseId", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
  }
}
