package typings.useCallbackRef

import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.useCallbackRef.distEs5TypesMod.ReactRef
import typings.useCallbackRef.distEs5TypesMod.RefCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-callback-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assignRef[T](ref: ReactRef[T]): ReactRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any]).asInstanceOf[ReactRef[T]]
  inline def assignRef[T](ref: ReactRef[T], value: T): ReactRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReactRef[T]]
  
  inline def createCallbackRef[T](callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Any]): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCallbackRef")(callback.asInstanceOf[js.Any]).asInstanceOf[RefObject[T]]
  
  inline def mergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T | Null]]
  
  inline def refToCallback[T](ref: ReactRef[T]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("refToCallback")(ref.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  
  inline def transformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T | Null, K]): typings.useCallbackRef.distEs5TypesMod.RefObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRef")(ref.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[typings.useCallbackRef.distEs5TypesMod.RefObject[T]]
  
  inline def useCallbackRef[T](initialValue: T, callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Unit]): MutableRefObject[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallbackRef")(initialValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Null]]
  inline def useCallbackRef[T](
    initialValue: Null,
    callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Unit]
  ): MutableRefObject[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallbackRef")(initialValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Null]]
  
  inline def useMergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergeRefs")(refs.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T | Null]]
  inline def useMergeRefs[T](refs: js.Array[ReactRef[T]], defaultValue: T): MutableRefObject[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergeRefs")(refs.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Null]]
  
  inline def useRefToCallback[T](ref: ReactRef[T]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefToCallback")(ref.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  
  inline def useTransformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T | Null, K]): typings.useCallbackRef.distEs5TypesMod.RefObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransformRef")(ref.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[typings.useCallbackRef.distEs5TypesMod.RefObject[T]]
}
