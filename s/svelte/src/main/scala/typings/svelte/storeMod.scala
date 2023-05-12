package typings.svelte

import typings.svelte.typesRuntimeStoreMod.Readable_
import typings.svelte.typesRuntimeStoreMod.StartStopNotifier
import typings.svelte.typesRuntimeStoreMod.Stores
import typings.svelte.typesRuntimeStoreMod.StoresValues
import typings.svelte.typesRuntimeStoreMod.Unsubscriber
import typings.svelte.typesRuntimeStoreMod.Writable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object storeMod {
  
  @JSImport("svelte/store", JSImport.Namespace)
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
  
  inline def readonly[T](store: Readable_[T]): Readable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("readonly")(store.asInstanceOf[js.Any]).asInstanceOf[Readable_[T]]
  
  inline def writable[T](): Writable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")().asInstanceOf[Writable_[T]]
  inline def writable[T](value: T): Writable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("writable")(value.asInstanceOf[js.Any]).asInstanceOf[Writable_[T]]
  inline def writable[T](value: T, start: StartStopNotifier[T]): Writable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writable")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Writable_[T]]
  inline def writable[T](value: Unit, start: StartStopNotifier[T]): Writable_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("writable")(value.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Writable_[T]]
}
