package typings.webgme

import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitHash
import typings.webgme.GmeStorageNs.CommitObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNumber extends js.Object {
  def apply(start: CommitHash | String, number: Double): js.Promise[js.Array[CommitObject]] = js.native
  def apply(start: CommitHash | String, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
  def apply(start: js.Array[String], number: Double): js.Promise[js.Array[CommitObject]] = js.native
  def apply(start: js.Array[String], number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
}

