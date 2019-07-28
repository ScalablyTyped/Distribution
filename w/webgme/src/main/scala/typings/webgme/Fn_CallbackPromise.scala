package typings.webgme

import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackPromise extends js.Object {
  def apply(): js.Promise[Unit] = js.native
  def apply(callback: ResultCallback[Unit]): Unit = js.native
}

