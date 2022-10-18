package typings.vscodeLanguageclient

import typings.std.PromiseLike
import typings.vscode.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonUtilsAsyncMod {
  
  @JSImport("vscode-languageclient/lib/common/utils/async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-languageclient/lib/common/utils/async", "Delayer")
  @js.native
  open class Delayer[T] protected () extends StObject {
    def this(defaultDelay: Double) = this()
    
    def cancel(): Unit = js.native
    
    /* private */ var cancelTimeout: Any = js.native
    
    /* private */ var completionPromise: Any = js.native
    
    var defaultDelay: Double = js.native
    
    def forceDelivery(): js.UndefOr[T] = js.native
    
    def isTriggered(): Boolean = js.native
    
    /* private */ var onSuccess: Any = js.native
    
    /* private */ var task: Any = js.native
    
    /* private */ var timeout: Any = js.native
    
    def trigger(task: ITask[T]): js.Promise[T] = js.native
    def trigger(task: ITask[T], delay: Double): js.Promise[T] = js.native
  }
  
  @JSImport("vscode-languageclient/lib/common/utils/async", "Semaphore")
  @js.native
  open class Semaphore[T] () extends StObject {
    def this(capacity: Double) = this()
    
    /* private */ var _active: Any = js.native
    
    /* private */ var _capacity: Any = js.native
    
    /* private */ var _waiting: Any = js.native
    
    def active: Double = js.native
    
    /* private */ var doRunNext: Any = js.native
    
    def lock(thunk: js.Function0[T | PromiseLike[T]]): js.Promise[T] = js.native
    
    /* private */ var runNext: Any = js.native
  }
  
  inline def clearTestMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTestMode")().asInstanceOf[Unit]
  
  inline def forEach[P](items: js.Array[P], func: js.Function1[/* item */ P, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEach[P](items: js.Array[P], func: js.Function1[/* item */ P, Unit], token: Unit, options: YieldOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any], token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEach[P](items: js.Array[P], func: js.Function1[/* item */ P, Unit], token: CancellationToken): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def forEach[P](
    items: js.Array[P],
    func: js.Function1[/* item */ P, Unit],
    token: CancellationToken,
    options: YieldOptions
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any], token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def map[P, C](items: js.Array[P], func: js.Function1[/* item */ P, C]): js.Promise[js.Array[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[C]]]
  inline def map[P, C](items: js.Array[P], func: js.Function1[/* item */ P, C], token: Unit, options: YieldOptions): js.Promise[js.Array[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any], token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[C]]]
  inline def map[P, C](items: js.Array[P], func: js.Function1[/* item */ P, C], token: CancellationToken): js.Promise[js.Array[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[C]]]
  inline def map[P, C](
    items: js.Array[P],
    func: js.Function1[/* item */ P, C],
    token: CancellationToken,
    options: YieldOptions
  ): js.Promise[js.Array[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("map")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any], token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[C]]]
  
  inline def mapAsync[P, C](
    items: js.Array[P],
    func: js.Function2[/* item */ P, /* token */ js.UndefOr[CancellationToken], js.Promise[C]]
  ): js.Promise[js.Array[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[C]]]
  inline def mapAsync[P, C](
    items: js.Array[P],
    func: js.Function2[/* item */ P, /* token */ js.UndefOr[CancellationToken], js.Promise[C]],
    token: Unit,
    options: YieldOptions
  ): js.Promise[js.Array[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any], token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[C]]]
  inline def mapAsync[P, C](
    items: js.Array[P],
    func: js.Function2[/* item */ P, /* token */ js.UndefOr[CancellationToken], js.Promise[C]],
    token: CancellationToken
  ): js.Promise[js.Array[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[C]]]
  inline def mapAsync[P, C](
    items: js.Array[P],
    func: js.Function2[/* item */ P, /* token */ js.UndefOr[CancellationToken], js.Promise[C]],
    token: CancellationToken,
    options: YieldOptions
  ): js.Promise[js.Array[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapAsync")(items.asInstanceOf[js.Any], func.asInstanceOf[js.Any], token.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[C]]]
  
  inline def setTestMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTestMode")().asInstanceOf[Unit]
  
  type ITask[T] = js.Function0[T]
  
  trait YieldOptions extends StObject {
    
    /**
      * The time in ms after which the function should yield.
      * The minimum yield time is 15ms
      */
    var yieldAfter: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional callback that is invoke when the code yields.
      */
    var yieldCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object YieldOptions {
    
    inline def apply(): YieldOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YieldOptions]
    }
    
    extension [Self <: YieldOptions](x: Self) {
      
      inline def setYieldAfter(value: Double): Self = StObject.set(x, "yieldAfter", value.asInstanceOf[js.Any])
      
      inline def setYieldAfterUndefined: Self = StObject.set(x, "yieldAfter", js.undefined)
      
      inline def setYieldCallback(value: () => Unit): Self = StObject.set(x, "yieldCallback", js.Any.fromFunction0(value))
      
      inline def setYieldCallbackUndefined: Self = StObject.set(x, "yieldCallback", js.undefined)
    }
  }
}
