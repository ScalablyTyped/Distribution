package typings.webpack.anon

import typings.tapable.mod.AsyncSeriesWaterfallHook
import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.ContextModuleOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  beforeResolve :tapable.tapable.AsyncSeriesWaterfallHook<[any], tapable.tapable.UnsetAdditionalOptions>,   afterResolve :tapable.tapable.AsyncSeriesWaterfallHook<[any], tapable.tapable.UnsetAdditionalOptions>,   contextModuleFiles :tapable.tapable.SyncWaterfallHook<[std.Array<string>], tapable.tapable.UnsetAdditionalOptions>,   alternatives :webpack.webpack.FakeHook<std.Pick<tapable.tapable.AsyncSeriesWaterfallHook<[std.Array<any>], tapable.tapable.UnsetAdditionalOptions>, 'name' | 'tap' | 'tapAsync' | 'tapPromise'>>,   alternativeRequests :tapable.tapable.AsyncSeriesWaterfallHook<[std.Array<any>, webpack.webpack.ContextModuleOptions], tapable.tapable.UnsetAdditionalOptions>}> */
trait ReadonlybeforeResolveAsyn extends StObject {
  
  val afterResolve: AsyncSeriesWaterfallHook[js.Array[Any], UnsetAdditionalOptions]
  
  val alternativeRequests: AsyncSeriesWaterfallHook[js.Tuple2[js.Array[Any], ContextModuleOptions], UnsetAdditionalOptions]
  
  val alternatives: FakeHookPickAsyncSeriesWa
  
  val beforeResolve: AsyncSeriesWaterfallHook[js.Array[Any], UnsetAdditionalOptions]
  
  val contextModuleFiles: SyncWaterfallHook[js.Array[js.Array[String]], UnsetAdditionalOptions]
}
object ReadonlybeforeResolveAsyn {
  
  inline def apply(
    afterResolve: AsyncSeriesWaterfallHook[js.Array[Any], UnsetAdditionalOptions],
    alternativeRequests: AsyncSeriesWaterfallHook[js.Tuple2[js.Array[Any], ContextModuleOptions], UnsetAdditionalOptions],
    alternatives: FakeHookPickAsyncSeriesWa,
    beforeResolve: AsyncSeriesWaterfallHook[js.Array[Any], UnsetAdditionalOptions],
    contextModuleFiles: SyncWaterfallHook[js.Array[js.Array[String]], UnsetAdditionalOptions]
  ): ReadonlybeforeResolveAsyn = {
    val __obj = js.Dynamic.literal(afterResolve = afterResolve.asInstanceOf[js.Any], alternativeRequests = alternativeRequests.asInstanceOf[js.Any], alternatives = alternatives.asInstanceOf[js.Any], beforeResolve = beforeResolve.asInstanceOf[js.Any], contextModuleFiles = contextModuleFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlybeforeResolveAsyn]
  }
  
  extension [Self <: ReadonlybeforeResolveAsyn](x: Self) {
    
    inline def setAfterResolve(value: AsyncSeriesWaterfallHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "afterResolve", value.asInstanceOf[js.Any])
    
    inline def setAlternativeRequests(
      value: AsyncSeriesWaterfallHook[js.Tuple2[js.Array[Any], ContextModuleOptions], UnsetAdditionalOptions]
    ): Self = StObject.set(x, "alternativeRequests", value.asInstanceOf[js.Any])
    
    inline def setAlternatives(value: FakeHookPickAsyncSeriesWa): Self = StObject.set(x, "alternatives", value.asInstanceOf[js.Any])
    
    inline def setBeforeResolve(value: AsyncSeriesWaterfallHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "beforeResolve", value.asInstanceOf[js.Any])
    
    inline def setContextModuleFiles(value: SyncWaterfallHook[js.Array[js.Array[String]], UnsetAdditionalOptions]): Self = StObject.set(x, "contextModuleFiles", value.asInstanceOf[js.Any])
  }
}
