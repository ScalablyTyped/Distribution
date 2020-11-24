package typings.uirouterCore.stateInterfaceMod

import typings.uirouterCore.paramsInterfaceMod.RawParams
import typings.uirouterCore.transitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetStateDef extends js.Object {
  
  var options: js.UndefOr[TransitionOptions] = js.native
  
  var params: js.UndefOr[RawParams] = js.native
  
  var state: StateOrName = js.native
}
object TargetStateDef {
  
  @scala.inline
  def apply(state: StateOrName): TargetStateDef = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetStateDef]
  }
  
  @scala.inline
  implicit class TargetStateDefOps[Self <: TargetStateDef] (val x: Self) extends AnyVal {
    
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
    def setState(value: StateOrName): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: TransitionOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setParams(value: RawParams): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
