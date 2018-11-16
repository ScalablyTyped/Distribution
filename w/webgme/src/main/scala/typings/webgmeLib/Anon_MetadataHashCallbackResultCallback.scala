package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MetadataHashCallbackResultCallback extends js.Object {
  def apply(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): stdLib.Promise[webgmeLib.GmeCommonNs.Metadata] = js.native
  def apply(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.Metadata]
  ): scala.Unit = js.native
}

