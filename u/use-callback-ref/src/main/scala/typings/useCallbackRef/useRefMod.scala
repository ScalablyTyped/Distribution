package typings.useCallbackRef

import typings.react.mod.MutableRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRefMod {
  
  @JSImport("use-callback-ref/dist/es5/useRef", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCallbackRef[T](initialValue: T, callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Unit]): MutableRefObject[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallbackRef")(initialValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Null]]
  inline def useCallbackRef[T](
    initialValue: Null,
    callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Unit]
  ): MutableRefObject[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallbackRef")(initialValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Null]]
}
