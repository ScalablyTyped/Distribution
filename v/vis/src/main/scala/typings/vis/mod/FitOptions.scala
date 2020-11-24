package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FitOptions extends js.Object {
  
  /**
    * For animation you can either use a Boolean to use it with the default options or
    * disable it or you can define the duration (in milliseconds) and easing function manually.
    */
  var animation: TimelineAnimationType = js.native
  
  /**
    * The nodes can be used to zoom to fit only specific nodes in the view.
    */
  var nodes: js.UndefOr[js.Array[String]] = js.native
}
object FitOptions {
  
  @scala.inline
  def apply(animation: TimelineAnimationType): FitOptions = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitOptions]
  }
  
  @scala.inline
  implicit class FitOptionsOps[Self <: FitOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: TimelineAnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: String*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[String]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
  }
}
