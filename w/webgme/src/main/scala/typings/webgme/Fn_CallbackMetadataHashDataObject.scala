package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashDataObject extends js.Object {
  def apply(metadataHash: MetadataHash): js.Promise[DataObject] = js.native
  def apply(metadataHash: MetadataHash, callback: ResultCallback[DataObject]): Unit = js.native
}

