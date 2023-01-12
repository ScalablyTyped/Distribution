package typings.webpack.anon

import typings.tapable.mod.Append
import typings.tapable.mod.AsArray
import typings.tapable.mod.InnerCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesHook<[], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>> */
trait FakeHookPickAsyncSeriesHo extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  def tap(options: String, fn: js.Function1[/* args */ AsArray[js.Array[Any]], Unit]): Unit
  
  def tapAsync(
    options: String,
    fn: js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit]
  ): Unit
  @JSName("tapAsync")
  var tapAsync_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit], 
    Unit
  ]
  
  def tapPromise(options: String, fn: js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]]): Unit
  @JSName("tapPromise")
  var tapPromise_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]], 
    Unit
  ]
  
  @JSName("tap")
  var tap_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], Unit], 
    Unit
  ]
}
object FakeHookPickAsyncSeriesHo {
  
  inline def apply(
    tap: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], Unit]) => Unit,
    tapAsync: (/* options */ String, /* fn */ js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit]) => Unit,
    tapPromise: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]]) => Unit
  ): FakeHookPickAsyncSeriesHo = {
    val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2(tap), tapAsync = js.Any.fromFunction2(tapAsync), tapPromise = js.Any.fromFunction2(tapPromise))
    __obj.asInstanceOf[FakeHookPickAsyncSeriesHo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FakeHookPickAsyncSeriesHo] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTap(
      value: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], Unit]) => Unit
    ): Self = StObject.set(x, "tap", js.Any.fromFunction2(value))
    
    inline def setTapAsync(
      value: (/* options */ String, /* fn */ js.Function1[/* args */ Append[AsArray[js.Array[Any]], InnerCallback[js.Error, Unit]], Unit]) => Unit
    ): Self = StObject.set(x, "tapAsync", js.Any.fromFunction2(value))
    
    inline def setTapPromise(
      value: (/* options */ String, /* fn */ js.Function1[/* args */ AsArray[js.Array[Any]], js.Promise[Unit]]) => Unit
    ): Self = StObject.set(x, "tapPromise", js.Any.fromFunction2(value))
  }
}
