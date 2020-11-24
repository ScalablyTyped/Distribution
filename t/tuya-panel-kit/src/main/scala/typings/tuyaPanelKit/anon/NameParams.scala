package typings.tuyaPanelKit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameParams[RouteName_1 /* <: String */] extends js.Object {
  
  // tslint:disable-next-line no-redundant-undefined
  var key: js.UndefOr[String] = js.native
  
  // tslint:disable-next-line no-unnecessary-generics
  var name: RouteName_1 = js.native
  
  var params: js.UndefOr[js.Object] = js.native
}
object NameParams {
  
  @scala.inline
  def apply[RouteName_1 /* <: String */](name: RouteName_1): NameParams[RouteName_1] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameParams[RouteName_1]]
  }
  
  @scala.inline
  implicit class NameParamsOps[Self <: NameParams[_], RouteName_1 /* <: String */] (val x: Self with NameParams[RouteName_1]) extends AnyVal {
    
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
    def setName(value: RouteName_1): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
