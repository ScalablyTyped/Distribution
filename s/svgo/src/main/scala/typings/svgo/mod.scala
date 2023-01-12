package typings.svgo

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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
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
  
  trait CustomPlugin extends StObject {
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomPlugin] (val x: Self) extends AnyVal {
      
      inline def setFn(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PluginFn<void> */ Any
      ): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Output extends StObject {
    
    var data: String
  }
  object Output {
    
    inline def apply(data: String): Output = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  type PluginConfig = (/* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuiltinsWithOptionalParams * / any */ String) | (/* import warning: importer.ImportType#apply Failed type conversion: {[ Name in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuiltinsWithOptionalParams * / any ]: {  name :Name,   params :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuiltinsWithOptionalParams * / any[Name] | undefined}}[keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuiltinsWithOptionalParams * / any] */ js.Any) | CustomPlugin
}
