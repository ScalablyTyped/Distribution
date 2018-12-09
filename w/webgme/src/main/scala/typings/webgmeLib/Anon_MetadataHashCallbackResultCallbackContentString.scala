package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_MetadataHashCallbackResultCallbackContentString extends js.Object {
  def apply(metadataHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[webgmeLib.GmeCommonNs.ContentString] = js.native
  def apply(
    metadataHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.MetadataHash]
  ): webgmeLib.GmeCommonNs.ContentString = js.native
}

