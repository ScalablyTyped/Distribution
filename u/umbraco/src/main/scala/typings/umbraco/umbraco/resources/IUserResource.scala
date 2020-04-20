package typings.umbraco.umbraco.resources

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @ngdoc service
  * @name umbraco.resources.userResource
  **/
trait IUserResource extends js.Object {
  def disableUser(userId: Double): Unit
}

object IUserResource {
  @scala.inline
  def apply(disableUser: Double => Unit): IUserResource = {
    val __obj = js.Dynamic.literal(disableUser = js.Any.fromFunction1(disableUser))
    __obj.asInstanceOf[IUserResource]
  }
}

