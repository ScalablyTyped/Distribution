package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeMod

import org.scalablytyped.runtime.Instantiable3
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.PatternVisitorCallback
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopeOptionsMod.PatternVisitorOptions
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/experimental-utils/dist/ts-eslint-scope", "PatternVisitor")
@js.native
object PatternVisitor
  extends Instantiable3[
      /* options */ PatternVisitorOptions, 
      /* rootPattern */ js.Any, 
      /* callback */ PatternVisitorCallback, 
      typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintDashScopePatternVisitorMod.PatternVisitor
    ] {
  def isPattern(node: Node): Boolean = js.native
}

