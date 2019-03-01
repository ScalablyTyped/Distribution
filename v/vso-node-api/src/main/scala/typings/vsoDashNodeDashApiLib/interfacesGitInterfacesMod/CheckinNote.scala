package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckinNote extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object CheckinNote {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): CheckinNote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CheckinNote]
  }
}

