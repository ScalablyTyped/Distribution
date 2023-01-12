package typings.webpack.anon

import typings.tapable.mod.Append
import typings.tapable.mod.AsArray
import typings.tapable.mod.InnerCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesWaterfallHook<[std.Array<any>], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>> */
trait FakeHookPickAsyncSeriesWa extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  @JSName("tapAsync")
  def tapAsync_0(
    options: String,
    fn: js.Function1[
      /* args */ Append[
        AsArray[js.Array[js.Array[Any]]], 
        InnerCallback[
          js.Error, 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]
      ], 
      Unit
    ]
  ): Unit
  @JSName("tapAsync")
  var tapAsync_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[
      /* args */ Append[
        AsArray[js.Array[js.Array[Any]]], 
        InnerCallback[
          js.Error, 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]
      ], 
      Unit
    ], 
    Unit
  ]
  
  @JSName("tapPromise")
  def tapPromise_0(
    options: String,
    fn: js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
      ]
    ]
  ): Unit
  @JSName("tapPromise")
  var tapPromise_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
      ]
    ], 
    Unit
  ]
  
  @JSName("tap")
  def tap_0(
    options: String,
    fn: js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
    ]
  ): Unit
  @JSName("tap")
  var tap_Original: js.Function2[
    /* options */ String, 
    /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
    ], 
    Unit
  ]
}
object FakeHookPickAsyncSeriesWa {
  
  inline def apply(
    tap: (/* options */ String, /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
    ]) => Unit,
    tapAsync: (/* options */ String, /* fn */ js.Function1[
      /* args */ Append[
        AsArray[js.Array[js.Array[Any]]], 
        InnerCallback[
          js.Error, 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]
      ], 
      Unit
    ]) => Unit,
    tapPromise: (/* options */ String, /* fn */ js.Function1[
      /* args */ AsArray[js.Array[js.Array[Any]]], 
      js.Promise[
        /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
      ]
    ]) => Unit
  ): FakeHookPickAsyncSeriesWa = {
    val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2(tap), tapAsync = js.Any.fromFunction2(tapAsync), tapPromise = js.Any.fromFunction2(tapPromise))
    __obj.asInstanceOf[FakeHookPickAsyncSeriesWa]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FakeHookPickAsyncSeriesWa] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTap(
      value: (/* options */ String, /* fn */ js.Function1[
          /* args */ AsArray[js.Array[js.Array[Any]]], 
          /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
        ]) => Unit
    ): Self = StObject.set(x, "tap", js.Any.fromFunction2(value))
    
    inline def setTapAsync(
      value: (/* options */ String, /* fn */ js.Function1[
          /* args */ Append[
            AsArray[js.Array[js.Array[Any]]], 
            InnerCallback[
              js.Error, 
              /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
            ]
          ], 
          Unit
        ]) => Unit
    ): Self = StObject.set(x, "tapAsync", js.Any.fromFunction2(value))
    
    inline def setTapPromise(
      value: (/* options */ String, /* fn */ js.Function1[
          /* args */ AsArray[js.Array[js.Array[Any]]], 
          js.Promise[
            /* import warning: importer.ImportType#apply Failed type conversion: tapable.tapable.AsArray<[std.Array<any>]>[0] */ js.Any
          ]
        ]) => Unit
    ): Self = StObject.set(x, "tapPromise", js.Any.fromFunction2(value))
  }
}
