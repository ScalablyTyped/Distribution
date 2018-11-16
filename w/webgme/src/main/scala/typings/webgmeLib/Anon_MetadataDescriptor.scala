package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MetadataDescriptor extends js.Object {
  def apply(metadataDescriptor: webgmeLib.BlobsNs.BlobMetadataDescriptor): stdLib.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  def apply(
    metadataDescriptor: webgmeLib.BlobsNs.BlobMetadataDescriptor,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
}

