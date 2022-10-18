package typings.webpack.mod

import typings.webpack.anon.AsiSafe
import typings.webpack.anon.Block
import typings.webpack.anon.BlockChunkGraph
import typings.webpack.anon.ChunkName
import typings.webpack.anon.ExportsArgument
import typings.webpack.anon.Expr
import typings.webpack.anon.IdExpr
import typings.webpack.anon.ImportVar
import typings.webpack.anon.Message
import typings.webpack.anon.Request
import typings.webpack.anon.Runtime
import typings.webpack.anon.RuntimeRequirements
import typings.webpack.anon.Strict
import typings.webpack.webpackStrings.`x EqualssignGreaterthansign LeftcurlybracketRightcurlybracket`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuntimeTemplate extends StObject {
  
  def assetUrl(__0: typings.webpack.anon.CodeGenerationResults): String = js.native
  
  def asyncModuleFactory(__0: BlockChunkGraph): String = js.native
  
  def basicFunction(): String = js.native
  def basicFunction(args: Any): String = js.native
  def basicFunction(args: Any, body: Any): String = js.native
  def basicFunction(args: Unit, body: Any): String = js.native
  
  def blockPromise(__0: Message): String = js.native
  
  /**
  	 * Add a comment
  	 */
  def comment(__0: ChunkName): String = js.native
  
  var compilation: Compilation = js.native
  
  def concatenation(args: (String | Expr)*): String = js.native
  
  var contentHashReplacement: String = js.native
  
  def defineEsModuleFlagStatement(__0: ExportsArgument): String = js.native
  
  def destructureArray(): String = js.native
  def destructureArray(items: Any): String = js.native
  def destructureArray(items: Any, value: Any): String = js.native
  def destructureArray(items: Unit, value: Any): String = js.native
  
  def destructureObject(): String = js.native
  def destructureObject(items: Any): String = js.native
  def destructureObject(items: Any, value: Any): String = js.native
  def destructureObject(items: Unit, value: Any): String = js.native
  
  def emptyFunction(): (`x EqualssignGreaterthansign LeftcurlybracketRightcurlybracket`) | (/* function() {} */ String) = js.native
  
  def exportFromImport(__0: AsiSafe): String = js.native
  
  def expressionFunction(): String = js.native
  def expressionFunction(expression: Any): String = js.native
  def expressionFunction(expression: Any, args: String): String = js.native
  def expressionFunction(expression: Unit, args: String): String = js.native
  
  def forEach(): String = js.native
  def forEach(variable: Any): String = js.native
  def forEach(variable: Any, array: Any): String = js.native
  def forEach(variable: Any, array: Any, body: Any): String = js.native
  def forEach(variable: Any, array: Unit, body: Any): String = js.native
  def forEach(variable: Unit, array: Any): String = js.native
  def forEach(variable: Unit, array: Any, body: Any): String = js.native
  def forEach(variable: Unit, array: Unit, body: Any): String = js.native
  
  var globalObject: String = js.native
  
  def iife(): String = js.native
  def iife(args: Any): String = js.native
  def iife(args: Any, body: Any): String = js.native
  def iife(args: Unit, body: Any): String = js.native
  
  def importStatement(__0: ImportVar): js.Tuple2[String, String] = js.native
  
  def isIIFE(): js.UndefOr[Boolean] = js.native
  
  def isModule(): js.UndefOr[Boolean] = js.native
  
  def missingModule(__0: Request): String = js.native
  
  def missingModulePromise(__0: Request): String = js.native
  
  def missingModuleStatement(__0: Request): String = js.native
  
  def moduleExports(__0: RuntimeRequirements): String = js.native
  
  def moduleId(__0: typings.webpack.anon.Module): String = js.native
  
  def moduleNamespace(__0: Strict): String = js.native
  
  def moduleNamespacePromise(__0: Block): String = js.native
  
  def moduleRaw(__0: RuntimeRequirements): String = js.native
  
  var outputOptions: OutputNormalized = js.native
  
  var requestShortener: RequestShortener = js.native
  
  def returningFunction(): String = js.native
  def returningFunction(returnValue: Any): String = js.native
  def returningFunction(returnValue: Any, args: String): String = js.native
  def returningFunction(returnValue: Unit, args: String): String = js.native
  
  def runtimeConditionExpression(__0: Runtime): String = js.native
  
  def supportTemplateLiteral(): js.UndefOr[Boolean] = js.native
  
  def supportsArrowFunction(): js.UndefOr[Boolean] = js.native
  
  def supportsBigIntLiteral(): js.UndefOr[Boolean] = js.native
  
  def supportsConst(): js.UndefOr[Boolean] = js.native
  
  def supportsDestructuring(): js.UndefOr[Boolean] = js.native
  
  def supportsDynamicImport(): js.UndefOr[Boolean] = js.native
  
  def supportsEcmaScriptModuleSyntax(): js.UndefOr[Boolean] = js.native
  
  def supportsForOf(): js.UndefOr[Boolean] = js.native
  
  def supportsOptionalChaining(): js.UndefOr[Boolean] = js.native
  
  def syncModuleFactory(__0: typings.webpack.anon.Dependency): String = js.native
  
  def throwMissingModuleErrorBlock(__0: Request): String = js.native
  
  def throwMissingModuleErrorFunction(__0: Request): String = js.native
  
  def weakError(__0: IdExpr): String = js.native
}
