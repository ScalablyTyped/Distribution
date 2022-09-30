package typings.swcCore.typesMod

import typings.swcCore.swcCoreStrings.`upward-optional`
import typings.swcCore.swcCoreStrings.root
import typings.swcCore.swcCoreStrings.unknown
import typings.swcCore.swcCoreStrings.upward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with Config {
  
  var caller: js.UndefOr[CallerOptions] = js.undefined
  
  /**
    * Defaults to searching for a default `.swcrc` file, but can
    * be passed the path of any JS or JSON5 config file.
    *
    *
    * NOTE: This option does not affect loading of .swcrc files,
    * so while it may be tempting to do configFile: "./foo/.swcrc",
    * it is not recommended. If the given .swcrc is loaded via the
    * standard file-relative logic, you'll end up loading the same
    * config file twice, merging it with itself. If you are linking
    * a specific config file, it is recommended to stick with a
    * naming scheme that is independent of the "swcrc" name.
    *
    * Defaults to `path.resolve(opts.root, ".swcrc")`
    */
  var configFile: js.UndefOr[String | Boolean] = js.undefined
  
  /**
    * The working directory that all paths in the programmatic
    * options will be resolved relative to.
    *
    * Defaults to `process.cwd()`.
    */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
    * The current active environment used during configuration loading.
    * This value is used as the key when resolving "env" configs,
    * and is also available inside configuration functions, plugins,
    * and presets, via the api.env() function.
    *
    * Defaults to `process.env.SWC_ENV || process.env.NODE_ENV || "development"`
    */
  var envName: js.UndefOr[String] = js.undefined
  
  /** The filename associated with the code currently being compiled,
    * if there is one. The filename is optional, but not all of Swc's
    * functionality is available when the filename is unknown, because a
    * subset of options rely on the filename for their functionality.
    *
    * The three primary cases users could run into are:
    *
    * - The filename is exposed to plugins. Some plugins may require the
    * presence of the filename.
    * - Options like "test", "exclude", and "ignore" require the filename
    * for string/RegExp matching.
    * - .swcrc files are loaded relative to the file being compiled.
    * If this option is omitted, Swc will behave as if swcrc: false has been set.
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * `true` will attempt to load an input sourcemap from the file itself, if it
    * contains a //# sourceMappingURL=... comment. If no map is found, or the
    * map fails to load and parse, it will be silently discarded.
    *
    *  If an object is provided, it will be treated as the source map object itself.
    *
    * Defaults to `true`.
    */
  var inputSourceMap: js.UndefOr[Boolean | String] = js.undefined
  
  var isModule: js.UndefOr[Boolean | unknown] = js.undefined
  
  /**
    * Destination path. Note that this value is used only to fix source path
    * of source map files and swc does not write output to this path.
    */
  var outputPath: js.UndefOr[String] = js.undefined
  
  var plugin: js.UndefOr[Plugin] = js.undefined
  
  /**
    * The initial path that will be processed based on the "rootMode" to
    * determine the conceptual root folder for the current Swc project.
    * This is used in two primary cases:
    *
    * - The base directory when checking for the default "configFile" value
    * - The default value for "swcrcRoots".
    *
    * Defaults to `opts.cwd`
    */
  var root: js.UndefOr[String] = js.undefined
  
  /**
    * This option, combined with the "root" value, defines how Swc chooses
    * its project root. The different modes define different ways that Swc
    * can process the "root" value to get the final project root.
    *
    * "root" - Passes the "root" value through as unchanged.
    * "upward" - Walks upward from the "root" directory, looking for a directory
    * containing a swc.config.js file, and throws an error if a swc.config.js
    * is not found.
    * "upward-optional" - Walk upward from the "root" directory, looking for
    * a directory containing a swc.config.js file, and falls back to "root"
    *  if a swc.config.js is not found.
    *
    *
    * "root" is the default mode because it avoids the risk that Swc
    * will accidentally load a swc.config.js that is entirely outside
    * of the current project folder. If you use "upward-optional",
    * be aware that it will walk up the directory structure all the
    * way to the filesystem root, and it is always possible that someone
    * will have a forgotten swc.config.js in their home directory,
    * which could cause unexpected errors in your builds.
    *
    *
    * Users with monorepo project structures that run builds/tests on a
    * per-package basis may well want to use "upward" since monorepos
    * often have a swc.config.js in the project root. Running Swc
    * in a monorepo subdirectory without "upward", will cause Swc
    * to skip loading any swc.config.js files in the project root,
    * which can lead to unexpected errors and compilation failure.
    */
  var rootMode: js.UndefOr[root | upward | `upward-optional`] = js.undefined
  
  /**
    * If true, a file is parsed as a script instead of module.
    */
  var script: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name to use for the file inside the source map object.
    *
    * Defaults to `path.basename(opts.filenameRelative)` when available, or `"unknown"`.
    */
  var sourceFileName: js.UndefOr[String] = js.undefined
  
  /**
    * The sourceRoot fields to set in the generated source map, if one is desired.
    */
  var sourceRoot: js.UndefOr[String] = js.undefined
  
  /**
    * true will enable searching for configuration files relative to the "filename" provided to Swc.
    *
    * A swcrc value passed in the programmatic options will override one set within a configuration file.
    *
    * Note: .swcrc files are only loaded if the current "filename" is inside of
    *  a package that matches one of the "swcrcRoots" packages.
    *
    *
    * Defaults to true as long as the filename option has been specified
    */
  var swcrc: js.UndefOr[Boolean] = js.undefined
  
  /**
    * By default, Babel will only search for .babelrc files within the "root" package
    *  because otherwise Babel cannot know if a given .babelrc is meant to be loaded,
    *  or if it's "plugins" and "presets" have even been installed, since the file
    *  being compiled could be inside node_modules, or have been symlinked into the project.
    *
    *
    * This option allows users to provide a list of other packages that should be
    * considered "root" packages when considering whether to load .babelrc files.
    *
    *
    * For example, a monorepo setup that wishes to allow individual packages
    * to have their own configs might want to do
    *
    *
    *
    * Defaults to `opts.root`
    */
  var swcrcRoots: js.UndefOr[Boolean | MatchPattern | js.Array[MatchPattern]] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setCaller(value: CallerOptions): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setConfigFile(value: String | Boolean): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEnvName(value: String): Self = StObject.set(x, "envName", value.asInstanceOf[js.Any])
    
    inline def setEnvNameUndefined: Self = StObject.set(x, "envName", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setInputSourceMap(value: Boolean | String): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
    
    inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
    
    inline def setIsModule(value: Boolean | unknown): Self = StObject.set(x, "isModule", value.asInstanceOf[js.Any])
    
    inline def setIsModuleUndefined: Self = StObject.set(x, "isModule", js.undefined)
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setPlugin(value: /* module */ Program => Program): Self = StObject.set(x, "plugin", js.Any.fromFunction1(value))
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootMode(value: root | upward | `upward-optional`): Self = StObject.set(x, "rootMode", value.asInstanceOf[js.Any])
    
    inline def setRootModeUndefined: Self = StObject.set(x, "rootMode", js.undefined)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setScript(value: Boolean): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSourceFileName(value: String): Self = StObject.set(x, "sourceFileName", value.asInstanceOf[js.Any])
    
    inline def setSourceFileNameUndefined: Self = StObject.set(x, "sourceFileName", js.undefined)
    
    inline def setSourceRoot(value: String): Self = StObject.set(x, "sourceRoot", value.asInstanceOf[js.Any])
    
    inline def setSourceRootUndefined: Self = StObject.set(x, "sourceRoot", js.undefined)
    
    inline def setSwcrc(value: Boolean): Self = StObject.set(x, "swcrc", value.asInstanceOf[js.Any])
    
    inline def setSwcrcRoots(value: Boolean | MatchPattern | js.Array[MatchPattern]): Self = StObject.set(x, "swcrcRoots", value.asInstanceOf[js.Any])
    
    inline def setSwcrcRootsUndefined: Self = StObject.set(x, "swcrcRoots", js.undefined)
    
    inline def setSwcrcRootsVarargs(value: MatchPattern*): Self = StObject.set(x, "swcrcRoots", js.Array(value*))
    
    inline def setSwcrcUndefined: Self = StObject.set(x, "swcrc", js.undefined)
  }
}
