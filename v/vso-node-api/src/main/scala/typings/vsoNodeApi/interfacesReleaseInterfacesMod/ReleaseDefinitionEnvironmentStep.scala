package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionEnvironmentStep extends StObject {
  
  var id: Double
}
object ReleaseDefinitionEnvironmentStep {
  
  inline def apply(id: Double): ReleaseDefinitionEnvironmentStep = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseDefinitionEnvironmentStep] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
