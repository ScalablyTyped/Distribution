package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commit extends js.Object {
  def apply(`type`: java.lang.String): scala.Unit = js.native
  def apply(`type`: java.lang.String, payload: js.Any): scala.Unit = js.native
  def apply(`type`: java.lang.String, payload: js.Any, options: CommitOptions): scala.Unit = js.native
  def apply[P /* <: Payload */](payloadWithType: P): scala.Unit = js.native
  def apply[P /* <: Payload */](payloadWithType: P, options: CommitOptions): scala.Unit = js.native
}

