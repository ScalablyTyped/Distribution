package typings.vite.mod

import typings.rollup.mod.AddonHook
import typings.rollup.mod.LoadResult
import typings.rollup.mod.ObjectHook
import typings.rollup.mod.PluginContext
import typings.rollup.mod.ResolveIdResult
import typings.rollup.mod.TransformPluginContext
import typings.std.NonNullable
import typings.vite.anon.Custom
import typings.vite.anon.Ssr
import typings.vite.viteStrings.api
import typings.vite.viteStrings.apply
import typings.vite.viteStrings.augmentChunkHash
import typings.vite.viteStrings.banner
import typings.vite.viteStrings.buildEnd
import typings.vite.viteStrings.buildStart
import typings.vite.viteStrings.cacheKey
import typings.vite.viteStrings.closeBundle
import typings.vite.viteStrings.closeWatcher
import typings.vite.viteStrings.config
import typings.vite.viteStrings.configResolved
import typings.vite.viteStrings.configurePreviewServer
import typings.vite.viteStrings.configureServer
import typings.vite.viteStrings.enforce
import typings.vite.viteStrings.footer
import typings.vite.viteStrings.generateBundle
import typings.vite.viteStrings.handleHotUpdate
import typings.vite.viteStrings.intro
import typings.vite.viteStrings.load
import typings.vite.viteStrings.moduleParsed
import typings.vite.viteStrings.name
import typings.vite.viteStrings.options
import typings.vite.viteStrings.outputOptions
import typings.vite.viteStrings.outro
import typings.vite.viteStrings.post
import typings.vite.viteStrings.pre
import typings.vite.viteStrings.renderChunk
import typings.vite.viteStrings.renderDynamicImport
import typings.vite.viteStrings.renderError
import typings.vite.viteStrings.renderStart
import typings.vite.viteStrings.resolveDynamicImport
import typings.vite.viteStrings.resolveFileUrl
import typings.vite.viteStrings.resolveId
import typings.vite.viteStrings.resolveImportMeta
import typings.vite.viteStrings.serve
import typings.vite.viteStrings.shouldTransformCachedModule
import typings.vite.viteStrings.transform
import typings.vite.viteStrings.transformIndexHtml
import typings.vite.viteStrings.watchChange
import typings.vite.viteStrings.writeBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PluginHookUtils extends StObject {
  
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_api(hookName: api): js.Array[NonNullable[HookHandler[js.UndefOr[Any]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_apply(hookName: apply): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          serve | typings.vite.viteStrings.build | (js.ThisFunction2[/* this */ Unit, /* config */ UserConfig, /* env */ ConfigEnv, Boolean])
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_augmentChunkHash(hookName: augmentChunkHash): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void> : (this : rollup.rollup.PluginContext, chunk : rollup.rollup.RenderedChunk): string | void */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'augmentChunkHash' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_banner(hookName: banner): js.Array[NonNullable[HookHandler[js.UndefOr[ObjectHook[AddonHook, js.Object]]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_buildEnd(hookName: buildEnd): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'buildEnd' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'buildEnd' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_buildStart(hookName: buildStart): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'buildStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_cacheKey(hookName: cacheKey): js.Array[NonNullable[HookHandler[js.UndefOr[String]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_closeBundle(hookName: closeBundle): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'closeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext): void> : (this : rollup.rollup.PluginContext): void */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'closeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_closeWatcher(hookName: closeWatcher): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'closeWatcher' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext): void> : (this : rollup.rollup.PluginContext): void */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'closeWatcher' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_config(hookName: config): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            js.ThisFunction2[
              /* this */ Unit, 
              /* config */ UserConfig, 
              /* env */ ConfigEnv, 
              UserConfig | Null | Unit | (js.Promise[UserConfig | Null | Unit])
            ], 
            js.Object
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_configResolved(hookName: configResolved): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            js.ThisFunction1[/* this */ Unit, /* config */ ResolvedConfig, Unit | js.Promise[Unit]], 
            js.Object
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_configurePreviewServer(hookName: configurePreviewServer): js.Array[NonNullable[HookHandler[js.UndefOr[ObjectHook[PreviewServerHook, js.Object]]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_configureServer(hookName: configureServer): js.Array[NonNullable[HookHandler[js.UndefOr[ObjectHook[ServerHook, js.Object]]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_enforce(hookName: enforce): js.Array[NonNullable[HookHandler[js.UndefOr[pre | post]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_footer(hookName: footer): js.Array[NonNullable[HookHandler[js.UndefOr[ObjectHook[AddonHook, js.Object]]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_generateBundle(hookName: generateBundle): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle, isWrite : boolean): void */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'generateBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_handleHotUpdate(hookName: handleHotUpdate): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            js.ThisFunction1[
              /* this */ Unit, 
              /* ctx */ HmrContext, 
              js.Array[ModuleNode] | Unit | (js.Promise[js.Array[ModuleNode] | Unit])
            ], 
            js.Object
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_intro(hookName: intro): js.Array[NonNullable[HookHandler[js.UndefOr[ObjectHook[AddonHook, js.Object]]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_load(hookName: load): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            js.ThisFunction2[
              /* this */ PluginContext, 
              /* id */ String, 
              /* options */ js.UndefOr[Ssr], 
              js.Promise[LoadResult] | LoadResult
            ], 
            js.Object
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_moduleParsed(hookName: moduleParsed): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'moduleParsed' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ModuleParsedHook> : rollup.rollup.ModuleParsedHook */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'moduleParsed' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_name(hookName: name): js.Array[NonNullable[HookHandler[String]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_options(hookName: options): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'options' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.MinimalPluginContext, options : rollup.rollup.InputOptions): rollup.rollup.InputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.MinimalPluginContext, options : rollup.rollup.InputOptions): rollup.rollup.InputOptions | rollup.rollup.NullValue */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'options' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_outputOptions(hookName: outputOptions): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : rollup.rollup.OutputOptions): rollup.rollup.OutputOptions | rollup.rollup.NullValue */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'outputOptions' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_outro(hookName: outro): js.Array[NonNullable[HookHandler[js.UndefOr[ObjectHook[AddonHook, js.Object]]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_renderChunk(hookName: renderChunk): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.RenderChunkHook> : rollup.rollup.RenderChunkHook */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'renderChunk' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_renderDynamicImport(hookName: renderDynamicImport): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue> : (this : rollup.rollup.PluginContext, options : {  customResolution :string | null,   format :rollup.rollup.InternalModuleFormat,   moduleId :string,   targetModuleId :string | null}): {  left :string,   right :string} | rollup.rollup.NullValue */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'renderDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_renderError(hookName: renderError): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, error : std.Error | undefined): void> : (this : rollup.rollup.PluginContext, error : std.Error | undefined): void */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'renderError' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_renderStart(hookName: renderStart): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void> : (this : rollup.rollup.PluginContext, outputOptions : rollup.rollup.NormalizedOutputOptions, inputOptions : rollup.rollup.NormalizedInputOptions): void */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'renderStart' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_resolveDynamicImport(hookName: resolveDynamicImport): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'resolveDynamicImport' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveDynamicImportHook> : rollup.rollup.ResolveDynamicImportHook */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'resolveDynamicImport' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_resolveFileUrl(hookName: resolveFileUrl): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveFileUrlHook> : rollup.rollup.ResolveFileUrlHook */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'resolveFileUrl' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_resolveId(hookName: resolveId): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            js.ThisFunction3[
              /* this */ PluginContext, 
              /* source */ String, 
              /* importer */ js.UndefOr[String], 
              /* options */ Custom, 
              js.Promise[ResolveIdResult] | ResolveIdResult
            ], 
            js.Object
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_resolveImportMeta(hookName: resolveImportMeta): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ResolveImportMetaHook> : rollup.rollup.ResolveImportMetaHook */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'resolveImportMeta' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_shouldTransformCachedModule(hookName: shouldTransformCachedModule): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'shouldTransformCachedModule' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.ShouldTransformCachedModuleHook> : rollup.rollup.ShouldTransformCachedModuleHook */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'shouldTransformCachedModule' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_transform(hookName: transform): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            js.ThisFunction3[
              /* this */ TransformPluginContext, 
              /* code */ String, 
              /* id */ String, 
              /* options */ js.UndefOr[Ssr], 
              js.Promise[typings.rollup.mod.TransformResult] | typings.rollup.mod.TransformResult
            ], 
            js.Object
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_transformIndexHtml(hookName: transformIndexHtml): js.Array[NonNullable[HookHandler[js.UndefOr[IndexHtmlTransform]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_version(hookName: typings.vite.viteStrings.version): js.Array[NonNullable[HookHandler[js.UndefOr[String]]]] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_watchChange(hookName: watchChange): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'watchChange' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<rollup.rollup.WatchChangeHook> : rollup.rollup.WatchChangeHook */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'watchChange' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  @JSName("getSortedPluginHooks")
  def getSortedPluginHooks_writeBundle(hookName: writeBundle): js.Array[
    NonNullable[
      HookHandler[
        js.UndefOr[
          ObjectHook[
            /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.AsyncPluginHooks ? rollup.rollup.MakeAsync<(this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void> : (this : rollup.rollup.PluginContext, options : rollup.rollup.NormalizedOutputOptions, bundle : rollup.rollup.OutputBundle): void */ js.Any, 
            /* import warning: importer.ImportType#apply Failed type conversion: 'writeBundle' extends rollup.rollup.ParallelPluginHooks ? {  sequential :boolean | undefined} : {} */ js.Any
          ]
        ]
      ]
    ]
  ] = js.native
  
  def getSortedPlugins(
    hookName: enforce | apply | config | configResolved | configureServer | configurePreviewServer | transformIndexHtml | handleHotUpdate | resolveId | load | transform
  ): js.Array[Plugin2] = js.native
}
