package typings.vegaTypings.anon

import typings.vegaTypings.vegaTypingsStrings.exterior
import typings.vegaTypings.vegaTypingsStrings.interior
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends StObject {
  
  var filter: interior | exterior | Null = js.native
  
  var mesh: String = js.native
}
object Filter {
  
  @scala.inline
  def apply(mesh: String): Filter = {
    val __obj = js.Dynamic.literal(mesh = mesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterMutableBuilder[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: interior | exterior): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = StObject.set(x, "filter", null)
    
    @scala.inline
    def setMesh(value: String): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
  }
}
