package typings.webgme

import typings.webgme.CoreNs.DataObject
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackRootHash extends js.Object {
  def apply(rootHash: MetadataHash): js.Promise[DataObject] = js.native
  def apply(rootHash: MetadataHash, callback: ResultCallback[DataObject]): Unit = js.native
}

