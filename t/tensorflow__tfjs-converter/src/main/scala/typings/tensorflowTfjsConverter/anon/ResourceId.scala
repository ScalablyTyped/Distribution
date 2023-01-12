package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceId extends StObject {
  
  var dtype: String
  
  var name: String
  
  var resourceId: Double
}
object ResourceId {
  
  inline def apply(dtype: String, name: String, resourceId: Double): ResourceId = {
    val __obj = js.Dynamic.literal(dtype = dtype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceId] (val x: Self) extends AnyVal {
    
    inline def setDtype(value: String): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setResourceId(value: Double): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
  }
}
