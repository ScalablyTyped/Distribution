package typings.vuex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commit extends js.Object {
  def apply(`type`: String): Unit = js.native
  def apply(`type`: String, payload: js.UndefOr[scala.Nothing], options: CommitOptions): Unit = js.native
  def apply(`type`: String, payload: js.Any): Unit = js.native
  def apply(`type`: String, payload: js.Any, options: CommitOptions): Unit = js.native
  def apply[P /* <: Payload */](payloadWithType: P): Unit = js.native
  def apply[P /* <: Payload */](payloadWithType: P, options: CommitOptions): Unit = js.native
}

