package typings.vsoNodeApi.vssinterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventScope extends js.Object {
  /**
    * Required: This is the identity of the scope for the type.
    */
  var id: String
  /**
    * Optional: The display name of the scope
    */
  var name: String
  /**
    * Required: The event specific type of a scope.
    */
  var `type`: String
}

object EventScope {
  @scala.inline
  def apply(id: String, name: String, `type`: String): EventScope = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventScope]
  }
}

