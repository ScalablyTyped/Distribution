package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZone extends js.Object {
  var displayName: java.lang.String
  var id: java.lang.String
}

object TimeZone {
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String): TimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[TimeZone]
  }
}

