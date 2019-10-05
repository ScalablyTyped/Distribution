package typings.webgme

import typings.webgme.GmeCommon.ContentString
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMetadataHashContentString extends js.Object {
  def apply(metadataHash: MetadataHash): js.Promise[ContentString] = js.native
  def apply(metadataHash: MetadataHash, callback: ResultCallback[MetadataHash]): ContentString = js.native
}

