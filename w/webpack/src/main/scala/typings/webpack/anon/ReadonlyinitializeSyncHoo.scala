package typings.webpack.anon

import typings.tapable.mod.AsyncParallelHook
import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.AssetEmittedInfo
import typings.webpack.mod.Compilation
import typings.webpack.mod.CompilationParams
import typings.webpack.mod.EntryNormalized
import typings.webpack.mod.NormalModuleFactory
import typings.webpack.mod.Stats
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  initialize :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   shouldEmit :tapable.tapable.SyncBailHook<[webpack.webpack.Compilation], boolean, tapable.tapable.UnsetAdditionalOptions>,   done :tapable.tapable.AsyncSeriesHook<[webpack.webpack.Stats], tapable.tapable.UnsetAdditionalOptions>,   afterDone :tapable.tapable.SyncHook<[webpack.webpack.Stats], void, tapable.tapable.UnsetAdditionalOptions>,   additionalPass :tapable.tapable.AsyncSeriesHook<[], tapable.tapable.UnsetAdditionalOptions>,   beforeRun :tapable.tapable.AsyncSeriesHook<[webpack.webpack.Compiler], tapable.tapable.UnsetAdditionalOptions>,   run :tapable.tapable.AsyncSeriesHook<[webpack.webpack.Compiler], tapable.tapable.UnsetAdditionalOptions>,   emit :tapable.tapable.AsyncSeriesHook<[webpack.webpack.Compilation], tapable.tapable.UnsetAdditionalOptions>,   assetEmitted :tapable.tapable.AsyncSeriesHook<[string, webpack.webpack.AssetEmittedInfo], tapable.tapable.UnsetAdditionalOptions>,   afterEmit :tapable.tapable.AsyncSeriesHook<[webpack.webpack.Compilation], tapable.tapable.UnsetAdditionalOptions>,   thisCompilation :tapable.tapable.SyncHook<[webpack.webpack.Compilation, webpack.webpack.CompilationParams], void, tapable.tapable.UnsetAdditionalOptions>,   compilation :tapable.tapable.SyncHook<[webpack.webpack.Compilation, webpack.webpack.CompilationParams], void, tapable.tapable.UnsetAdditionalOptions>,   normalModuleFactory :tapable.tapable.SyncHook<[webpack.webpack.NormalModuleFactory], void, tapable.tapable.UnsetAdditionalOptions>,   contextModuleFactory :tapable.tapable.SyncHook<[webpack.webpack.ContextModuleFactory], void, tapable.tapable.UnsetAdditionalOptions>,   beforeCompile :tapable.tapable.AsyncSeriesHook<[webpack.webpack.CompilationParams], tapable.tapable.UnsetAdditionalOptions>,   compile :tapable.tapable.SyncHook<[webpack.webpack.CompilationParams], void, tapable.tapable.UnsetAdditionalOptions>,   make :tapable.tapable.AsyncParallelHook<[webpack.webpack.Compilation], tapable.tapable.UnsetAdditionalOptions>,   finishMake :tapable.tapable.AsyncParallelHook<[webpack.webpack.Compilation], tapable.tapable.UnsetAdditionalOptions>,   afterCompile :tapable.tapable.AsyncSeriesHook<[webpack.webpack.Compilation], tapable.tapable.UnsetAdditionalOptions>,   readRecords :tapable.tapable.AsyncSeriesHook<[], tapable.tapable.UnsetAdditionalOptions>,   emitRecords :tapable.tapable.AsyncSeriesHook<[], tapable.tapable.UnsetAdditionalOptions>,   watchRun :tapable.tapable.AsyncSeriesHook<[webpack.webpack.Compiler], tapable.tapable.UnsetAdditionalOptions>,   failed :tapable.tapable.SyncHook<[std.Error], void, tapable.tapable.UnsetAdditionalOptions>,   invalid :tapable.tapable.SyncHook<[null | string, number], void, tapable.tapable.UnsetAdditionalOptions>,   watchClose :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   shutdown :tapable.tapable.AsyncSeriesHook<[], tapable.tapable.UnsetAdditionalOptions>,   infrastructureLog :tapable.tapable.SyncBailHook<[string, string, std.Array<any>], true, tapable.tapable.UnsetAdditionalOptions>,   environment :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   afterEnvironment :tapable.tapable.SyncHook<[], void, tapable.tapable.UnsetAdditionalOptions>,   afterPlugins :tapable.tapable.SyncHook<[webpack.webpack.Compiler], void, tapable.tapable.UnsetAdditionalOptions>,   afterResolvers :tapable.tapable.SyncHook<[webpack.webpack.Compiler], void, tapable.tapable.UnsetAdditionalOptions>,   entryOption :tapable.tapable.SyncBailHook<[string, webpack.webpack.EntryNormalized], boolean, tapable.tapable.UnsetAdditionalOptions>}> */
trait ReadonlyinitializeSyncHoo extends StObject {
  
