package typings.atTypescriptDashEslintParser.atTypescriptDashEslintParserMod

import typings.atTypescriptDashEslintParser.Anon_Comments
import typings.atTypescriptDashEslintParser.distScopeScopeDashManagerMod.ScopeManager
import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.ParserServices
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Program
import typings.eslintDashVisitorDashKeys.eslintDashVisitorDashKeysMod.VisitorKeys
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseForESLintResult extends js.Object {
  var ast: Program with Anon_Comments
  var scopeManager: ReturnType[
    js.Function2[
      /* ast */ Program, 
      /* parserOptions */ typings.atTypescriptDashEslintParser.distParserDashOptionsMod.ParserOptions, 
      ScopeManager
    ]
  ]
  var services: ParserServices
  var visitorKeys: VisitorKeys
}

object ParseForESLintResult {
  @scala.inline
  def apply(
    ast: Program with Anon_Comments,
    scopeManager: ReturnType[
      js.Function2[
        /* ast */ Program, 
        /* parserOptions */ typings.atTypescriptDashEslintParser.distParserDashOptionsMod.ParserOptions, 
        ScopeManager
      ]
    ],
    services: ParserServices,
    visitorKeys: VisitorKeys
  ): ParseForESLintResult = {
    val __obj = js.Dynamic.literal(ast = ast, scopeManager = scopeManager, services = services, visitorKeys = visitorKeys)
  
    __obj.asInstanceOf[ParseForESLintResult]
  }
}

