package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.stackTypesMod.StackNavigationEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BC[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends js.Object {
  
  var a: ParamList = js.native
  
  var b: RouteName = js.native
  
  var c: StackNavigationEventMap = js.native
}
object BC {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](a: ParamList, b: RouteName, c: StackNavigationEventMap): BC[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[BC[ParamList, RouteName]]
  }
  
  @scala.inline
  implicit class BCOps[Self <: BC[_, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] (val x: Self with (BC[ParamList, RouteName])) extends AnyVal {
    
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
    def setA(value: ParamList): Self = this.set("a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setB(value: RouteName): Self = this.set("b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setC(value: StackNavigationEventMap): Self = this.set("c", value.asInstanceOf[js.Any])
  }
}
