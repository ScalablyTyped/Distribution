package typings.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.userResource
  **/
@js.native
trait IUserResource extends js.Object {
  
  def disableUser(userId: Double): Unit = js.native
}
object IUserResource {
  
  @scala.inline
  def apply(disableUser: Double => Unit): IUserResource = {
    val __obj = js.Dynamic.literal(disableUser = js.Any.fromFunction1(disableUser))
    __obj.asInstanceOf[IUserResource]
  }
  
  @scala.inline
  implicit class IUserResourceOps[Self <: IUserResource] (val x: Self) extends AnyVal {
    
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
    def setDisableUser(value: Double => Unit): Self = this.set("disableUser", js.Any.fromFunction1(value))
  }
}
