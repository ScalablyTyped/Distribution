package typings.webpack.mod

import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilationHooksJavascriptModulesPlugin extends StObject {
  
  var chunkHash: SyncHook[js.Tuple3[Chunk, Hash, ChunkHashContext], Unit, UnsetAdditionalOptions]
  
  var embedInRuntimeBailout: SyncBailHook[js.Tuple2[Module, RenderContext], String, UnsetAdditionalOptions]
  
  var inlineInRuntimeBailout: SyncBailHook[js.Tuple2[Module, RenderBootstrapContext], String, UnsetAdditionalOptions]
  
  var render: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions]
  
  var renderChunk: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions]
  
  var renderContent: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions]
  
  var renderMain: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions]
  
  var renderModuleContainer: SyncWaterfallHook[js.Tuple3[Source, Module, ChunkRenderContext], UnsetAdditionalOptions]
  
  var renderModuleContent: SyncWaterfallHook[js.Tuple3[Source, Module, ChunkRenderContext], UnsetAdditionalOptions]
  
  var renderModulePackage: SyncWaterfallHook[js.Tuple3[Source, Module, ChunkRenderContext], UnsetAdditionalOptions]
  
  var renderRequire: SyncWaterfallHook[js.Tuple2[String, RenderBootstrapContext], UnsetAdditionalOptions]
  
  var renderStartup: SyncWaterfallHook[js.Tuple3[Source, Module, StartupRenderContext], UnsetAdditionalOptions]
  
  var strictRuntimeBailout: SyncBailHook[js.Array[RenderContext], String, UnsetAdditionalOptions]
  
  var useSourceMap: SyncBailHook[js.Tuple2[Chunk, RenderContext], Boolean, UnsetAdditionalOptions]
}
object CompilationHooksJavascriptModulesPlugin {
  
  inline def apply(
    chunkHash: SyncHook[js.Tuple3[Chunk, Hash, ChunkHashContext], Unit, UnsetAdditionalOptions],
    embedInRuntimeBailout: SyncBailHook[js.Tuple2[Module, RenderContext], String, UnsetAdditionalOptions],
    inlineInRuntimeBailout: SyncBailHook[js.Tuple2[Module, RenderBootstrapContext], String, UnsetAdditionalOptions],
    render: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions],
    renderChunk: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions],
    renderContent: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions],
    renderMain: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions],
    renderModuleContainer: SyncWaterfallHook[js.Tuple3[Source, Module, ChunkRenderContext], UnsetAdditionalOptions],
    renderModuleContent: SyncWaterfallHook[js.Tuple3[Source, Module, ChunkRenderContext], UnsetAdditionalOptions],
    renderModulePackage: SyncWaterfallHook[js.Tuple3[Source, Module, ChunkRenderContext], UnsetAdditionalOptions],
    renderRequire: SyncWaterfallHook[js.Tuple2[String, RenderBootstrapContext], UnsetAdditionalOptions],
    renderStartup: SyncWaterfallHook[js.Tuple3[Source, Module, StartupRenderContext], UnsetAdditionalOptions],
    strictRuntimeBailout: SyncBailHook[js.Array[RenderContext], String, UnsetAdditionalOptions],
    useSourceMap: SyncBailHook[js.Tuple2[Chunk, RenderContext], Boolean, UnsetAdditionalOptions]
  ): CompilationHooksJavascriptModulesPlugin = {
    val __obj = js.Dynamic.literal(chunkHash = chunkHash.asInstanceOf[js.Any], embedInRuntimeBailout = embedInRuntimeBailout.asInstanceOf[js.Any], inlineInRuntimeBailout = inlineInRuntimeBailout.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], renderChunk = renderChunk.asInstanceOf[js.Any], renderContent = renderContent.asInstanceOf[js.Any], renderMain = renderMain.asInstanceOf[js.Any], renderModuleContainer = renderModuleContainer.asInstanceOf[js.Any], renderModuleContent = renderModuleContent.asInstanceOf[js.Any], renderModulePackage = renderModulePackage.asInstanceOf[js.Any], renderRequire = renderRequire.asInstanceOf[js.Any], renderStartup = renderStartup.asInstanceOf[js.Any], strictRuntimeBailout = strictRuntimeBailout.asInstanceOf[js.Any], useSourceMap = useSourceMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationHooksJavascriptModulesPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompilationHooksJavascriptModulesPlugin] (val x: Self) extends AnyVal {
    
    inline def setChunkHash(value: SyncHook[js.Tuple3[Chunk, Hash, ChunkHashContext], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "chunkHash", value.asInstanceOf[js.Any])
    
    inline def setEmbedInRuntimeBailout(value: SyncBailHook[js.Tuple2[Module, RenderContext], String, UnsetAdditionalOptions]): Self = StObject.set(x, "embedInRuntimeBailout", value.asInstanceOf[js.Any])
    
    inline def setInlineInRuntimeBailout(value: SyncBailHook[js.Tuple2[Module, RenderBootstrapContext], String, UnsetAdditionalOptions]): Self = StObject.set(x, "inlineInRuntimeBailout", value.asInstanceOf[js.Any])
    
    inline def setRender(value: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderChunk(value: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions]): Self = StObject.set(x, "renderChunk", value.asInstanceOf[js.Any])
    
    inline def setRenderContent(value: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions]): Self = StObject.set(x, "renderContent", value.asInstanceOf[js.Any])
    
    inline def setRenderMain(value: SyncWaterfallHook[js.Tuple2[Source, RenderContext], UnsetAdditionalOptions]): Self = StObject.set(x, "renderMain", value.asInstanceOf[js.Any])
    
    inline def setRenderModuleContainer(value: SyncWaterfallHook[js.Tuple3[Source, Module, ChunkRenderContext], UnsetAdditionalOptions]): Self = StObject.set(x, "renderModuleContainer", value.asInstanceOf[js.Any])
    
    inline def setRenderModuleContent(value: SyncWaterfallHook[js.Tuple3[Source, Module, ChunkRenderContext], UnsetAdditionalOptions]): Self = StObject.set(x, "renderModuleContent", value.asInstanceOf[js.Any])
    
    inline def setRenderModulePackage(value: SyncWaterfallHook[js.Tuple3[Source, Module, ChunkRenderContext], UnsetAdditionalOptions]): Self = StObject.set(x, "renderModulePackage", value.asInstanceOf[js.Any])
    
    inline def setRenderRequire(value: SyncWaterfallHook[js.Tuple2[String, RenderBootstrapContext], UnsetAdditionalOptions]): Self = StObject.set(x, "renderRequire", value.asInstanceOf[js.Any])
    
    inline def setRenderStartup(value: SyncWaterfallHook[js.Tuple3[Source, Module, StartupRenderContext], UnsetAdditionalOptions]): Self = StObject.set(x, "renderStartup", value.asInstanceOf[js.Any])
    
    inline def setStrictRuntimeBailout(value: SyncBailHook[js.Array[RenderContext], String, UnsetAdditionalOptions]): Self = StObject.set(x, "strictRuntimeBailout", value.asInstanceOf[js.Any])
    
    inline def setUseSourceMap(value: SyncBailHook[js.Tuple2[Chunk, RenderContext], Boolean, UnsetAdditionalOptions]): Self = StObject.set(x, "useSourceMap", value.asInstanceOf[js.Any])
  }
}
