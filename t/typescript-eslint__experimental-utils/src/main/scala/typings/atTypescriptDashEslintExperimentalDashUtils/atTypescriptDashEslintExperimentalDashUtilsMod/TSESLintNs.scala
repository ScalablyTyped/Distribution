package typings.atTypescriptDashEslintExperimentalDashUtils.atTypescriptDashEslintExperimentalDashUtilsMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod.RuleTesterConfig
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCodeNs.Config
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCodeNs.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils", "TSESLint")
@js.native
object TSESLintNs extends js.Object {
  @js.native
  class SourceCodeCls protected ()
    extends typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode {
    def this(config: Config) = this()
    def this(text: String, ast: Program) = this()
  }
  
  val Linter: Instantiable0[
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintLinterMod.Linter
  ] = js.native
  val RuleTester: Instantiable1[
    js.UndefOr[RuleTesterConfig], 
    typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintRuleTesterMod.RuleTester
  ] = js.native
  @js.native
  object SourceCode
    extends Instantiable2[
          /* text */ String, 
          /* ast */ Program, 
          typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode
        ]
       with Instantiable1[
          /* config */ Config, 
          typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode
        ] {
    def splitLines(text: String): js.Array[String] = js.native
  }
  
}

