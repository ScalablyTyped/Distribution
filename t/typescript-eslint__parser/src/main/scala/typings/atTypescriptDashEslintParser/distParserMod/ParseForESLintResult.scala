package typings.atTypescriptDashEslintParser.distParserMod

import typings.atTypescriptDashEslintParser.distScopeScopeDashManagerMod.ScopeManager
import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.ParserServices
import typings.eslintDashVisitorDashKeys.eslintDashVisitorDashKeysMod.VisitorKeys
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseForESLintResult extends js.Object {
  var ast: js.Any
  var scopeManager: ReturnType[
    js.Function2[
      /* ast */ _, 
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
    ast: js.Any,
    scopeManager: ReturnType[
      js.Function2[
        /* ast */ _, 
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

