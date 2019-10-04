package typings.atTestingDashLibraryReactDashHooks.atTestingDashLibraryReactDashHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderHookResult[P, R] extends js.Object {
  val result: HookResult[R] = js.native
  def rerender(): Unit = js.native
  def rerender(newProps: P): Unit = js.native
  def unmount(): Boolean = js.native
  def waitForNextUpdate(): js.Promise[Unit] = js.native
}

