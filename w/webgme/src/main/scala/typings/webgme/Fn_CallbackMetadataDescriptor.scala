package typings.webgme

import typings.webgme.Blobs.BlobMetadataDescriptor
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataDescriptor extends js.Object {
  def apply(metadataDescriptor: BlobMetadataDescriptor): js.Promise[MetadataHash] = js.native
  def apply(metadataDescriptor: BlobMetadataDescriptor, callback: ResultCallback[MetadataHash]): Unit = js.native
}

