package typings.winrt.WindowsNs.StorageNs.AccessCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessListEntry extends js.Object {
  var metadata: String
  var token: String
}

object AccessListEntry {
  @scala.inline
  def apply(metadata: String, token: String): AccessListEntry = {
    val __obj = js.Dynamic.literal(metadata = metadata, token = token)
  
    __obj.asInstanceOf[AccessListEntry]
  }
}

