package typings.vscodeDashLanguageserverDashProtocol.libProtocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileEvent extends js.Object {
  /**
    * The change type.
    */
  var `type`: FileChangeType
  /**
    * The file's uri.
    */
  var uri: String
}

object FileEvent {
  @scala.inline
  def apply(`type`: FileChangeType, uri: String): FileEvent = {
    val __obj = js.Dynamic.literal(uri = uri)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FileEvent]
  }
}

