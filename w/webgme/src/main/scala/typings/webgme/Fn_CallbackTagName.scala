package typings.webgme

import typings.webgme.GmeCommonNs.Name
import typings.webgme.GmeCommonNs.ResultCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackTagName extends js.Object {
  def apply(tagName: Name): js.Promise[Unit] = js.native
  def apply(tagName: Name, callback: ResultCallback[Unit]): Unit = js.native
}

