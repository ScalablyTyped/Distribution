package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait A[ParamList /* <: ParamListBase */] extends js.Object {
  
  var a: ParamList = js.native
  
  var b: /* keyof ParamList */ String = js.native
}
object A {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */](a: ParamList, b: /* keyof ParamList */ String): A[ParamList] = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[A[ParamList]]
  }
  
  @scala.inline
  implicit class AOps[Self <: A[_], ParamList /* <: ParamListBase */] (val x: Self with A[ParamList]) extends AnyVal {
    
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
    def setB(value: /* keyof ParamList */ String): Self = this.set("b", value.asInstanceOf[js.Any])
  }
}
