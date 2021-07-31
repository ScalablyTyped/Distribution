package typings.useCallbackRef

import typings.react.mod.MutableRefObject
import typings.react.mod.RefObject
import typings.useCallbackRef.typesMod.ReactRef
import typings.useCallbackRef.typesMod.RefCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-callback-ref", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def assignRef[T](ref: ReactRef[T]): ReactRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any]).asInstanceOf[ReactRef[T]]
  @scala.inline
  def assignRef[T](ref: ReactRef[T], value: T): ReactRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("assignRef")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ReactRef[T]]
  
  @scala.inline
  def createCallbackRef[T](callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, js.Any]): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createCallbackRef")(callback.asInstanceOf[js.Any]).asInstanceOf[RefObject[T]]
  
  @scala.inline
  def mergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeRefs")(refs.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T | Null]]
  
  @scala.inline
  def refToCallback[T](ref: ReactRef[T]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("refToCallback")(ref.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  
  @scala.inline
  def transformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T, K]): typings.useCallbackRef.typesMod.RefObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformRef")(ref.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[typings.useCallbackRef.typesMod.RefObject[T]]
  
  @scala.inline
  def useCallbackRef[T](initialValue: T, callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Unit]): MutableRefObject[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallbackRef")(initialValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Null]]
  @scala.inline
  def useCallbackRef[T](
    initialValue: Null,
    callback: js.Function2[/* newValue */ T | Null, /* lastValue */ T | Null, Unit]
  ): MutableRefObject[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useCallbackRef")(initialValue.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Null]]
  
  @scala.inline
  def useMergeRefs[T](refs: js.Array[ReactRef[T]]): MutableRefObject[T | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergeRefs")(refs.asInstanceOf[js.Any]).asInstanceOf[MutableRefObject[T | Null]]
  @scala.inline
  def useMergeRefs[T](refs: js.Array[ReactRef[T]], defaultValue: T): MutableRefObject[T | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("useMergeRefs")(refs.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[MutableRefObject[T | Null]]
  
  @scala.inline
  def useRefToCallback[T](ref: ReactRef[T]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefToCallback")(ref.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  
  @scala.inline
  def useTransformRef[T, K](ref: ReactRef[K], transformer: js.Function1[/* original */ T, K]): typings.useCallbackRef.typesMod.RefObject[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTransformRef")(ref.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any])).asInstanceOf[typings.useCallbackRef.typesMod.RefObject[T]]
}
