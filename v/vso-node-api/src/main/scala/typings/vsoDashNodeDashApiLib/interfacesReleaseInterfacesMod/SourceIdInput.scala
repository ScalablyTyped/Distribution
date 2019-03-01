package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceIdInput extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
}

object SourceIdInput {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String): SourceIdInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SourceIdInput]
  }
}

