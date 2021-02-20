package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefinitionEnvironmentReference extends StObject {
  
  var definitionEnvironmentId: Double = js.native
  
  var definitionEnvironmentName: String = js.native
  
  var releaseDefinitionId: Double = js.native
  
  var releaseDefinitionName: String = js.native
}
object DefinitionEnvironmentReference {
  
  @scala.inline
  def apply(
    definitionEnvironmentId: Double,
    definitionEnvironmentName: String,
    releaseDefinitionId: Double,
    releaseDefinitionName: String
  ): DefinitionEnvironmentReference = {
    val __obj = js.Dynamic.literal(definitionEnvironmentId = definitionEnvironmentId.asInstanceOf[js.Any], definitionEnvironmentName = definitionEnvironmentName.asInstanceOf[js.Any], releaseDefinitionId = releaseDefinitionId.asInstanceOf[js.Any], releaseDefinitionName = releaseDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionEnvironmentReference]
  }
  
  @scala.inline
  implicit class DefinitionEnvironmentReferenceMutableBuilder[Self <: DefinitionEnvironmentReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionEnvironmentId(value: Double): Self = StObject.set(x, "definitionEnvironmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionEnvironmentName(value: String): Self = StObject.set(x, "definitionEnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDefinitionId(value: Double): Self = StObject.set(x, "releaseDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDefinitionName(value: String): Self = StObject.set(x, "releaseDefinitionName", value.asInstanceOf[js.Any])
  }
}
