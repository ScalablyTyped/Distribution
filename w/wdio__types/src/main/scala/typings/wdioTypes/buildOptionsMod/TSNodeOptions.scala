package typings.wdioTypes.buildOptionsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TSNodeOptions extends StObject {
  
  /**
    * Specify a custom TypeScript compiler
    */
  var compiler: js.UndefOr[String] = js.undefined
  
  /**
    * Use TypeScript's compiler host API
    */
  var compilerHost: js.UndefOr[Boolean] = js.undefined
  
  /**
    * JSON object to merge with compiler options
    */
  var compilerOptions: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
    * Behave as if invoked in this working directory
    */
  var cwd: js.UndefOr[String] = js.undefined
  
  /**
    * Emit output files into `.ts-node` directory. Requires `--compilerHost`
    */
  var emit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Load files, include and exclude from tsconfig.json on startup.
    * This may avoid certain typechecking failures. See Missing types for details.
    */
  var files: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Override the path patterns to skip compilation
    */
  var ignore: js.UndefOr[js.RegExp] = js.undefined
  
  /**
    * Ignore TypeScript warnings by diagnostic code
    */
  var ignoreDiagnostics: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Logs TypeScript errors to stderr instead of throwing exceptions
    */
  var logError: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable top-level await in REPL. Equivalent to node's `--no-experimental-repl-await`
    */
  var noExperimentalReplAwait: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Re-order file extensions so that TypeScript imports are preferred
    */
  var preferTsExts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use pretty diagnostic formatter
    */
  var pretty: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Path to tsconfig file.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Scope compiler to files within `scopeDir`. Anything outside this directory is ignored.
    */
  var scope: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Directory within which compiler is limited when `scope` is enabled.
    */
  var scopeDir: js.UndefOr[String] = js.undefined
  
  /**
    * Skip ignore checks
    */
  var skipIgnore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Skip project config resolution and loading
    */
  var skipProject: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use TypeScript's faster transpileModule
    */
  var transpileOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Opposite of --transpileOnly
    */
  var typeCheck: js.UndefOr[Boolean] = js.undefined
}
object TSNodeOptions {
  
  inline def apply(): TSNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TSNodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TSNodeOptions] (val x: Self) extends AnyVal {
    
    inline def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerHost(value: Boolean): Self = StObject.set(x, "compilerHost", value.asInstanceOf[js.Any])
    
    inline def setCompilerHostUndefined: Self = StObject.set(x, "compilerHost", js.undefined)
    
    inline def setCompilerOptions(value: Record[String, Any]): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEmit(value: Boolean): Self = StObject.set(x, "emit", value.asInstanceOf[js.Any])
    
    inline def setEmitUndefined: Self = StObject.set(x, "emit", js.undefined)
    
    inline def setFiles(value: Boolean): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setIgnore(value: js.RegExp): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDiagnostics(value: js.Array[String]): Self = StObject.set(x, "ignoreDiagnostics", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDiagnosticsUndefined: Self = StObject.set(x, "ignoreDiagnostics", js.undefined)
    
    inline def setIgnoreDiagnosticsVarargs(value: String*): Self = StObject.set(x, "ignoreDiagnostics", js.Array(value*))
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setLogError(value: Boolean): Self = StObject.set(x, "logError", value.asInstanceOf[js.Any])
    
    inline def setLogErrorUndefined: Self = StObject.set(x, "logError", js.undefined)
    
    inline def setNoExperimentalReplAwait(value: Boolean): Self = StObject.set(x, "noExperimentalReplAwait", value.asInstanceOf[js.Any])
    
    inline def setNoExperimentalReplAwaitUndefined: Self = StObject.set(x, "noExperimentalReplAwait", js.undefined)
    
    inline def setPreferTsExts(value: Boolean): Self = StObject.set(x, "preferTsExts", value.asInstanceOf[js.Any])
    
    inline def setPreferTsExtsUndefined: Self = StObject.set(x, "preferTsExts", js.undefined)
    
    inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setScope(value: Boolean): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeDir(value: String): Self = StObject.set(x, "scopeDir", value.asInstanceOf[js.Any])
    
    inline def setScopeDirUndefined: Self = StObject.set(x, "scopeDir", js.undefined)
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setSkipIgnore(value: Boolean): Self = StObject.set(x, "skipIgnore", value.asInstanceOf[js.Any])
    
    inline def setSkipIgnoreUndefined: Self = StObject.set(x, "skipIgnore", js.undefined)
    
    inline def setSkipProject(value: Boolean): Self = StObject.set(x, "skipProject", value.asInstanceOf[js.Any])
    
    inline def setSkipProjectUndefined: Self = StObject.set(x, "skipProject", js.undefined)
    
    inline def setTranspileOnly(value: Boolean): Self = StObject.set(x, "transpileOnly", value.asInstanceOf[js.Any])
    
    inline def setTranspileOnlyUndefined: Self = StObject.set(x, "transpileOnly", js.undefined)
    
    inline def setTypeCheck(value: Boolean): Self = StObject.set(x, "typeCheck", value.asInstanceOf[js.Any])
    
    inline def setTypeCheckUndefined: Self = StObject.set(x, "typeCheck", js.undefined)
  }
}
