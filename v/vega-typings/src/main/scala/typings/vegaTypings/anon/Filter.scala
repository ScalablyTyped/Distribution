package typings.vegaTypings.anon

import typings.vegaTypings.vegaTypingsStrings.exterior
import typings.vegaTypings.vegaTypingsStrings.interior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
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
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setMesh(value: String): Self = this.set("mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: interior | exterior): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = this.set("filter", null)
  }
}
