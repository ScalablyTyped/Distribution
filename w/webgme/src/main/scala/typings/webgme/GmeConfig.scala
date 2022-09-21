package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.webgme.Blobs.ObjectBlob
import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.Name
import typings.webgme.anon.AllowBrowserExecution
import typings.webgme.anon.AllowDuplication
import typings.webgme.anon.AllowGuests
import typings.webgme.anon.AutoMerge
import typings.webgme.anon.BasePaths
import typings.webgme.anon.BehindSecureProxy
import typings.webgme.anon.ClearOldDataAtStartUp
import typings.webgme.anon.Components
import typings.webgme.anon.DSN
import typings.webgme.anon.DecoratorPaths
import typings.webgme.anon.EnableCustomConstraints
import typings.webgme.anon.LevelString
import typings.webgme.anon.Log
import typings.webgme.anon.Manager
import typings.webgme.anon.Uri
import typings.webgme.webgmeStrings.basic
import typings.webgme.webgmeStrings.basic2
import typings.webgme.webgmeStrings.basic3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Each Plugin has a configuration specified via a metadata.json file.
  * This interface prescribes that configuration file.
  * 
  */
object GmeConfig {
  
  trait ClientOptions extends StObject {
    
    /**
      * Directory from where to serve the static files for the webapp. 
      * This should only be modified if you are using a custom UI.
      *  e.g. './src/client'
      */
    var appDir: String
    
    /**
      * Default connection router to use when opening up a new model, 
      * available options (ordered by level of complexity 
      * and sophistication) are: 'basic', 'basic2' and 'basic3'.
      */
    var defaultConnectionRouter: basic | basic2 | basic3
    
    /**
      * Enable [raven-js](https://docs.sentry.io/clients/javascript/)
      * to automatically send reports to the provided url. 
      * [Sentry.io](https://sentry.io/) 
      * provides free plans and comes with an 
      * easy ui that supports releases, source maps etc.
      * 
      * Url like endpoint for raven-js e.g. 'https:// ****@sentry.io/999999'.
      * null indicates that it is unused.
      * 
      * Options passed to the raven-client, if not specified {release: } will be passed.
      */
    var errorReporting: DSN
    
    /**
      * When debug is activated in the browser 
      * (type localStorage.debug = gme* in the 
      * console and refresh the page) messages below 
      * this level will not be printed.
      * e.g. debug, info, warn, error
      */
    var log: LevelString
  }
  object ClientOptions {
    
    inline def apply(
      appDir: String,
      defaultConnectionRouter: basic | basic2 | basic3,
      errorReporting: DSN,
      log: LevelString
    ): ClientOptions = {
      val __obj = js.Dynamic.literal(appDir = appDir.asInstanceOf[js.Any], defaultConnectionRouter = defaultConnectionRouter.asInstanceOf[js.Any], errorReporting = errorReporting.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
      
      inline def setDefaultConnectionRouter(value: basic | basic2 | basic3): Self = StObject.set(x, "defaultConnectionRouter", value.asInstanceOf[js.Any])
      
      inline def setErrorReporting(value: DSN): Self = StObject.set(x, "errorReporting", value.asInstanceOf[js.Any])
      
      inline def setLog(value: LevelString): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigItem extends StObject {
    
    // a detailed description fo the item
    var description: String
    
    // a human comprehensible name
    var displayName: String
    
    // a unique name for the configuration item
    var name: Name
    
    // can the value be changed?
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    // a regular expression limiting the values allowed.
    // e.g. '^[a-zA-Z]+$'
    var regex: js.UndefOr[js.RegExp] = js.undefined
    
    // a description of the regex grammar
    // e.g. 'Name can only contain English characters!'
    var regexMessage: js.UndefOr[String] = js.undefined
    
    // the value of the item: if valueItem is provided it must be one of those values.
    var value: String
    
    // an enumeration of the allowed values for the value field
    var valueItems: js.UndefOr[js.Array[String]] = js.undefined
    
    // the datatype of the value: 'string', 'integer', ...
    var valueType: String
  }
  object ConfigItem {
    
    inline def apply(description: String, displayName: String, name: Name, value: String, valueType: String): ConfigItem = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigItem]
    }
    
    extension [Self <: ConfigItem](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRegex(value: js.RegExp): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexMessage(value: String): Self = StObject.set(x, "regexMessage", value.asInstanceOf[js.Any])
      
      inline def setRegexMessageUndefined: Self = StObject.set(x, "regexMessage", js.undefined)
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueItems(value: js.Array[String]): Self = StObject.set(x, "valueItems", value.asInstanceOf[js.Any])
      
      inline def setValueItemsUndefined: Self = StObject.set(x, "valueItems", js.undefined)
      
      inline def setValueItemsVarargs(value: String*): Self = StObject.set(x, "valueItems", js.Array(value*))
      
      inline def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    }
  }
  
  trait GmeConfig extends StObject {
    
    /**  Add-on related settings. */
    var addOns: BasePaths
    
    /**  Authentication related settings. */
    var authentication: AllowGuests
    
    /** Bin script related settings. */
    var bin: Log
    
    /** Blob related settings. */
    var blob: ObjectBlob
    
    /** Client related settings. */
    var client: ClientOptions
    
    /** Client related settings. */
    var core: EnableCustomConstraints
    
    /**
      * If true will add extra debug messages and also 
      * enable experimental Visualizers, (URL equivalent (only on client side) ?debug=true).
      */
    var debug: Boolean
    
    /** Executor related settings. */
    var executor: ClearOldDataAtStartUp
    
