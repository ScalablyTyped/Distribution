package typings.webgme

import typings.webgme.v1Mod.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGuid extends js.Object {
  var guid: GUID
  var path: String
}

object AnonGuid {
  @scala.inline
  def apply(guid: GUID, path: String): AnonGuid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGuid]
  }
}

