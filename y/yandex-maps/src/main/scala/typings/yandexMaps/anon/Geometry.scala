package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry[TargetGeometry] extends js.Object {
  
  var geometry: js.UndefOr[TargetGeometry] = js.native
}
object Geometry {
  
  @scala.inline
  def apply[TargetGeometry](): Geometry[TargetGeometry] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geometry[TargetGeometry]]
  }
  
  @scala.inline
  implicit class GeometryOps[Self <: Geometry[_], TargetGeometry] (val x: Self with Geometry[TargetGeometry]) extends AnyVal {
    
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
    def setGeometry(value: TargetGeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
  }
}
