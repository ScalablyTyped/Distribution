package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashSubpath extends js.Object {
  def apply(metadataHash: MetadataHash, subpath: String): js.Promise[DataObject] = js.native
  def apply(metadataHash: MetadataHash, subpath: String, callback: ResultCallback[DataObject]): Unit = js.native
}

