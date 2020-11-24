package typings.uifabricReactHooks

import typings.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/react-hooks/lib/testUtilities", JSImport.Namespace)
@js.native
object testUtilitiesMod extends js.Object {
  
  def validateHookValueNotChanged[TValues /* <: js.Array[NonNullable[_]] */](testDescription: String, useHook: js.Function0[TValues]): Unit = js.native
  def validateHookValueNotChanged[TValues /* <: js.Array[NonNullable[_]] */](testDescription: String, useHook: js.Function0[TValues], useHookAgain: js.Function0[TValues]): Unit = js.native
}
