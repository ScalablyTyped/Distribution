package typings.stylelintWebpackPlugin

import typings.std.Error
import typings.std.Partial
import typings.std.TimerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylelintErrorMod {
  
  @JSImport("stylelint-webpack-plugin/declarations/StylelintError", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with Error {
    /**
      * @param {Partial<string>} messages
      */
    def this(messages: Partial[String]) = this()
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("stylelint-webpack-plugin/declarations/StylelintError", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @param {Options} options
      * @param {Array<LintResult>} messages
      * @returns {StylelintError}
      */
    inline def format(hasFormatter: Options, messages: js.Array[LintResult]): StylelintError = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(hasFormatter.asInstanceOf[js.Any], messages.asInstanceOf[js.Any])).asInstanceOf[StylelintError]
  }
  
  type LintResult = typings.stylelint.mod.LintResult
  
  trait Options extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var emitError: js.UndefOr[Boolean] = js.undefined
    
    var emitWarning: js.UndefOr[Boolean] = js.undefined
    
    var failOnError: js.UndefOr[Boolean] = js.undefined
    
    var failOnWarning: js.UndefOr[Boolean] = js.undefined
    
    var files: String | js.Array[String]
    
    var formatter: TimerHandler
    
    var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var stylelintPath: String
  }
  object Options {
    
    inline def apply(files: String | js.Array[String], formatter: TimerHandler, stylelintPath: String): Options = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], stylelintPath = stylelintPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      inline def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      inline def setEmitWarning(value: Boolean): Self = StObject.set(x, "emitWarning", value.asInstanceOf[js.Any])
      
      inline def setEmitWarningUndefined: Self = StObject.set(x, "emitWarning", js.undefined)
      
      inline def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
      
      inline def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
      
      inline def setFailOnWarning(value: Boolean): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
      
      inline def setFailOnWarningUndefined: Self = StObject.set(x, "failOnWarning", js.undefined)
      
      inline def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setFormatter(value: TimerHandler): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setLintDirtyModulesOnly(value: Boolean): Self = StObject.set(x, "lintDirtyModulesOnly", value.asInstanceOf[js.Any])
      
      inline def setLintDirtyModulesOnlyUndefined: Self = StObject.set(x, "lintDirtyModulesOnly", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setStylelintPath(value: String): Self = StObject.set(x, "stylelintPath", value.asInstanceOf[js.Any])
    }
  }
  
  type StylelintError = Error
}
