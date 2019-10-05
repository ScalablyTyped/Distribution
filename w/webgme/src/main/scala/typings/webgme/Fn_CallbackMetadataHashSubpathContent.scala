package typings.webgme

import typings.webgme.GmeCommon.Content
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashSubpathContent extends js.Object {
  def apply(metadataHash: MetadataHash, callback: ResultCallback[Content], subpath: String): Unit = js.native
  def apply(metadataHash: MetadataHash, subpath: String): js.Promise[Content] = js.native
}

