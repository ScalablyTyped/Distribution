package typings.wonka

import typings.std.AsyncIterable
import typings.std.Event
import typings.std.HTMLElement
import typings.wonka.distTypesTypesMod.Observer
import typings.wonka.distTypesTypesMod.Source
import typings.wonka.distTypesTypesMod.Subject
import typings.wonka.distTypesTypesMod.TeardownFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSourcesMod {
  
  @JSImport("wonka/dist/types/sources", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wonka/dist/types/sources", "empty")
  @js.native
  val empty: Source[Any] = js.native
  
  inline def fromArray[T](array: js.Array[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(array.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromAsyncIterable[T](iterable: AsyncIterable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromDomEvent(element: HTMLElement, event: String): Source[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDomEvent")(element.asInstanceOf[js.Any], event.asInstanceOf[js.Any])).asInstanceOf[Source[Event]]
  
  inline def fromIterable[T](iterable: js.Iterable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  inline def fromIterable[T](iterable: AsyncIterable[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromPromise[T](promise: js.Promise[T]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPromise")(promise.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def fromValue[T](value: T): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromValue")(value.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def interval(ms: Double): Source[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(ms.asInstanceOf[js.Any]).asInstanceOf[Source[Double]]
  
  inline def `lazy`[T](make: js.Function0[Source[T]]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("lazy")(make.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def make[T](produce: js.Function1[/* observer */ Observer[T], TeardownFn]): Source[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("make")(produce.asInstanceOf[js.Any]).asInstanceOf[Source[T]]
  
  inline def makeSubject[T](): Subject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSubject")().asInstanceOf[Subject[T]]
  
  @JSImport("wonka/dist/types/sources", "never")
  @js.native
  val never: Source[Any] = js.native
}
