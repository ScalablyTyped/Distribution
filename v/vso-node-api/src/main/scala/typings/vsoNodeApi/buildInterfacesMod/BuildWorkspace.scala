package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildWorkspace extends js.Object {
  
  var mappings: js.Array[MappingDetails] = js.native
}
object BuildWorkspace {
  
  @scala.inline
  def apply(mappings: js.Array[MappingDetails]): BuildWorkspace = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildWorkspace]
  }
  
  @scala.inline
  implicit class BuildWorkspaceOps[Self <: BuildWorkspace] (val x: Self) extends AnyVal {
    
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
    def setMappingsVarargs(value: MappingDetails*): Self = this.set("mappings", js.Array(value :_*))
    
    @scala.inline
    def setMappings(value: js.Array[MappingDetails]): Self = this.set("mappings", value.asInstanceOf[js.Any])
  }
}
