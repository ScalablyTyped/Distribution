package typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod

import typings.atTypescriptDashEslintExperimentalDashUtils.Anon_IncludeComments
import typings.atTypescriptDashEslintExperimentalDashUtils.Anon_Leading
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintScopeMod.Scope.ScopeManager
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode.CursorWithCountOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode.CursorWithSkipOptions
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode.FilterPredicate
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode.Program
import typings.atTypescriptDashEslintExperimentalDashUtils.distTsDashEslintSourceCodeMod.SourceCode.VisitorKeys
import typings.atTypescriptDashEslintTypescriptDashEstree.distParserDashOptionsMod.ParserServices
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Comment
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.LineAndColumnData
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Node
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("SourceCode")
@js.native
trait SourceCode_ extends js.Object {
  var ast: Program = js.native
  var hasBOM: Boolean = js.native
  var lines: js.Array[String] = js.native
  var parserServices: ParserServices = js.native
  var scopeManager: ScopeManager = js.native
  var text: String = js.native
  var tokensAndComments: js.Array[Comment | Token] = js.native
  var visitorKeys: VisitorKeys = js.native
  def commentsExistBetween(left: Node, right: Node): Boolean = js.native
  def commentsExistBetween(left: Node, right: Token): Boolean = js.native
  def commentsExistBetween(left: Token, right: Node): Boolean = js.native
  def commentsExistBetween(left: Token, right: Token): Boolean = js.native
  def getAllComments(): js.Array[Comment] = js.native
  def getComments(node: Node): Anon_Leading = js.native
  def getCommentsAfter(nodeOrToken: Node): js.Array[Comment] = js.native
  def getCommentsAfter(nodeOrToken: Token): js.Array[Comment] = js.native
  def getCommentsBefore(nodeOrToken: Node): js.Array[Comment] = js.native
  def getCommentsBefore(nodeOrToken: Token): js.Array[Comment] = js.native
  def getCommentsInside(node: Node): js.Array[Comment] = js.native
  def getFirstToken(node: Node): Token | Null = js.native
  def getFirstToken(node: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokenBetween(left: Comment, right: Comment): Token | Null = js.native
  def getFirstTokenBetween(left: Comment, right: Comment, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokenBetween(left: Comment, right: Node): Token | Null = js.native
  def getFirstTokenBetween(left: Comment, right: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokenBetween(left: Comment, right: Token): Token | Null = js.native
  def getFirstTokenBetween(left: Comment, right: Token, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokenBetween(left: Node, right: Comment): Token | Null = js.native
  def getFirstTokenBetween(left: Node, right: Comment, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokenBetween(left: Node, right: Node): Token | Null = js.native
  def getFirstTokenBetween(left: Node, right: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokenBetween(left: Node, right: Token): Token | Null = js.native
  def getFirstTokenBetween(left: Node, right: Token, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokenBetween(left: Token, right: Comment): Token | Null = js.native
  def getFirstTokenBetween(left: Token, right: Comment, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokenBetween(left: Token, right: Node): Token | Null = js.native
  def getFirstTokenBetween(left: Token, right: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokenBetween(left: Token, right: Token): Token | Null = js.native
  def getFirstTokenBetween(left: Token, right: Token, options: CursorWithSkipOptions): Token | Null = js.native
  def getFirstTokens(node: Node): js.Array[Token] = js.native
  def getFirstTokens(node: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Comment, right: Comment): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Comment, right: Comment, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Comment, right: Node): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Comment, right: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Comment, right: Token): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Comment, right: Token, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Node, right: Comment): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Node, right: Comment, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Node, right: Node): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Node, right: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Node, right: Token): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Node, right: Token, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Token, right: Comment): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Token, right: Comment, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Token, right: Node): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Token, right: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Token, right: Token): js.Array[Token] = js.native
  def getFirstTokensBetween(left: Token, right: Token, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getIndexFromLoc(location: LineAndColumnData): Double = js.native
  def getJSDocComment(node: Node): Node | Token | Null = js.native
  def getLastToken(node: Node): Token | Null = js.native
  def getLastToken(node: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokenBetween(left: Comment, right: Comment): Token | Null = js.native
  def getLastTokenBetween(left: Comment, right: Comment, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokenBetween(left: Comment, right: Node): Token | Null = js.native
  def getLastTokenBetween(left: Comment, right: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokenBetween(left: Comment, right: Token): Token | Null = js.native
  def getLastTokenBetween(left: Comment, right: Token, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokenBetween(left: Node, right: Comment): Token | Null = js.native
  def getLastTokenBetween(left: Node, right: Comment, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokenBetween(left: Node, right: Node): Token | Null = js.native
  def getLastTokenBetween(left: Node, right: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokenBetween(left: Node, right: Token): Token | Null = js.native
  def getLastTokenBetween(left: Node, right: Token, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokenBetween(left: Token, right: Comment): Token | Null = js.native
  def getLastTokenBetween(left: Token, right: Comment, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokenBetween(left: Token, right: Node): Token | Null = js.native
  def getLastTokenBetween(left: Token, right: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokenBetween(left: Token, right: Token): Token | Null = js.native
  def getLastTokenBetween(left: Token, right: Token, options: CursorWithSkipOptions): Token | Null = js.native
  def getLastTokens(node: Node): js.Array[Token] = js.native
  def getLastTokens(node: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLastTokensBetween(left: Comment, right: Comment): js.Array[Token] = js.native
  def getLastTokensBetween(left: Comment, right: Comment, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLastTokensBetween(left: Comment, right: Node): js.Array[Token] = js.native
  def getLastTokensBetween(left: Comment, right: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLastTokensBetween(left: Comment, right: Token): js.Array[Token] = js.native
  def getLastTokensBetween(left: Comment, right: Token, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLastTokensBetween(left: Node, right: Comment): js.Array[Token] = js.native
  def getLastTokensBetween(left: Node, right: Comment, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLastTokensBetween(left: Node, right: Node): js.Array[Token] = js.native
  def getLastTokensBetween(left: Node, right: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLastTokensBetween(left: Node, right: Token): js.Array[Token] = js.native
  def getLastTokensBetween(left: Node, right: Token, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLastTokensBetween(left: Token, right: Comment): js.Array[Token] = js.native
  def getLastTokensBetween(left: Token, right: Comment, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLastTokensBetween(left: Token, right: Node): js.Array[Token] = js.native
  def getLastTokensBetween(left: Token, right: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLastTokensBetween(left: Token, right: Token): js.Array[Token] = js.native
  def getLastTokensBetween(left: Token, right: Token, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getLines(): js.Array[String] = js.native
  def getLocFromIndex(index: Double): LineAndColumnData = js.native
  def getNodeByRangeIndex(index: Double): Node | Null = js.native
  def getText(): String = js.native
  def getText(node: Node): String = js.native
  def getText(node: Node, beforeCount: Double): String = js.native
  def getText(node: Node, beforeCount: Double, afterCount: Double): String = js.native
  def getTokenAfter(node: Comment): Token | Null = js.native
  def getTokenAfter(node: Comment, options: CursorWithSkipOptions): Token | Null = js.native
  def getTokenAfter(node: Node): Token | Null = js.native
  def getTokenAfter(node: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getTokenAfter(node: Token): Token | Null = js.native
  def getTokenAfter(node: Token, options: CursorWithSkipOptions): Token | Null = js.native
  def getTokenBefore(node: Comment): Token | Null = js.native
  def getTokenBefore(node: Comment, options: CursorWithSkipOptions): Token | Null = js.native
  def getTokenBefore(node: Node): Token | Null = js.native
  def getTokenBefore(node: Node, options: CursorWithSkipOptions): Token | Null = js.native
  def getTokenBefore(node: Token): Token | Null = js.native
  def getTokenBefore(node: Token, options: CursorWithSkipOptions): Token | Null = js.native
  def getTokenByRangeStart(offset: Double): Token | Null = js.native
  def getTokenByRangeStart(offset: Double, options: Anon_IncludeComments): Token | Null = js.native
  def getTokens(node: Node): js.Array[Token] = js.native
  def getTokens(node: Node, beforeCount: Double): js.Array[Token] = js.native
  def getTokens(node: Node, beforeCount: Double, afterCount: Double): js.Array[Token] = js.native
  def getTokens(node: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getTokens(node: Node, options: FilterPredicate): js.Array[Token] = js.native
  def getTokensAfter(node: Comment): js.Array[Token] = js.native
  def getTokensAfter(node: Comment, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getTokensAfter(node: Node): js.Array[Token] = js.native
  def getTokensAfter(node: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getTokensAfter(node: Token): js.Array[Token] = js.native
  def getTokensAfter(node: Token, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getTokensBefore(node: Comment): js.Array[Token] = js.native
  def getTokensBefore(node: Comment, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getTokensBefore(node: Node): js.Array[Token] = js.native
  def getTokensBefore(node: Node, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getTokensBefore(node: Token): js.Array[Token] = js.native
  def getTokensBefore(node: Token, options: CursorWithCountOptions): js.Array[Token] = js.native
  def getTokensBetween(left: Node | Token | Comment, right: Node | Token | Comment): js.Array[Token] = js.native
  def getTokensBetween(
    left: Node | Token | Comment,
    right: Node | Token | Comment,
    padding: Double | FilterPredicate | CursorWithCountOptions
  ): js.Array[Token] = js.native
  def isSpaceBetweenTokens(first: Token, second: Token): Boolean = js.native
}

