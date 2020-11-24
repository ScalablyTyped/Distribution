package typings.wordpressCustomizeBrowser.containerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerArguments extends js.Object {
  
  var completeCallback: js.UndefOr[js.Function0[Unit]] = js.native
  
  var duration: js.UndefOr[String | Double] = js.native
  
  var unchanged: js.UndefOr[Boolean] = js.native
}
object ContainerArguments {
  
  @scala.inline
  def apply(): ContainerArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerArguments]
  }
  
  @scala.inline
  implicit class ContainerArgumentsOps[Self <: ContainerArguments] (val x: Self) extends AnyVal {
    
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
    def setCompleteCallback(value: () => Unit): Self = this.set("completeCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCompleteCallback: Self = this.set("completeCallback", js.undefined)
    
    @scala.inline
    def setDuration(value: String | Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setUnchanged(value: Boolean): Self = this.set("unchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnchanged: Self = this.set("unchanged", js.undefined)
  }
}
