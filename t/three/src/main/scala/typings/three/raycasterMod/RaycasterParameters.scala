package typings.three.raycasterMod

import typings.three.anon.Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RaycasterParameters extends js.Object {
  
  var LOD: js.UndefOr[js.Any] = js.native
  
  var Line: js.UndefOr[Threshold] = js.native
  
  var Mesh: js.UndefOr[js.Any] = js.native
  
  var Points: js.UndefOr[Threshold] = js.native
  
  var Sprite: js.UndefOr[js.Any] = js.native
}
object RaycasterParameters {
  
  @scala.inline
  def apply(): RaycasterParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RaycasterParameters]
  }
  
  @scala.inline
  implicit class RaycasterParametersOps[Self <: RaycasterParameters] (val x: Self) extends AnyVal {
    
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
    def setLOD(value: js.Any): Self = this.set("LOD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLOD: Self = this.set("LOD", js.undefined)
    
    @scala.inline
    def setLine(value: Threshold): Self = this.set("Line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("Line", js.undefined)
    
    @scala.inline
    def setMesh(value: js.Any): Self = this.set("Mesh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMesh: Self = this.set("Mesh", js.undefined)
    
    @scala.inline
    def setPoints(value: Threshold): Self = this.set("Points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoints: Self = this.set("Points", js.undefined)
    
    @scala.inline
    def setSprite(value: js.Any): Self = this.set("Sprite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSprite: Self = this.set("Sprite", js.undefined)
  }
}
