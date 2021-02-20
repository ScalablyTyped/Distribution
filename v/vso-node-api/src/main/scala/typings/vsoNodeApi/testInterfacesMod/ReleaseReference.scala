package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseReference extends StObject {
  
  var definitionId: Double = js.native
  
  var environmentDefinitionId: Double = js.native
  
  var environmentDefinitionName: String = js.native
  
  var environmentId: Double = js.native
  
  var environmentName: String = js.native
  
  var id: Double = js.native
  
  var name: String = js.native
}
object ReleaseReference {
  
  @scala.inline
  def apply(
    definitionId: Double,
    environmentDefinitionId: Double,
    environmentDefinitionName: String,
    environmentId: Double,
    environmentName: String,
    id: Double,
    name: String
  ): ReleaseReference = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], environmentDefinitionId = environmentDefinitionId.asInstanceOf[js.Any], environmentDefinitionName = environmentDefinitionName.asInstanceOf[js.Any], environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseReference]
  }
  
  @scala.inline
  implicit class ReleaseReferenceMutableBuilder[Self <: ReleaseReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentDefinitionId(value: Double): Self = StObject.set(x, "environmentDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentDefinitionName(value: String): Self = StObject.set(x, "environmentDefinitionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentId(value: Double): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
