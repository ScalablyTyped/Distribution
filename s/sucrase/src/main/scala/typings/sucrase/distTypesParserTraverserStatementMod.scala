package typings.sucrase

import typings.sucrase.distTypesParserMod.File
import typings.sucrase.distTypesParserTokenizerTypesMod.TokenType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesParserTraverserStatementMod {
  
  @JSImport("sucrase/dist/types/parser/traverser/statement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def baseParseExportStar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("baseParseExportStar")().asInstanceOf[Unit]
  
  inline def baseParseMaybeDecoratorArguments(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("baseParseMaybeDecoratorArguments")().asInstanceOf[Unit]
  
  inline def parseBlock(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBlock")().asInstanceOf[Unit]
  inline def parseBlock(isFunctionScope: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBlock")(isFunctionScope.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseBlock(isFunctionScope: Boolean, contextId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBlock")(isFunctionScope.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseBlock(isFunctionScope: Unit, contextId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseBlock")(isFunctionScope.asInstanceOf[js.Any], contextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseBlockBody(end: TokenType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBlockBody")(end.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseClass(isStatement: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseClass")(isStatement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseClass(isStatement: Boolean, optionalId: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseClass")(isStatement.asInstanceOf[js.Any], optionalId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseClassProperty(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseClassProperty")().asInstanceOf[Unit]
  
  inline def parseClassPropertyName(classContextId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseClassPropertyName")(classContextId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseDecorators(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDecorators")().asInstanceOf[Unit]
  
  inline def parseExport(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExport")().asInstanceOf[Unit]
  
  inline def parseExportFrom(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExportFrom")().asInstanceOf[Unit]
  
  inline def parseExportSpecifiers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExportSpecifiers")().asInstanceOf[Unit]
  
  inline def parseFunction(functionStart: Double, isStatement: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFunction")(functionStart.asInstanceOf[js.Any], isStatement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseFunction(functionStart: Double, isStatement: Boolean, optionalId: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFunction")(functionStart.asInstanceOf[js.Any], isStatement.asInstanceOf[js.Any], optionalId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseFunctionParams(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionParams")().asInstanceOf[Unit]
  inline def parseFunctionParams(allowModifiers: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionParams")(allowModifiers.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def parseFunctionParams(allowModifiers: Boolean, funcContextId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionParams")(allowModifiers.asInstanceOf[js.Any], funcContextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseFunctionParams(allowModifiers: Unit, funcContextId: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFunctionParams")(allowModifiers.asInstanceOf[js.Any], funcContextId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseImport(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseImport")().asInstanceOf[Unit]
  
  inline def parsePostMemberNameModifiers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePostMemberNameModifiers")().asInstanceOf[Unit]
  
  inline def parseStatement(declaration: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStatement")(declaration.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseTopLevel(): File = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTopLevel")().asInstanceOf[File]
  
  inline def parseVarStatement(kind: TokenType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseVarStatement")(kind.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
