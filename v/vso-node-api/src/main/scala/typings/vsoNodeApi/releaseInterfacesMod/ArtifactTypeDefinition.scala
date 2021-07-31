package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactTypeDefinition extends StObject {
  
  var displayName: String
  
  var inputDescriptors: js.Array[InputDescriptor]
  
  var name: String
  
  var uniqueSourceIdentifier: String
}
object ArtifactTypeDefinition {
  
  @scala.inline
  def apply(
    displayName: String,
    inputDescriptors: js.Array[InputDescriptor],
    name: String,
    uniqueSourceIdentifier: String
  ): ArtifactTypeDefinition = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uniqueSourceIdentifier = uniqueSourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactTypeDefinition]
  }
  
  @scala.inline
  implicit class ArtifactTypeDefinitionMutableBuilder[Self <: ArtifactTypeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptors(value: js.Array[InputDescriptor]): Self = StObject.set(x, "inputDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptorsVarargs(value: InputDescriptor*): Self = StObject.set(x, "inputDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueSourceIdentifier(value: String): Self = StObject.set(x, "uniqueSourceIdentifier", value.asInstanceOf[js.Any])
  }
}
