package typings.sucrase

import typings.sucrase.distTypesParserTokenizerKeywordsMod.ContextualKeyword
import typings.sucrase.distTypesParserTokenizerTypesMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesParserTraverserUtilMod {
  
  @JSImport("sucrase/dist/types/parser/traverser/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canInsertSemicolon(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canInsertSemicolon")().asInstanceOf[Boolean]
  
  inline def eatContextual(contextualKeyword: ContextualKeyword): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("eatContextual")(contextualKeyword.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def expect(`type`: TokenType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("expect")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def expectContextual(contextualKeyword: ContextualKeyword): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("expectContextual")(contextualKeyword.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hasFollowingLineBreak(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasFollowingLineBreak")().asInstanceOf[Boolean]
  
  inline def hasPrecedingLineBreak(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPrecedingLineBreak")().asInstanceOf[Boolean]
  
  inline def isContextual(contextualKeyword: ContextualKeyword): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContextual")(contextualKeyword.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLineTerminator(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLineTerminator")().asInstanceOf[Boolean]
  
  inline def isLookaheadContextual(contextualKeyword: ContextualKeyword): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLookaheadContextual")(contextualKeyword.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def semicolon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("semicolon")().asInstanceOf[Unit]
  
  inline def unexpected(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unexpected")().asInstanceOf[Unit]
  inline def unexpected(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unexpected")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def unexpected(message: String, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unexpected")(message.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def unexpected(message: Unit, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unexpected")(message.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
