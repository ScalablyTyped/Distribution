package typings.webgme

import typings.webgme.GmeCommonNs.ContentString
import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashContentString extends js.Object {
  def apply(metadataHash: MetadataHash): js.Promise[ContentString] = js.native
  def apply(metadataHash: MetadataHash, callback: ResultCallback[MetadataHash]): ContentString = js.native
}

