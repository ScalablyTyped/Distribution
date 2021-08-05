package typings.webpackDeadcodePlugin

import typings.std.Plugin
import typings.webpackDeadcodePlugin.anon.RequiredOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-deadcode-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with WebpackDeadcodePlugin {
    def this(options: Options) = this()
  }
  
  trait Options extends StObject {
    
    /** Current working directoy for patterns above. If you don't set explicitly, your webpack context will be used. */
    var context: js.UndefOr[String] = js.undefined
    
    /** Whether to run unsed export detection or not. */
    var detectUnusedExport: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to run unused files detection or not. */
    var detectUnusedFiles: js.UndefOr[Boolean] = js.undefined
    
    /** The array of patterns to not look at. */
    var exclude: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Deadcode does not interrupt the compilation by default.
      * If you want to cancel the compilation, set it `true`, it throws a fatal error and stops the compilation.
      */
    var failOnHint: js.UndefOr[Boolean] = js.undefined
    
    var outputFile: js.UndefOr[String] = js.undefined
    
    /**
      * The array of patterns to look for unused files and unused export in used files.
      * Directly passed to [`fast-glob`](https://github.com/mrmlnc/fast-glob).
      */
    var patterns: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDetectUnusedExport(value: Boolean): Self = StObject.set(x, "detectUnusedExport", value.asInstanceOf[js.Any])
      
      inline def setDetectUnusedExportUndefined: Self = StObject.set(x, "detectUnusedExport", js.undefined)
      
      inline def setDetectUnusedFiles(value: Boolean): Self = StObject.set(x, "detectUnusedFiles", value.asInstanceOf[js.Any])
      
      inline def setDetectUnusedFilesUndefined: Self = StObject.set(x, "detectUnusedFiles", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setFailOnHint(value: Boolean): Self = StObject.set(x, "failOnHint", value.asInstanceOf[js.Any])
      
      inline def setFailOnHintUndefined: Self = StObject.set(x, "failOnHint", js.undefined)
      
      inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value :_*))
    }
  }
  
  @js.native
  trait WebpackDeadcodePlugin
    extends StObject
       with Plugin {
    
    def handleAfterEmit(
      options: RequiredOptions,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ js.Any,
      callback: js.Function0[Unit]
    ): Unit = js.native
    
    var options: Options = js.native
  }
}
