package typings.stylableUniDriver.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementRemoteApi extends js.Object {
  
  def attr(name: String): js.Promise[String | Null] = js.native
  
  def hasClass(s: String): js.Promise[Boolean] = js.native
}
object ElementRemoteApi {
  
  @scala.inline
  def apply(attr: String => js.Promise[String | Null], hasClass: String => js.Promise[Boolean]): ElementRemoteApi = {
    val __obj = js.Dynamic.literal(attr = js.Any.fromFunction1(attr), hasClass = js.Any.fromFunction1(hasClass))
    __obj.asInstanceOf[ElementRemoteApi]
  }
  
  @scala.inline
  implicit class ElementRemoteApiOps[Self <: ElementRemoteApi] (val x: Self) extends AnyVal {
    
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
    def setAttr(value: String => js.Promise[String | Null]): Self = this.set("attr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasClass(value: String => js.Promise[Boolean]): Self = this.set("hasClass", js.Any.fromFunction1(value))
  }
}
