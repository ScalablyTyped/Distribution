package typings.webgme

import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_BeforeCallback extends js.Object {
  def apply(before: Double, number: Double): js.Promise[CommitObject] = js.native
  def apply(before: Double, number: Double, callback: ResultCallback[CommitObject]): Unit = js.native
  def apply(before: CommitHash, number: Double): js.Promise[CommitObject] = js.native
  def apply(before: CommitHash, number: Double, callback: ResultCallback[CommitObject]): Unit = js.native
}

