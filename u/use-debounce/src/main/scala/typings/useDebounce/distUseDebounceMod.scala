package typings.useDebounce

import typings.useDebounce.anon.EqualityFn
import typings.useDebounce.distUseDebouncedCallbackMod.ControlFunctions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUseDebounceMod {
  
  @JSImport("use-debounce/dist/useDebounce", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](value: T, delay: Double): js.Tuple2[T, ControlFunctions] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, ControlFunctions]]
  inline def default[T](value: T, delay: Double, options: EqualityFn[T]): js.Tuple2[T, ControlFunctions] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T, ControlFunctions]]
}
