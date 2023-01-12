package typings.webpack.anon

import typings.tapable.mod.AsyncParallelHook
import typings.tapable.mod.AsyncSeriesBailHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.Etag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginIdle extends StObject {
  
  var beginIdle: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  var endIdle: AsyncParallelHook[js.Array[Any], UnsetAdditionalOptions]
  
  var get: AsyncSeriesBailHook[
    js.Tuple3[
      String, 
      Null | Etag, 
      js.Array[
        js.Function2[
          /* result */ Any, 
          /* callback */ js.Function1[/* arg0 */ js.UndefOr[js.Error], Unit], 
          Unit
        ]
      ]
    ], 
    Any, 
    UnsetAdditionalOptions
  ]
  
  var shutdown: AsyncParallelHook[js.Array[Any], UnsetAdditionalOptions]
  
  var store: AsyncParallelHook[js.Tuple3[String, Null | Etag, Any], UnsetAdditionalOptions]
  
  var storeBuildDependencies: AsyncParallelHook[js.Array[js.Iterable[String]], UnsetAdditionalOptions]
}
object BeginIdle {
  
  inline def apply(
    beginIdle: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    endIdle: AsyncParallelHook[js.Array[Any], UnsetAdditionalOptions],
    get: AsyncSeriesBailHook[
      js.Tuple3[
        String, 
        Null | Etag, 
        js.Array[
          js.Function2[
            /* result */ Any, 
            /* callback */ js.Function1[/* arg0 */ js.UndefOr[js.Error], Unit], 
            Unit
          ]
        ]
      ], 
      Any, 
      UnsetAdditionalOptions
    ],
    shutdown: AsyncParallelHook[js.Array[Any], UnsetAdditionalOptions],
    store: AsyncParallelHook[js.Tuple3[String, Null | Etag, Any], UnsetAdditionalOptions],
    storeBuildDependencies: AsyncParallelHook[js.Array[js.Iterable[String]], UnsetAdditionalOptions]
  ): BeginIdle = {
    val __obj = js.Dynamic.literal(beginIdle = beginIdle.asInstanceOf[js.Any], endIdle = endIdle.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], shutdown = shutdown.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any], storeBuildDependencies = storeBuildDependencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeginIdle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeginIdle] (val x: Self) extends AnyVal {
    
    inline def setBeginIdle(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beginIdle", value.asInstanceOf[js.Any])
    
    inline def setEndIdle(value: AsyncParallelHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "endIdle", value.asInstanceOf[js.Any])
    
    inline def setGet(
      value: AsyncSeriesBailHook[
          js.Tuple3[
            String, 
            Null | Etag, 
            js.Array[
              js.Function2[
                /* result */ Any, 
                /* callback */ js.Function1[/* arg0 */ js.UndefOr[js.Error], Unit], 
                Unit
              ]
            ]
          ], 
          Any, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setShutdown(value: AsyncParallelHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "shutdown", value.asInstanceOf[js.Any])
    
    inline def setStore(value: AsyncParallelHook[js.Tuple3[String, Null | Etag, Any], UnsetAdditionalOptions]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setStoreBuildDependencies(value: AsyncParallelHook[js.Array[js.Iterable[String]], UnsetAdditionalOptions]): Self = StObject.set(x, "storeBuildDependencies", value.asInstanceOf[js.Any])
  }
}
