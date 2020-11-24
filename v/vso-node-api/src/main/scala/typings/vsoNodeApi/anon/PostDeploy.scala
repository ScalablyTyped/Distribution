package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostDeploy extends js.Object {
  
  var all: scala.Double = js.native
  
  var postDeploy: scala.Double = js.native
  
  var preDeploy: scala.Double = js.native
  
  var undefined: scala.Double = js.native
}
object PostDeploy {
  
  @scala.inline
  def apply(all: scala.Double, postDeploy: scala.Double, preDeploy: scala.Double, undefined: scala.Double): PostDeploy = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], postDeploy = postDeploy.asInstanceOf[js.Any], preDeploy = preDeploy.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostDeploy]
  }
  
  @scala.inline
  implicit class PostDeployOps[Self <: PostDeploy] (val x: Self) extends AnyVal {
    
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostDeploy(value: scala.Double): Self = this.set("postDeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreDeploy(value: scala.Double): Self = this.set("preDeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefined(value: scala.Double): Self = this.set("undefined", value.asInstanceOf[js.Any])
  }
}
