package typings.wallabyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWallabyEnvironmentParameters extends js.Object {
  
  var env: js.UndefOr[String] = js.native
  
  var runner: js.UndefOr[String] = js.native
}
object IWallabyEnvironmentParameters {
  
  @scala.inline
  def apply(): IWallabyEnvironmentParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWallabyEnvironmentParameters]
  }
  
  @scala.inline
  implicit class IWallabyEnvironmentParametersOps[Self <: IWallabyEnvironmentParameters] (val x: Self) extends AnyVal {
    
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
    def setEnv(value: String): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setRunner(value: String): Self = this.set("runner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunner: Self = this.set("runner", js.undefined)
  }
}
