package typings.webgme

import typings.webgme.GmeCommon.ProjectStart
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackNumberStart extends js.Object {
  def apply(start: ProjectStart, number: Double): js.Promise[js.Array[CommitObject]] = js.native
  def apply(start: ProjectStart, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
}

