package typings.unifiedEngine

import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.ReadableStream
import typings.std.URL
import typings.std.WritableStream
import typings.unified.mod.Pluggable
import typings.unified.mod.PluggableList
import typings.unifiedEngine.configurationMod.PluginIdList
import typings.unifiedEngine.configurationMod.PluginIdObject
import typings.unifiedEngine.unifiedEngineNumbers.`0`
import typings.unifiedEngine.unifiedEngineNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("unified-engine/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def engine(options: Options, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("engine")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Callback = js.Function3[
    /* error */ js.Error | Null, 
    /* status */ js.UndefOr[`0` | `1`], 
    /* context */ js.UndefOr[Context], 
    Unit
  ]
  
  type Completer = typings.unifiedEngine.fileSetMod.Completer
  
  type ConfigTransform = typings.unifiedEngine.configurationMod.ConfigTransform
  
  trait Context extends StObject {
    
    /**
      * Internally used information
      */
    var fileSet: js.UndefOr[typings.unifiedEngine.fileSetMod.FileSet] = js.undefined
    
    /**
      * Processed files.
      */
    var files: js.UndefOr[js.Array[typings.vfile.mod.VFile]] = js.undefined
  }
  object Context {
    
    inline def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setFileSet(value: typings.unifiedEngine.fileSetMod.FileSet): Self = StObject.set(x, "fileSet", value.asInstanceOf[js.Any])
      
      inline def setFileSetUndefined: Self = StObject.set(x, "fileSet", js.undefined)
      
      inline def setFiles(value: js.Array[typings.vfile.mod.VFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: typings.vfile.mod.VFile*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  type FileSet = typings.unifiedEngine.fileSetMod.FileSet
  
  trait Options extends StObject {
    
    /**
      * Whether to always serialize successfully processed files.
      */
    var alwaysStringify: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to report with ANSI color sequences.
      */
    var color: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Transform config files from a different schema.
      */
    var configTransform: js.UndefOr[typings.unifiedEngine.configurationMod.ConfigTransform] = js.undefined
    
    /**
      * Directory to search files in, load plugins from, and more.
      * Defaults to `process.cwd()`.
      */
    var cwd: js.UndefOr[String | URL] = js.undefined
    
    /**
      * Default configuration to use if no config file is given or found.
      */
    var defaultConfig: js.UndefOr[typings.unifiedEngine.configurationMod.Preset] = js.undefined
    
    /**
      * Whether to search for configuration files.
      * Defaults to `true` if `rcName` or `packageField` are given
      */
    var detectConfig: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to search for ignore files.
      * Defaults to `true` if `ignoreName` is given.
      */
    var detectIgnore: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `files` matches directories, include `files` with `extensions`
      */
    var extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * File path to process the given file on `streamIn` as.
      */
    var filePath: js.UndefOr[String] = js.undefined
    
    /**
      * Paths or globs to files and directories, or virtual files, to process.
      */
    var files: js.UndefOr[js.Array[String | typings.vfile.mod.VFile | URL]] = js.undefined
    
    /**
      * Call back with an unsuccessful (`1`) code on warnings as well as errors
      */
    var frail: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of ignore files to load.
      */
    var ignoreName: js.UndefOr[String] = js.undefined
    
    /**
      * Filepath to an ignore file to load.
      */
    var ignorePath: js.UndefOr[String] = js.undefined
    
    /**
      * Resolve patterns in `ignorePath` from the current working
      * directory (`'cwd'`) or the ignore file’s directory (`'dir'`, default).
      */
    var ignorePathResolveFrom: js.UndefOr[typings.unifiedEngine.ignoreMod.ResolveFrom] = js.undefined
    
    /**
      * Patterns to ignore in addition to ignore files
      */
    var ignorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Ignore files that do not have an associated detected configuration file.
      */
    var ignoreUnconfigured: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to output a formatted syntax tree.
      */
    var inspect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to write the processed file to `streamOut`
      */
    var out: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to write successfully processed files, and where to.
      *
      * * When `true`, overwrites the given files
      * * When `false`, does not write to the file system
      * * When pointing to an existing directory, files are written to that
      * directory and keep their original basenames
      * * When the parent directory of the given path exists and one file is
      * processed, the file is written to the given path
      */
    var output: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * Property at which configuration can be found in `package.json` files
      */
    var packageField: js.UndefOr[String] = js.undefined
    
    /**
      * Prefix to use when searching for plugins
      */
    var pluginPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Plugins to use.
      */
    var plugins: js.UndefOr[PluggableList | PluginIdObject | PluginIdList] = js.undefined
    
    /**
      * Unified processor to transform files
      */
    def processor(): Processor
    
    /**
      * Do not report successful files
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of configuration files to load.
      */
    var rcName: js.UndefOr[String] = js.undefined
    
    /**
      * Filepath to a configuration file to load.
      */
    var rcPath: js.UndefOr[String] = js.undefined
    
    /**
      * Reporter to use
      * Defaults to `vfile-reporter`
      */
    var reporter: js.UndefOr[String | VFileReporter] = js.undefined
    
    /**
      * Config to pass to the used reporter.
      */
    var reporterOptions: js.UndefOr[VFileReporterOptions] = js.undefined
    
    /**
      * Configuration for the parser and compiler of the processor.
      */
    var settings: js.UndefOr[typings.unifiedEngine.configurationMod.Settings] = js.undefined
    
    /**
      * Report only fatal errors
      */
    var silent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Skip given files if they are ignored.
      */
    var silentlyIgnore: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Stream to write the report (if any) to.
      * Defaults to `process.stderr`.
      */
    var streamError: js.UndefOr[WritableStream[Any]] = js.undefined
    
    /**
      * Stream to read from if no files are found or given.
      * Defaults to `process.stdin`.
      */
    var streamIn: js.UndefOr[ReadableStream[Any]] = js.undefined
    
    /**
      * Stream to write processed files to.
      * Defaults to `process.stdout`.
      */
    var streamOut: js.UndefOr[WritableStream[Any]] = js.undefined
    
    /**
      * Whether to treat both input and output as a syntax tree.
      */
    var tree: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to treat input as a syntax tree.
      * Defaults to `options.tree`.
      */
    var treeIn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to treat output as a syntax tree.
      * Defaults to `options.tree`.
      */
    var treeOut: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(processor: () => Processor): Options = {
      val __obj = js.Dynamic.literal(processor = js.Any.fromFunction0(processor))
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlwaysStringify(value: Boolean): Self = StObject.set(x, "alwaysStringify", value.asInstanceOf[js.Any])
      
      inline def setAlwaysStringifyUndefined: Self = StObject.set(x, "alwaysStringify", js.undefined)
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setConfigTransform(value: (/* config */ Any, /* filePath */ String) => typings.unifiedEngine.configurationMod.Preset): Self = StObject.set(x, "configTransform", js.Any.fromFunction2(value))
      
      inline def setConfigTransformUndefined: Self = StObject.set(x, "configTransform", js.undefined)
      
      inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDefaultConfig(value: typings.unifiedEngine.configurationMod.Preset): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
      
      inline def setDefaultConfigUndefined: Self = StObject.set(x, "defaultConfig", js.undefined)
      
      inline def setDetectConfig(value: Boolean): Self = StObject.set(x, "detectConfig", value.asInstanceOf[js.Any])
      
      inline def setDetectConfigUndefined: Self = StObject.set(x, "detectConfig", js.undefined)
      
      inline def setDetectIgnore(value: Boolean): Self = StObject.set(x, "detectIgnore", value.asInstanceOf[js.Any])
      
      inline def setDetectIgnoreUndefined: Self = StObject.set(x, "detectIgnore", js.undefined)
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setFiles(value: js.Array[String | typings.vfile.mod.VFile | URL]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setFilesVarargs(value: (String | typings.vfile.mod.VFile | URL)*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFrail(value: Boolean): Self = StObject.set(x, "frail", value.asInstanceOf[js.Any])
      
      inline def setFrailUndefined: Self = StObject.set(x, "frail", js.undefined)
      
      inline def setIgnoreName(value: String): Self = StObject.set(x, "ignoreName", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNameUndefined: Self = StObject.set(x, "ignoreName", js.undefined)
      
      inline def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathResolveFrom(value: typings.unifiedEngine.ignoreMod.ResolveFrom): Self = StObject.set(x, "ignorePathResolveFrom", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathResolveFromUndefined: Self = StObject.set(x, "ignorePathResolveFrom", js.undefined)
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setIgnorePatterns(value: js.Array[String]): Self = StObject.set(x, "ignorePatterns", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternsUndefined: Self = StObject.set(x, "ignorePatterns", js.undefined)
      
      inline def setIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "ignorePatterns", js.Array(value*))
      
      inline def setIgnoreUnconfigured(value: Boolean): Self = StObject.set(x, "ignoreUnconfigured", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnconfiguredUndefined: Self = StObject.set(x, "ignoreUnconfigured", js.undefined)
      
      inline def setInspect(value: Boolean): Self = StObject.set(x, "inspect", value.asInstanceOf[js.Any])
      
      inline def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setOutput(value: String | Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPackageField(value: String): Self = StObject.set(x, "packageField", value.asInstanceOf[js.Any])
      
      inline def setPackageFieldUndefined: Self = StObject.set(x, "packageField", js.undefined)
      
      inline def setPluginPrefix(value: String): Self = StObject.set(x, "pluginPrefix", value.asInstanceOf[js.Any])
      
      inline def setPluginPrefixUndefined: Self = StObject.set(x, "pluginPrefix", js.undefined)
      
      inline def setPlugins(value: PluggableList | PluginIdObject | PluginIdList): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: ((Array[String | Any]) | Pluggable[js.Array[Any]] | String)*): Self = StObject.set(x, "plugins", js.Array(value*))
      
      inline def setProcessor(value: () => Processor): Self = StObject.set(x, "processor", js.Any.fromFunction0(value))
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRcName(value: String): Self = StObject.set(x, "rcName", value.asInstanceOf[js.Any])
      
      inline def setRcNameUndefined: Self = StObject.set(x, "rcName", js.undefined)
      
      inline def setRcPath(value: String): Self = StObject.set(x, "rcPath", value.asInstanceOf[js.Any])
      
      inline def setRcPathUndefined: Self = StObject.set(x, "rcPath", js.undefined)
      
      inline def setReporter(value: String | VFileReporter): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterFunction2(value: (/* files */ js.Array[VFile], /* options */ VFileReporterOptions) => String): Self = StObject.set(x, "reporter", js.Any.fromFunction2(value))
      
      inline def setReporterOptions(value: VFileReporterOptions): Self = StObject.set(x, "reporterOptions", value.asInstanceOf[js.Any])
      
      inline def setReporterOptionsUndefined: Self = StObject.set(x, "reporterOptions", js.undefined)
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setSettings(value: typings.unifiedEngine.configurationMod.Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSilentlyIgnore(value: Boolean): Self = StObject.set(x, "silentlyIgnore", value.asInstanceOf[js.Any])
      
      inline def setSilentlyIgnoreUndefined: Self = StObject.set(x, "silentlyIgnore", js.undefined)
      
      inline def setStreamError(value: WritableStream[Any]): Self = StObject.set(x, "streamError", value.asInstanceOf[js.Any])
      
      inline def setStreamErrorUndefined: Self = StObject.set(x, "streamError", js.undefined)
      
      inline def setStreamIn(value: ReadableStream[Any]): Self = StObject.set(x, "streamIn", value.asInstanceOf[js.Any])
      
      inline def setStreamInUndefined: Self = StObject.set(x, "streamIn", js.undefined)
      
      inline def setStreamOut(value: WritableStream[Any]): Self = StObject.set(x, "streamOut", value.asInstanceOf[js.Any])
      
      inline def setStreamOutUndefined: Self = StObject.set(x, "streamOut", js.undefined)
      
      inline def setTree(value: Boolean): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeIn(value: Boolean): Self = StObject.set(x, "treeIn", value.asInstanceOf[js.Any])
      
      inline def setTreeInUndefined: Self = StObject.set(x, "treeIn", js.undefined)
      
      inline def setTreeOut(value: Boolean): Self = StObject.set(x, "treeOut", value.asInstanceOf[js.Any])
      
      inline def setTreeOutUndefined: Self = StObject.set(x, "treeOut", js.undefined)
      
      inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    }
  }
  
  type Preset = typings.unifiedEngine.configurationMod.Preset
  
  type Processor = typings.unified.mod.Processor[Any, Any, Any, Any]
  
  type ResolveFrom = typings.unifiedEngine.ignoreMod.ResolveFrom
  
  trait Settings extends StObject {
    
    var alwaysStringify: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.VFileReporterOptions['color'] */ js.Any
      ] = js.undefined
    
    var configTransform: js.UndefOr[typings.unifiedEngine.configurationMod.ConfigTransform] = js.undefined
    
    var cwd: Exclude[js.UndefOr[String | URL], js.UndefOr[URL]]
    
    var defaultConfig: js.UndefOr[typings.unifiedEngine.configurationMod.Preset] = js.undefined
    
    var detectConfig: js.UndefOr[Boolean] = js.undefined
    
    var detectIgnore: js.UndefOr[Boolean] = js.undefined
    
    var extensions: Exclude[js.UndefOr[js.Array[String]], Unit]
    
    var filePath: js.UndefOr[String] = js.undefined
    
    var files: js.Array[String | VFile]
    
    var frail: js.UndefOr[Boolean] = js.undefined
    
    var ignoreName: js.UndefOr[String] = js.undefined
    
    var ignorePath: js.UndefOr[String] = js.undefined
    
    var ignorePathResolveFrom: js.UndefOr[typings.unifiedEngine.ignoreMod.ResolveFrom] = js.undefined
    
    var ignorePatterns: Exclude[js.UndefOr[js.Array[String]], Unit]
    
    var ignoreUnconfigured: Exclude[js.UndefOr[Boolean], Unit]
    
    var inspect: js.UndefOr[Boolean] = js.undefined
    
    var out: js.UndefOr[Boolean] = js.undefined
    
    var output: js.UndefOr[String | Boolean] = js.undefined
    
    var packageField: js.UndefOr[String] = js.undefined
    
    var pluginPrefix: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.Preset['plugins'] */ js.Any
      ] = js.undefined
    
    def processor(): Processor
    @JSName("processor")
    var processor_Original: js.Function0[Processor]
    
    var quiet: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.VFileReporterOptions['quiet'] */ js.Any
      ] = js.undefined
    
    var rcName: js.UndefOr[String] = js.undefined
    
    var rcPath: js.UndefOr[String] = js.undefined
    
    var reporter: js.UndefOr[String | VFileReporter] = js.undefined
    
    var reporterOptions: js.UndefOr[VFileReporterOptions] = js.undefined
    
    var settings: Exclude[
        js.UndefOr[
          /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.Preset['settings'] */ js.Any
        ], 
        Unit
      ]
    
    var silent: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.VFileReporterOptions['silent'] */ js.Any
      ] = js.undefined
    
    var silentlyIgnore: Exclude[js.UndefOr[Boolean], Unit]
    
    var streamError: Exclude[js.UndefOr[WritableStream[Any]], Unit]
    
    var streamIn: Exclude[js.UndefOr[ReadableStream[Any]], Unit]
    
    var streamOut: Exclude[js.UndefOr[WritableStream[Any]], Unit]
    
    var tree: js.UndefOr[Boolean] = js.undefined
    
    var treeIn: js.UndefOr[Boolean] = js.undefined
    
    var treeOut: js.UndefOr[Boolean] = js.undefined
  }
  object Settings {
    
    inline def apply(files: js.Array[String | VFile], processor: () => Processor): Settings = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], processor = js.Any.fromFunction0(processor))
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setAlwaysStringify(value: Boolean): Self = StObject.set(x, "alwaysStringify", value.asInstanceOf[js.Any])
      
      inline def setAlwaysStringifyUndefined: Self = StObject.set(x, "alwaysStringify", js.undefined)
      
      inline def setColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.VFileReporterOptions['color'] */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setConfigTransform(value: (/* config */ Any, /* filePath */ String) => typings.unifiedEngine.configurationMod.Preset): Self = StObject.set(x, "configTransform", js.Any.fromFunction2(value))
      
      inline def setConfigTransformUndefined: Self = StObject.set(x, "configTransform", js.undefined)
      
      inline def setCwd(value: Exclude[js.UndefOr[String | URL], js.UndefOr[URL]]): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setDefaultConfig(value: typings.unifiedEngine.configurationMod.Preset): Self = StObject.set(x, "defaultConfig", value.asInstanceOf[js.Any])
      
      inline def setDefaultConfigUndefined: Self = StObject.set(x, "defaultConfig", js.undefined)
      
      inline def setDetectConfig(value: Boolean): Self = StObject.set(x, "detectConfig", value.asInstanceOf[js.Any])
      
      inline def setDetectConfigUndefined: Self = StObject.set(x, "detectConfig", js.undefined)
      
      inline def setDetectIgnore(value: Boolean): Self = StObject.set(x, "detectIgnore", value.asInstanceOf[js.Any])
      
      inline def setDetectIgnoreUndefined: Self = StObject.set(x, "detectIgnore", js.undefined)
      
      inline def setExtensions(value: Exclude[js.UndefOr[js.Array[String]], Unit]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setFiles(value: js.Array[String | VFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: (String | VFile)*): Self = StObject.set(x, "files", js.Array(value*))
      
      inline def setFrail(value: Boolean): Self = StObject.set(x, "frail", value.asInstanceOf[js.Any])
      
      inline def setFrailUndefined: Self = StObject.set(x, "frail", js.undefined)
      
      inline def setIgnoreName(value: String): Self = StObject.set(x, "ignoreName", value.asInstanceOf[js.Any])
      
      inline def setIgnoreNameUndefined: Self = StObject.set(x, "ignoreName", js.undefined)
      
      inline def setIgnorePath(value: String): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathResolveFrom(value: typings.unifiedEngine.ignoreMod.ResolveFrom): Self = StObject.set(x, "ignorePathResolveFrom", value.asInstanceOf[js.Any])
      
      inline def setIgnorePathResolveFromUndefined: Self = StObject.set(x, "ignorePathResolveFrom", js.undefined)
      
      inline def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      inline def setIgnorePatterns(value: Exclude[js.UndefOr[js.Array[String]], Unit]): Self = StObject.set(x, "ignorePatterns", value.asInstanceOf[js.Any])
      
      inline def setIgnorePatternsUndefined: Self = StObject.set(x, "ignorePatterns", js.undefined)
      
      inline def setIgnorePatternsVarargs(value: String*): Self = StObject.set(x, "ignorePatterns", js.Array(value*))
      
      inline def setIgnoreUnconfigured(value: Exclude[js.UndefOr[Boolean], Unit]): Self = StObject.set(x, "ignoreUnconfigured", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnconfiguredUndefined: Self = StObject.set(x, "ignoreUnconfigured", js.undefined)
      
      inline def setInspect(value: Boolean): Self = StObject.set(x, "inspect", value.asInstanceOf[js.Any])
      
      inline def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
      
      inline def setOut(value: Boolean): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setOutput(value: String | Boolean): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setPackageField(value: String): Self = StObject.set(x, "packageField", value.asInstanceOf[js.Any])
      
      inline def setPackageFieldUndefined: Self = StObject.set(x, "packageField", js.undefined)
      
      inline def setPluginPrefix(value: String): Self = StObject.set(x, "pluginPrefix", value.asInstanceOf[js.Any])
      
      inline def setPluginPrefixUndefined: Self = StObject.set(x, "pluginPrefix", js.undefined)
      
      inline def setPlugins(
        value: /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.Preset['plugins'] */ js.Any
      ): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setProcessor(value: () => Processor): Self = StObject.set(x, "processor", js.Any.fromFunction0(value))
      
      inline def setQuiet(
        value: /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.VFileReporterOptions['quiet'] */ js.Any
      ): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRcName(value: String): Self = StObject.set(x, "rcName", value.asInstanceOf[js.Any])
      
      inline def setRcNameUndefined: Self = StObject.set(x, "rcName", js.undefined)
      
      inline def setRcPath(value: String): Self = StObject.set(x, "rcPath", value.asInstanceOf[js.Any])
      
      inline def setRcPathUndefined: Self = StObject.set(x, "rcPath", js.undefined)
      
      inline def setReporter(value: String | VFileReporter): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
      
      inline def setReporterFunction2(value: (/* files */ js.Array[VFile], /* options */ VFileReporterOptions) => String): Self = StObject.set(x, "reporter", js.Any.fromFunction2(value))
      
      inline def setReporterOptions(value: VFileReporterOptions): Self = StObject.set(x, "reporterOptions", value.asInstanceOf[js.Any])
      
      inline def setReporterOptionsUndefined: Self = StObject.set(x, "reporterOptions", js.undefined)
      
      inline def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
      
      inline def setSettings(
        value: Exclude[
              js.UndefOr[
                /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.Preset['settings'] */ js.Any
              ], 
              Unit
            ]
      ): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      inline def setSilent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: unified-engine.unified-engine/lib.VFileReporterOptions['silent'] */ js.Any
      ): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setSilentlyIgnore(value: Exclude[js.UndefOr[Boolean], Unit]): Self = StObject.set(x, "silentlyIgnore", value.asInstanceOf[js.Any])
      
      inline def setSilentlyIgnoreUndefined: Self = StObject.set(x, "silentlyIgnore", js.undefined)
      
      inline def setStreamError(value: Exclude[js.UndefOr[WritableStream[Any]], Unit]): Self = StObject.set(x, "streamError", value.asInstanceOf[js.Any])
      
      inline def setStreamErrorUndefined: Self = StObject.set(x, "streamError", js.undefined)
      
      inline def setStreamIn(value: Exclude[js.UndefOr[ReadableStream[Any]], Unit]): Self = StObject.set(x, "streamIn", value.asInstanceOf[js.Any])
      
      inline def setStreamInUndefined: Self = StObject.set(x, "streamIn", js.undefined)
      
      inline def setStreamOut(value: Exclude[js.UndefOr[WritableStream[Any]], Unit]): Self = StObject.set(x, "streamOut", value.asInstanceOf[js.Any])
      
      inline def setStreamOutUndefined: Self = StObject.set(x, "streamOut", js.undefined)
      
      inline def setTree(value: Boolean): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeIn(value: Boolean): Self = StObject.set(x, "treeIn", value.asInstanceOf[js.Any])
      
      inline def setTreeInUndefined: Self = StObject.set(x, "treeIn", js.undefined)
      
      inline def setTreeOut(value: Boolean): Self = StObject.set(x, "treeOut", value.asInstanceOf[js.Any])
      
      inline def setTreeOutUndefined: Self = StObject.set(x, "treeOut", js.undefined)
      
      inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    }
  }
  
  type VFile = typings.vfile.mod.VFile
  
  type VFileReporter = js.Function2[/* files */ js.Array[VFile], /* options */ VFileReporterOptions, String]
  
  trait VFileReporterFields extends StObject {
    
    var color: js.UndefOr[Boolean] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object VFileReporterFields {
    
    inline def apply(): VFileReporterFields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VFileReporterFields]
    }
    
    extension [Self <: VFileReporterFields](x: Self) {
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait VFileReporterOptions
    extends StObject
       with VFileReporterFields
       with /* key */ StringDictionary[Any]
  object VFileReporterOptions {
    
    inline def apply(): VFileReporterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VFileReporterOptions]
    }
  }
}
