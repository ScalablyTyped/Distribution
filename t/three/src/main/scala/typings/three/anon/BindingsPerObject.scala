package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingsPerObject extends StObject {
  
  var bindingsPerObject: Double
  
  var objects: InUse
}
object BindingsPerObject {
  
  inline def apply(bindingsPerObject: Double, objects: InUse): BindingsPerObject = {
    val __obj = js.Dynamic.literal(bindingsPerObject = bindingsPerObject.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingsPerObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingsPerObject] (val x: Self) extends AnyVal {
    
    inline def setBindingsPerObject(value: Double): Self = StObject.set(x, "bindingsPerObject", value.asInstanceOf[js.Any])
    
    inline def setObjects(value: InUse): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
  }
}
