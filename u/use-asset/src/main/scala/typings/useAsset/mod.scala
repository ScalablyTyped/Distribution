package typings.useAsset

import typings.useAsset.anon.Clear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("use-asset", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createAsset[T](fn: PromiseFn): Clear[T] = js.native
  def createAsset[T](fn: PromiseFn, lifespan: Double): Clear[T] = js.native
  
  @js.native
  object useAsset extends js.Object {
    
    def apply(fn: PromiseFn, args: js.Array[_]): js.Any = js.native
    
    var clear: js.Function1[/* repeated */ js.Any, Unit] = js.native
    
    var lifespan: Double = js.native
    
    var peek: js.Function1[/* repeated */ js.Any, js.Any] = js.native
    
    var preload: js.Function2[/* fn */ PromiseFn, /* repeated */ js.Any, js.UndefOr[scala.Nothing]] = js.native
  }
  
  type PromiseFn = js.Function1[/* args */ js.Any, js.Promise[js.Any]]
}
