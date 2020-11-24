package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.typesMod.PathConfigMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialRouteName extends js.Object {
  
  var initialRouteName: js.UndefOr[String] = js.native
  
  var screens: PathConfigMap = js.native
}
object InitialRouteName {
  
  @scala.inline
  def apply(screens: PathConfigMap): InitialRouteName = {
    val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialRouteName]
  }
  
  @scala.inline
  implicit class InitialRouteNameOps[Self <: InitialRouteName] (val x: Self) extends AnyVal {
    
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
    def setScreens(value: PathConfigMap): Self = this.set("screens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteName(value: String): Self = this.set("initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialRouteName: Self = this.set("initialRouteName", js.undefined)
  }
}
