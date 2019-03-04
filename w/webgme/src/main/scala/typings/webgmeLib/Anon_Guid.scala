package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Guid extends js.Object {
  var guid: webgmeLib.v1Mod.GUID
  var path: java.lang.String
}

object Anon_Guid {
  @scala.inline
  def apply(guid: webgmeLib.v1Mod.GUID, path: java.lang.String): Anon_Guid = {
    val __obj = js.Dynamic.literal(guid = guid, path = path)
  
    __obj.asInstanceOf[Anon_Guid]
  }
}

