package typings.uikit.mod.UIkit

import typings.uikit.mod.UIkitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitNavElement extends js.Object {
  
  var animate: Boolean = js.native
  
  var index: String | Double | UIkitNode = js.native
}
object UIkitNavElement {
  
  @scala.inline
  def apply(animate: Boolean, index: String | Double | UIkitNode): UIkitNavElement = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitNavElement]
  }
  
  @scala.inline
  implicit class UIkitNavElementOps[Self <: UIkitNavElement] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String | Double | UIkitNode): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
