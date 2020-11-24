package typings.tuyaPanelKit.tabRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/types.DefaultRouterOptions<string> & {  backBehavior :tuya-panel-kit.tuya-panel-kit/@react-navigation/routers/TabRouter.BackBehavior | undefined} */
@js.native
trait TabRouterOptions extends js.Object {
  
  var backBehavior: js.UndefOr[BackBehavior] = js.native
  
  /**
    * Name of the route to focus by on initial render.
    * If not specified, usually the first route is used.
    */
  var initialRouteName: js.UndefOr[String] = js.native
}
object TabRouterOptions {
  
  @scala.inline
  def apply(): TabRouterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabRouterOptions]
  }
  
  @scala.inline
  implicit class TabRouterOptionsOps[Self <: TabRouterOptions] (val x: Self) extends AnyVal {
    
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
    def setBackBehavior(value: BackBehavior): Self = this.set("backBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackBehavior: Self = this.set("backBehavior", js.undefined)
    
    @scala.inline
    def setInitialRouteName(value: String): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
  }
}
