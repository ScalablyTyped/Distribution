package typings.useMemoOne

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-memo-one", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](// getResult changes on every call,
  callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](
    // getResult changes on every call,
  callback: T,
    // the inputs array changes on every call
  inputs: DependencyList
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallback")(callback.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useCallbackOne[T /* <: js.Function1[/* repeated */ Any, Any] */](// getResult changes on every call,
  callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useCallbackOne")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useCallbackOne[T /* <: js.Function1[/* repeated */ Any, Any] */](
    // getResult changes on every call,
  callback: T,
    // the inputs array changes on every call
  inputs: DependencyList
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallbackOne")(callback.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useMemo[T](// getResult changes on every call,
  getResult: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(getResult.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemo[T](
    // getResult changes on every call,
  getResult: js.Function0[T],
    // the inputs array changes on every call
  inputs: DependencyList
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemo")(getResult.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useMemoOne[T](// getResult changes on every call,
  getResult: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoOne")(getResult.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useMemoOne[T](
    // getResult changes on every call,
  getResult: js.Function0[T],
    // the inputs array changes on every call
  inputs: DependencyList
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useMemoOne")(getResult.asInstanceOf[js.Any], inputs.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type DependencyList = js.Array[Any]
}
