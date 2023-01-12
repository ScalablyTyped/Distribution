package typings.webpackDeadcodePlugin

import typings.webpackDeadcodePlugin.anon.RequiredOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-deadcode-plugin", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with WebpackDeadcodePlugin {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def handleAfterEmit(
      options: RequiredOptions,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ Any,
      callback: js.Function0[Unit]
    ): Unit = js.native
    
    /* CompleteClass */
    var options: Options = js.native
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDetectUnusedExport(value: Boolean): Self = StObject.set(x, "detectUnusedExport", value.asInstanceOf[js.Any])
      
      inline def setDetectUnusedExportUndefined: Self = StObject.set(x, "detectUnusedExport", js.undefined)
      
      inline def setDetectUnusedFiles(value: Boolean): Self = StObject.set(x, "detectUnusedFiles", value.asInstanceOf[js.Any])
      
      inline def setDetectUnusedFilesUndefined: Self = StObject.set(x, "detectUnusedFiles", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFailOnHint(value: Boolean): Self = StObject.set(x, "failOnHint", value.asInstanceOf[js.Any])
      
      inline def setFailOnHintUndefined: Self = StObject.set(x, "failOnHint", js.undefined)
      
      inline def setOutputFile(value: String): Self = StObject.set(x, "outputFile", value.asInstanceOf[js.Any])
      
      inline def setOutputFileUndefined: Self = StObject.set(x, "outputFile", js.undefined)
      
      inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ trait WebpackDeadcodePlugin extends StObject {
    
    def handleAfterEmit(
      options: RequiredOptions,
      compilation: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ Any,
      callback: js.Function0[Unit]
    ): Unit
    
    var options: Options
  }
  object WebpackDeadcodePlugin {
    
    inline def apply(
      handleAfterEmit: (RequiredOptions, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ Any, js.Function0[Unit]) => Unit,
      options: Options
    ): WebpackDeadcodePlugin = {
      val __obj = js.Dynamic.literal(handleAfterEmit = js.Any.fromFunction3(handleAfterEmit), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebpackDeadcodePlugin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebpackDeadcodePlugin] (val x: Self) extends AnyVal {
      
      inline def setHandleAfterEmit(
        value: (RequiredOptions, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify compilation.Compilation */ Any, js.Function0[Unit]) => Unit
      ): Self = StObject.set(x, "handleAfterEmit", js.Any.fromFunction3(value))
      
      inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
