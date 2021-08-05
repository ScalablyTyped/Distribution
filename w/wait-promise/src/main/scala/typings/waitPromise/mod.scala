package typings.waitPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wait-promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def after(time: Double): Wait = ^.asInstanceOf[js.Dynamic].applyDynamic("after")(time.asInstanceOf[js.Any]).asInstanceOf[Wait]
  
  inline def and(func: js.Function0[Unit]): Wait = ^.asInstanceOf[js.Dynamic].applyDynamic("and")(func.asInstanceOf[js.Any]).asInstanceOf[Wait]
  
  inline def before(time: Double): Wait = ^.asInstanceOf[js.Dynamic].applyDynamic("before")(time.asInstanceOf[js.Any]).asInstanceOf[Wait]
  
  inline def check(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")().asInstanceOf[js.Promise[Unit]]
  inline def check[T](cond: js.Function0[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(cond.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def every(interval: Double): Wait = ^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any]).asInstanceOf[Wait]
  inline def every(interval: Double, limit: Double): Wait = (^.asInstanceOf[js.Dynamic].applyDynamic("every")(interval.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Wait]
  
  inline def forward(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[js.Promise[Unit]]
  
  inline def limit(limit: Double): Wait = ^.asInstanceOf[js.Dynamic].applyDynamic("limit")(limit.asInstanceOf[js.Any]).asInstanceOf[Wait]
  
  inline def sleep(time: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(time.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def till[T](cond: js.Function0[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("till")(cond.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  inline def until[T](cond: js.Function0[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("until")(cond.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  @js.native
  trait Wait extends StObject {
    
    def after(time: Double): this.type = js.native
    
    def and(func: js.Function0[Unit]): this.type = js.native
    
    def before(time: Double): this.type = js.native
    
    def check(): js.Promise[Unit] = js.native
    def check[T](cond: js.Function0[T]): js.Promise[T] = js.native
    
    def every(interval: Double): this.type = js.native
    def every(interval: Double, limit: Double): this.type = js.native
    
    // The promise returned by `forward()` never resolves.
    def forward(): js.Promise[Unit] = js.native
    
    def limit(limit: Double): this.type = js.native
    
    def till[T](cond: js.Function0[T]): js.Promise[T] = js.native
    
    def until[T](cond: js.Function0[T]): js.Promise[T] = js.native
  }
}
