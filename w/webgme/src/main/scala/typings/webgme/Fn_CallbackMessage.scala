package typings.webgme

import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMessage extends js.Object {
  def apply(): js.Promise[MetadataHash] = js.native
  def apply(callback: ResultCallback[MetadataHash]): Unit = js.native
  def apply(message: String): js.Promise[MetadataHash] = js.native
}

