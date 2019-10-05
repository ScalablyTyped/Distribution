package typings.webgme

import typings.webgme.GmeCommon.Metadata
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashMetadata extends js.Object {
  def apply(metadataHash: MetadataHash): js.Promise[Metadata] = js.native
  def apply(metadataHash: MetadataHash, callback: ResultCallback[Metadata]): Unit = js.native
}

