package typings.webpack.mod

import typings.node.bufferMod.global.Buffer
import typings.tapable.mod.AsyncSeriesBailHook
import typings.tapable.mod.HookMap
import typings.tapable.mod.SyncHook
import typings.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NormalModuleCompilationHooks extends StObject {
  
  var beforeLoaders: SyncHook[
    js.Tuple3[js.Array[LoaderItem], NormalModule, js.Object], 
    Unit, 
    UnsetAdditionalOptions
  ]
  
  var beforeParse: SyncHook[js.Array[NormalModule], Unit, UnsetAdditionalOptions]
  
  var beforeSnapshot: SyncHook[js.Array[NormalModule], Unit, UnsetAdditionalOptions]
  
  var loader: SyncHook[js.Tuple2[js.Object, NormalModule], Unit, UnsetAdditionalOptions]
  
  var needBuild: AsyncSeriesBailHook[js.Tuple2[NormalModule, NeedBuildContext], Boolean, UnsetAdditionalOptions]
  
  var readResource: HookMap[
    AsyncSeriesBailHook[js.Array[js.Object], String | Buffer, UnsetAdditionalOptions]
  ]
  
  var readResourceForScheme: HookMap[
    AsyncSeriesBailHook[js.Tuple2[String, NormalModule], String | Buffer, UnsetAdditionalOptions]
  ]
}
object NormalModuleCompilationHooks {
  
  inline def apply(
    beforeLoaders: SyncHook[
      js.Tuple3[js.Array[LoaderItem], NormalModule, js.Object], 
      Unit, 
      UnsetAdditionalOptions
    ],
    beforeParse: SyncHook[js.Array[NormalModule], Unit, UnsetAdditionalOptions],
    beforeSnapshot: SyncHook[js.Array[NormalModule], Unit, UnsetAdditionalOptions],
    loader: SyncHook[js.Tuple2[js.Object, NormalModule], Unit, UnsetAdditionalOptions],
    needBuild: AsyncSeriesBailHook[js.Tuple2[NormalModule, NeedBuildContext], Boolean, UnsetAdditionalOptions],
    readResource: HookMap[
      AsyncSeriesBailHook[js.Array[js.Object], String | Buffer, UnsetAdditionalOptions]
    ],
    readResourceForScheme: HookMap[
      AsyncSeriesBailHook[js.Tuple2[String, NormalModule], String | Buffer, UnsetAdditionalOptions]
    ]
  ): NormalModuleCompilationHooks = {
    val __obj = js.Dynamic.literal(beforeLoaders = beforeLoaders.asInstanceOf[js.Any], beforeParse = beforeParse.asInstanceOf[js.Any], beforeSnapshot = beforeSnapshot.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], needBuild = needBuild.asInstanceOf[js.Any], readResource = readResource.asInstanceOf[js.Any], readResourceForScheme = readResourceForScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalModuleCompilationHooks]
  }
  
  extension [Self <: NormalModuleCompilationHooks](x: Self) {
    
    inline def setBeforeLoaders(
      value: SyncHook[
          js.Tuple3[js.Array[LoaderItem], NormalModule, js.Object], 
          Unit, 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "beforeLoaders", value.asInstanceOf[js.Any])
    
    inline def setBeforeParse(value: SyncHook[js.Array[NormalModule], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeParse", value.asInstanceOf[js.Any])
    
    inline def setBeforeSnapshot(value: SyncHook[js.Array[NormalModule], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeSnapshot", value.asInstanceOf[js.Any])
    
    inline def setLoader(value: SyncHook[js.Tuple2[js.Object, NormalModule], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
    
    inline def setNeedBuild(
      value: AsyncSeriesBailHook[js.Tuple2[NormalModule, NeedBuildContext], Boolean, UnsetAdditionalOptions]
    ): Self = StObject.set(x, "needBuild", value.asInstanceOf[js.Any])
    
    inline def setReadResource(
      value: HookMap[
          AsyncSeriesBailHook[js.Array[js.Object], String | Buffer, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "readResource", value.asInstanceOf[js.Any])
    
    inline def setReadResourceForScheme(
      value: HookMap[
          AsyncSeriesBailHook[js.Tuple2[String, NormalModule], String | Buffer, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "readResourceForScheme", value.asInstanceOf[js.Any])
  }
}
