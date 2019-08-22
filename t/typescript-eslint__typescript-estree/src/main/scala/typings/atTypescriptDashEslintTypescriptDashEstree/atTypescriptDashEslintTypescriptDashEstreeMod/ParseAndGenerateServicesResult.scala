package typings.atTypescriptDashEslintTypescriptDashEstree.atTypescriptDashEslintTypescriptDashEstreeMod

import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.ParserServices
import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.TSESTreeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseAndGenerateServicesResult[T /* <: TSESTreeOptions */] extends js.Object {
  var ast: AST[T]
  var services: ParserServices
}

object ParseAndGenerateServicesResult {
  @scala.inline
  def apply[T /* <: TSESTreeOptions */](ast: AST[T], services: ParserServices): ParseAndGenerateServicesResult[T] = {
    val __obj = js.Dynamic.literal(ast = ast, services = services)
  
    __obj.asInstanceOf[ParseAndGenerateServicesResult[T]]
  }
}

