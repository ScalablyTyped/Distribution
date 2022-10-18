package typings.vueReactivity.mod

import typings.std.Exclude
import typings.std.Map
import typings.std.Set
import typings.std.WeakMap
import typings.std.WeakSet
import typings.vueReactivity.anon.Get
import typings.vueReactivity.anon.RawSymbol
import typings.vueReactivity.anon.ShallowReactiveMarker
import typings.vueReactivity.mod.^
import typings.vueShared.mod.IfAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def ITERATE_KEY: js.Symbol = ^.asInstanceOf[js.Dynamic].selectDynamic("ITERATE_KEY").asInstanceOf[js.Symbol]

inline def computed[T](getter: ComputedGetter[T]): ComputedRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("computed")(getter.asInstanceOf[js.Any]).asInstanceOf[ComputedRef[T]]
inline def computed[T](getter: ComputedGetter[T], debugOptions: DebuggerOptions): ComputedRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("computed")(getter.asInstanceOf[js.Any], debugOptions.asInstanceOf[js.Any])).asInstanceOf[ComputedRef[T]]
inline def computed[T](options: WritableComputedOptions[T]): WritableComputedRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("computed")(options.asInstanceOf[js.Any]).asInstanceOf[WritableComputedRef[T]]
inline def computed[T](options: WritableComputedOptions[T], debugOptions: DebuggerOptions): WritableComputedRef[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("computed")(options.asInstanceOf[js.Any], debugOptions.asInstanceOf[js.Any])).asInstanceOf[WritableComputedRef[T]]

inline def customRef[T](factory: CustomRefFactory[T]): Ref_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("customRef")(factory.asInstanceOf[js.Any]).asInstanceOf[Ref_[T]]

inline def deferredComputed[T](getter: js.Function0[T]): ComputedRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("deferredComputed")(getter.asInstanceOf[js.Any]).asInstanceOf[ComputedRef[T]]

