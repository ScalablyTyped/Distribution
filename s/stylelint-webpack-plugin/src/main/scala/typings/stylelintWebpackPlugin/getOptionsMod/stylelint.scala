package typings.stylelintWebpackPlugin.getOptionsMod

import typings.stylelint.anon.PartialLinterOptions
import typings.stylelint.mod.LinterResult
import typings.stylelint.mod.Plugin
import typings.stylelint.mod.RuleTesterContext
import typings.stylelint.mod.RuleTesterResult
import typings.stylelint.mod.RuleTesterSchema
import typings.stylelintWebpackPlugin.anon.Typeofformatters
import typings.stylelintWebpackPlugin.anon.Typeofutils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait stylelint extends js.Object {
  
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
