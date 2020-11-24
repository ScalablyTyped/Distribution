package typings.testingLibraryReactHooks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/react-hooks", "renderHook")
@js.native
object renderHook extends js.Object {
  
  def apply[P, R](callback: js.Function1[/* props */ P, R]): RenderHookResult[P, R] = js.native
  def apply[P, R](callback: js.Function1[/* props */ P, R], options: RenderHookOptions[P]): RenderHookResult[P, R] = js.native
}
