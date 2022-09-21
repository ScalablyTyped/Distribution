package typings.unifiedEngine

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.unified.mod.Pluggable
import typings.unifiedEngine.findUpMod.FindUp
import typings.unist.mod.Data
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  @JSImport("unified-engine/lib/configuration", "Configuration")
  @js.native
  open class Configuration protected () extends StObject {
    /**
      * @param {Options} options
      */
    def this(options: Options) = this()
    
    /** @type {ConfigTransform|undefined} */
    var configTransform: js.UndefOr[ConfigTransform] = js.native
    
    /**
      * @param {Buffer|undefined} buf
      * @param {string|undefined} filePath
      * @returns {Promise<Config|undefined>}
      */
    def create(): js.Promise[js.UndefOr[Config]] = js.native
    def create(buf: Unit, filePath: String): js.Promise[js.UndefOr[Config]] = js.native
    def create(buf: Buffer): js.Promise[js.UndefOr[Config]] = js.native
    def create(buf: Buffer, filePath: String): js.Promise[js.UndefOr[Config]] = js.native
    
    /** @type {string} */
    var cwd: String = js.native
    
    /** @type {Preset|undefined} */
    var defaultConfig: js.UndefOr[Preset] = js.native
    
    /** @type {FindUp<Config>} */
    var findUp: FindUp[Config] = js.native
    
    /** @type {Preset} */
    var `given`: Preset = js.native
    
    /**
      * @param {string} filePath
      * @param {Callback} callback
      * @returns {void}
      */
    def load(filePath: String, callback: Callback): Unit = js.native
    
    /** @type {string|undefined} */
    var packageField: js.UndefOr[String] = js.native
    
    /** @type {string|undefined} */
    var pluginPrefix: js.UndefOr[String] = js.native
  }
  
  type Callback = js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[Config], Unit]
  
  trait Config extends StObject {
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var plugins: js.Array[Array[(typings.unified.mod.Plugin[js.Array[Any], Node[Data], Node[Data]]) | Any]]
    
    var settings: Settings
  }
  object Config {
    
    inline def apply(
      plugins: js.Array[Array[(typings.unified.mod.Plugin[js.Array[Any], Node[Data], Node[Data]]) | Any]],
      settings: Settings
    ): Config = {
      val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setPlugins(value: js.Array[Array[(typings.unified.mod.Plugin[js.Array[Any], Node[Data], Node[Data]]) | Any]]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsVarargs(value: (Array[(typings.unified.mod.Plugin[js.Array[Any], Node[Data], Node[Data]]) | Any])*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  type ConfigTransform = js.Function2[/* config */ Any, /* filePath */ String, Preset]
  
  type Loader = js.Function2[/* buf */ Buffer, /* filePath */ String, js.Promise[js.UndefOr[Preset]]]
  
  trait Options extends StObject {
    
    var configTransform: js.UndefOr[ConfigTransform] = js.undefined
    
    var cwd: String
    
    var defaultConfig: js.UndefOr[Preset] = js.undefined
    
    var detectConfig: js.UndefOr[Boolean] = js.undefined
    
    var packageField: js.UndefOr[String] = js.undefined
    
    var pluginPrefix: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[typings.unified.mod.PluggableList | PluginIdObject | PluginIdList] = js.undefined
    
    var rcName: js.UndefOr[String] = js.undefined
    
    var rcPath: js.UndefOr[String] = js.undefined
    
    var settings: js.UndefOr[Settings] = js.undefined
  }
  object Options {
    
    inline def apply(cwd: String): Options = {
      val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConfigTransform(value: (/* config */ Any, /* filePath */ String) => Preset): Self = StObject.set(x, "configTransform", js.Any.fromFunction2(value))
      
      inline def setConfigTransformUndefined: Self = StObject.set(x, "configTransform", js.undefined)
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setDefaultConfig(value: Preset): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
      
      inline def setDefaultConfigUndefined: Self = StObject.set(x, "defaultConfig", js.undefined)
      
      inline def setDetectConfig(value: Boolean): Self = StObject.set(x, "detectConfig", value.asInstanceOf[js.Any])
      
      inline def setDetectConfigUndefined: Self = StObject.set(x, "detectConfig", js.undefined)
      
      inline def setPackageField(value: String): Self = StObject.set(x, "packageField", value.asInstanceOf[js.Any])
      
      inline def setPackageFieldUndefined: Self = StObject.set(x, "packageField", js.undefined)
      
      inline def setPluginPrefix(value: String): Self = StObject.set(x, "pluginPrefix", value.asInstanceOf[js.Any])
      
      inline def setPluginPrefixUndefined: Self = StObject.set(x, "pluginPrefix", js.undefined)
      
      inline def setPlugins(value: typings.unified.mod.PluggableList | PluginIdObject | PluginIdList): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: ((Array[String | Any]) | Pluggable[js.Array[Any]] | String)*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setRcName(value: String): Self = StObject.set(x, "rcName", value.asInstanceOf[js.Any])
      
      inline def setRcNameUndefined: Self = StObject.set(x, "rcName", js.undefined)
      
      inline def setRcPath(value: String): Self = StObject.set(x, "rcPath", value.asInstanceOf[js.Any])
      
      inline def setRcPathUndefined: Self = StObject.set(x, "rcPath", js.undefined)
      
      inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  type PluggableList = typings.unified.mod.PluggableList
  
  type Plugin = typings.unified.mod.Plugin[js.Array[Any], Node[Data], Node[Data]]
  
  type PluginIdList = js.Array[String | (Array[String | Any])]
  
  type PluginIdObject = Record[String, js.UndefOr[Settings | Null]]
  
  type PluginTuple = typings.unified.mod.PluginTuple[js.Array[Any], Node[Data], Node[Data]]
  
  trait Preset extends StObject {
    
    var plugins: js.UndefOr[typings.unified.mod.PluggableList | PluginIdObject | PluginIdList] = js.undefined
    
    var settings: js.UndefOr[Settings] = js.undefined
  }
  object Preset {
    
    inline def apply(): Preset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Preset]
    }
    
    extension [Self <: Preset](x: Self) {
      
      inline def setPlugins(value: typings.unified.mod.PluggableList | PluginIdObject | PluginIdList): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: ((Array[String | Any]) | Pluggable[js.Array[Any]] | String)*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
  
  type Settings = Record[String, Any]
}
