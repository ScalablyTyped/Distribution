package typings.webcola

import typings.d3Dispatch.mod.Dispatch_
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnTypes extends js.Object {
  def apply[T /* <: EventTarget */](types: String*): Dispatch_[T] = js.native
}

