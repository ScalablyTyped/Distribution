package typings.tapable

import typings.std.Omit
import typings.tapable.tapableBooleans.`false`
import typings.tapable.tapableBooleans.`true`
import typings.tapable.tapableStrings.async
import typings.tapable.tapableStrings.call
import typings.tapable.tapableStrings.callAsync
import typings.tapable.tapableStrings.promise
import typings.tapable.tapableStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tapable", "AsyncParallelBailHook")
  @js.native
  open class AsyncParallelBailHook[T, R, AdditionalOptions] ()
    extends StObject
       with AsyncHook[T, R, AdditionalOptions]
  
  @JSImport("tapable", "AsyncParallelHook")
  @js.native
  open class AsyncParallelHook[T, AdditionalOptions] ()
    extends StObject
       with AsyncHook[T, Unit, AdditionalOptions]
  
  @JSImport("tapable", "AsyncSeriesBailHook")
  @js.native
  open class AsyncSeriesBailHook[T, R, AdditionalOptions] ()
    extends StObject
       with AsyncHook[T, R, AdditionalOptions]
  
  @JSImport("tapable", "AsyncSeriesHook")
  @js.native
  open class AsyncSeriesHook[T, AdditionalOptions] ()
    extends StObject
       with AsyncHook[T, Unit, AdditionalOptions]
  
  @JSImport("tapable", "AsyncSeriesLoopHook")
  @js.native
  open class AsyncSeriesLoopHook[T, AdditionalOptions] ()
    extends StObject
       with AsyncHook[T, Unit, AdditionalOptions]
  
  @JSImport("tapable", "AsyncSeriesWaterfallHook")
  @js.native
  open class AsyncSeriesWaterfallHook[T, AdditionalOptions] ()
    extends StObject
       with AsyncHook[
          T, 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<T>[0] */ js.Any, 
          AdditionalOptions
        ]
  
  @JSImport("tapable", "HookMap")
  @js.native
  open class HookMap[H] protected () extends StObject {
    def this(factory: HookFactory[H]) = this()
    def this(factory: HookFactory[H], name: String) = this()
    
    def `for`(key: Any): H = js.native
    
    def get(key: Any): js.UndefOr[H] = js.native
    
    def intercept(interceptor: HookMapInterceptor[H]): Unit = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  
  @JSImport("tapable", "MultiHook")
  @js.native
  open class MultiHook[H] protected () extends StObject {
    def this(hooks: js.Array[H]) = this()
    def this(hooks: js.Array[H], name: String) = this()
    
    var name: js.UndefOr[String] = js.native
    
    def tap(options: String): Unit = js.native
    def tap(options: String, fn: js.Function): Unit = js.native
    def tap(options: Tap): Unit = js.native
    def tap(options: Tap, fn: js.Function): Unit = js.native
    
    def tapAsync(options: String): Unit = js.native
    def tapAsync(options: String, fn: js.Function): Unit = js.native
    def tapAsync(options: Tap): Unit = js.native
    def tapAsync(options: Tap, fn: js.Function): Unit = js.native
    
    def tapPromise(options: String): Unit = js.native
    def tapPromise(options: String, fn: js.Function): Unit = js.native
    def tapPromise(options: Tap): Unit = js.native
    def tapPromise(options: Tap, fn: js.Function): Unit = js.native
  }
  
  @JSImport("tapable", "SyncBailHook")
  @js.native
  open class SyncBailHook[T, R, AdditionalOptions] () extends SyncHook[T, R, AdditionalOptions]
  
  @JSImport("tapable", "SyncHook")
  @js.native
  open class SyncHook[T, R, AdditionalOptions] ()
    extends StObject
       with Hook[T, R, AdditionalOptions] {
    
    def call(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AsArray<T> is not an array type */ args: AsArray[T]
    ): R = js.native
  }
  
  @JSImport("tapable", "SyncLoopHook")
  @js.native
  open class SyncLoopHook[T, AdditionalOptions] () extends SyncHook[T, Unit, AdditionalOptions]
  
  @JSImport("tapable", "SyncWaterfallHook")
  @js.native
  open class SyncWaterfallHook[T, AdditionalOptions] ()
    extends SyncHook[
          T, 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<T>[0] */ js.Any, 
          AdditionalOptions
        ]
  
  type Append[T /* <: js.Array[Any] */, U] = /* import warning: importer.ImportType#apply Failed type conversion: tapable.anon.0<U, T>[tapable.tapable.Measure<T['length']>] */ js.Any
  
  type ArgumentNames[T /* <: js.Array[Any] */] = FixedSizeArray[
    /* import warning: importer.ImportType#apply Failed type conversion: T['length'] */ js.Any, 
    String
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Array<any> ? T : [T]
    }}}
    */
  @js.native
  trait AsArray[T] extends StObject
  
  @js.native
  trait AsyncHook[T, R, AdditionalOptions]
    extends StObject
       with Hook[T, R, AdditionalOptions] {
    
    def tapAsync(
      options: Tap & IfSet[AdditionalOptions],
      fn: js.Function1[/* args */ Append[AsArray[T], InnerCallback[js.Error, R]], Unit]
    ): Unit = js.native
    def tapAsync(options: String, fn: js.Function1[/* args */ Append[AsArray[T], InnerCallback[js.Error, R]], Unit]): Unit = js.native
    
    def tapPromise(options: Tap & IfSet[AdditionalOptions], fn: js.Function1[/* args */ AsArray[T], js.Promise[R]]): Unit = js.native
    def tapPromise(options: String, fn: js.Function1[/* args */ AsArray[T], js.Promise[R]]): Unit = js.native
  }
  
  type Callback[E, T] = js.Function2[/* error */ E | Null, /* result */ js.UndefOr[T], Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends 0 ? std.Array<void> : std.ReadonlyArray<U> & {  0 :U,   length :T}
    }}}
    */
  @js.native
  trait FixedSizeArray[T /* <: Double */, U] extends StObject
  
  trait FullTap
    extends StObject
       with Tap {
    
    var fn: js.Function
    
    var `type`: sync | async | promise
  }
  object FullTap {
    
    inline def apply(fn: js.Function, name: String, `type`: sync | async | promise): FullTap = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullTap]
    }
    
    extension [Self <: FullTap](x: Self) {
      
      inline def setFn(value: js.Function): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setType(value: sync | async | promise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Hook[T, R, AdditionalOptions] extends StObject {
    
    def callAsync(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Append<AsArray<T>, Callback<Error, R>> is not an array type */ args: Append[AsArray[T], Callback[js.Error, R]]
    ): Unit = js.native
    
    def intercept(interceptor: HookInterceptor[T, R, AdditionalOptions]): Unit = js.native
    
    def isUsed(): Boolean = js.native
    
    var name: js.UndefOr[String] = js.native
    
    def promise(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type AsArray<T> is not an array type */ args: AsArray[T]
    ): js.Promise[R] = js.native
    
    def tap(options: Tap & IfSet[AdditionalOptions], fn: js.Function1[/* args */ AsArray[T], R]): Unit = js.native
    def tap(options: String, fn: js.Function1[/* args */ AsArray[T], R]): Unit = js.native
    
    var taps: js.Array[FullTap] = js.native
    
    def withOptions(options: TapOptions & IfSet[AdditionalOptions]): Omit[this.type, call | callAsync | promise] = js.native
  }
  
  type HookFactory[H] = js.Function2[/* key */ Any, /* hook */ js.UndefOr[H], H]
  
  trait HookInterceptor[T, R, AdditionalOptions] extends StObject {
    
    var call: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var done: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var error: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
    
    var loop: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var register: js.UndefOr[
        js.Function1[/* tap */ FullTap & IfSet[AdditionalOptions], FullTap & IfSet[AdditionalOptions]]
      ] = js.undefined
    
    var result: js.UndefOr[js.Function1[/* result */ R, Unit]] = js.undefined
    
    var tap: js.UndefOr[js.Function1[/* tap */ FullTap & IfSet[AdditionalOptions], Unit]] = js.undefined
  }
  object HookInterceptor {
    
    inline def apply[T, R, AdditionalOptions](): HookInterceptor[T, R, AdditionalOptions] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookInterceptor[T, R, AdditionalOptions]]
    }
    
    extension [Self <: HookInterceptor[?, ?, ?], T, R, AdditionalOptions](x: Self & (HookInterceptor[T, R, AdditionalOptions])) {
      
      inline def setCall(value: /* repeated */ Any => Unit): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
      
      inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      inline def setDone(value: () => Unit): Self = StObject.set(x, "done", js.Any.fromFunction0(value))
      
      inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
      
      inline def setError(value: /* err */ js.Error => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setLoop(value: /* repeated */ Any => Unit): Self = StObject.set(x, "loop", js.Any.fromFunction1(value))
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRegister(value: /* tap */ FullTap & IfSet[AdditionalOptions] => FullTap & IfSet[AdditionalOptions]): Self = StObject.set(x, "register", js.Any.fromFunction1(value))
      
      inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
      
      inline def setResult(value: /* result */ R => Unit): Self = StObject.set(x, "result", js.Any.fromFunction1(value))
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
      
      inline def setTap(value: /* tap */ FullTap & IfSet[AdditionalOptions] => Unit): Self = StObject.set(x, "tap", js.Any.fromFunction1(value))
      
      inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
    }
  }
  
  trait HookMapInterceptor[H] extends StObject {
    
    var factory: js.UndefOr[HookFactory[H]] = js.undefined
  }
  object HookMapInterceptor {
    
    inline def apply[H](): HookMapInterceptor[H] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HookMapInterceptor[H]]
    }
    
    extension [Self <: HookMapInterceptor[?], H](x: Self & HookMapInterceptor[H]) {
      
      inline def setFactory(value: (/* key */ Any, /* hook */ js.UndefOr[H]) => H): Self = StObject.set(x, "factory", js.Any.fromFunction2(value))
      
      inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    X extends tapable.tapable.UnsetAdditionalOptions ? {} : X
    }}}
    */
  @js.native
  trait IfSet[X] extends StObject
  
  type InnerCallback[E, T] = js.Function2[/* error */ js.UndefOr[E | Null | `false`], /* result */ js.UndefOr[T], Unit]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 ? T : never
    }}}
    */
  @js.native
  trait Measure[T /* <: Double */] extends StObject
  
  trait Tap
    extends StObject
       with TapOptions {
    
    var name: String
  }
  object Tap {
    
    inline def apply(name: String): Tap = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tap]
    }
    
    extension [Self <: Tap](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TapOptions extends StObject {
    
    var before: js.UndefOr[String] = js.undefined
    
    var stage: js.UndefOr[Double] = js.undefined
  }
  object TapOptions {
    
    inline def apply(): TapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TapOptions]
    }
    
    extension [Self <: TapOptions](x: Self) {
      
      inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setStage(value: Double): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
    }
  }
  
  trait UnsetAdditionalOptions extends StObject {
    
    var _UnsetAdditionalOptions: `true`
  }
  object UnsetAdditionalOptions {
    
    inline def apply(): UnsetAdditionalOptions = {
      val __obj = js.Dynamic.literal(_UnsetAdditionalOptions = true)
      __obj.asInstanceOf[UnsetAdditionalOptions]
    }
    
    extension [Self <: UnsetAdditionalOptions](x: Self) {
      
      inline def set_UnsetAdditionalOptions(value: `true`): Self = StObject.set(x, "_UnsetAdditionalOptions", value.asInstanceOf[js.Any])
    }
  }
}
