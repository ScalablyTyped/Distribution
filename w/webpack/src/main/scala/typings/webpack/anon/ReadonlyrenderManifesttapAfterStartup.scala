package typings.webpack.anon

import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import typings.webpack.mod.DependencyTemplates
import typings.webpack.mod.ModuleTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  renderManifest :{tap (options : any | undefined, fn : any | undefined): void},   modules :{tap (): never},   moduleObj :{tap (): never},   require :{tap (options : any | undefined, fn : any | undefined): void},   beforeStartup :{tap (): never},   startup :{tap (): never},   afterStartup :{tap (): never},   render :{tap (options : any | undefined, fn : any | undefined): void},   renderWithEntry :{tap (options : any | undefined, fn : any | undefined): void},   assetPath :{tap (options : any | undefined, fn : any | undefined): void, call (filename : any | undefined, options : any | undefined): string},   hash :{tap (options : any | undefined, fn : any | undefined): void},   hashForChunk :{tap (options : any | undefined, fn : any | undefined): void},   globalHashPaths :{tap (): void},   globalHash :{tap (): void},   hotBootstrap :{tap (): never},   bootstrap :tapable.tapable.SyncWaterfallHook<[string, webpack.webpack.Chunk, string, webpack.webpack.ModuleTemplate, webpack.webpack.DependencyTemplates], tapable.tapable.UnsetAdditionalOptions>,   localVars :tapable.tapable.SyncWaterfallHook<[string, webpack.webpack.Chunk, string], tapable.tapable.UnsetAdditionalOptions>,   requireExtensions :tapable.tapable.SyncWaterfallHook<[string, webpack.webpack.Chunk, string], tapable.tapable.UnsetAdditionalOptions>,   requireEnsure :tapable.tapable.SyncWaterfallHook<[string, webpack.webpack.Chunk, string, string], tapable.tapable.UnsetAdditionalOptions>,  readonly jsonpScript :tapable.tapable.SyncWaterfallHook<[string, webpack.webpack.Chunk], tapable.tapable.UnsetAdditionalOptions>,  readonly linkPrefetch :tapable.tapable.SyncWaterfallHook<[string, webpack.webpack.Chunk], tapable.tapable.UnsetAdditionalOptions>,  readonly linkPreload :tapable.tapable.SyncWaterfallHook<[string, webpack.webpack.Chunk], tapable.tapable.UnsetAdditionalOptions>}> */
trait ReadonlyrenderManifesttapAfterStartup extends StObject {
  
  val afterStartup: `0`
  
  val assetPath: Call
  
  val beforeStartup: `0`
  
  val bootstrap: SyncWaterfallHook[
    js.Tuple5[String, typings.webpack.mod.Chunk, String, ModuleTemplate, DependencyTemplates], 
    UnsetAdditionalOptions
  ]
  
  val globalHash: `1`
  
  val globalHashPaths: `1`
  
  val hash: Tap
  
  val hashForChunk: Tap
  
  val hotBootstrap: `0`
  
  val jsonpScript: SyncWaterfallHook[js.Tuple2[String, typings.webpack.mod.Chunk], UnsetAdditionalOptions]
  
  val linkPrefetch: SyncWaterfallHook[js.Tuple2[String, typings.webpack.mod.Chunk], UnsetAdditionalOptions]
  
  val linkPreload: SyncWaterfallHook[js.Tuple2[String, typings.webpack.mod.Chunk], UnsetAdditionalOptions]
  
  val localVars: SyncWaterfallHook[js.Tuple3[String, typings.webpack.mod.Chunk, String], UnsetAdditionalOptions]
  
  val moduleObj: `0`
  
  val modules: `0`
  
  val render: Tap
  
  val renderManifest: Tap
  
  val renderWithEntry: Tap
  
  val require: Tap
  
  val requireEnsure: SyncWaterfallHook[
    js.Tuple4[String, typings.webpack.mod.Chunk, String, String], 
    UnsetAdditionalOptions
  ]
  
  val requireExtensions: SyncWaterfallHook[js.Tuple3[String, typings.webpack.mod.Chunk, String], UnsetAdditionalOptions]
  
  val startup: `0`
}
object ReadonlyrenderManifesttapAfterStartup {
  
