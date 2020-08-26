package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TfvcBranchMapping extends js.Object {
  /**
    * Depth of the branch.
    */
  var depth: String = js.native
  /**
    * Server item for the branch.
    */
  var serverItem: String = js.native
  /**
    * Type of the branch.
    */
  var `type`: String = js.native
}

object TfvcBranchMapping {
  @scala.inline
  def apply(depth: String, serverItem: String, `type`: String): TfvcBranchMapping = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcBranchMapping]
  }
  @scala.inline
  implicit class TfvcBranchMappingOps[Self <: TfvcBranchMapping] (val x: Self) extends AnyVal {
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
    def setDepth(value: String): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerItem(value: String): Self = this.set("serverItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

