package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.memberTypeResource
  * @description Loads in data for member types
  **/
trait IMemberTypeResource extends StObject {
  
  //return all member types
  def getTypes(): Any
}
object IMemberTypeResource {
  
  inline def apply(getTypes: () => Any): IMemberTypeResource = {
    val __obj = js.Dynamic.literal(getTypes = js.Any.fromFunction0(getTypes))
    __obj.asInstanceOf[IMemberTypeResource]
  }
  
  extension [Self <: IMemberTypeResource](x: Self) {
    
    inline def setGetTypes(value: () => Any): Self = StObject.set(x, "getTypes", js.Any.fromFunction0(value))
  }
}
