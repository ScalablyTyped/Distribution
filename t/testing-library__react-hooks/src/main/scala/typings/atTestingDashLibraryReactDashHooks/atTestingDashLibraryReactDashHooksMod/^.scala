package typings.atTestingDashLibraryReactDashHooks.atTestingDashLibraryReactDashHooksMod

import typings.reactDashTestDashRenderer.reactDashTestDashRendererMod.DebugPromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@testing-library/react-hooks", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def act(callback: js.Function0[js.Promise[js.UndefOr[Unit]]]): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  @JSName("act")
  def act_DebugPromiseLike(callback: js.Function0[js.UndefOr[Unit]]): DebugPromiseLike = js.native
  def renderHook[P, R](callback: js.Function1[/* props */ P, R]): RenderHookResult[P, R] = js.native
  def renderHook[P, R](callback: js.Function1[/* props */ P, R], options: RenderHookOptions[P]): RenderHookResult[P, R] = js.native
}

