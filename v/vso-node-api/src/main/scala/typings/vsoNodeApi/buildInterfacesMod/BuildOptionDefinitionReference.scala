package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildOptionDefinitionReference extends StObject {
  
  /**
    * The ID of the referenced build option.
    */
  var id: String
}
object BuildOptionDefinitionReference {
  
  inline def apply(id: String): BuildOptionDefinitionReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildOptionDefinitionReference]
  }
  
  extension [Self <: BuildOptionDefinitionReference](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
