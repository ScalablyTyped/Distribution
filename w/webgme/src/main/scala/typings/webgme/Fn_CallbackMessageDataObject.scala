package typings.webgme

import typings.webgme.Core.DataObject
import typings.webgme.GmeCommon.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackMessageDataObject extends js.Object {
  def apply(message: String): js.Promise[DataObject] = js.native
  def apply(message: String, callback: ResultCallback[DataObject]): Unit = js.native
}

