package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: Double
  
  var subsystem_id: Double
}
object Id {
  
  inline def apply(id: Double, subsystem_id: Double): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], subsystem_id = subsystem_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSubsystem_id(value: Double): Self = StObject.set(x, "subsystem_id", value.asInstanceOf[js.Any])
  }
}
