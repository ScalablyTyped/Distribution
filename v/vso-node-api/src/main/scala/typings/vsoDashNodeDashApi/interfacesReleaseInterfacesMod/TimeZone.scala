package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeZone extends js.Object {
  var displayName: String
  var id: String
}

object TimeZone {
  @scala.inline
  def apply(displayName: String, id: String): TimeZone = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id)
  
    __obj.asInstanceOf[TimeZone]
  }
}

