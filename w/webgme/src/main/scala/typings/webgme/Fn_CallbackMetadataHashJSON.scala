package typings.webgme

import typings.std.JSON
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashJSON extends js.Object {
  def apply(metadataHash: MetadataHash): js.Promise[JSON] = js.native
  def apply(metadataHash: MetadataHash, callback: ResultCallback[JSON]): Unit = js.native
}

