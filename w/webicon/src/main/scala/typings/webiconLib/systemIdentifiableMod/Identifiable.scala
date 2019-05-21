package typings
package webiconLib.systemIdentifiableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifiable extends js.Object {
  /**
    * The id of the object.
    */
  var id: java.lang.String
}

object Identifiable {
  @scala.inline
  def apply(id: java.lang.String): Identifiable = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[Identifiable]
  }
}

