package typings.tokeyCssSelectorParser

import typings.tokeyCore.distTypesMod.Token
import typings.tokeyCssSelectorParser.distAstTypesMod.Combinator
import typings.tokeyCssSelectorParser.distAstTypesMod.Comment
import typings.tokeyCssSelectorParser.distAstTypesMod.Nth
import typings.tokeyCssSelectorParser.distAstTypesMod.Selector
import typings.tokeyCssSelectorParser.distAstTypesMod.SelectorList
import typings.tokeyCssSelectorParser.distAstTypesMod.SelectorNode
import typings.tokeyCssSelectorParser.distTokenizerMod.CSSSelectorToken
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Greaterthansign
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Plussign
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.Tilde
import typings.tokeyCssSelectorParser.tokeyCssSelectorParserStrings.space
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersMod {
  
  @JSImport("@tokey/css-selector-parser/dist/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createCombinatorAst_space(hasValueTypeStartEnd: CSSSelectorToken & (Token[space | Plussign | Greaterthansign | Tilde])): Combinator = ^.asInstanceOf[js.Dynamic].applyDynamic("createCombinatorAst")(hasValueTypeStartEnd.asInstanceOf[js.Any]).asInstanceOf[Combinator]
  
  inline def createCommentAst(hasValueStartEnd: CSSSelectorToken): Comment = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommentAst")(hasValueStartEnd.asInstanceOf[js.Any]).asInstanceOf[Comment]
  
  inline def createEmptyNth(): Nth = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptyNth")().asInstanceOf[Nth]
  
  inline def createEmptySelector(): Selector = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmptySelector")().asInstanceOf[Selector]
  
  inline def ensureSelector(selectors: SelectorList, startToken: CSSSelectorToken): Selector = (^.asInstanceOf[js.Dynamic].applyDynamic("ensureSelector")(selectors.asInstanceOf[js.Any], startToken.asInstanceOf[js.Any])).asInstanceOf[Selector]
  
  inline def isCombinatorToken(token: CSSSelectorToken): /* is @tokey/core.@tokey/core/dist/types.Token<'space' | '+' | '>' | '~'> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCombinatorToken")(token.asInstanceOf[js.Any]).asInstanceOf[/* is @tokey/core.@tokey/core/dist/types.Token<'space' | '+' | '>' | '~'> */ Boolean]
  
  inline def isNamespacedAst(token: SelectorNode): /* is @tokey/css-selector-parser.@tokey/css-selector-parser/dist/ast-types.NamespacedNode */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespacedAst")(token.asInstanceOf[js.Any]).asInstanceOf[/* is @tokey/css-selector-parser.@tokey/css-selector-parser/dist/ast-types.NamespacedNode */ Boolean]
  
  inline def isNamespacedToken(token: CSSSelectorToken): /* is @tokey/core.@tokey/core/dist/types.Token<'text' | '*'> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamespacedToken")(token.asInstanceOf[js.Any]).asInstanceOf[/* is @tokey/core.@tokey/core/dist/types.Token<'text' | '*'> */ Boolean]
  
  inline def trimCombinators(selector: Selector): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trimCombinators")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
