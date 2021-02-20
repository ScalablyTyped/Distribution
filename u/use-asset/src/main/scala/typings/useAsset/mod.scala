package typings.useAsset

import typings.useAsset.anon.Clear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("use-asset", "createAsset")
  @js.native
  def createAsset[T](fn: PromiseFn): Clear[T] = js.native
  @JSImport("use-asset", "createAsset")
  @js.native
  def createAsset[T](fn: PromiseFn, lifespan: Double): Clear[T] = js.native
  
  object useAsset {
    
    @JSImport("use-asset", "useAsset")
    @js.native
    def apply(fn: PromiseFn, args: js.Array[_]): js.Any = js.native
    @JSImport("use-asset", "useAsset")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("use-asset", "useAsset.clear")
    @js.native
    def clear: js.Function1[/* repeated */ js.Any, Unit] = js.native
    @scala.inline
    def clear_=(x: js.Function1[/* repeated */ js.Any, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clear")(x.asInstanceOf[js.Any])
    
    @JSImport("use-asset", "useAsset.lifespan")
    @js.native
    def lifespan: Double = js.native
    @scala.inline
    def lifespan_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lifespan")(x.asInstanceOf[js.Any])
    
    @JSImport("use-asset", "useAsset.peek")
    @js.native
    def peek: js.Function1[/* repeated */ js.Any, js.Any] = js.native
    @scala.inline
    def peek_=(x: js.Function1[/* repeated */ js.Any, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("peek")(x.asInstanceOf[js.Any])
    
    @JSImport("use-asset", "useAsset.preload")
    @js.native
    def preload: js.Function2[/* fn */ PromiseFn, /* repeated */ js.Any, js.UndefOr[scala.Nothing]] = js.native
    @scala.inline
    def preload_=(x: js.Function2[/* fn */ PromiseFn, /* repeated */ js.Any, js.UndefOr[scala.Nothing]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preload")(x.asInstanceOf[js.Any])
  }
  
  type PromiseFn = js.Function1[/* args */ js.Any, js.Promise[js.Any]]
}
