package typings.tv4

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tv4", JSImport.Namespace)
  @js.native
  val ^ : TV4 = js.native
  
  type AsyncValidationCallback = js.Function2[/* isValid */ Boolean, /* error */ ValidationError, Unit]
  
  trait BaseResult extends StObject {
    
    var missing: js.Array[String]
    
    var valid: Boolean
  }
  object BaseResult {
    
    inline def apply(missing: js.Array[String], valid: Boolean): BaseResult = {
      val __obj = js.Dynamic.literal(missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseResult] (val x: Self) extends AnyVal {
      
      inline def setMissing(value: js.Array[String]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      inline def setMissingVarargs(value: String*): Self = StObject.set(x, "missing", js.Array(value*))
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCodes = StringDictionary[Double]
  
  type ErrorMap = StringDictionary[String]
  
  trait ErrorVar
    extends StObject
       with ValidationError {
    
    var params: Any
    
    var stack: String
  }
  object ErrorVar {
    
    inline def apply(code: Double, message: Any, params: Any, stack: String): ErrorVar = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorVar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorVar] (val x: Self) extends AnyVal {
      
      inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatValidationFunction = js.Function2[/* data */ Any, /* schema */ JsonSchema, Null | String]
  
  trait JsonSchema
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var default: js.UndefOr[Any] = js.undefined
    
    @JSName("$schema")
    var $schema: js.UndefOr[String] = js.undefined
    
    var additionalProperties: js.UndefOr[Boolean] = js.undefined
    
    var definitions: js.UndefOr[Any] = js.undefined
    
    // used for humans only, and not used for computation
    var description: js.UndefOr[String] = js.undefined
    
    // used for humans only, and not used for computation
    var id: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[Any] = js.undefined
    
    var patternProperties: js.UndefOr[Any] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var required: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object JsonSchema {
    
    inline def apply(): JsonSchema = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JsonSchema]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsonSchema] (val x: Self) extends AnyVal {
      
      inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
      
      inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
      
      inline def setAdditionalProperties(value: Boolean): Self = StObject.set(x, "additionalProperties", value.asInstanceOf[js.Any])
      
      inline def setAdditionalPropertiesUndefined: Self = StObject.set(x, "additionalProperties", js.undefined)
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setDefinitions(value: Any): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
      
      inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setPatternProperties(value: Any): Self = StObject.set(x, "patternProperties", value.asInstanceOf[js.Any])
      
      inline def setPatternPropertiesUndefined: Self = StObject.set(x, "patternProperties", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRequired(value: js.Array[String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRequiredVarargs(value: String*): Self = StObject.set(x, "required", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  type KeywordValidationFunction = js.Function4[
    /* data */ Any, 
    /* value */ Any, 
    /* schema */ JsonSchema, 
    /* dataPointerPath */ String, 
    Null | String | ValidationError
  ]
  
  trait MultiResult
    extends StObject
       with BaseResult {
    
    var errors: js.Array[ValidationError]
  }
  object MultiResult {
    
    inline def apply(errors: js.Array[ValidationError], missing: js.Array[String], valid: Boolean): MultiResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
  
  type SchemaMap = StringDictionary[JsonSchema]
  
  trait SingleResult
    extends StObject
       with BaseResult {
    
    var error: ValidationError
  }
  object SingleResult {
    
    inline def apply(error: ValidationError, missing: js.Array[String], valid: Boolean): SingleResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], missing = missing.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[SingleResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SingleResult] (val x: Self) extends AnyVal {
      
      inline def setError(value: ValidationError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
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
    def getMissingUris(filter: js.RegExp): js.Array[String] = js.native
    
    def getSchema(uri: String): JsonSchema = js.native
    
    def getSchemaMap(): SchemaMap = js.native
    
    def getSchemaUris(): js.Array[String] = js.native
    def getSchemaUris(filter: js.RegExp): js.Array[String] = js.native
    
    def language(code: String): Unit = js.native
    
    var missing: js.Array[String] = js.native
    
    // not documented
    def normSchema(schema: JsonSchema, baseUri: String): Any = js.native
    
    def reset(): Unit = js.native
    
    def resolveUrl(base: String, href: String): String = js.native
    
    def setErrorReporter(lang: String): Unit = js.native
    def setErrorReporter(
      reporter: js.Function3[/* error */ ValidationError, /* data */ Any, /* schema */ JsonSchema, String]
    ): Unit = js.native
    
    // primary API
    def validate(data: Any, schema: JsonSchema): Boolean = js.native
    // from including: tv4.async-jquery.js
    def validate(data: Any, schema: JsonSchema, callback: AsyncValidationCallback): Unit = js.native
    def validate(data: Any, schema: JsonSchema, callback: AsyncValidationCallback, checkRecursive: Boolean): Unit = js.native
    def validate(
      data: Any,
      schema: JsonSchema,
      callback: AsyncValidationCallback,
      checkRecursive: Boolean,
      banUnknownProperties: Boolean
    ): Unit = js.native
    def validate(data: Any, schema: JsonSchema, checkRecursive: Boolean): Boolean = js.native
    def validate(data: Any, schema: JsonSchema, checkRecursive: Boolean, banUnknownProperties: Boolean): Boolean = js.native
    
    def validateMultiple(data: Any, schema: JsonSchema): MultiResult = js.native
    def validateMultiple(data: Any, schema: JsonSchema, checkRecursive: Boolean): MultiResult = js.native
    def validateMultiple(data: Any, schema: JsonSchema, checkRecursive: Boolean, banUnknownProperties: Boolean): MultiResult = js.native
    
    def validateResult(data: Any, schema: JsonSchema): SingleResult = js.native
    def validateResult(data: Any, schema: JsonSchema, checkRecursive: Boolean): SingleResult = js.native
    def validateResult(data: Any, schema: JsonSchema, checkRecursive: Boolean, banUnknownProperties: Boolean): SingleResult = js.native
  }
  
  trait ValidationError extends StObject {
    
    var code: Double
    
    var dataPath: js.UndefOr[String] = js.undefined
    
    var message: Any
    
    var schemaPath: js.UndefOr[String] = js.undefined
    
    var subErrors: js.UndefOr[js.Array[ValidationError]] = js.undefined
  }
  object ValidationError {
    
    inline def apply(code: Double, message: Any): ValidationError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDataPath(value: String): Self = StObject.set(x, "dataPath", value.asInstanceOf[js.Any])
      
      inline def setDataPathUndefined: Self = StObject.set(x, "dataPath", js.undefined)
      
      inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSchemaPath(value: String): Self = StObject.set(x, "schemaPath", value.asInstanceOf[js.Any])
      
      inline def setSchemaPathUndefined: Self = StObject.set(x, "schemaPath", js.undefined)
      
      inline def setSubErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "subErrors", value.asInstanceOf[js.Any])
      
      inline def setSubErrorsUndefined: Self = StObject.set(x, "subErrors", js.undefined)
      
      inline def setSubErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "subErrors", js.Array(value*))
    }
  }
  
  type _To = TV4
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: TV4 = ^
}
