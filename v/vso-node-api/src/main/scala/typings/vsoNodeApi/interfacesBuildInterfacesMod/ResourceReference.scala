package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceReference extends StObject {
  
  /**
    * An alias to be used when referencing the resource.
    */
  var alias: String
}
object ResourceReference {
  
  inline def apply(alias: String): ResourceReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceReference]
  }
  
  extension [Self <: ResourceReference](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
  }
}
