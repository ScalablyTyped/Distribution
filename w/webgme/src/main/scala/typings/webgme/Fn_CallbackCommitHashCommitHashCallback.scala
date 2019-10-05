package typings.webgme

import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitHashCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackCommitHashCommitHashCallback extends js.Object {
  def apply(): js.Promise[CommitHash] = js.native
  def apply(callback: CommitHashCallback): Unit = js.native
}

