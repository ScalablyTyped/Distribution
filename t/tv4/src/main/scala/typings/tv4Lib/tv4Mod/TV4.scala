package typings
package tv4Lib.tv4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TV4 extends js.Object {
  var error: ErrorVar = js.native
  var errorCodes: ErrorCodes = js.native
  var missing: js.Array[java.lang.String] = js.native
  def addFormat(format: java.lang.String, validationFunction: FormatValidationFunction): scala.Unit = js.native
  def addFormat(formats: org.scalablytyped.runtime.StringDictionary[FormatValidationFunction]): scala.Unit = js.native
  def addLanguage(code: java.lang.String, map: ErrorMap): scala.Unit = js.native
  // additional API for more complex cases
  def addSchema(schema: JsonSchema): scala.Unit = js.native
  def addSchema(uri: java.lang.String, schema: JsonSchema): scala.Unit = js.native
  def defineError(codeName: java.lang.String, codeNumber: scala.Double, defaultMessage: java.lang.String): scala.Unit = js.native
  def defineKeyword(keyword: java.lang.String, validationFunction: KeywordValidationFunction): scala.Unit = js.native
  def dropSchemas(): scala.Unit = js.native
  def freshApi(): TV4 = js.native
  def getMissingUris(): js.Array[java.lang.String] = js.native
  def getMissingUris(filter: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def getSchema(uri: java.lang.String): JsonSchema = js.native
  def getSchemaMap(): SchemaMap = js.native
  def getSchemaUris(): js.Array[java.lang.String] = js.native
  def getSchemaUris(filter: stdLib.RegExp): js.Array[java.lang.String] = js.native
  def language(code: java.lang.String): scala.Unit = js.native
  // not documented
  def normSchema(schema: JsonSchema, baseUri: java.lang.String): js.Any = js.native
  def reset(): scala.Unit = js.native
  def resolveUrl(base: java.lang.String, href: java.lang.String): java.lang.String = js.native
  def setErrorReporter(lang: java.lang.String): scala.Unit = js.native
  def setErrorReporter(
    reporter: js.Function3[
      /* error */ ValidationError, 
      /* data */ js.Any, 
      /* schema */ JsonSchema, 
      java.lang.String
    ]
  ): scala.Unit = js.native
  // primary API
  def validate(data: js.Any, schema: JsonSchema): scala.Boolean = js.native
  // from including: tv4.async-jquery.js
  def validate(data: js.Any, schema: JsonSchema, callback: AsyncValidationCallback): scala.Unit = js.native
  def validate(data: js.Any, schema: JsonSchema, callback: AsyncValidationCallback, checkRecursive: scala.Boolean): scala.Unit = js.native
  def validate(
    data: js.Any,
    schema: JsonSchema,
    callback: AsyncValidationCallback,
    checkRecursive: scala.Boolean,
    banUnknownProperties: scala.Boolean
  ): scala.Unit = js.native
  def validate(data: js.Any, schema: JsonSchema, checkRecursive: scala.Boolean): scala.Boolean = js.native
  def validate(
    data: js.Any,
    schema: JsonSchema,
    checkRecursive: scala.Boolean,
    banUnknownProperties: scala.Boolean
  ): scala.Boolean = js.native
  def validateMultiple(data: js.Any, schema: JsonSchema): MultiResult = js.native
  def validateMultiple(data: js.Any, schema: JsonSchema, checkRecursive: scala.Boolean): MultiResult = js.native
  def validateMultiple(
    data: js.Any,
    schema: JsonSchema,
    checkRecursive: scala.Boolean,
    banUnknownProperties: scala.Boolean
  ): MultiResult = js.native
  def validateResult(data: js.Any, schema: JsonSchema): SingleResult = js.native
  def validateResult(data: js.Any, schema: JsonSchema, checkRecursive: scala.Boolean): SingleResult = js.native
  def validateResult(
    data: js.Any,
    schema: JsonSchema,
    checkRecursive: scala.Boolean,
    banUnknownProperties: scala.Boolean
  ): SingleResult = js.native
}

