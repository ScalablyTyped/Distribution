package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import typings.tuyaPanelKit.typesMod.EventMapBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait B[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, EventMap /* <: EventMapBase */] extends js.Object {
  
  var a: ParamList = js.native
  
  var b: RouteName = js.native
  
  var c: EventMap = js.native
}
object B {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, EventMap /* <: EventMapBase */](a: ParamList, b: RouteName, c: EventMap): B[ParamList, RouteName, EventMap] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[B[ParamList, RouteName, EventMap]]
  }
  
  @scala.inline
  implicit class BOps[Self <: B[_, _, _], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, EventMap /* <: EventMapBase */] (val x: Self with (B[ParamList, RouteName, EventMap])) extends AnyVal {
    
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
    def setC(value: EventMap): Self = this.set("c", value.asInstanceOf[js.Any])
  }
}
