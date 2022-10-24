package typings.wixStyleReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesProvidersUseDebouncedCallbackMod {
  
  @JSImport("wix-style-react/dist/types/providers/useDebouncedCallback", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Callback](cb: Callback, dependencies: js.Array[Any]): Callback = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Callback]
  inline def default[Callback](cb: Callback, dependencies: js.Array[Any], debounceMs: Double): Callback = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], debounceMs.asInstanceOf[js.Any])).asInstanceOf[Callback]
  inline def default[Callback](
    cb: Callback,
    dependencies: js.Array[Any],
    debounceMs: Double,
    debounceFn: js.Function2[/* callback */ js.Function, /* debounceMs */ Double, js.Function]
  ): Callback = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], debounceMs.asInstanceOf[js.Any], debounceFn.asInstanceOf[js.Any])).asInstanceOf[Callback]
  inline def default[Callback](
    cb: Callback,
    dependencies: js.Array[Any],
    debounceMs: Unit,
    debounceFn: js.Function2[/* callback */ js.Function, /* debounceMs */ Double, js.Function]
  ): Callback = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(cb.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any], debounceMs.asInstanceOf[js.Any], debounceFn.asInstanceOf[js.Any])).asInstanceOf[Callback]
}
