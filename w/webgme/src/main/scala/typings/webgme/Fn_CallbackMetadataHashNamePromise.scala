package typings.webgme

import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.Name
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashNamePromise extends js.Object {
  def apply(name: Name, metadataHash: MetadataHash): js.Promise[MetadataHash] = js.native
  def apply(name: Name, metadataHash: MetadataHash, callback: ResultCallback[MetadataHash]): Unit = js.native
}

