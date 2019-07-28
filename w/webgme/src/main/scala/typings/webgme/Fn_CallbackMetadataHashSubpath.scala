package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashSubpath extends js.Object {
  def apply(metadataHash: MetadataHash, subpath: String): js.Promise[DataObject] = js.native
  def apply(metadataHash: MetadataHash, subpath: String, callback: ResultCallback[DataObject]): Unit = js.native
}

