package typings.wdioUtils

import typings.wdioTypes.buildServicesMod.ServicePlugin
import typings.wdioUtils.anon.Dictkey
import typings.wdioUtils.anon.File
import typings.wdioUtils.wdioUtilsStrings.`QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark`
import typings.wdioUtils.wdioUtilsStrings.`QuotationmarkLessthansignScript[base64]GreaterthansignQuotationmark`
import typings.wdioUtils.wdioUtilsStrings.`null`
import typings.wdioUtils.wdioUtilsStrings.`object`
import typings.wdioUtils.wdioUtilsStrings.bigint
import typings.wdioUtils.wdioUtilsStrings.boolean
import typings.wdioUtils.wdioUtilsStrings.function
import typings.wdioUtils.wdioUtilsStrings.number
import typings.wdioUtils.wdioUtilsStrings.string
import typings.wdioUtils.wdioUtilsStrings.symbol
import typings.wdioUtils.wdioUtilsStrings.undefined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsMod {
  
  @JSImport("@wdio/utils/build/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canAccess(file: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canAccess")(file.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def commandCallStructure(commandName: String, args: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("commandCallStructure")(commandName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def filterSpecArgs(args: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSpecArgs")(args.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getArgumentType(arg: Any): string | number | bigint | boolean | symbol | undefined | `object` | function | `null` = ^.asInstanceOf[js.Dynamic].applyDynamic("getArgumentType")(arg.asInstanceOf[js.Any]).asInstanceOf[string | number | bigint | boolean | symbol | undefined | `object` | function | `null`]
  
  inline def isBase64(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunctionAsync(fn: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionAsync")(fn.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidParameter(arg: Any, expectedType: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidParameter")(arg.asInstanceOf[js.Any], expectedType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def overwriteElementCommands(propertiesObject: Dictkey): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overwriteElementCommands")(propertiesObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def safeRequire(name: String): ServicePlugin | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("safeRequire")(name.asInstanceOf[js.Any]).asInstanceOf[ServicePlugin | Null]
  
  inline def sleep(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")().asInstanceOf[js.Promise[Any]]
  inline def sleep(ms: Double): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def transformCommandLogResult(result: File): `QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark` | `QuotationmarkLessthansignScript[base64]GreaterthansignQuotationmark` | File = ^.asInstanceOf[js.Dynamic].applyDynamic("transformCommandLogResult")(result.asInstanceOf[js.Any]).asInstanceOf[`QuotationmarkLessthansignScreenshot[base64]GreaterthansignQuotationmark` | `QuotationmarkLessthansignScript[base64]GreaterthansignQuotationmark` | File]
}
