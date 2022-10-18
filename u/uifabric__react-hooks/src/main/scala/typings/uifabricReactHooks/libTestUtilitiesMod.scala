package typings.uifabricReactHooks

import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTestUtilitiesMod {
  
  @JSImport("@uifabric/react-hooks/lib/testUtilities", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateHookValueNotChanged[TValues /* <: js.Array[NonNullable[Any]] */](testDescription: String, useHook: js.Function0[TValues]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateHookValueNotChanged")(testDescription.asInstanceOf[js.Any], useHook.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateHookValueNotChanged[TValues /* <: js.Array[NonNullable[Any]] */](testDescription: String, useHook: js.Function0[TValues], useHookAgain: js.Function0[TValues]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateHookValueNotChanged")(testDescription.asInstanceOf[js.Any], useHook.asInstanceOf[js.Any], useHookAgain.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
