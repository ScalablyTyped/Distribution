package typings.typeorm.treeMetadataArgsMod

import typings.typeorm.treeTypesMod.TreeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMetadataArgs extends js.Object {
  
  /**
    * Entity to which tree is applied.
    */
  var target: js.Function | String = js.native
  
  /**
    * Tree type.
    */
  var `type`: TreeType = js.native
}
object TreeMetadataArgs {
  
  @scala.inline
  def apply(target: js.Function | String, `type`: TreeType): TreeMetadataArgs = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeMetadataArgs]
  }
  
  @scala.inline
  implicit class TreeMetadataArgsOps[Self <: TreeMetadataArgs] (val x: Self) extends AnyVal {
    
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
    def setTarget(value: js.Function | String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TreeType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
