package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsReadonly[Params /* <: js.UndefOr[js.Object] */] extends js.Object {
  
  /**
    * Params for this route
    */
  var params: Params = js.native
}
object ParamsReadonly {
  
  @scala.inline
  def apply[Params /* <: js.UndefOr[js.Object] */](params: Params): ParamsReadonly[Params] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsReadonly[Params]]
  }
  
  @scala.inline
  implicit class ParamsReadonlyOps[Self <: ParamsReadonly[_], Params /* <: js.UndefOr[js.Object] */] (val x: Self with ParamsReadonly[Params]) extends AnyVal {
    
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
    def setParams(value: Params): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
