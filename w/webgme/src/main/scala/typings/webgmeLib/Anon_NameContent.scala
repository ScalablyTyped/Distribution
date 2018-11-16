package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_NameContent extends js.Object {
  def apply(name: webgmeLib.GmeCommonNs.Name, content: webgmeLib.BlobsNs.ObjectBlob): stdLib.Promise[webgmeLib.GmeCommonNs.MetadataHash] = js.native
  def apply(
    name: webgmeLib.GmeCommonNs.Name,
    content: webgmeLib.BlobsNs.ObjectBlob,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): scala.Unit = js.native
}