  val additionalPass: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]
  
  val afterCompile: AsyncSeriesHook[js.Array[Compilation], UnsetAdditionalOptions]
  
  val afterDone: SyncHook[js.Array[Stats], Unit, UnsetAdditionalOptions]
  
  val afterEmit: AsyncSeriesHook[js.Array[Compilation], UnsetAdditionalOptions]
  
  val afterEnvironment: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val afterPlugins: SyncHook[js.Array[typings.webpack.mod.Compiler], Unit, UnsetAdditionalOptions]
  
  val afterResolvers: SyncHook[js.Array[typings.webpack.mod.Compiler], Unit, UnsetAdditionalOptions]
  
  val assetEmitted: AsyncSeriesHook[js.Tuple2[String, AssetEmittedInfo], UnsetAdditionalOptions]
  
  val beforeCompile: AsyncSeriesHook[js.Array[CompilationParams], UnsetAdditionalOptions]
  
  val beforeRun: AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]
  
  val compilation: SyncHook[js.Tuple2[Compilation, CompilationParams], Unit, UnsetAdditionalOptions]
  
  val compile: SyncHook[js.Array[CompilationParams], Unit, UnsetAdditionalOptions]
  
  val contextModuleFactory: SyncHook[js.Array[typings.webpack.mod.ContextModuleFactory], Unit, UnsetAdditionalOptions]
  
  val done: AsyncSeriesHook[js.Array[Stats], UnsetAdditionalOptions]
  
  val emit: AsyncSeriesHook[js.Array[Compilation], UnsetAdditionalOptions]
  
  val emitRecords: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]
  
  val entryOption: SyncBailHook[js.Tuple2[String, EntryNormalized], Boolean, UnsetAdditionalOptions]
  
  val environment: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val failed: SyncHook[js.Array[js.Error], Unit, UnsetAdditionalOptions]
  
  val finishMake: AsyncParallelHook[js.Array[Compilation], UnsetAdditionalOptions]
  
  val infrastructureLog: SyncBailHook[js.Tuple3[String, String, js.Array[Any]], `true`, UnsetAdditionalOptions]
  
  val initialize: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val invalid: SyncHook[js.Tuple2[Null | String, Double], Unit, UnsetAdditionalOptions]
  
  val make: AsyncParallelHook[js.Array[Compilation], UnsetAdditionalOptions]
  
  val normalModuleFactory: SyncHook[js.Array[NormalModuleFactory], Unit, UnsetAdditionalOptions]
  
  val readRecords: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]
  
  val run: AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]
  
  val shouldEmit: SyncBailHook[js.Array[Compilation], Boolean, UnsetAdditionalOptions]
  
  val shutdown: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]
  
  val thisCompilation: SyncHook[js.Tuple2[Compilation, CompilationParams], Unit, UnsetAdditionalOptions]
  
  val watchClose: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  val watchRun: AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]
}
object ReadonlyinitializeSyncHoo {
  
