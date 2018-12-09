package typings
package vuexLib.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dispatch extends js.Object {
  def apply(`type`: java.lang.String): js.Promise[_] = js.native
  def apply(`type`: java.lang.String, payload: js.Any): js.Promise[_] = js.native
  def apply(`type`: java.lang.String, payload: js.Any, options: DispatchOptions): js.Promise[_] = js.native
  def apply[P /* <: Payload */](payloadWithType: P): js.Promise[_] = js.native
  def apply[P /* <: Payload */](payloadWithType: P, options: DispatchOptions): js.Promise[_] = js.native
}

