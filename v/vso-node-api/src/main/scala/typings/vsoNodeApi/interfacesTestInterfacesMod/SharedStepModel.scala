package typings.vsoNodeApi.interfacesTestInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedStepModel extends StObject {
  
  var id: Double
  
  var revision: Double
}
object SharedStepModel {
  
  inline def apply(id: Double, revision: Double): SharedStepModel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStepModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedStepModel] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
