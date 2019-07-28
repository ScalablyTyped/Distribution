package typings.webgme

import typings.webgme.BlobsNs.ObjectBlob
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Callback extends js.Object {
  def apply(name: Name, content: ObjectBlob): js.Promise[MetadataHash] = js.native
  def apply(name: Name, content: ObjectBlob, callback: ResultCallback[MetadataHash]): Unit = js.native
}

