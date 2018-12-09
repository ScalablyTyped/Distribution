package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NameMetadataHashCallback extends js.Object {
  def apply(name: webgmeLib.GmeCommonNs.Name, metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  def apply(
    name: webgmeLib.GmeCommonNs.Name,
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
}

