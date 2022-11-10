package typings.svelte

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuntimeStoreMod {
  
  @JSImport("svelte/types/runtime/store", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def derived[S /* <: Stores */, T](stores: S, fn: js.Function1[/* values */ StoresValues[S], T]): Readable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("derived")(stores.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Readable_[T]]
  inline def derived[S /* <: Stores */, T](stores: S, fn: js.Function1[/* values */ StoresValues[S], T], initial_value: T): Readable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("derived")(stores.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], initial_value.asInstanceOf[js.Any])).asInstanceOf[Readable_[T]]
  inline def derived[S /* <: Stores */, T](
    stores: S,
    fn: js.Function2[
      /* values */ StoresValues[S], 
      /* set */ js.Function1[/* value */ T, Unit], 
      Unsubscriber | Unit
    ]
  ): Readable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("derived")(stores.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Readable_[T]]
  inline def derived[S /* <: Stores */, T](
    stores: S,
    fn: js.Function2[
      /* values */ StoresValues[S], 
      /* set */ js.Function1[/* value */ T, Unit], 
      Unsubscriber | Unit
    ],
    initial_value: T
  ): Readable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("derived")(stores.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], initial_value.asInstanceOf[js.Any])).asInstanceOf[Readable_[T]]
  
  inline def get[T](store: Readable_[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(store.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def readable[T](): Readable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")().asInstanceOf[Readable_[T]]
  inline def readable[T](value: T): Readable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("readable")(value.asInstanceOf[js.Any]).asInstanceOf[Readable_[T]]
  inline def readable[T](value: T, start: StartStopNotifier[T]): Readable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("readable")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Readable_[T]]
  inline def readable[T](value: Unit, start: StartStopNotifier[T]): Readable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("readable")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Readable_[T]]
  
  inline def writable[T](): Writable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")().asInstanceOf[Writable_[T]]
  inline def writable[T](value: T): Writable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")(value.asInstanceOf[js.Any]).asInstanceOf[Writable_[T]]
  inline def writable[T](value: T, start: StartStopNotifier[T]): Writable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writable")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Writable_[T]]
  inline def writable[T](value: Unit, start: StartStopNotifier[T]): Writable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writable")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Writable_[T]]
  
  /** Cleanup logic callback. */
  type Invalidator[T] = js.Function1[/* value */ js.UndefOr[T], Unit]
  
  @js.native
  trait Readable_[T] extends StObject {
    
    /**
      * Subscribe on value changes.
      * @param run subscription callback
      * @param invalidate cleanup callback
      */
    def subscribe(run: Subscriber[T]): Unsubscriber = js.native
    def subscribe(run: Subscriber[T], invalidate: Invalidator[T]): Unsubscriber = js.native
  }
  
  type StartStopNotifier[T] = js.Function1[/* set */ Subscriber[T], Unsubscriber | Unit]
  
  /** One or more `Readable`s. */
  type Stores = Readable_[Any] | Array[Readable_[Any]] | js.Array[Readable_[Any]]
  
  /** One or more values from `Readable` stores. */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends svelte.svelte/types/runtime/store.Readable<infer U> ? U : {[ K in keyof T ]: T[K] extends svelte.svelte/types/runtime/store.Readable<infer U>? U : never}
    }}}
    */
  @js.native
  trait StoresValues[T] extends StObject
  
  type Subscriber[T] = js.Function1[/* value */ T, Unit]
  
  type Unsubscriber = js.Function0[Unit]
  
  type Updater[T] = js.Function1[/* value */ T, T]
  
  @js.native
  trait Writable_[T]
    extends StObject
       with Readable_[T] {
    
    /**
      * Set value and inform subscribers.
      * @param value to set
      */
    def set(value: T): Unit = js.native
    
    /**
      * Update value using callback and inform subscribers.
      * @param updater callback
      */
    def update(updater: Updater[T]): Unit = js.native
  }
}
