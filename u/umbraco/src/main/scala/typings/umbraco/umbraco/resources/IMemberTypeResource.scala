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
  def getTypes(): js.Any
}
object IMemberTypeResource {
  
  @scala.inline
  def apply(getTypes: () => js.Any): IMemberTypeResource = {
    val __obj = js.Dynamic.literal(getTypes = js.Any.fromFunction0(getTypes))
    __obj.asInstanceOf[IMemberTypeResource]
  }
  
  @scala.inline
  implicit class IMemberTypeResourceMutableBuilder[Self <: IMemberTypeResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetTypes(value: () => js.Any): Self = StObject.set(x, "getTypes", js.Any.fromFunction0(value))
  }
}
