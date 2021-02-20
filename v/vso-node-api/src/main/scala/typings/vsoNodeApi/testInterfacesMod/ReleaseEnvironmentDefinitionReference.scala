package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseEnvironmentDefinitionReference extends StObject {
  
  var definitionId: Double = js.native
  
  var environmentDefinitionId: Double = js.native
}
object ReleaseEnvironmentDefinitionReference {
  
  @scala.inline
  def apply(definitionId: Double, environmentDefinitionId: Double): ReleaseEnvironmentDefinitionReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], environmentDefinitionId = environmentDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseEnvironmentDefinitionReference]
  }
  
  @scala.inline
  implicit class ReleaseEnvironmentDefinitionReferenceMutableBuilder[Self <: ReleaseEnvironmentDefinitionReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentDefinitionId(value: Double): Self = StObject.set(x, "environmentDefinitionId", value.asInstanceOf[js.Any])
  }
}
