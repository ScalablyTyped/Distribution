package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackRootHash extends js.Object {
  def apply(rootHash: webgmeLib.GmeCommonNs.MetadataHash): js.Promise[webgmeLib.CoreNs.DataObject] = js.native
  def apply(
    rootHash: webgmeLib.GmeCommonNs.MetadataHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
}

