package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardRow extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
}

object BoardRow {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): BoardRow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BoardRow]
  }
}

