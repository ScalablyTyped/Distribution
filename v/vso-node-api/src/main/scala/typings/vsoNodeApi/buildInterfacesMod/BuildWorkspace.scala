package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildWorkspace extends StObject {
  
  var mappings: js.Array[MappingDetails] = js.native
}
object BuildWorkspace {
  
  @scala.inline
  def apply(mappings: js.Array[MappingDetails]): BuildWorkspace = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildWorkspace]
  }
  
  @scala.inline
  implicit class BuildWorkspaceMutableBuilder[Self <: BuildWorkspace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMappings(value: js.Array[MappingDetails]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingsVarargs(value: MappingDetails*): Self = StObject.set(x, "mappings", js.Array(value :_*))
  }
}
