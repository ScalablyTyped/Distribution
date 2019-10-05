package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackRootHash extends js.Object {
  def apply(rootHash: MetadataHash): js.Promise[DataObject] = js.native
  def apply(rootHash: MetadataHash, callback: ResultCallback[DataObject]): Unit = js.native
}

