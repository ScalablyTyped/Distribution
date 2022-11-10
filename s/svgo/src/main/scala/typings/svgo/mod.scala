package typings.svgo

import typings.svgo.anon.FloatPrecision
import typings.svgo.svgoStrings.`preset-default`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svgo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadConfig(): js.Promise[Config | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")().asInstanceOf[js.Promise[Config | Null]]
  inline def loadConfig(configFile: String): js.Promise[Config] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(configFile.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Config]]
  inline def loadConfig(configFile: String, cwd: String): js.Promise[Config] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(configFile.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Config]]
  
  inline def optimize(input: String): Output = ^.asInstanceOf[js.Dynamic].applyDynamic("optimize")(input.asInstanceOf[js.Any]).asInstanceOf[Output]
  inline def optimize(input: String, config: Config): Output = (^.asInstanceOf[js.Dynamic].applyDynamic("optimize")(input.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Output]
  
  type BuiltinPluginWithOptionalParams = DefaultPlugin | PresetDefault | (Usage[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_cleanupListOfValues.js */ Any
  ])
  
  type BuiltinPluginWithRequiredParams = UsageReqParams[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_addAttributesToSVGElement.js */ Any
  ]
  
  trait Config extends StObject {
    
    /** Output as Data URI string. */
    var datauri: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataUri */ Any
      ] = js.undefined
    
    /** Precision of floating point numbers. Will be passed to each plugin that suppors this param. */
    var floatPrecision: js.UndefOr[Double] = js.undefined
    
    /** Options for rendering optimized SVG from AST. */
    var js2svg: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringifyOptions */ Any
      ] = js.undefined
    
    /** Pass over SVGs multiple times to ensure all optimizations are applied. */
    var multipass: js.UndefOr[Boolean] = js.undefined
    
    /** Can be used by plugins, for example prefixids */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Plugins configuration
      * ['preset-default'] is default
      * Can also specify any builtin plugin
      * ['sortAttrs', { name: 'prefixIds', params: { prefix: 'my-prefix' } }]
      * Or custom
      * [{ name: 'myPlugin', fn: () => ({}) }]
      */
    var plugins: js.UndefOr[js.Array[PluginConfig]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setDatauri(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataUri */ Any
      ): Self = StObject.set(x, "datauri", value.asInstanceOf[js.Any])
      
      inline def setDatauriUndefined: Self = StObject.set(x, "datauri", js.undefined)
      
      inline def setFloatPrecision(value: Double): Self = StObject.set(x, "floatPrecision", value.asInstanceOf[js.Any])
      
      inline def setFloatPrecisionUndefined: Self = StObject.set(x, "floatPrecision", js.undefined)
      
      inline def setJs2svg(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringifyOptions */ Any
      ): Self = StObject.set(x, "js2svg", value.asInstanceOf[js.Any])
      
      inline def setJs2svgUndefined: Self = StObject.set(x, "js2svg", js.undefined)
      
      inline def setMultipass(value: Boolean): Self = StObject.set(x, "multipass", value.asInstanceOf[js.Any])
      
      inline def setMultipassUndefined: Self = StObject.set(x, "multipass", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPlugins(value: js.Array[PluginConfig]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: PluginConfig*): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
  
  trait CustomPlugin
    extends StObject
       with _PluginConfig {
    
    var fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFn<void> */ Any
    
    var name: String
  }
  object CustomPlugin {
    
    inline def apply(
      fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFn<void> */ Any,
      name: String
    ): CustomPlugin = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomPlugin]
    }
    
    extension [Self <: CustomPlugin](x: Self) {
      
      inline def setFn(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFn<void> */ Any
      ): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type DefaultPlugin = Usage[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_cleanupAttrs.js */ Any
  ]
  
  trait Output extends StObject {
    
    var data: String
  }
  object Output {
    
    inline def apply(data: String): Output = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    extension [Self <: Output](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends svgo.svgo.DefaultPlugin ? {[ key in T['name'] ]:? T['params'] | false} : never
    }}}
    */
  @js.native
  trait Overrides[T] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - / * import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_cleanupAttrs.js * / any['name'] * / js.Any
    - typings.svgo.svgoStrings.`preset-default`
    - typings.svgo.mod.BuiltinPluginWithOptionalParams
    - typings.svgo.mod.BuiltinPluginWithRequiredParams
    - typings.svgo.mod.CustomPlugin
  */
  type PluginConfig = _PluginConfig | (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof imported_cleanupAttrs.js * / any['name'] */ js.Any) | BuiltinPluginWithOptionalParams | BuiltinPluginWithRequiredParams
  
  trait PluginDef extends StObject {
    
    var fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFn<unknown> */ Any
    
    var name: String
  }
  object PluginDef {
    
    inline def apply(
      fn: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFn<unknown> */ Any,
      name: String
    ): PluginDef = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginDef]
    }
    
    extension [Self <: PluginDef](x: Self) {
      
      inline def setFn(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFn<unknown> */ Any
      ): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PresetDefault extends StObject {
    
    var name: `preset-default`
    
    var params: js.UndefOr[FloatPrecision] = js.undefined
  }
  object PresetDefault {
    
    inline def apply(): PresetDefault = {
      val __obj = js.Dynamic.literal(name = "preset-default")
      __obj.asInstanceOf[PresetDefault]
    }
    
    extension [Self <: PresetDefault](x: Self) {
      
      inline def setName(value: `preset-default`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: FloatPrecision): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait Usage[T /* <: PluginDef */] extends StObject {
    
    var name: /* import warning: importer.ImportType#apply Failed type conversion: T['name'] */ js.Any
    
    var params: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['fn']>[1] */ js.Any
      ] = js.undefined
  }
  object Usage {
    
    inline def apply[T /* <: PluginDef */](name: /* import warning: importer.ImportType#apply Failed type conversion: T['name'] */ js.Any): Usage[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Usage[T]]
    }
    
    extension [Self <: Usage[?], T /* <: PluginDef */](x: Self & Usage[T]) {
      
      inline def setName(value: /* import warning: importer.ImportType#apply Failed type conversion: T['name'] */ js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['fn']>[1] */ js.Any
      ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait UsageReqParams[T /* <: PluginDef */] extends StObject {
    
    var name: /* import warning: importer.ImportType#apply Failed type conversion: T['name'] */ js.Any
    
    var params: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['fn']>[1] */ js.Any
  }
  object UsageReqParams {
    
    inline def apply[T /* <: PluginDef */](
      name: /* import warning: importer.ImportType#apply Failed type conversion: T['name'] */ js.Any,
      params: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['fn']>[1] */ js.Any
    ): UsageReqParams[T] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageReqParams[T]]
    }
    
    extension [Self <: UsageReqParams[?], T /* <: PluginDef */](x: Self & UsageReqParams[T]) {
      
      inline def setName(value: /* import warning: importer.ImportType#apply Failed type conversion: T['name'] */ js.Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(
        value: /* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<T['fn']>[1] */ js.Any
      ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  trait _PluginConfig extends StObject
}
