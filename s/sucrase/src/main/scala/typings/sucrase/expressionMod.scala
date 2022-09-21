package typings.sucrase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expressionMod {
  
  @JSImport("sucrase/dist/types/parser/traverser/expression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sucrase/dist/types/parser/traverser/expression", "StopState")
  @js.native
  open class StopState protected () extends StObject {
    def this(stop: Boolean) = this()
    
    var stop: Boolean = js.native
  }
  
  inline def atPossibleAsync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("atPossibleAsync")().asInstanceOf[Boolean]
  
  inline def baseParseConditional(noIn: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("baseParseConditional")(noIn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def baseParseMaybeAssign(noIn: Boolean, isWithinParens: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("baseParseMaybeAssign")(noIn.asInstanceOf[js.Any], isWithinParens.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def baseParseSubscript(startTokenIndex: Double, noCalls: Boolean, stopState: StopState): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("baseParseSubscript")(startTokenIndex.asInstanceOf[js.Any], noCalls.asInstanceOf[js.Any], stopState.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def baseParseSubscripts(startTokenIndex: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("baseParseSubscripts")(startTokenIndex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def baseParseSubscripts(startTokenIndex: Double, noCalls: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("baseParseSubscripts")(startTokenIndex.asInstanceOf[js.Any], noCalls.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseArrow(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArrow")().asInstanceOf[Boolean]
  
  inline def parseArrowExpression(startTokenIndex: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseArrowExpression")(startTokenIndex.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseCallExpressionArguments(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCallExpressionArguments")().asInstanceOf[Unit]
  
  inline def parseExprAtom(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExprAtom")().asInstanceOf[Boolean]
  
  inline def parseExprSubscripts(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExprSubscripts")().asInstanceOf[Boolean]
  
  inline def parseExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")().asInstanceOf[Unit]
  inline def parseExpression(noIn: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExpression")(noIn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseFunctionBody(allowExpression: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionBody")(allowExpression.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseFunctionBody(allowExpression: Boolean, funcContextId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionBody")(allowExpression.asInstanceOf[js.Any], funcContextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseFunctionBodyAndFinish(functionStart: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionBodyAndFinish")(functionStart.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseFunctionBodyAndFinish(functionStart: Double, funcContextId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionBodyAndFinish")(functionStart.asInstanceOf[js.Any], funcContextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseIdentifier(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseIdentifier")().asInstanceOf[Unit]
  
  inline def parseLiteral(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLiteral")().asInstanceOf[Unit]
  
  inline def parseMaybeAssign(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMaybeAssign")().asInstanceOf[Boolean]
  inline def parseMaybeAssign(noIn: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMaybeAssign")(noIn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def parseMaybeAssign(noIn: Boolean, isWithinParens: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMaybeAssign")(noIn.asInstanceOf[js.Any], isWithinParens.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def parseMaybeAssign(noIn: Unit, isWithinParens: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMaybeAssign")(noIn.asInstanceOf[js.Any], isWithinParens.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parseMaybeUnary(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseMaybeUnary")().asInstanceOf[Boolean]
  
  inline def parseMethod(functionStart: Double, isConstructor: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseMethod")(functionStart.asInstanceOf[js.Any], isConstructor.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseObj(isPattern: Boolean, isBlockScope: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseObj")(isPattern.asInstanceOf[js.Any], isBlockScope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseParenExpression(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseParenExpression")().asInstanceOf[Unit]
  
  inline def parsePropertyName(objectContextId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePropertyName")(objectContextId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseTemplate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTemplate")().asInstanceOf[Unit]
}
