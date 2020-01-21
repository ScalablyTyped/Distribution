package typings.tv4.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TV4 extends js.Object {
  var error: ErrorVar = js.native
  var errorCodes: ErrorCodes = js.native
  var missing: js.Array[String] = js.native
  def addFormat(format: String, validationFunction: FormatValidationFunction): Unit = js.native
  def addFormat(formats: StringDictionary[FormatValidationFunction]): Unit = js.native
  def addLanguage(code: String, map: ErrorMap): Unit = js.native
  // additional API for more complex cases
  def addSchema(schema: JsonSchema): Unit = js.native
  def addSchema(uri: String, schema: JsonSchema): Unit = js.native
  def defineError(codeName: String, codeNumber: Double, defaultMessage: String): Unit = js.native
  def defineKeyword(keyword: String, validationFunction: KeywordValidationFunction): Unit = js.native
  def dropSchemas(): Unit = js.native
  def freshApi(): TV4 = js.native
  def getMissingUris(): js.Array[String] = js.native
  def getMissingUris(filter: RegExp): js.Array[String] = js.native
  def getSchema(uri: String): JsonSchema = js.native
  def getSchemaMap(): SchemaMap = js.native
  def getSchemaUris(): js.Array[String] = js.native
  def getSchemaUris(filter: RegExp): js.Array[String] = js.native
  def language(code: String): Unit = js.native
  // not documented
  def normSchema(schema: JsonSchema, baseUri: String): js.Any = js.native
  def reset(): Unit = js.native
  def resolveUrl(base: String, href: String): String = js.native
  def setErrorReporter(lang: String): Unit = js.native
  def setErrorReporter(
    reporter: js.Function3[/* error */ ValidationError, /* data */ js.Any, /* schema */ JsonSchema, String]
  ): Unit = js.native
  // primary API
  def validate(data: js.Any, schema: JsonSchema): Boolean = js.native
  // from including: tv4.async-jquery.js
  def validate(data: js.Any, schema: JsonSchema, callback: AsyncValidationCallback): Unit = js.native
  def validate(data: js.Any, schema: JsonSchema, callback: AsyncValidationCallback, checkRecursive: Boolean): Unit = js.native
  def validate(
    data: js.Any,
    schema: JsonSchema,
    callback: AsyncValidationCallback,
    checkRecursive: Boolean,
    banUnknownProperties: Boolean
  ): Unit = js.native
  def validate(data: js.Any, schema: JsonSchema, checkRecursive: Boolean): Boolean = js.native
  def validate(data: js.Any, schema: JsonSchema, checkRecursive: Boolean, banUnknownProperties: Boolean): Boolean = js.native
  def validateMultiple(data: js.Any, schema: JsonSchema): MultiResult = js.native
  def validateMultiple(data: js.Any, schema: JsonSchema, checkRecursive: Boolean): MultiResult = js.native
  def validateMultiple(data: js.Any, schema: JsonSchema, checkRecursive: Boolean, banUnknownProperties: Boolean): MultiResult = js.native
  def validateResult(data: js.Any, schema: JsonSchema): SingleResult = js.native
  def validateResult(data: js.Any, schema: JsonSchema, checkRecursive: Boolean): SingleResult = js.native
  def validateResult(data: js.Any, schema: JsonSchema, checkRecursive: Boolean, banUnknownProperties: Boolean): SingleResult = js.native
}

