package typings.atTypescriptDashEslintTypescriptDashEstree

import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.Extra
import typings.typescript.typescriptMod.CompilerOptions
import typings.typescript.typescriptMod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/typescript-estree/dist/tsconfig-parser", JSImport.Namespace)
@js.native
object distTsconfigDashParserMod extends js.Object {
  val defaultCompilerOptions: CompilerOptions = js.native
  def calculateProjectParserOptions(code: String, filePath: String, extra: Extra): js.Array[Program] = js.native
  def clearCaches(): Unit = js.native
  def createProgram(code: String, filePath: String, extra: Extra): js.UndefOr[Program] = js.native
}

