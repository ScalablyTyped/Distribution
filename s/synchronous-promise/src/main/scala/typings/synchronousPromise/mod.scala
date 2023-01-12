package typings.synchronousPromise

import org.scalablytyped.runtime.Instantiable1
import typings.std.Promise
import typings.std.PromiseLike
import typings.synchronousPromise.synchronousPromiseStrings.fulfilled
import typings.synchronousPromise.synchronousPromiseStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("synchronous-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait SynchronousPromise[T]
    extends StObject
       with Promise[T] {
    
    def pause(): SynchronousPromise[T] = js.native
    
    def resume(): SynchronousPromise[T] = js.native
  }
  @JSImport("synchronous-promise", "SynchronousPromise")
  @js.native
  def SynchronousPromise: SynchronousPromiseConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("synchronous-promise", "SynchronousPromise")
  @js.native
  open class SynchronousPromiseCls[T] protected ()
    extends StObject
       with SynchronousPromise[T] {
    /**
      * Creates a new Promise.
      * @param executor A callback used to initialize the promise. This callback is passed two arguments:
      * a resolve callback used resolve the promise with a value or the result of another promise,
      * and a reject callback used to reject the promise with a provided reason or error.
      */
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
  }
  
  inline def SynchronousPromise_=(x: SynchronousPromiseConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SynchronousPromise")(x.asInstanceOf[js.Any])
  
  trait FulfilledOutcome[T]
    extends StObject
       with SettledOutcome[T] {
    
    var status: fulfilled
    
    var value: T
  }
  object FulfilledOutcome {
    
    inline def apply[T](value: T): FulfilledOutcome[T] = {
      val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FulfilledOutcome[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FulfilledOutcome[?], T] (val x: Self & FulfilledOutcome[T]) extends AnyVal {
      
      inline def setStatus(value: fulfilled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait RejectedOutcome
    extends StObject
       with SettledOutcome[Any] {
    
    var reason: Any
    
    var status: rejected
  }
  object RejectedOutcome {
    
    inline def apply(reason: Any): RejectedOutcome = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[RejectedOutcome]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RejectedOutcome] (val x: Self) extends AnyVal {
      
      inline def setReason(value: Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: rejected): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.synchronousPromise.mod.FulfilledOutcome[T]
    - typings.synchronousPromise.mod.RejectedOutcome
  */
  trait SettledOutcome[T] extends StObject
  object SettledOutcome {
    
    inline def FulfilledOutcome[T](value: T): typings.synchronousPromise.mod.FulfilledOutcome[T] = {
      val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.synchronousPromise.mod.FulfilledOutcome[T]]
    }
    
    inline def RejectedOutcome(reason: Any): typings.synchronousPromise.mod.RejectedOutcome = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[typings.synchronousPromise.mod.RejectedOutcome]
    }
  }
  
  @js.native
  trait SynchronousPromiseConstructor
    extends StObject
       with /**
    * Creates a new Promise.
    * @param executor A callback used to initialize the promise. This callback is passed two arguments:
    * a resolve callback used resolve the promise with a value or the result of another promise,
    * and a reject callback used to reject the promise with a provided reason or error.
    */
  Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | PromiseLike[js.Object]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ], 
          SynchronousPromise[js.Object]
        ] {
    
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param v1 An array of Promises
      * @returns A new Promise.
      */
    def all[T](v1: js.Array[ValueOrPromiseOfValue[T]]): SynchronousPromise[js.Array[T]] = js.native
    /**
      * Creates a Promise that is resolved with an array of results when all of the provided Promises
      * resolve, or rejected when any Promise is rejected.
      * @param values Any number of Promises.
      * @returns A new Promise.
      */
    def all[T](values: ValueOrPromiseOfValue[T]*): SynchronousPromise[js.Array[T]] = js.native
    
    /**
      * Creates a Promise that is resolved with an array of outcome objects after all of the provided Promises
      * have settled. Each outcome object has a .status of either "fulfilled" or "rejected" and corresponding
      * "value" or "reason" properties.
      * @param v1 An array of Promises.
      * @returns A new Promise.
      */
    def allSettled[T](v1: js.Array[ValueOrPromiseOfValue[T]]): SynchronousPromise[js.Array[SettledOutcome[T]]] = js.native
    /**
      * Creates a Promise that is resolved with an array of outcome objects after all of the provided Promises
      * have settled. Each outcome object has a .status of either "fulfilled" or "rejected" and corresponding
      * "value" or "reason" properties.
      * @param values Any number of promises
      * @returns A new Promise.
      */
    def allSettled[TAllSettled](values: ValueOrPromiseOfValue[TAllSettled]*): SynchronousPromise[js.Array[SettledOutcome[TAllSettled]]] = js.native
    
    /**
      * Creates a Promise that is resolved or rejected when any of the provided Promises are resolved
      * or rejected.
      * @param values An array of Promises.
      * @returns A new Promise.
      */
    // race<T>(values: IterableShim<T | PromiseLike<T>>): Promise<T>;
    /**
      * Creates a Promise that is resolved with the first value from the provided
      * Promises, or rejected when all provided Promises reject
      * @param v1 An array of Promises
      */
    def any[T](v1: js.Array[ValueOrPromiseOfValue[T]]): SynchronousPromise[T] = js.native
    /**
      * Creates a Promise that is resolved with the first value from the provided
      * Promises, or rejected when all provided Promises reject
      * @param values Any number of Promises
      */
    def any[T](values: ValueOrPromiseOfValue[T]*): SynchronousPromise[T] = js.native
    
    /**
      * Installs SynchronousPromise as the global Promise implementation.
      * When running from within typescript, you will need to use this to
      * patch the generated __awaiter to ensure it gets a _real_ Promise implementation
      * (see https://github.com/Microsoft/TypeScript/issues/19909).
      *
      * Use the following code:
      * declare var __awaiter: Function;
      * __awaiter = SynchronousPromise.installGlobally();
      *
      * This is non-destructive to the __awaiter: it simply wraps it in a closure
      * where the real implementation of Promise has already been captured.
      */
    def installGlobally(__awaiter: js.Function): js.Function = js.native
    
    /**
      * Creates a new rejected promise for the provided reason.
      * @param reason The reason the promise was rejected.
      * @returns A new rejected Promise.
      */
    def reject(reason: Any): SynchronousPromise[Unit] = js.native
    /**
      * Creates a new rejected promise for the provided reason.
      * @param reason The reason the promise was rejected.
      * @returns A new rejected Promise.
      */
    @JSName("reject")
    def reject_T[T](reason: Any): SynchronousPromise[T] = js.native
    
    /**
      * Creates a new resolved promise .
      * @returns A resolved promise.
      */
    def resolve(): SynchronousPromise[Unit] = js.native
    /**
      * Creates a new resolved promise for the provided value.
      * @param value A promise.
      * @returns A promise whose internal state matches the provided promise.
      */
    def resolve[T](value: T): SynchronousPromise[T] = js.native
    def resolve[T](value: PromiseLike[T]): SynchronousPromise[T] = js.native
    
    /*
      * Uninstalls SynchronousPromise as the global Promise implementation,
      * if it is already installed.
      */
    def uninstallGlobally(): Unit = js.native
    
    /**
      * Creates a new unresolved promise with the `resolve` and `reject` methods exposed
      * @returns An unresolved promise with the `resolve` and `reject` methods exposed
      */
    def unresolved[T](): UnresolvedSynchronousPromise[T] = js.native
  }
  
  /**
    * Interface type only exposed when using the static unresolved() convenience method
    */
  @js.native
  trait UnresolvedSynchronousPromise[T]
    extends StObject
       with SynchronousPromise[T] {
    
    def reject[T](data: T): Unit = js.native
    
    def resolve(): Unit = js.native
    def resolve[T](data: T): Unit = js.native
  }
  
  type ValueOrPromiseOfValue[T] = T | PromiseLike[T]
}
