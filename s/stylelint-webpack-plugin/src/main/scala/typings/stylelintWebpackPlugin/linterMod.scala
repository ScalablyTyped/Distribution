package typings.stylelintWebpackPlugin

import typings.std.TimerHandler
import typings.stylelintWebpackPlugin.stylelintErrorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linterMod {
  
  @JSImport("stylelint-webpack-plugin/declarations/linter", JSImport.Default)
  @js.native
  def default(lint: Lint, options: Options, compiler: Compiler, callback: LinterCallback): Unit = js.native
  
  type Compiler = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.Compiler */ js.Any
  
  type Lint = js.Function1[/* options */ Options, js.Promise[LinterResult]]
  
  type LintResult = typings.stylelint.mod.LintResult
  
  type LinterCallback = js.Function1[/* error */ js.UndefOr[default | Null], Unit]
  
  type LinterResult = typings.stylelint.mod.LinterResult
  
  @js.native
  trait Options extends StObject {
    
    var context: js.UndefOr[String] = js.native
    
    var emitError: js.UndefOr[Boolean] = js.native
    
    var emitWarning: js.UndefOr[Boolean] = js.native
    
    var failOnError: js.UndefOr[Boolean] = js.native
    
    var failOnWarning: js.UndefOr[Boolean] = js.native
    
    var files: String | js.Array[String] = js.native
    
    var formatter: TimerHandler = js.native
    
    var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.native
    
    var quiet: js.UndefOr[Boolean] = js.native
    
    var stylelintPath: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(files: String | js.Array[String], formatter: TimerHandler, stylelintPath: String): Options = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], formatter = formatter.asInstanceOf[js.Any], stylelintPath = stylelintPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEmitError(value: Boolean): Self = StObject.set(x, "emitError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitErrorUndefined: Self = StObject.set(x, "emitError", js.undefined)
      
      @scala.inline
      def setEmitWarning(value: Boolean): Self = StObject.set(x, "emitWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmitWarningUndefined: Self = StObject.set(x, "emitWarning", js.undefined)
      
      @scala.inline
      def setFailOnError(value: Boolean): Self = StObject.set(x, "failOnError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnErrorUndefined: Self = StObject.set(x, "failOnError", js.undefined)
      
      @scala.inline
      def setFailOnWarning(value: Boolean): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailOnWarningUndefined: Self = StObject.set(x, "failOnWarning", js.undefined)
      
      @scala.inline
      def setFiles(value: String | js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFormatter(value: TimerHandler): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLintDirtyModulesOnly(value: Boolean): Self = StObject.set(x, "lintDirtyModulesOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLintDirtyModulesOnlyUndefined: Self = StObject.set(x, "lintDirtyModulesOnly", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setStylelintPath(value: String): Self = StObject.set(x, "stylelintPath", value.asInstanceOf[js.Any])
    }
  }
}