  inline def apply(
    additionalPass: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions],
    afterCompile: AsyncSeriesHook[js.Array[Compilation], UnsetAdditionalOptions],
    afterDone: SyncHook[js.Array[Stats], Unit, UnsetAdditionalOptions],
    afterEmit: AsyncSeriesHook[js.Array[Compilation], UnsetAdditionalOptions],
    afterEnvironment: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    afterPlugins: SyncHook[js.Array[typings.webpack.mod.Compiler], Unit, UnsetAdditionalOptions],
    afterResolvers: SyncHook[js.Array[typings.webpack.mod.Compiler], Unit, UnsetAdditionalOptions],
    assetEmitted: AsyncSeriesHook[js.Tuple2[String, AssetEmittedInfo], UnsetAdditionalOptions],
    beforeCompile: AsyncSeriesHook[js.Array[CompilationParams], UnsetAdditionalOptions],
    beforeRun: AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions],
    compilation: SyncHook[js.Tuple2[Compilation, CompilationParams], Unit, UnsetAdditionalOptions],
    compile: SyncHook[js.Array[CompilationParams], Unit, UnsetAdditionalOptions],
    contextModuleFactory: SyncHook[js.Array[typings.webpack.mod.ContextModuleFactory], Unit, UnsetAdditionalOptions],
    done: AsyncSeriesHook[js.Array[Stats], UnsetAdditionalOptions],
    emit: AsyncSeriesHook[js.Array[Compilation], UnsetAdditionalOptions],
    emitRecords: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions],
    entryOption: SyncBailHook[js.Tuple2[String, EntryNormalized], Boolean, UnsetAdditionalOptions],
    environment: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    failed: SyncHook[js.Array[js.Error], Unit, UnsetAdditionalOptions],
    finishMake: AsyncParallelHook[js.Array[Compilation], UnsetAdditionalOptions],
    infrastructureLog: SyncBailHook[js.Tuple3[String, String, js.Array[Any]], `true`, UnsetAdditionalOptions],
    initialize: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    invalid: SyncHook[js.Tuple2[Null | String, Double], Unit, UnsetAdditionalOptions],
    make: AsyncParallelHook[js.Array[Compilation], UnsetAdditionalOptions],
    normalModuleFactory: SyncHook[js.Array[NormalModuleFactory], Unit, UnsetAdditionalOptions],
    readRecords: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions],
    run: AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions],
    shouldEmit: SyncBailHook[js.Array[Compilation], Boolean, UnsetAdditionalOptions],
    shutdown: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions],
    thisCompilation: SyncHook[js.Tuple2[Compilation, CompilationParams], Unit, UnsetAdditionalOptions],
    watchClose: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    watchRun: AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]
  ): ReadonlyinitializeSyncHoo = {
    val __obj = js.Dynamic.literal(additionalPass = additionalPass.asInstanceOf[js.Any], afterCompile = afterCompile.asInstanceOf[js.Any], afterDone = afterDone.asInstanceOf[js.Any], afterEmit = afterEmit.asInstanceOf[js.Any], afterEnvironment = afterEnvironment.asInstanceOf[js.Any], afterPlugins = afterPlugins.asInstanceOf[js.Any], afterResolvers = afterResolvers.asInstanceOf[js.Any], assetEmitted = assetEmitted.asInstanceOf[js.Any], beforeCompile = beforeCompile.asInstanceOf[js.Any], beforeRun = beforeRun.asInstanceOf[js.Any], compilation = compilation.asInstanceOf[js.Any], compile = compile.asInstanceOf[js.Any], contextModuleFactory = contextModuleFactory.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], emitRecords = emitRecords.asInstanceOf[js.Any], entryOption = entryOption.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], finishMake = finishMake.asInstanceOf[js.Any], infrastructureLog = infrastructureLog.asInstanceOf[js.Any], initialize = initialize.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any], readRecords = readRecords.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], shouldEmit = shouldEmit.asInstanceOf[js.Any], shutdown = shutdown.asInstanceOf[js.Any], thisCompilation = thisCompilation.asInstanceOf[js.Any], watchClose = watchClose.asInstanceOf[js.Any], watchRun = watchRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyinitializeSyncHoo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyinitializeSyncHoo] (val x: Self) extends AnyVal {
    
    inline def setAdditionalPass(value: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "additionalPass", value.asInstanceOf[js.Any])
    
    inline def setAfterCompile(value: AsyncSeriesHook[js.Array[Compilation], UnsetAdditionalOptions]): Self = StObject.set(x, "afterCompile", value.asInstanceOf[js.Any])
    
    inline def setAfterDone(value: SyncHook[js.Array[Stats], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterDone", value.asInstanceOf[js.Any])
    
    inline def setAfterEmit(value: AsyncSeriesHook[js.Array[Compilation], UnsetAdditionalOptions]): Self = StObject.set(x, "afterEmit", value.asInstanceOf[js.Any])
    
    inline def setAfterEnvironment(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterEnvironment", value.asInstanceOf[js.Any])
    
    inline def setAfterPlugins(value: SyncHook[js.Array[typings.webpack.mod.Compiler], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterPlugins", value.asInstanceOf[js.Any])
    
    inline def setAfterResolvers(value: SyncHook[js.Array[typings.webpack.mod.Compiler], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterResolvers", value.asInstanceOf[js.Any])
    
    inline def setAssetEmitted(value: AsyncSeriesHook[js.Tuple2[String, AssetEmittedInfo], UnsetAdditionalOptions]): Self = StObject.set(x, "assetEmitted", value.asInstanceOf[js.Any])
    
    inline def setBeforeCompile(value: AsyncSeriesHook[js.Array[CompilationParams], UnsetAdditionalOptions]): Self = StObject.set(x, "beforeCompile", value.asInstanceOf[js.Any])
    
    inline def setBeforeRun(value: AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]): Self = StObject.set(x, "beforeRun", value.asInstanceOf[js.Any])
    
    inline def setCompilation(value: SyncHook[js.Tuple2[Compilation, CompilationParams], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setCompile(value: SyncHook[js.Array[CompilationParams], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "compile", value.asInstanceOf[js.Any])
    
    inline def setContextModuleFactory(value: SyncHook[js.Array[typings.webpack.mod.ContextModuleFactory], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "contextModuleFactory", value.asInstanceOf[js.Any])
    
    inline def setDone(value: AsyncSeriesHook[js.Array[Stats], UnsetAdditionalOptions]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setEmit(value: AsyncSeriesHook[js.Array[Compilation], UnsetAdditionalOptions]): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
    
    inline def setEmitRecords(value: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "emitRecords", value.asInstanceOf[js.Any])
    
    inline def setEntryOption(value: SyncBailHook[js.Tuple2[String, EntryNormalized], Boolean, UnsetAdditionalOptions]): Self = StObject.set(x, "entryOption", value.asInstanceOf[js.Any])
    
    inline def setEnvironment(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: SyncHook[js.Array[js.Error], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setFinishMake(value: AsyncParallelHook[js.Array[Compilation], UnsetAdditionalOptions]): Self = StObject.set(x, "finishMake", value.asInstanceOf[js.Any])
    
    inline def setInfrastructureLog(value: SyncBailHook[js.Tuple3[String, String, js.Array[Any]], `true`, UnsetAdditionalOptions]): Self = StObject.set(x, "infrastructureLog", value.asInstanceOf[js.Any])
    
    inline def setInitialize(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "initialize", value.asInstanceOf[js.Any])
    
    inline def setInvalid(value: SyncHook[js.Tuple2[Null | String, Double], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setMake(value: AsyncParallelHook[js.Array[Compilation], UnsetAdditionalOptions]): Self = StObject.set(x, "make", value.asInstanceOf[js.Any])
    
    inline def setNormalModuleFactory(value: SyncHook[js.Array[NormalModuleFactory], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "normalModuleFactory", value.asInstanceOf[js.Any])
    
    inline def setReadRecords(value: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "readRecords", value.asInstanceOf[js.Any])
    
    inline def setRun(value: AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setShouldEmit(value: SyncBailHook[js.Array[Compilation], Boolean, UnsetAdditionalOptions]): Self = StObject.set(x, "shouldEmit", value.asInstanceOf[js.Any])
    
    inline def setShutdown(value: AsyncSeriesHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "shutdown", value.asInstanceOf[js.Any])
    
    inline def setThisCompilation(value: SyncHook[js.Tuple2[Compilation, CompilationParams], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "thisCompilation", value.asInstanceOf[js.Any])
    
    inline def setWatchClose(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "watchClose", value.asInstanceOf[js.Any])
    
    inline def setWatchRun(value: AsyncSeriesHook[js.Array[typings.webpack.mod.Compiler], UnsetAdditionalOptions]): Self = StObject.set(x, "watchRun", value.asInstanceOf[js.Any])
  }
}
