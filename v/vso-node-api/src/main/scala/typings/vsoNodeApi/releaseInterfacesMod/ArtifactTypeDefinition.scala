package typings.vsoNodeApi.releaseInterfacesMod

import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactTypeDefinition extends js.Object {
  
  var displayName: String = js.native
  
  var inputDescriptors: js.Array[InputDescriptor] = js.native
  
  var name: String = js.native
  
  var uniqueSourceIdentifier: String = js.native
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
  implicit class ArtifactTypeDefinitionOps[Self <: ArtifactTypeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptorsVarargs(value: InputDescriptor*): Self = this.set("inputDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setInputDescriptors(value: js.Array[InputDescriptor]): Self = this.set("inputDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueSourceIdentifier(value: String): Self = this.set("uniqueSourceIdentifier", value.asInstanceOf[js.Any])
  }
}
