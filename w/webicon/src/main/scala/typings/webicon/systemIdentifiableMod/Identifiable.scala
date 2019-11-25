package typings.webicon.systemIdentifiableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifiable extends js.Object {
  /**
    * The id of the object.
    */
  var id: String
}

object Identifiable {
  @scala.inline
  def apply(id: String): Identifiable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Identifiable]
  }
}

