package typings.wouter.mod

import typings.wouter.matcherMod.DefaultParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteComponentProps[T /* <: DefaultParams */] extends js.Object {
  
  var params: T = js.native
}
object RouteComponentProps {
  
  @scala.inline
  def apply[T /* <: DefaultParams */](params: T): RouteComponentProps[T] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteComponentProps[T]]
  }
  
  @scala.inline
  implicit class RouteComponentPropsOps[Self <: RouteComponentProps[_], T /* <: DefaultParams */] (val x: Self with RouteComponentProps[T]) extends AnyVal {
    
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
    def setParams(value: T): Self = this.set("params", value.asInstanceOf[js.Any])
  }
}