inline def effect[T](fn: js.Function0[T]): ReactiveEffectRunner[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("effect")(fn.asInstanceOf[js.Any]).asInstanceOf[ReactiveEffectRunner[Any]]
inline def effect[T](fn: js.Function0[T], options: ReactiveEffectOptions): ReactiveEffectRunner[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("effect")(fn.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReactiveEffectRunner[Any]]

inline def effectScope(): EffectScope_ = ^.asInstanceOf[js.Dynamic].applyDynamic("effectScope")().asInstanceOf[EffectScope_]
inline def effectScope(detached: Boolean): EffectScope_ = ^.asInstanceOf[js.Dynamic].applyDynamic("effectScope")(detached.asInstanceOf[js.Any]).asInstanceOf[EffectScope_]

inline def enableTracking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableTracking")().asInstanceOf[Unit]

inline def getCurrentScope(): js.UndefOr[EffectScope_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentScope")().asInstanceOf[js.UndefOr[EffectScope_]]

inline def isProxy(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isProxy")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isReactive(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReactive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isReadonly(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isReadonly")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isRef[T](r: Any): /* is @vue/reactivity.@vue/reactivity.Ref<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(r.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/reactivity.@vue/reactivity.Ref<T> */ Boolean]
inline def isRef[T](r: Ref_[T]): /* is @vue/reactivity.@vue/reactivity.Ref<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRef")(r.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/reactivity.@vue/reactivity.Ref<T> */ Boolean]

inline def isShallow(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isShallow")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def markRaw[T /* <: js.Object */](value: T): T & RawSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("markRaw")(value.asInstanceOf[js.Any]).asInstanceOf[T & RawSymbol]

inline def onScopeDispose(fn: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onScopeDispose")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def pauseTracking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("pauseTracking")().asInstanceOf[Unit]

inline def proxyRefs[T /* <: js.Object */](objectWithRefs: T): ShallowUnwrapRef[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyRefs")(objectWithRefs.asInstanceOf[js.Any]).asInstanceOf[ShallowUnwrapRef[T]]

inline def reactive[T /* <: js.Object */](target: T): UnwrapNestedRefs[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("reactive")(target.asInstanceOf[js.Any]).asInstanceOf[UnwrapNestedRefs[T]]

inline def readonly[T /* <: js.Object */](target: T): DeepReadonly[UnwrapNestedRefs[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(target.asInstanceOf[js.Any]).asInstanceOf[DeepReadonly[UnwrapNestedRefs[T]]]

inline def ref[T](): Ref_[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")().asInstanceOf[Ref_[js.UndefOr[T]]]
inline def ref[T /* <: js.Object */](value: T): /* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@vue/reactivity.@vue/reactivity.Ref<any>] ? T : @vue/reactivity.@vue/reactivity.Ref<@vue/reactivity.@vue/reactivity.UnwrapRef<T>> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(value.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@vue/reactivity.@vue/reactivity.Ref<any>] ? T : @vue/reactivity.@vue/reactivity.Ref<@vue/reactivity.@vue/reactivity.UnwrapRef<T>> */ js.Any]

inline def ref_T_Ref_[T](value: T): Ref_[UnwrapRef[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(value.asInstanceOf[js.Any]).asInstanceOf[Ref_[UnwrapRef[T]]]

inline def resetTracking(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTracking")().asInstanceOf[Unit]

inline def shallowReactive[T /* <: js.Object */](target: T): ShallowReactive_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowReactive")(target.asInstanceOf[js.Any]).asInstanceOf[ShallowReactive_[T]]

inline def shallowReadonly[T /* <: js.Object */](target: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowReadonly")(target.asInstanceOf[js.Any]).asInstanceOf[T]

inline def shallowRef[T](): ShallowRef_[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowRef")().asInstanceOf[ShallowRef_[js.UndefOr[T]]]
inline def shallowRef[T](value: T): ShallowRef_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowRef")(value.asInstanceOf[js.Any]).asInstanceOf[ShallowRef_[T]]

inline def shallowRef_T_Any[T /* <: js.Object */](value: T): /* import warning: importer.ImportType#apply Failed type conversion: T extends @vue/reactivity.@vue/reactivity.Ref<any> ? T : @vue/reactivity.@vue/reactivity.ShallowRef<T> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("shallowRef")(value.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: T extends @vue/reactivity.@vue/reactivity.Ref<any> ? T : @vue/reactivity.@vue/reactivity.ShallowRef<T> */ js.Any]

inline def stop(runner: ReactiveEffectRunner[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(runner.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def toRaw[T](observed: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("toRaw")(observed.asInstanceOf[js.Any]).asInstanceOf[T]

inline def toRef[T /* <: js.Object */, K /* <: /* keyof T */ String */](`object`: T, key: K): ToRef_[
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toRef")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ToRef_[
/* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any]]
inline def toRef[T /* <: js.Object */, K /* <: /* keyof T */ String */](
  `object`: T,
  key: K,
  defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
): ToRef_[
Exclude[
  /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
  Unit
]] = (^.asInstanceOf[js.Dynamic].applyDynamic("toRef")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ToRef_[
Exclude[
  /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
  Unit
]]]

inline def toRefs[T /* <: js.Object */](`object`: T): ToRefs_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("toRefs")(`object`.asInstanceOf[js.Any]).asInstanceOf[ToRefs_[T]]

inline def track(target: js.Object, `type`: TrackOpTypes, key: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def trigger(target: js.Object, `type`: TriggerOpTypes): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(target: js.Object, `type`: TriggerOpTypes, key: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(target: js.Object, `type`: TriggerOpTypes, key: Any, newValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(target: js.Object, `type`: TriggerOpTypes, key: Any, newValue: Any, oldValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Any,
  newValue: Any,
  oldValue: Any,
  oldTarget: Map[Any, Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Any,
  newValue: Any,
  oldValue: Any,
  oldTarget: Set[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Any,
  newValue: Any,
  oldValue: Unit,
  oldTarget: Map[Any, Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Any,
  newValue: Any,
  oldValue: Unit,
  oldTarget: Set[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(target: js.Object, `type`: TriggerOpTypes, key: Any, newValue: Unit, oldValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Any,
  newValue: Unit,
  oldValue: Any,
  oldTarget: Map[Any, Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Any,
  newValue: Unit,
  oldValue: Any,
  oldTarget: Set[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Any,
  newValue: Unit,
  oldValue: Unit,
  oldTarget: Map[Any, Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Any,
  newValue: Unit,
  oldValue: Unit,
  oldTarget: Set[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(target: js.Object, `type`: TriggerOpTypes, key: Unit, newValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(target: js.Object, `type`: TriggerOpTypes, key: Unit, newValue: Any, oldValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Unit,
  newValue: Any,
  oldValue: Any,
  oldTarget: Map[Any, Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Unit,
  newValue: Any,
  oldValue: Any,
  oldTarget: Set[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Unit,
  newValue: Any,
  oldValue: Unit,
  oldTarget: Map[Any, Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Unit,
  newValue: Any,
  oldValue: Unit,
  oldTarget: Set[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(target: js.Object, `type`: TriggerOpTypes, key: Unit, newValue: Unit, oldValue: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Unit,
  newValue: Unit,
  oldValue: Any,
  oldTarget: Map[Any, Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Unit,
  newValue: Unit,
  oldValue: Any,
  oldTarget: Set[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Unit,
  newValue: Unit,
  oldValue: Unit,
  oldTarget: Map[Any, Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def trigger(
  target: js.Object,
  `type`: TriggerOpTypes,
  key: Unit,
  newValue: Unit,
  oldValue: Unit,
  oldTarget: Set[Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(target.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], newValue.asInstanceOf[js.Any], oldValue.asInstanceOf[js.Any], oldTarget.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def triggerRef(ref: Ref_[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("triggerRef")(ref.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def unref[T](ref: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unref")(ref.asInstanceOf[js.Any]).asInstanceOf[T]
inline def unref[T](ref: Ref_[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("unref")(ref.asInstanceOf[js.Any]).asInstanceOf[T]

type BaseTypes = String | Double | Boolean

type Builtin = Primitive | js.Function | js.Date | js.Error | js.RegExp

type CollectionTypes = IterableCollections | WeakCollections

type ComputedSetter[T] = js.Function1[/* v */ T, Unit]

type CustomRefFactory[T] = js.Function2[/* track */ js.Function0[Unit], /* trigger */ js.Function0[Unit], Get[T]]

type IterableCollections = (Map[Any, Any]) | Set[Any]

type Primitive = js.UndefOr[String | Double | Boolean | js.BigInt | js.Symbol | Null]

type ShallowReactive_[T] = T & ShallowReactiveMarker

type ToRef_[T] = IfAny[
T, 
Ref_[T], 
/* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@vue/reactivity.@vue/reactivity.Ref<any>] ? T : @vue/reactivity.@vue/reactivity.Ref<T> */ js.Any]

type WeakCollections = (WeakMap[Any, Any]) | WeakSet[Any]
