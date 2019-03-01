package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
}

object Category {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): Category = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Category]
  }
}

