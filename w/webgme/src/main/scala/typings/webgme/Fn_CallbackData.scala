package typings.webgme

import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.Payload
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackData extends js.Object {
  def apply(name: Name, data: Payload): js.Promise[MetadataHash] = js.native
  def apply(name: Name, data: Payload, callback: ResultCallback[MetadataHash]): Unit = js.native
}

