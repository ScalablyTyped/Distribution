package typings.vueReactivity

import typings.std.Exclude
import typings.std.Map
import typings.std.Set
import typings.std.WeakMap
import typings.std.WeakSet
import typings.vueReactivity.anon.Get
import typings.vueReactivity.anon.RawSymbol
import typings.vueReactivity.anon.ShallowReactiveMarker
import typings.vueShared.mod.IfAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/reactivity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@vue/reactivity", "EffectScope")
  @js.native
  /* Excluded from this release type: active */
  /* Excluded from this release type: effects */
  /* Excluded from this release type: cleanups */
  /* Excluded from this release type: parent */
  /* Excluded from this release type: scopes */
  /* Excluded from this release type: index */
  open class EffectScope_ () extends StObject {
    def this(detached: Boolean) = this()
    
    var detached: Boolean = js.native
    
    def run[T](fn: js.Function0[T]): js.UndefOr[T] = js.native
    
    /* Excluded from this release type: on */
    /* Excluded from this release type: off */
    def stop(): Unit = js.native
    def stop(fromParent: Boolean): Unit = js.native
  }
  
  @JSImport("@vue/reactivity", "ITERATE_KEY")
  @js.native
  val ITERATE_KEY: js.Symbol = js.native
  
  @JSImport("@vue/reactivity", "ReactiveEffect")
  @js.native
  open class ReactiveEffect[T] protected () extends StObject {
    def this(fn: js.Function0[T]) = this()
    def this(fn: js.Function0[T], scheduler: EffectScheduler) = this()
    def this(fn: js.Function0[T], scheduler: Null, scope: EffectScope_) = this()
    def this(fn: js.Function0[T], scheduler: Unit, scope: EffectScope_) = this()
    def this(fn: js.Function0[T], scheduler: EffectScheduler, scope: EffectScope_) = this()
    
    var active: Boolean = js.native
    
    var deps: js.Array[Dep] = js.native
    
    def fn(): T = js.native
    
    /* Excluded from this release type: computed */
    /* Excluded from this release type: allowRecurse */
    /* Excluded from this release type: deferStop */
    var onStop: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onTrack: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.native
    
    var onTrigger: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.native
    
    var parent: js.UndefOr[ReactiveEffect[Any]] = js.native
    
    def run(): js.UndefOr[T] = js.native
    
    var scheduler: EffectScheduler | Null = js.native
    
    def stop(): Unit = js.native
  }
  
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
  
  inline def markRaw[T /* <: js.Object */](value: T): Raw[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("markRaw")(value.asInstanceOf[js.Any]).asInstanceOf[Raw[T]]
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toRef")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ToRef_[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]]
  inline def toRef[T /* <: js.Object */, K /* <: /* keyof T */ String */](
    `object`: T,
    key: K,
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ): ToRef_[
    Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toRef")(`object`.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[ToRef_[
    Exclude[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any, 
      Unit
    ]
  ]]
  
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
  
  @js.native
  trait ComputedGetter[T] extends StObject {
    
    def apply(args: Any*): T = js.native
  }
  
  @js.native
  trait ComputedRef[T]
    extends StObject
       with WritableComputedRef[T]
  
  @js.native
  trait ComputedRefImpl[T] extends StObject {
    
    val __v_isRef: /* true */ Boolean = js.native
    
    var _cacheable: Boolean = js.native
    
    var _dirty: Boolean = js.native
    
    /* private */ val _setter: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    var dep: js.UndefOr[Dep] = js.native
    
    val effect: ReactiveEffect[T] = js.native
    
    def value: T = js.native
    def value_=(newValue: T): Unit = js.native
  }
  
  type ComputedSetter[T] = js.Function1[/* v */ T, Unit]
  
  type CustomRefFactory[T] = js.Function2[/* track */ js.Function0[Unit], /* trigger */ js.Function0[Unit], Get[T]]
  
  trait DebuggerEvent
    extends StObject
       with DebuggerEventExtraInfo {
    
    var effect: ReactiveEffect[Any]
  }
  object DebuggerEvent {
    
    inline def apply(effect: ReactiveEffect[Any], key: Any, target: js.Object, `type`: TrackOpTypes | TriggerOpTypes): DebuggerEvent = {
      val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebuggerEvent]
    }
    
    extension [Self <: DebuggerEvent](x: Self) {
      
      inline def setEffect(value: ReactiveEffect[Any]): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    }
  }
  
  trait DebuggerEventExtraInfo extends StObject {
    
    var key: Any
    
    var newValue: js.UndefOr[Any] = js.undefined
    
    var oldTarget: js.UndefOr[(Map[Any, Any]) | Set[Any]] = js.undefined
    
    var oldValue: js.UndefOr[Any] = js.undefined
    
    var target: js.Object
    
    var `type`: TrackOpTypes | TriggerOpTypes
  }
  object DebuggerEventExtraInfo {
    
    inline def apply(key: Any, target: js.Object, `type`: TrackOpTypes | TriggerOpTypes): DebuggerEventExtraInfo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DebuggerEventExtraInfo]
    }
    
    extension [Self <: DebuggerEventExtraInfo](x: Self) {
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldTarget(value: (Map[Any, Any]) | Set[Any]): Self = StObject.set(x, "oldTarget", value.asInstanceOf[js.Any])
      
      inline def setOldTargetUndefined: Self = StObject.set(x, "oldTarget", js.undefined)
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setTarget(value: js.Object): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: TrackOpTypes | TriggerOpTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DebuggerOptions extends StObject {
    
    var onTrack: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.undefined
    
    var onTrigger: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.undefined
  }
  object DebuggerOptions {
    
    inline def apply(): DebuggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DebuggerOptions]
    }
    
    extension [Self <: DebuggerOptions](x: Self) {
      
      inline def setOnTrack(value: /* event */ DebuggerEvent => Unit): Self = StObject.set(x, "onTrack", js.Any.fromFunction1(value))
      
      inline def setOnTrackUndefined: Self = StObject.set(x, "onTrack", js.undefined)
      
      inline def setOnTrigger(value: /* event */ DebuggerEvent => Unit): Self = StObject.set(x, "onTrigger", js.Any.fromFunction1(value))
      
      inline def setOnTriggerUndefined: Self = StObject.set(x, "onTrigger", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends @vue/reactivity.@vue/reactivity.Builtin ? T : T extends std.Map<infer K, infer V> ? std.ReadonlyMap<@vue/reactivity.@vue/reactivity.DeepReadonly<K>, @vue/reactivity.@vue/reactivity.DeepReadonly<V>> : T extends std.ReadonlyMap<infer K, infer V> ? std.ReadonlyMap<@vue/reactivity.@vue/reactivity.DeepReadonly<K>, @vue/reactivity.@vue/reactivity.DeepReadonly<V>> : T extends std.WeakMap<infer K, infer V> ? std.WeakMap<@vue/reactivity.@vue/reactivity.DeepReadonly<K>, @vue/reactivity.@vue/reactivity.DeepReadonly<V>> : T extends std.Set<infer U> ? std.ReadonlySet<@vue/reactivity.@vue/reactivity.DeepReadonly<U>> : T extends std.ReadonlySet<infer U> ? std.ReadonlySet<@vue/reactivity.@vue/reactivity.DeepReadonly<U>> : T extends std.WeakSet<infer U> ? std.WeakSet<@vue/reactivity.@vue/reactivity.DeepReadonly<U>> : T extends std.Promise<infer U> ? std.Promise<@vue/reactivity.@vue/reactivity.DeepReadonly<U>> : T extends @vue/reactivity.@vue/reactivity.Ref<infer U> ? std.Readonly<@vue/reactivity.@vue/reactivity.Ref<@vue/reactivity.@vue/reactivity.DeepReadonly<U>>> : T extends {} ? {readonly [ K in keyof T ]: @vue/reactivity.@vue/reactivity.DeepReadonly<T[K]>} : std.Readonly<T>
    }}}
    */
  type DeepReadonly[T] = T
  
  @js.native
  trait Dep
    extends StObject
       with Set[ReactiveEffect[Any]]
       with TrackedMarkers
  
  @js.native
  trait EffectScheduler extends StObject {
    
    def apply(args: Any*): Any = js.native
  }
  
  type IterableCollections = (Map[Any, Any]) | Set[Any]
  
  type Primitive = js.UndefOr[String | Double | Boolean | js.BigInt | js.Symbol | Null]
  
  type Raw[T] = T & RawSymbol
  
  trait ReactiveEffectOptions
    extends StObject
       with DebuggerOptions {
    
    var allowRecurse: js.UndefOr[Boolean] = js.undefined
    
    var `lazy`: js.UndefOr[Boolean] = js.undefined
    
    var onStop: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var scheduler: js.UndefOr[EffectScheduler] = js.undefined
    
    var scope: js.UndefOr[EffectScope_] = js.undefined
  }
  object ReactiveEffectOptions {
    
    inline def apply(): ReactiveEffectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactiveEffectOptions]
    }
    
    extension [Self <: ReactiveEffectOptions](x: Self) {
      
      inline def setAllowRecurse(value: Boolean): Self = StObject.set(x, "allowRecurse", value.asInstanceOf[js.Any])
      
      inline def setAllowRecurseUndefined: Self = StObject.set(x, "allowRecurse", js.undefined)
      
      inline def setLazy(value: Boolean): Self = StObject.set(x, "lazy", value.asInstanceOf[js.Any])
      
      inline def setLazyUndefined: Self = StObject.set(x, "lazy", js.undefined)
      
      inline def setOnStop(value: () => Unit): Self = StObject.set(x, "onStop", js.Any.fromFunction0(value))
      
      inline def setOnStopUndefined: Self = StObject.set(x, "onStop", js.undefined)
      
      inline def setScheduler(value: EffectScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setSchedulerUndefined: Self = StObject.set(x, "scheduler", js.undefined)
      
      inline def setScope(value: EffectScope_): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait ReactiveEffectRunner[T] extends StObject {
    
    def apply(): T = js.native
    
    var effect: ReactiveEffect[Any] = js.native
  }
  
  object ReactiveFlags {
    
    inline def IS_REACTIVE: "__v_isReactive" = "__v_isReactive".asInstanceOf["__v_isReactive"]
    
    inline def IS_READONLY: "__v_isReadonly" = "__v_isReadonly".asInstanceOf["__v_isReadonly"]
    
    inline def IS_SHALLOW: "__v_isShallow" = "__v_isShallow".asInstanceOf["__v_isShallow"]
    
    inline def RAW: "__v_raw" = "__v_raw".asInstanceOf["__v_raw"]
    
    inline def SKIP: "__v_skip" = "__v_skip".asInstanceOf["__v_skip"]
  }
  type ReactiveFlags = "__v_skip" | "__v_isReactive" | "__v_isReadonly" | "__v_isShallow" | "__v_raw"
  
  trait RefUnwrapBailTypes extends StObject
  
  @js.native
  trait Ref_[T] extends StObject {
    
    var value: T = js.native
  }
  
  type ShallowReactive_[T] = T & ShallowReactiveMarker
  
  @js.native
  trait ShallowRef_[T]
    extends StObject
       with Ref_[T]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: T[K] extends @vue/reactivity.@vue/reactivity.Ref<infer V>? V : T[K] extends @vue/reactivity.@vue/reactivity.Ref<infer V> | undefined? unknown extends V? undefined : V | undefined : T[K]}
    }}}
    */
  @js.native
  trait ShallowUnwrapRef[T] extends StObject
  
  type ToRef_[T] = IfAny[
    T, 
    Ref_[T], 
    /* import warning: importer.ImportType#apply Failed type conversion: [T] extends [@vue/reactivity.@vue/reactivity.Ref<any>] ? T : @vue/reactivity.@vue/reactivity.Ref<T> */ js.Any
  ]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof T ]: @vue/reactivity.@vue/reactivity.ToRef<T[K]>}
    }}}
    */
  @js.native
  trait ToRefs_[T] extends StObject
  
  object TrackOpTypes {
    
    inline def GET: "get" = "get".asInstanceOf["get"]
    
    inline def HAS: "has" = "has".asInstanceOf["has"]
    
    inline def ITERATE: "iterate" = "iterate".asInstanceOf["iterate"]
  }
  type TrackOpTypes = "get" | "has" | "iterate"
  
  /**
    * wasTracked and newTracked maintain the status for several levels of effect
    * tracking recursion. One bit per level is used to define whether the dependency
    * was/is tracked.
    */
  trait TrackedMarkers extends StObject {
    
    /**
      * newTracked
      */
    var n: Double
    
    /**
      * wasTracked
      */
    var w: Double
  }
  object TrackedMarkers {
    
    inline def apply(n: Double, w: Double): TrackedMarkers = {
      val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackedMarkers]
    }
    
    extension [Self <: TrackedMarkers](x: Self) {
      
      inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  object TriggerOpTypes {
    
    inline def ADD: "add" = "add".asInstanceOf["add"]
    
    inline def CLEAR: "clear" = "clear".asInstanceOf["clear"]
    
    inline def DELETE: "delete" = "delete".asInstanceOf["delete"]
    
    inline def SET: "set" = "set".asInstanceOf["set"]
  }
  type TriggerOpTypes = "set" | "add" | "delete" | "clear"
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends @vue/reactivity.@vue/reactivity.Ref<any> ? T : @vue/reactivity.@vue/reactivity.UnwrapRefSimple<T>
    }}}
    */
  type UnwrapNestedRefs[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends @vue/reactivity.@vue/reactivity.ShallowRef<infer V> ? V : T extends @vue/reactivity.@vue/reactivity.Ref<infer V> ? @vue/reactivity.@vue/reactivity.UnwrapRefSimple<V> : @vue/reactivity.@vue/reactivity.UnwrapRefSimple<T>
    }}}
    */
  type UnwrapRef[T] = T
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends std.Function | @vue/reactivity.@vue/reactivity.CollectionTypes | @vue/reactivity.@vue/reactivity.BaseTypes | @vue/reactivity.@vue/reactivity.Ref<any> | @vue/reactivity.@vue/reactivity.RefUnwrapBailTypes[keyof @vue/reactivity.@vue/reactivity.RefUnwrapBailTypes] | {[RawSymbol] : true | undefined} ? T : T extends std.ReadonlyArray<any> ? {[ K in keyof T ]: @vue/reactivity.@vue/reactivity.UnwrapRefSimple<T[K]>} : T extends object & {[ShallowReactiveMarker] : never | undefined} ? {[ P in keyof T ]: P extends symbol? T[P] : @vue/reactivity.@vue/reactivity.UnwrapRef<T[P]>} : T
    }}}
    */
  type UnwrapRefSimple[T] = T
  
  type WeakCollections = (WeakMap[Any, Any]) | WeakSet[Any]
  
  trait WritableComputedOptions[T] extends StObject {
    
    def get(args: Any*): T
    @JSName("get")
    var get_Original: ComputedGetter[T]
    
    def set(v: T): Unit
    @JSName("set")
    var set_Original: ComputedSetter[T]
  }
  object WritableComputedOptions {
    
    inline def apply[T](get: ComputedGetter[T], set: T => Unit): WritableComputedOptions[T] = {
      val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[WritableComputedOptions[T]]
    }
    
    extension [Self <: WritableComputedOptions[?], T](x: Self & WritableComputedOptions[T]) {
      
      inline def setGet(value: ComputedGetter[T]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait WritableComputedRef[T]
    extends StObject
       with Ref_[T] {
    
    val effect: ReactiveEffect[T] = js.native
  }
}
