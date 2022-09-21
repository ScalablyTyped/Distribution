package typings.tabris.global.tabris

import typings.tabris.mod.SubscriptionHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("tabris.Observable")
@js.native
open class Observable[T] protected ()
  extends typings.tabris.mod.Observable[T] {
  /**
    * An Observable represents a sequence of values which may be observed. API based on the proposed Ecma
    * TC39 Observable standard. It can be converted to an RxJS Observable via its
    * [`from`](https://rxjs.dev/api/index/function/from) function.
    */
  def this(subscribe: SubscriptionHandler[T]) = this()
}
/* static members */
object Observable {
  
  @JSGlobal("tabris.Observable")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an observable emitting the given source object once and then again whenever it fires property
    * change events. It can be used with any widget, NativeObject instance, or object using @property or
    * @prop decorators.
    * Events are aggregated, meaning multiple subsequent property changes may result in only one
    * notification to the observer. It is guaranteed that this notification will occur before the next
    * frame is rendered on screen.
    * The observable completes if the source object is disposed.
    * Limitations: The observable will not detect property changes that do not trigger change events, so
    * plain objects, arrays, objects created by third-party libraries or instances of built-in ECMAScript
    * types (such as Map) are not supported. Also, changes of `bounds` or any built-in property giving
    * scroll offsets will *not* trigger the observable.
    * @param source
    */
  inline def mutations[T /* <: js.Object */](source: T): typings.tabris.mod.Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("mutations")(source.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.Observable[T]]
}
