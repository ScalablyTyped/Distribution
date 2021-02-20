package typings.stylelintWebpackPlugin

import typings.stylelint.anon.PartialLinterOptions
import typings.stylelint.mod.LinterResult
import typings.stylelint.mod.Plugin
import typings.stylelint.mod.RuleTesterContext
import typings.stylelint.mod.RuleTesterResult
import typings.stylelint.mod.RuleTesterSchema
import typings.stylelintWebpackPlugin.anon.PartialOptions
import typings.stylelintWebpackPlugin.anon.Typeofformatters
import typings.stylelintWebpackPlugin.anon.Typeofutils
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOptionsMod {
  
  @JSImport("stylelint-webpack-plugin/declarations/getOptions", JSImport.Default)
  @js.native
  def default(pluginOptions: PartialOptions): Options = js.native
  
  @js.native
  trait Options extends StObject {
    
    var context: js.UndefOr[String] = js.native
    
    var emitError: js.UndefOr[Boolean] = js.native
    
    var emitWarning: js.UndefOr[Boolean] = js.native
    
    var failOnError: js.UndefOr[Boolean] = js.native
    
    var failOnWarning: js.UndefOr[Boolean] = js.native
    
    var files: js.Array[String] | String = js.native
    
    var formatter: js.Function | String = js.native
    
    var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.native
    
    var quiet: js.UndefOr[Boolean] = js.native
    
    var stylelintPath: String = js.native
  }
  object Options {
    
    @scala.inline
    def apply(files: js.Array[String] | String, formatter: js.Function | String, stylelintPath: String): Options = {
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
      def setFiles(value: js.Array[String] | String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFormatter(value: js.Function | String): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
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
  
  @js.native
  trait stylelint extends StObject {
    
    def createPlugin(ruleName: String, plugin: Plugin): js.Any = js.native
    
    def createRuleTester(
      fn: js.Function2[
          /* result */ js.Promise[js.Array[RuleTesterResult]], 
          /* context */ RuleTesterContext, 
          Unit
        ]
    ): js.Function2[/* rule */ Plugin, /* schema */ RuleTesterSchema, Unit] = js.native
    
    val formatters: Typeofformatters = js.native
    
    def lint(): js.Promise[LinterResult] = js.native
    def lint(options: PartialLinterOptions): js.Promise[LinterResult] = js.native
    
    val utils: Typeofutils = js.native
  }
}
