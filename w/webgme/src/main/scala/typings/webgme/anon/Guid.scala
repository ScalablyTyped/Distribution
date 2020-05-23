package typings.webgme.anon

import typings.webgme.v1Mod.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guid extends js.Object {
  var guid: GUID
  var path: String
}

object Guid {
  @scala.inline
  def apply(guid: GUID, path: String): Guid = {
    val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guid]
  }
}

