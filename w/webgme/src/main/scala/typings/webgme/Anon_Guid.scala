package typings.webgme

import typings.webgme.v1Mod.GUID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Guid extends js.Object {
  var guid: GUID
  var path: String
}

object Anon_Guid {
  @scala.inline
  def apply(guid: GUID, path: String): Anon_Guid = {
    val __obj = js.Dynamic.literal(guid = guid, path = path)
  
    __obj.asInstanceOf[Anon_Guid]
  }
}

