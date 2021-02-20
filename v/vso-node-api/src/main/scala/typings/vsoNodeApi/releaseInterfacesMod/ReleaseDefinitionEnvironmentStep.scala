package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionEnvironmentStep extends StObject {
  
  var id: Double = js.native
}
object ReleaseDefinitionEnvironmentStep {
  
  @scala.inline
  def apply(id: Double): ReleaseDefinitionEnvironmentStep = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionEnvironmentStep]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionEnvironmentStepMutableBuilder[Self <: ReleaseDefinitionEnvironmentStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
