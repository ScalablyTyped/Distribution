package typings.sucrase

import typings.sucrase.distTypesParserTokenizerTypesMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesParserTraverserLvalMod {
  
  @JSImport("sucrase/dist/types/parser/traverser/lval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def markPriorBindingIdentifier(isBlockScope: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markPriorBindingIdentifier")(isBlockScope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseBindingAtom(isBlockScope: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingAtom")(isBlockScope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseBindingIdentifier(isBlockScope: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingIdentifier")(isBlockScope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseBindingList(close: TokenType, isBlockScope: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingList")(close.asInstanceOf[js.Any], isBlockScope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseBindingList(close: TokenType, isBlockScope: Boolean, allowEmpty: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingList")(close.asInstanceOf[js.Any], isBlockScope.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseBindingList(close: TokenType, isBlockScope: Boolean, allowEmpty: Boolean, allowModifiers: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingList")(close.asInstanceOf[js.Any], isBlockScope.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any], allowModifiers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseBindingList(
    close: TokenType,
    isBlockScope: Boolean,
    allowEmpty: Boolean,
    allowModifiers: Boolean,
    contextId: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingList")(close.asInstanceOf[js.Any], isBlockScope.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any], allowModifiers.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseBindingList(
    close: TokenType,
    isBlockScope: Boolean,
    allowEmpty: Boolean,
    allowModifiers: Unit,
    contextId: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingList")(close.asInstanceOf[js.Any], isBlockScope.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any], allowModifiers.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseBindingList(close: TokenType, isBlockScope: Boolean, allowEmpty: Unit, allowModifiers: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingList")(close.asInstanceOf[js.Any], isBlockScope.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any], allowModifiers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseBindingList(
    close: TokenType,
    isBlockScope: Boolean,
    allowEmpty: Unit,
    allowModifiers: Boolean,
    contextId: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingList")(close.asInstanceOf[js.Any], isBlockScope.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any], allowModifiers.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseBindingList(close: TokenType, isBlockScope: Boolean, allowEmpty: Unit, allowModifiers: Unit, contextId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBindingList")(close.asInstanceOf[js.Any], isBlockScope.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any], allowModifiers.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseImportedIdentifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseImportedIdentifier")().asInstanceOf[Unit]
  
  inline def parseMaybeDefault(isBlockScope: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMaybeDefault")(isBlockScope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseMaybeDefault(isBlockScope: Boolean, leftAlreadyParsed: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMaybeDefault")(isBlockScope.asInstanceOf[js.Any], leftAlreadyParsed.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseRest(isBlockScope: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRest")(isBlockScope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseSpread(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseSpread")().asInstanceOf[Unit]
}
