package typings.umbraco.umbraco.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @ngdoc service
  * @name umbraco.resources.userResource
  **/
trait IUserResource extends StObject {
  
  def disableUser(userId: Double): Unit
}
object IUserResource {
  
  @scala.inline
  def apply(disableUser: Double => Unit): IUserResource = {
    val __obj = js.Dynamic.literal(disableUser = js.Any.fromFunction1(disableUser))
    __obj.asInstanceOf[IUserResource]
  }
  
  @scala.inline
  implicit class IUserResourceMutableBuilder[Self <: IUserResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableUser(value: Double => Unit): Self = StObject.set(x, "disableUser", js.Any.fromFunction1(value))
  }
}
