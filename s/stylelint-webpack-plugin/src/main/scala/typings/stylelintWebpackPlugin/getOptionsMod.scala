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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOptionsMod {
  
  @JSImport("stylelint-webpack-plugin/declarations/getOptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(pluginOptions: PartialOptions): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(pluginOptions.asInstanceOf[js.Any]).asInstanceOf[Options]
  
  trait Options extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var emitError: js.UndefOr[Boolean] = js.undefined
    
    var emitWarning: js.UndefOr[Boolean] = js.undefined
    
    var failOnError: js.UndefOr[Boolean] = js.undefined
    
    var failOnWarning: js.UndefOr[Boolean] = js.undefined
    
    var files: js.Array[String] | String
    
    var formatter: js.Function | String
    
    var lintDirtyModulesOnly: js.UndefOr[Boolean] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var stylelintPath: String
  }
  object Options {
    
    inline def apply(files: js.Array[String] | String, formatter: js.Function | String, stylelintPath: String): Options = {
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
      
      inline def setFiles(value: js.Array[String] | String): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setFormatter(value: js.Function | String): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setLintDirtyModulesOnly(value: Boolean): Self = StObject.set(x, "lintDirtyModulesOnly", value.asInstanceOf[js.Any])
      
      inline def setLintDirtyModulesOnlyUndefined: Self = StObject.set(x, "lintDirtyModulesOnly", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setStylelintPath(value: String): Self = StObject.set(x, "stylelintPath", value.asInstanceOf[js.Any])
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
