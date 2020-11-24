package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.treelinks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeLinksTransform extends _Transforms {
  
  var `type`: treelinks = js.native
}
object TreeLinksTransform {
  
  @scala.inline
  def apply(`type`: treelinks): TreeLinksTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeLinksTransform]
  }
  
  @scala.inline
  implicit class TreeLinksTransformOps[Self <: TreeLinksTransform] (val x: Self) extends AnyVal {
    
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
    def setType(value: treelinks): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
