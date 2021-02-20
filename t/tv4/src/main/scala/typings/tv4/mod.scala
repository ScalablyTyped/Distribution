package typings.tv4

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tv4", JSImport.Namespace)
  @js.native
  val ^ : TV4 = js.native
  
  type AsyncValidationCallback = js.Function2[/* isValid */ Boolean, /* error */ ValidationError, Unit]
  
  @js.native
  trait BaseResult extends StObject {
    
    var missing: js.Array[String] = js.native
    
    var valid: Boolean = js.native
  }
  object BaseResult {
    
    @scala.inline
    def apply(missing: js.Array[String], valid: Boolean): BaseResult = {
      val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResult]
    }
    
    @scala.inline
    implicit class BaseResultMutableBuilder[Self <: BaseResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMissing(value: js.Array[String]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingVarargs(value: String*): Self = StObject.set(x, "missing", js.Array(value :_*))
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCodes = StringDictionary[Double]
  
  type ErrorMap = StringDictionary[String]
  
  @js.native
  trait ErrorVar extends ValidationError {
    
    var params: js.Any = js.native
    
    var stack: String = js.native
  }
  object ErrorVar {
    
    @scala.inline
    def apply(code: Double, message: js.Any, params: js.Any, stack: String): ErrorVar = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorVar]
    }
    
    @scala.inline
    implicit class ErrorVarMutableBuilder[Self <: ErrorVar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatValidationFunction = js.Function2[/* data */ js.Any, /* schema */ JsonSchema, String]
  
  @js.native
  trait JsonSchema
    extends /* key */ StringDictionary[js.Any] {
    
    var default: js.UndefOr[js.Any] = js.native
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.native
    
    var additionalProperties: js.UndefOr[Boolean] = js.native
    
    var definitions: js.UndefOr[js.Any] = js.native
    
    // used for humans only, and not used for computation
    var description: js.UndefOr[String] = js.native
    
    // used for humans only, and not used for computation
    var id: js.UndefOr[String] = js.native
    
    var items: js.UndefOr[js.Any] = js.native
    
    var patternProperties: js.UndefOr[js.Any] = js.native
    
    var properties: js.UndefOr[js.Any] = js.native
    
    var required: js.UndefOr[js.Array[String]] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String | js.Array[String]] = js.native
  }
  object JsonSchema {
    
    @scala.inline
    def apply(): JsonSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonSchema]
    }
    
    @scala.inline
    implicit class JsonSchemaMutableBuilder[Self <: JsonSchema] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      @scala.inline
      def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefinitions(value: js.Any): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setPatternProperties(value: js.Any): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  type KeywordValidationFunction = js.Function4[
    /* data */ js.Any, 
    /* value */ js.Any, 
    /* schema */ JsonSchema, 
    /* dataPointerPath */ String, 
    String | ValidationError
  ]
  
  @js.native
  trait MultiResult extends BaseResult {
    
    var errors: js.Array[ValidationError] = js.native
  }
  object MultiResult {
    
    @scala.inline
    def apply(errors: js.Array[ValidationError], missing: js.Array[String], valid: Boolean): MultiResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiResult]
    }
    
    @scala.inline
    implicit class MultiResultMutableBuilder[Self <: MultiResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  type SchemaMap = StringDictionary[JsonSchema]
  
  @js.native
  trait SingleResult extends BaseResult {
    
    var error: ValidationError = js.native
  }
  object SingleResult {
    
    @scala.inline
    def apply(error: ValidationError, missing: js.Array[String], valid: Boolean): SingleResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleResult]
    }
    
    @scala.inline
    implicit class SingleResultMutableBuilder[Self <: SingleResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: ValidationError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TV4 extends StObject {
    
    def addFormat(format: String, validationFunction: FormatValidationFunction): Unit = js.native
    def addFormat(formats: StringDictionary[FormatValidationFunction]): Unit = js.native
    
    def addLanguage(code: String, map: ErrorMap): Unit = js.native
    
    // additional API for more complex cases
    def addSchema(schema: JsonSchema): Unit = js.native
    def addSchema(uri: String, schema: JsonSchema): Unit = js.native
    
    def defineError(codeName: String, codeNumber: Double, defaultMessage: String): Unit = js.native
    
    def defineKeyword(keyword: String, validationFunction: KeywordValidationFunction): Unit = js.native
    
    def dropSchemas(): Unit = js.native
    
    var error: ErrorVar = js.native
    
    var errorCodes: ErrorCodes = js.native
    
    def freshApi(): TV4 = js.native
    
    def getMissingUris(): js.Array[String] = js.native
    def getMissingUris(filter: RegExp): js.Array[String] = js.native
    
    def getSchema(uri: String): JsonSchema = js.native
    
    def getSchemaMap(): SchemaMap = js.native
    
    def getSchemaUris(): js.Array[String] = js.native
    def getSchemaUris(filter: RegExp): js.Array[String] = js.native
    
    def language(code: String): Unit = js.native
    
    var missing: js.Array[String] = js.native
    
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
  
  @js.native
  trait ValidationError extends StObject {
    
    var code: Double = js.native
    
    var dataPath: js.UndefOr[String] = js.native
    
    var message: js.Any = js.native
    
    var schemaPath: js.UndefOr[String] = js.native
    
    var subErrors: js.UndefOr[js.Array[ValidationError]] = js.native
  }
  object ValidationError {
    
    @scala.inline
    def apply(code: Double, message: js.Any): ValidationError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit class ValidationErrorMutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataPathUndefined: Self = StObject.set(x, "dataPath", js.undefined)
      
      @scala.inline
      def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchemaPathUndefined: Self = StObject.set(x, "schemaPath", js.undefined)
      
      @scala.inline
      def setSubErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "subErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubErrorsUndefined: Self = StObject.set(x, "subErrors", js.undefined)
      
      @scala.inline
      def setSubErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "subErrors", js.Array(value :_*))
    }
  }
  
  type _To = TV4
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TV4 = ^
}
