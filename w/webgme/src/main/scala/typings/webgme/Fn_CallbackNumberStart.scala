package typings.webgme

import typings.webgme.GmeCommonNs.ProjectStart
import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNumberStart extends js.Object {
  def apply(start: ProjectStart, number: Double): js.Promise[js.Array[CommitObject]] = js.native
  def apply(start: ProjectStart, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
}

