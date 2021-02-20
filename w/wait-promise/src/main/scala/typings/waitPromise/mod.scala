package typings.waitPromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wait-promise", "after")
  @js.native
  def after(time: Double): Wait = js.native
  
  @JSImport("wait-promise", "and")
  @js.native
  def and(func: js.Function0[Unit]): Wait = js.native
  
  @JSImport("wait-promise", "before")
  @js.native
  def before(time: Double): Wait = js.native
  
  @JSImport("wait-promise", "check")
  @js.native
  def check(): js.Promise[Unit] = js.native
  @JSImport("wait-promise", "check")
  @js.native
  def check[T](cond: js.Function0[T]): js.Promise[T] = js.native
  
  @JSImport("wait-promise", "every")
  @js.native
  def every(interval: Double): Wait = js.native
  @JSImport("wait-promise", "every")
  @js.native
  def every(interval: Double, limit: Double): Wait = js.native
  
  @JSImport("wait-promise", "forward")
  @js.native
  def forward(): js.Promise[Unit] = js.native
  
  @JSImport("wait-promise", "limit")
  @js.native
  def limit(limit: Double): Wait = js.native
  
  @JSImport("wait-promise", "sleep")
  @js.native
  def sleep(time: Double): js.Promise[Unit] = js.native
  
  @JSImport("wait-promise", "till")
  @js.native
  def till[T](cond: js.Function0[T]): js.Promise[T] = js.native
  
  @JSImport("wait-promise", "until")
  @js.native
  def until[T](cond: js.Function0[T]): js.Promise[T] = js.native
  
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
