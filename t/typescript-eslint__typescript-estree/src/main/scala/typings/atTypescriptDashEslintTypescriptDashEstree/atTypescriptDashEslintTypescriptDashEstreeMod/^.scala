package typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.TSESTreeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@typescript-eslint/typescript-estree", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def parse[T /* <: TSESTreeOptions */](code: String): AST[T] = js.native
  def parse[T /* <: TSESTreeOptions */](code: String, options: T): AST[T] = js.native
  def parseAndGenerateServices[T /* <: TSESTreeOptions */](code: String, options: T): ParseAndGenerateServicesResult[T] = js.native
}

