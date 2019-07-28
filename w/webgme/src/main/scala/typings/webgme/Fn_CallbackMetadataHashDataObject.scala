package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashDataObject extends js.Object {
  def apply(metadataHash: MetadataHash): js.Promise[DataObject] = js.native
  def apply(metadataHash: MetadataHash, callback: ResultCallback[DataObject]): Unit = js.native
}

