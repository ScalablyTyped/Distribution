package typings.webgme.GmeCommon

import typings.webgme.Core.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaInfo extends js.Object {
  
  var owner: Node = js.native
  
  var ownerPath: Path = js.native
  
  var target: Node = js.native
  
  var targetPath: Path = js.native
}
object MetaInfo {
  
  @scala.inline
  def apply(owner: Node, ownerPath: Path, target: Node, targetPath: Path): MetaInfo = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerPath = ownerPath.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaInfo]
  }
  
  @scala.inline
  implicit class MetaInfoOps[Self <: MetaInfo] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: Node): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerPath(value: Path): Self = this.set("ownerPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Node): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetPath(value: Path): Self = this.set("targetPath", value.asInstanceOf[js.Any])
  }
}
