package typings.vite.mod

import typings.rollup.mod.LoadResult
import typings.rollup.mod.ObjectHook
import typings.rollup.mod.Plugin
import typings.rollup.mod.PluginContext
import typings.rollup.mod.ResolveIdResult
import typings.rollup.mod.TransformPluginContext
import typings.vite.anon.IsEntry
import typings.vite.anon.Ssr
import typings.vite.viteStrings.post
import typings.vite.viteStrings.pre
import typings.vite.viteStrings.serve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Vite plugins extends the Rollup plugin interface with a few extra
  * vite-specific options. A valid vite plugin is also a valid Rollup plugin.
  * On the contrary, a Rollup plugin may or may NOT be a valid vite universal
  * plugin, since some Rollup features do not make sense in an unbundled
  * dev server context. That said, as long as a rollup plugin doesn't have strong
  * coupling between its bundle phase and output phase hooks then it should
  * just work (that means, most of them).
  *
  * By default, the plugins are run during both serve and build. When a plugin
  * is applied during serve, it will only run **non output plugin hooks** (see
  * rollup type definition of {@link rollup#PluginHooks}). You can think of the
  * dev server as only running `const bundle = rollup.rollup()` but never calling
  * `bundle.generate()`.
  *
  * A plugin that expects to have different behavior depending on serve/build can
  * export a factory function that receives the command being run via options.
  *
  * If a plugin should be applied only for server or build, a function format
  * config file can be used to conditional determine the plugins to use.
  */
trait Plugin2
  extends StObject
     with Plugin
     with _PluginOption {
  
  /**
    * Apply the plugin only for serve or build, or on certain conditions.
    */
  @JSName("apply")
  var apply: js.UndefOr[
    serve | typings.vite.viteStrings.build | (js.ThisFunction2[/* this */ Unit, /* config */ UserConfig, /* env */ ConfigEnv, Boolean])
  ] = js.undefined
  
  /**
    * Modify vite config before it's resolved. The hook can either mutate the
    * passed-in config directly, or return a partial config object that will be
    * deeply merged into existing config.
    *
    * Note: User plugins are resolved before running this hook so injecting other
    * plugins inside  the `config` hook will have no effect.
    */
  var config: js.UndefOr[
    ObjectHook[
      js.ThisFunction2[
        /* this */ Unit, 
        /* config */ UserConfig, 
        /* env */ ConfigEnv, 
        UserConfig | Null | Unit | (js.Promise[UserConfig | Null | Unit])
      ], 
      js.Object
    ]
  ] = js.undefined
  
  /**
    * Use this hook to read and store the final resolved vite config.
    */
  var configResolved: js.UndefOr[
    ObjectHook[
      js.ThisFunction1[/* this */ Unit, /* config */ ResolvedConfig, Unit | js.Promise[Unit]], 
      js.Object
    ]
  ] = js.undefined
  
  /**
    * Configure the preview server. The hook receives the connect server and
    * its underlying http server.
    *
    * The hooks are called before other middlewares are applied. A hook can
    * return a post hook that will be called after other middlewares are
    * applied. Hooks can be async functions and will be called in series.
    */
  var configurePreviewServer: js.UndefOr[ObjectHook[PreviewServerHook, js.Object]] = js.undefined
  
  /**
    * Configure the vite server. The hook receives the {@link ViteDevServer}
    * instance. This can also be used to store a reference to the server
    * for use in other hooks.
    *
    * The hooks will be called before internal middlewares are applied. A hook
    * can return a post hook that will be called after internal middlewares
    * are applied. Hook can be async functions and will be called in series.
    */
  var configureServer: js.UndefOr[ObjectHook[ServerHook, js.Object]] = js.undefined
  
  /**
    * Enforce plugin invocation tier similar to webpack loaders.
    *
    * Plugin invocation order:
    * - alias resolution
    * - `enforce: 'pre'` plugins
    * - vite core plugins
    * - normal plugins
    * - vite build plugins
    * - `enforce: 'post'` plugins
    * - vite build post plugins
    */
  var enforce: js.UndefOr[pre | post] = js.undefined
  
  /**
    * Perform custom handling of HMR updates.
    * The handler receives a context containing changed filename, timestamp, a
    * list of modules affected by the file change, and the dev server instance.
    *
    * - The hook can return a filtered list of modules to narrow down the update.
    *   e.g. for a Vue SFC, we can narrow down the part to update by comparing
    *   the descriptors.
    *
    * - The hook can also return an empty array and then perform custom updates
    *   by sending a custom hmr payload via server.ws.send().
    *
    * - If the hook doesn't return a value, the hmr update will be performed as
    *   normal.
    */
  var handleHotUpdate: js.UndefOr[
    ObjectHook[
      js.ThisFunction1[
        /* this */ Unit, 
        /* ctx */ HmrContext, 
        js.Array[ModuleNode] | Unit | (js.Promise[js.Array[ModuleNode] | Unit])
      ], 
      js.Object
    ]
  ] = js.undefined
  
  @JSName("load")
  var load_Plugin2: js.UndefOr[
    ObjectHook[
      js.ThisFunction2[
        /* this */ PluginContext, 
        /* id */ String, 
        /* options */ js.UndefOr[Ssr], 
        js.Promise[LoadResult] | LoadResult
      ], 
      js.Object
    ]
  ] = js.undefined
  
  /**
    * extend hooks with ssr flag
    */
  @JSName("resolveId")
  var resolveId_Plugin2: js.UndefOr[
    ObjectHook[
      js.ThisFunction3[
        /* this */ PluginContext, 
        /* source */ String, 
        /* importer */ js.UndefOr[String], 
        /* options */ IsEntry, 
        js.Promise[ResolveIdResult] | ResolveIdResult
      ], 
      js.Object
    ]
  ] = js.undefined
  
  /**
    * Transform index.html.
    * The hook receives the following arguments:
    *
    * - html: string
    * - ctx?: vite.ServerContext (only present during serve)
    * - bundle?: rollup.OutputBundle (only present during build)
    *
    * It can either return a transformed string, or a list of html tag
    * descriptors that will be injected into the `<head>` or `<body>`.
    *
    * By default the transform is applied **after** vite's internal html
    * transform. If you need to apply the transform before vite, use an object:
    * `{ enforce: 'pre', transform: hook }`
    */
  var transformIndexHtml: js.UndefOr[IndexHtmlTransform] = js.undefined
  
  @JSName("transform")
  var transform_Plugin2: js.UndefOr[
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
  ] = js.undefined
}
object Plugin2 {
  
  inline def apply(name: String): Plugin2 = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin2]
  }
  
  extension [Self <: Plugin2](x: Self) {
    
    inline def setApply(
      value: serve | typings.vite.viteStrings.build | (js.ThisFunction2[/* this */ Unit, /* config */ UserConfig, /* env */ ConfigEnv, Boolean])
    ): Self = StObject.set(x, "apply", value.asInstanceOf[js.Any])
    
    inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
    
    inline def setConfig(
      value: ObjectHook[
          js.ThisFunction2[
            /* this */ Unit, 
            /* config */ UserConfig, 
            /* env */ ConfigEnv, 
            UserConfig | Null | Unit | (js.Promise[UserConfig | Null | Unit])
          ], 
          js.Object
        ]
    ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigResolved(
      value: ObjectHook[
          js.ThisFunction1[/* this */ Unit, /* config */ ResolvedConfig, Unit | js.Promise[Unit]], 
          js.Object
        ]
    ): Self = StObject.set(x, "configResolved", value.asInstanceOf[js.Any])
    
    inline def setConfigResolvedUndefined: Self = StObject.set(x, "configResolved", js.undefined)
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setConfigurePreviewServer(value: ObjectHook[PreviewServerHook, js.Object]): Self = StObject.set(x, "configurePreviewServer", value.asInstanceOf[js.Any])
    
    inline def setConfigurePreviewServerUndefined: Self = StObject.set(x, "configurePreviewServer", js.undefined)
    
    inline def setConfigureServer(value: ObjectHook[ServerHook, js.Object]): Self = StObject.set(x, "configureServer", value.asInstanceOf[js.Any])
    
    inline def setConfigureServerUndefined: Self = StObject.set(x, "configureServer", js.undefined)
    
    inline def setEnforce(value: pre | post): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setHandleHotUpdate(
      value: ObjectHook[
          js.ThisFunction1[
            /* this */ Unit, 
            /* ctx */ HmrContext, 
            js.Array[ModuleNode] | Unit | (js.Promise[js.Array[ModuleNode] | Unit])
          ], 
          js.Object
        ]
    ): Self = StObject.set(x, "handleHotUpdate", value.asInstanceOf[js.Any])
    
    inline def setHandleHotUpdateUndefined: Self = StObject.set(x, "handleHotUpdate", js.undefined)
    
    inline def setLoad(
      value: ObjectHook[
          js.ThisFunction2[
            /* this */ PluginContext, 
            /* id */ String, 
            /* options */ js.UndefOr[Ssr], 
            js.Promise[LoadResult] | LoadResult
          ], 
          js.Object
        ]
    ): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setResolveId(
      value: ObjectHook[
          js.ThisFunction3[
            /* this */ PluginContext, 
            /* source */ String, 
            /* importer */ js.UndefOr[String], 
            /* options */ IsEntry, 
            js.Promise[ResolveIdResult] | ResolveIdResult
          ], 
          js.Object
        ]
    ): Self = StObject.set(x, "resolveId", value.asInstanceOf[js.Any])
    
    inline def setResolveIdUndefined: Self = StObject.set(x, "resolveId", js.undefined)
    
    inline def setTransform(
      value: ObjectHook[
          js.ThisFunction3[
            /* this */ TransformPluginContext, 
            /* code */ String, 
            /* id */ String, 
            /* options */ js.UndefOr[Ssr], 
            js.Promise[typings.rollup.mod.TransformResult] | typings.rollup.mod.TransformResult
          ], 
          js.Object
        ]
    ): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformIndexHtml(value: IndexHtmlTransform): Self = StObject.set(x, "transformIndexHtml", value.asInstanceOf[js.Any])
    
    inline def setTransformIndexHtmlUndefined: Self = StObject.set(x, "transformIndexHtml", js.undefined)
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
