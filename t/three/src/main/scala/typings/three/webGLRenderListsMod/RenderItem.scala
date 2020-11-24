package typings.three.webGLRenderListsMod

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.groupMod.Group
import typings.three.materialMod.Material
import typings.three.object3DMod.Object3D
import typings.three.webGLProgramMod.WebGLProgram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RenderItem extends js.Object {
  
  var geometry: BufferGeometry | Null = js.native
  
  var group: Group | Null = js.native
  
  var groupOrder: Double = js.native
  
  var id: Double = js.native
  
  var material: Material = js.native
  
  var `object`: Object3D = js.native
  
  var program: WebGLProgram = js.native
  
  var renderOrder: Double = js.native
  
  var z: Double = js.native
}
object RenderItem {
  
  @scala.inline
  def apply(
    groupOrder: Double,
    id: Double,
    material: Material,
    `object`: Object3D,
    program: WebGLProgram,
    renderOrder: Double,
    z: Double
  ): RenderItem = {
    val __obj = js.Dynamic.literal(groupOrder = groupOrder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], material = material.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], renderOrder = renderOrder.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderItem]
  }
  
  @scala.inline
  implicit class RenderItemOps[Self <: RenderItem] (val x: Self) extends AnyVal {
    
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
    def setGroupOrder(value: Double): Self = this.set("groupOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterial(value: Material): Self = this.set("material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Object3D): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgram(value: WebGLProgram): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderOrder(value: Double): Self = this.set("renderOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: BufferGeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryNull: Self = this.set("geometry", null)
    
    @scala.inline
    def setGroup(value: Group): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
  }
}
