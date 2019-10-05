package typings.webgme

import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackArray extends js.Object {
  def apply(): js.Promise[js.Array[MetadataHash]] = js.native
  def apply(callback: ResultCallback[js.Array[MetadataHash]]): Unit = js.native
}

