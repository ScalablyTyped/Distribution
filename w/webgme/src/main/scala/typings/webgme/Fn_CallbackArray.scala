package typings.webgme

import typings.webgme.GmeCommonNs.MetadataHash
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackArray extends js.Object {
  def apply(): js.Promise[js.Array[MetadataHash]] = js.native
  def apply(callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
}

