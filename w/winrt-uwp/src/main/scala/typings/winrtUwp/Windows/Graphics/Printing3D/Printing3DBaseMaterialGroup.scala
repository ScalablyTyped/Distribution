package typings.winrtUwp.Windows.Graphics.Printing3D

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of base materials used in the 3D model. */
@js.native
trait Printing3DBaseMaterialGroup extends js.Object {
  
  /** Gets a group of base materials used in the 3D model. */
  var bases: IVector[Printing3DBaseMaterial] = js.native
  
  /** Gets the identifier (ID) of the base material group. */
  var materialGroupId: Double = js.native
}
object Printing3DBaseMaterialGroup {
  
  @scala.inline
  def apply(bases: IVector[Printing3DBaseMaterial], materialGroupId: Double): Printing3DBaseMaterialGroup = {
    val __obj = js.Dynamic.literal(bases = bases.asInstanceOf[js.Any], materialGroupId = materialGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printing3DBaseMaterialGroup]
  }
  
  @scala.inline
  implicit class Printing3DBaseMaterialGroupOps[Self <: Printing3DBaseMaterialGroup] (val x: Self) extends AnyVal {
    
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
    def setBases(value: IVector[Printing3DBaseMaterial]): Self = this.set("bases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialGroupId(value: Double): Self = this.set("materialGroupId", value.asInstanceOf[js.Any])
  }
}
