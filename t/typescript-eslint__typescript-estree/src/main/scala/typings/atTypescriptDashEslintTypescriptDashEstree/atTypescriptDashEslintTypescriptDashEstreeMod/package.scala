package typings.atTypescriptDashEslintTypescriptDashEstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atTypescriptDashEslintTypescriptDashEstreeMod {
  import typings.atTypescriptDashEslintTypescriptDashEstree.Anon_Comments
  import typings.atTypescriptDashEslintTypescriptDashEstree.Anon_Range
  import typings.atTypescriptDashEslintTypescriptDashEstree.Anon_Tokens
  import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.TSESTreeOptions
  import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Program

  type AST[T /* <: TSESTreeOptions */] = Program with (js.Object | Anon_Range) with (js.Object | Anon_Tokens) with (js.Object | Anon_Comments)
}
