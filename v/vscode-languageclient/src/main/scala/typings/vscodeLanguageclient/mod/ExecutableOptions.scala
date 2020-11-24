package typings.vscodeLanguageclient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecutableOptions extends js.Object {
  
  var cwd: js.UndefOr[String] = js.native
  
  var detached: js.UndefOr[Boolean] = js.native
  
  var env: js.UndefOr[js.Any] = js.native
  
  var shell: js.UndefOr[Boolean] = js.native
}
object ExecutableOptions {
  
  @scala.inline
  def apply(): ExecutableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutableOptions]
  }
  
  @scala.inline
  implicit class ExecutableOptionsOps[Self <: ExecutableOptions] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    
    @scala.inline
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    
    @scala.inline
    def setEnv(value: js.Any): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setShell(value: Boolean): Self = this.set("shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShell: Self = this.set("shell", js.undefined)
  }
}
