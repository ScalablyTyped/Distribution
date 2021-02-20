package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SvnWorkspace extends StObject {
  
  var mappings: js.Array[SvnMappingDetails] = js.native
}
object SvnWorkspace {
  
  @scala.inline
  def apply(mappings: js.Array[SvnMappingDetails]): SvnWorkspace = {
    val __obj = js.Dynamic.literal(mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SvnWorkspace]
  }
  
  @scala.inline
  implicit class SvnWorkspaceMutableBuilder[Self <: SvnWorkspace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMappings(value: js.Array[SvnMappingDetails]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMappingsVarargs(value: SvnMappingDetails*): Self = StObject.set(x, "mappings", js.Array(value :_*))
  }
}
