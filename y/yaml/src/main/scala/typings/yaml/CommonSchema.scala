package typings.yaml

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonSchema extends StObject {
  
  var default: js.UndefOr[Any] = js.undefined
  
  @JSName("$anchor")
  var $anchor: js.UndefOr[String] = js.undefined
  
  @JSName("$comment")
  var $comment: js.UndefOr[String] = js.undefined
  
  @JSName("$defs")
  var $defs: js.UndefOr[Record[String, JsonSchema]] = js.undefined
  
  @JSName("$dynamicAnchor")
  var $dynamicAnchor: js.UndefOr[String] = js.undefined
  
  @JSName("$dynamicRef")
  var $dynamicRef: js.UndefOr[String] = js.undefined
  
  @JSName("$id")
  var $id: js.UndefOr[String] = js.undefined
  
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.undefined
  
  @JSName("$vocabulary")
  var $vocabulary: js.UndefOr[Record[String, Boolean]] = js.undefined
  
  var allOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  
  var anyOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  
  var const: js.UndefOr[Any] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var `else`: js.UndefOr[JsonSchema] = js.undefined
  
  var `enum`: js.UndefOr[js.Array[Any]] = js.undefined
  
  var examples: js.UndefOr[js.Array[Any]] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var `if`: js.UndefOr[JsonSchema] = js.undefined
  
  var not: js.UndefOr[JsonSchema] = js.undefined
  
  var oneOf: js.UndefOr[js.Array[JsonSchema]] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var `then`: js.UndefOr[JsonSchema] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[JsonType | js.Array[JsonType]] = js.undefined
  
  var writeOnly: js.UndefOr[Boolean] = js.undefined
}
object CommonSchema {
  
  inline def apply(): CommonSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSchema]
  }
  
  extension [Self <: CommonSchema](x: Self) {
    
    inline def set$anchor(value: String): Self = StObject.set(x, "$anchor", value.asInstanceOf[js.Any])
    
    inline def set$anchorUndefined: Self = StObject.set(x, "$anchor", js.undefined)
    
    inline def set$comment(value: String): Self = StObject.set(x, "$comment", value.asInstanceOf[js.Any])
    
    inline def set$commentUndefined: Self = StObject.set(x, "$comment", js.undefined)
    
    inline def set$defs(value: Record[String, JsonSchema]): Self = StObject.set(x, "$defs", value.asInstanceOf[js.Any])
    
    inline def set$defsUndefined: Self = StObject.set(x, "$defs", js.undefined)
    
    inline def set$dynamicAnchor(value: String): Self = StObject.set(x, "$dynamicAnchor", value.asInstanceOf[js.Any])
    
    inline def set$dynamicAnchorUndefined: Self = StObject.set(x, "$dynamicAnchor", js.undefined)
    
    inline def set$dynamicRef(value: String): Self = StObject.set(x, "$dynamicRef", value.asInstanceOf[js.Any])
    
    inline def set$dynamicRefUndefined: Self = StObject.set(x, "$dynamicRef", js.undefined)
    
    inline def set$id(value: String): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
    
    inline def set$idUndefined: Self = StObject.set(x, "$id", js.undefined)
    
    inline def set$ref(value: String): Self = StObject.set(x, "$ref", value.asInstanceOf[js.Any])
    
    inline def set$refUndefined: Self = StObject.set(x, "$ref", js.undefined)
    
    inline def set$schema(value: String): Self = StObject.set(x, "$schema", value.asInstanceOf[js.Any])
    
    inline def set$schemaUndefined: Self = StObject.set(x, "$schema", js.undefined)
    
    inline def set$vocabulary(value: Record[String, Boolean]): Self = StObject.set(x, "$vocabulary", value.asInstanceOf[js.Any])
    
    inline def set$vocabularyUndefined: Self = StObject.set(x, "$vocabulary", js.undefined)
    
    inline def setAllOf(value: js.Array[JsonSchema]): Self = StObject.set(x, "allOf", value.asInstanceOf[js.Any])
    
    inline def setAllOfUndefined: Self = StObject.set(x, "allOf", js.undefined)
    
    inline def setAllOfVarargs(value: JsonSchema*): Self = StObject.set(x, "allOf", js.Array(value*))
    
    inline def setAnyOf(value: js.Array[JsonSchema]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    inline def setAnyOfVarargs(value: JsonSchema*): Self = StObject.set(x, "anyOf", js.Array(value*))
    
    inline def setConst(value: Any): Self = StObject.set(x, "const", value.asInstanceOf[js.Any])
    
    inline def setConstUndefined: Self = StObject.set(x, "const", js.undefined)
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setElse(value: JsonSchema): Self = StObject.set(x, "else", value.asInstanceOf[js.Any])
    
    inline def setElseUndefined: Self = StObject.set(x, "else", js.undefined)
    
    inline def setEnum(value: js.Array[Any]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
    
    inline def setEnumVarargs(value: Any*): Self = StObject.set(x, "enum", js.Array(value*))
    
    inline def setExamples(value: js.Array[Any]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: Any*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIf(value: JsonSchema): Self = StObject.set(x, "if", value.asInstanceOf[js.Any])
    
    inline def setIfUndefined: Self = StObject.set(x, "if", js.undefined)
    
    inline def setNot(value: JsonSchema): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    
    inline def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
    
    inline def setOneOf(value: js.Array[JsonSchema]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfUndefined: Self = StObject.set(x, "oneOf", js.undefined)
    
    inline def setOneOfVarargs(value: JsonSchema*): Self = StObject.set(x, "oneOf", js.Array(value*))
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setThen(value: JsonSchema): Self = StObject.set(x, "then", value.asInstanceOf[js.Any])
    
    inline def setThenUndefined: Self = StObject.set(x, "then", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: JsonType | js.Array[JsonType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setTypeVarargs(value: JsonType*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setWriteOnly(value: Boolean): Self = StObject.set(x, "writeOnly", value.asInstanceOf[js.Any])
    
    inline def setWriteOnlyUndefined: Self = StObject.set(x, "writeOnly", js.undefined)
  }
}
