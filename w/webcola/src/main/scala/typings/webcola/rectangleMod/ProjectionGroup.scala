package typings.webcola.rectangleMod

import typings.webcola.vpscMod.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectionGroup extends js.Object {
  
  var bounds: Rectangle = js.native
  
  var groups: js.Array[ProjectionGroup] = js.native
  
  var leaves: js.Array[Leaf] = js.native
  
  var maxVar: Variable = js.native
  
  var minVar: Variable = js.native
  
  var padding: Double = js.native
  
  var stiffness: Double = js.native
}
object ProjectionGroup {
  
  @scala.inline
  def apply(
    bounds: Rectangle,
    groups: js.Array[ProjectionGroup],
    leaves: js.Array[Leaf],
    maxVar: Variable,
    minVar: Variable,
    padding: Double,
    stiffness: Double
  ): ProjectionGroup = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], leaves = leaves.asInstanceOf[js.Any], maxVar = maxVar.asInstanceOf[js.Any], minVar = minVar.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionGroup]
  }
  
  @scala.inline
  implicit class ProjectionGroupOps[Self <: ProjectionGroup] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: Rectangle): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: ProjectionGroup*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[ProjectionGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeavesVarargs(value: Leaf*): Self = this.set("leaves", js.Array(value :_*))
    
    @scala.inline
    def setLeaves(value: js.Array[Leaf]): Self = this.set("leaves", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVar(value: Variable): Self = this.set("maxVar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVar(value: Variable): Self = this.set("minVar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffness(value: Double): Self = this.set("stiffness", value.asInstanceOf[js.Any])
  }
}