    /** Mongo database related settings. */
    var mongo: Uri
    
    /** Plugin related settings. */
    var plugin: AllowBrowserExecution
    
    /** Additional paths to for requirejs. 
      * Custom paths that will be added to the 
      * paths of requirejs configuration. 
      * Paths added here will also be served under the given key, 
      * i.e. {myPath: './aPath/aSubPath/'} 
      * will expose files via <host>/myPath/someFile.js.
      */
    var requirejsPaths: Dictionary[String]
    
    /** REST related settings. */
    var rest: Components
    
    /** Seed related settings. */
    var seedProjects: AllowDuplication
    
    /**
      *  Serialize the configuration.
      * @returns {*} 
      * @memberOf GmeConfig
      */
    def serialize(): Any
    
    /** Server related settings. */
    var server: BehindSecureProxy
    
    /** Socket IO related settings. */
    var socketIO: typings.webgme.anon.ClientOptions
    
    /** Storage related settings. */
    var storage: AutoMerge
    
    /** Visualization related settings. */
    var visualization: DecoratorPaths
    
    var webhooks: Manager
  }
  object GmeConfig {
    
    inline def apply(
      addOns: BasePaths,
      authentication: AllowGuests,
      bin: Log,
      blob: ObjectBlob,
      client: ClientOptions,
      core: EnableCustomConstraints,
      debug: Boolean,
      executor: ClearOldDataAtStartUp,
      mongo: Uri,
      plugin: AllowBrowserExecution,
      requirejsPaths: Dictionary[String],
      rest: Components,
      seedProjects: AllowDuplication,
      serialize: () => Any,
      server: BehindSecureProxy,
      socketIO: typings.webgme.anon.ClientOptions,
      storage: AutoMerge,
      visualization: DecoratorPaths,
      webhooks: Manager
    ): typings.webgme.GmeConfig.GmeConfig = {
      val __obj = js.Dynamic.literal(addOns = addOns.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], mongo = mongo.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], requirejsPaths = requirejsPaths.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], seedProjects = seedProjects.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), server = server.asInstanceOf[js.Any], socketIO = socketIO.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webgme.GmeConfig.GmeConfig]
    }
    
    extension [Self <: typings.webgme.GmeConfig.GmeConfig](x: Self) {
      
      inline def setAddOns(value: BasePaths): Self = StObject.set(x, "addOns", value.asInstanceOf[js.Any])
      
      inline def setAuthentication(value: AllowGuests): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
      
      inline def setBin(value: Log): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setBlob(value: ObjectBlob): Self = StObject.set(x, "blob", value.asInstanceOf[js.Any])
      
      inline def setClient(value: ClientOptions): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setCore(value: EnableCustomConstraints): Self = StObject.set(x, "core", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setExecutor(value: ClearOldDataAtStartUp): Self = StObject.set(x, "executor", value.asInstanceOf[js.Any])
      
      inline def setMongo(value: Uri): Self = StObject.set(x, "mongo", value.asInstanceOf[js.Any])
      
      inline def setPlugin(value: AllowBrowserExecution): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
      
      inline def setRequirejsPaths(value: Dictionary[String]): Self = StObject.set(x, "requirejsPaths", value.asInstanceOf[js.Any])
      
      inline def setRest(value: Components): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setSeedProjects(value: AllowDuplication): Self = StObject.set(x, "seedProjects", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: () => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
      
      inline def setServer(value: BehindSecureProxy): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setSocketIO(value: typings.webgme.anon.ClientOptions): Self = StObject.set(x, "socketIO", value.asInstanceOf[js.Any])
      
      inline def setStorage(value: AutoMerge): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setVisualization(value: DecoratorPaths): Self = StObject.set(x, "visualization", value.asInstanceOf[js.Any])
      
      inline def setWebhooks(value: Manager): Self = StObject.set(x, "webhooks", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogOptions extends StObject {
    
    var log: LevelString
  }
  object LogOptions {
    
    inline def apply(log: LevelString): LogOptions = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogOptions]
    }
    
    extension [Self <: LogOptions](x: Self) {
      
      inline def setLog(value: LevelString): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    }
  }
  
  trait PluginConfig
    extends StObject
       with typings.webgme.GmeConfig.GmeConfig
       with /* propName */ StringDictionary[Any]
  object PluginConfig {
    
    inline def apply(
      addOns: BasePaths,
      authentication: AllowGuests,
      bin: Log,
      blob: ObjectBlob,
      client: ClientOptions,
      core: EnableCustomConstraints,
      debug: Boolean,
      executor: ClearOldDataAtStartUp,
      mongo: Uri,
      plugin: AllowBrowserExecution,
      requirejsPaths: Dictionary[String],
      rest: Components,
      seedProjects: AllowDuplication,
      serialize: () => Any,
      server: BehindSecureProxy,
      socketIO: typings.webgme.anon.ClientOptions,
      storage: AutoMerge,
      visualization: DecoratorPaths,
      webhooks: Manager
    ): PluginConfig = {
      val __obj = js.Dynamic.literal(addOns = addOns.asInstanceOf[js.Any], authentication = authentication.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], core = core.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], executor = executor.asInstanceOf[js.Any], mongo = mongo.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any], requirejsPaths = requirejsPaths.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], seedProjects = seedProjects.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), server = server.asInstanceOf[js.Any], socketIO = socketIO.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], visualization = visualization.asInstanceOf[js.Any], webhooks = webhooks.asInstanceOf[js.Any])
      __obj.asInstanceOf[PluginConfig]
    }
  }
}