  inline def apply(
    afterStartup: `0`,
    assetPath: Call,
    beforeStartup: `0`,
    bootstrap: SyncWaterfallHook[
      js.Tuple5[String, typings.webpack.mod.Chunk, String, ModuleTemplate, DependencyTemplates], 
      UnsetAdditionalOptions
    ],
    globalHash: `1`,
    globalHashPaths: `1`,
    hash: Tap,
    hashForChunk: Tap,
    hotBootstrap: `0`,
    jsonpScript: SyncWaterfallHook[js.Tuple2[String, typings.webpack.mod.Chunk], UnsetAdditionalOptions],
    linkPrefetch: SyncWaterfallHook[js.Tuple2[String, typings.webpack.mod.Chunk], UnsetAdditionalOptions],
    linkPreload: SyncWaterfallHook[js.Tuple2[String, typings.webpack.mod.Chunk], UnsetAdditionalOptions],
    localVars: SyncWaterfallHook[js.Tuple3[String, typings.webpack.mod.Chunk, String], UnsetAdditionalOptions],
    moduleObj: `0`,
    modules: `0`,
    render: Tap,
    renderManifest: Tap,
    renderWithEntry: Tap,
    require: Tap,
    requireEnsure: SyncWaterfallHook[
      js.Tuple4[String, typings.webpack.mod.Chunk, String, String], 
      UnsetAdditionalOptions
    ],
    requireExtensions: SyncWaterfallHook[js.Tuple3[String, typings.webpack.mod.Chunk, String], UnsetAdditionalOptions],
    startup: `0`
  ): ReadonlyrenderManifesttapAfterStartup = {
    val __obj = js.Dynamic.literal(afterStartup = afterStartup.asInstanceOf[js.Any], assetPath = assetPath.asInstanceOf[js.Any], beforeStartup = beforeStartup.asInstanceOf[js.Any], bootstrap = bootstrap.asInstanceOf[js.Any], globalHash = globalHash.asInstanceOf[js.Any], globalHashPaths = globalHashPaths.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hashForChunk = hashForChunk.asInstanceOf[js.Any], hotBootstrap = hotBootstrap.asInstanceOf[js.Any], jsonpScript = jsonpScript.asInstanceOf[js.Any], linkPrefetch = linkPrefetch.asInstanceOf[js.Any], linkPreload = linkPreload.asInstanceOf[js.Any], localVars = localVars.asInstanceOf[js.Any], moduleObj = moduleObj.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], renderManifest = renderManifest.asInstanceOf[js.Any], renderWithEntry = renderWithEntry.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any], requireEnsure = requireEnsure.asInstanceOf[js.Any], requireExtensions = requireExtensions.asInstanceOf[js.Any], startup = startup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyrenderManifesttapAfterStartup]
  }
  
  extension [Self <: ReadonlyrenderManifesttapAfterStartup](x: Self) {
    
    inline def setAfterStartup(value: `0`): Self = StObject.set(x, "afterStartup", value.asInstanceOf[js.Any])
    
    inline def setAssetPath(value: Call): Self = StObject.set(x, "assetPath", value.asInstanceOf[js.Any])
    
    inline def setBeforeStartup(value: `0`): Self = StObject.set(x, "beforeStartup", value.asInstanceOf[js.Any])
    
    inline def setBootstrap(
      value: SyncWaterfallHook[
          js.Tuple5[String, typings.webpack.mod.Chunk, String, ModuleTemplate, DependencyTemplates], 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "bootstrap", value.asInstanceOf[js.Any])
    
    inline def setGlobalHash(value: `1`): Self = StObject.set(x, "globalHash", value.asInstanceOf[js.Any])
    
    inline def setGlobalHashPaths(value: `1`): Self = StObject.set(x, "globalHashPaths", value.asInstanceOf[js.Any])
    
    inline def setHash(value: Tap): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashForChunk(value: Tap): Self = StObject.set(x, "hashForChunk", value.asInstanceOf[js.Any])
    
    inline def setHotBootstrap(value: `0`): Self = StObject.set(x, "hotBootstrap", value.asInstanceOf[js.Any])
    
    inline def setJsonpScript(value: SyncWaterfallHook[js.Tuple2[String, typings.webpack.mod.Chunk], UnsetAdditionalOptions]): Self = StObject.set(x, "jsonpScript", value.asInstanceOf[js.Any])
    
    inline def setLinkPrefetch(value: SyncWaterfallHook[js.Tuple2[String, typings.webpack.mod.Chunk], UnsetAdditionalOptions]): Self = StObject.set(x, "linkPrefetch", value.asInstanceOf[js.Any])
    
    inline def setLinkPreload(value: SyncWaterfallHook[js.Tuple2[String, typings.webpack.mod.Chunk], UnsetAdditionalOptions]): Self = StObject.set(x, "linkPreload", value.asInstanceOf[js.Any])
    
    inline def setLocalVars(
      value: SyncWaterfallHook[js.Tuple3[String, typings.webpack.mod.Chunk, String], UnsetAdditionalOptions]
    ): Self = StObject.set(x, "localVars", value.asInstanceOf[js.Any])
    
    inline def setModuleObj(value: `0`): Self = StObject.set(x, "moduleObj", value.asInstanceOf[js.Any])
    
    inline def setModules(value: `0`): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Tap): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
    
    inline def setRenderManifest(value: Tap): Self = StObject.set(x, "renderManifest", value.asInstanceOf[js.Any])
    
    inline def setRenderWithEntry(value: Tap): Self = StObject.set(x, "renderWithEntry", value.asInstanceOf[js.Any])
    
    inline def setRequire(value: Tap): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireEnsure(
      value: SyncWaterfallHook[
          js.Tuple4[String, typings.webpack.mod.Chunk, String, String], 
          UnsetAdditionalOptions
        ]
    ): Self = StObject.set(x, "requireEnsure", value.asInstanceOf[js.Any])
    
    inline def setRequireExtensions(
      value: SyncWaterfallHook[js.Tuple3[String, typings.webpack.mod.Chunk, String], UnsetAdditionalOptions]
    ): Self = StObject.set(x, "requireExtensions", value.asInstanceOf[js.Any])
    
    inline def setStartup(value: `0`): Self = StObject.set(x, "startup", value.asInstanceOf[js.Any])
  }
}
