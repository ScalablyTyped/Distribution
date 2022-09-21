package typings.webpack.anon

import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.MultiHook
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.MultiStats
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  done :tapable.tapable.SyncHook<[webpack.webpack.MultiStats], void, tapable.tapable.UnsetAdditionalOptions>,   invalid :tapable.tapable.MultiHook<tapable.tapable.SyncHook<[null | string, number], void, tapable.tapable.UnsetAdditionalOptions>>,   run :tapable.tapable.MultiHook<tapable.tapable.AsyncSeriesHook<[webpack.webpack.Compiler], tapable.tapable.UnsetAdditionalOptions>>,   watchClose :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   watchRun :tapable.tapable.MultiHook<tapable.tapable.AsyncSeriesHook<[webpack.webpack.Compiler], tapable.tapable.UnsetAdditionalOptions>>,   infrastructureLog :tapable.tapable.MultiHook<tapable.tapable.SyncBailHook<[string, string, std.Array<any>], true, tapable.tapable.UnsetAdditionalOptions>>}> */
trait ReadonlydoneSyncHookMulti extends StObject {
  
  val done: SyncHook[js.Array[MultiStats], Unit, UnsetAdditionalOptions]
  
  val infrastructureLog: MultiHook[
    SyncBailHook[js.Tuple3[String, String, js.Array[Any]], `true`, UnsetAdditionalOptions]
  ]
  
  val invalid: MultiHook[SyncHook[js.Tuple2[Null | String, Double], Unit, UnsetAdditionalOptions]]
  
  val run: MultiHook[AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]]
  
  val watchClose: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val watchRun: MultiHook[AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]]
}
object ReadonlydoneSyncHookMulti {
  
  inline def apply(
    done: SyncHook[js.Array[MultiStats], Unit, UnsetAdditionalOptions],
    infrastructureLog: MultiHook[
      SyncBailHook[js.Tuple3[String, String, js.Array[Any]], `true`, UnsetAdditionalOptions]
    ],
    invalid: MultiHook[SyncHook[js.Tuple2[Null | String, Double], Unit, UnsetAdditionalOptions]],
    run: MultiHook[AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]],
    watchClose: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    watchRun: MultiHook[AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]]
  ): ReadonlydoneSyncHookMulti = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], infrastructureLog = infrastructureLog.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], watchClose = watchClose.asInstanceOf[js.Any], watchRun = watchRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlydoneSyncHookMulti]
  }
  
  extension [Self <: ReadonlydoneSyncHookMulti](x: Self) {
    
    inline def setDone(value: SyncHook[js.Array[MultiStats], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureLog(
      value: MultiHook[
          SyncBailHook[js.Tuple3[String, String, js.Array[Any]], `true`, UnsetAdditionalOptions]
        ]
    ): Self = StObject.set(x, "infrastructureLog", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: MultiHook[SyncHook[js.Tuple2[Null | String, Double], Unit, UnsetAdditionalOptions]]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setRun(value: MultiHook[AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]]): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setWatchClose(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "watchClose", value.asInstanceOf[js.Any])
    
    inline def setWatchRun(value: MultiHook[AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]]): Self = StObject.set(x, "watchRun", value.asInstanceOf[js.Any])
  }
}
