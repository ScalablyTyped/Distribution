package typings.webgme

import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitHash
import typings.webgme.GmeStorageNs.CommitObject
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

