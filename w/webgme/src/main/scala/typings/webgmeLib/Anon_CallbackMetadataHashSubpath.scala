package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackMetadataHashSubpath extends js.Object {
  def apply(metadataHash: webgmeLib.GmeCommonNs.MetadataHash, subpath: java.lang.String): js.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    subpath: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

