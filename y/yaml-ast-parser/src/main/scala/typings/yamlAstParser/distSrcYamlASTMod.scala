package typings.yamlAstParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcYamlASTMod {
  
  @JSImport("yaml-ast-parser/dist/src/yamlAST", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Kind extends StObject
  @JSImport("yaml-ast-parser/dist/src/yamlAST", "Kind")
  @js.native
  object Kind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Kind & Double] = js.native
    
    @js.native
    sealed trait ANCHOR_REF
      extends StObject
         with Kind
    /* 4 */ val ANCHOR_REF: typings.yamlAstParser.distSrcYamlASTMod.Kind.ANCHOR_REF & Double = js.native
    
    @js.native
    sealed trait INCLUDE_REF
      extends StObject
         with Kind
    /* 5 */ val INCLUDE_REF: typings.yamlAstParser.distSrcYamlASTMod.Kind.INCLUDE_REF & Double = js.native
    
    @js.native
    sealed trait MAP
      extends StObject
         with Kind
    /* 2 */ val MAP: typings.yamlAstParser.distSrcYamlASTMod.Kind.MAP & Double = js.native
    
    @js.native
    sealed trait MAPPING
      extends StObject
         with Kind
    /* 1 */ val MAPPING: typings.yamlAstParser.distSrcYamlASTMod.Kind.MAPPING & Double = js.native
    
    @js.native
    sealed trait SCALAR
      extends StObject
         with Kind
    /* 0 */ val SCALAR: typings.yamlAstParser.distSrcYamlASTMod.Kind.SCALAR & Double = js.native
    
    @js.native
    sealed trait SEQ
      extends StObject
         with Kind
    /* 3 */ val SEQ: typings.yamlAstParser.distSrcYamlASTMod.Kind.SEQ & Double = js.native
  }
  
  inline def newAnchorRef(key: String, start: Double, end: Double, value: YAMLNode): YAMLAnchorReference = (^.asInstanceOf[js.Dynamic].applyDynamic("newAnchorRef")(key.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[YAMLAnchorReference]
  
  inline def newItems(): YAMLSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("newItems")().asInstanceOf[YAMLSequence]
  
  inline def newMap(): YamlMap = ^.asInstanceOf[js.Dynamic].applyDynamic("newMap")().asInstanceOf[YamlMap]
  inline def newMap(mappings: js.Array[YAMLMapping]): YamlMap = ^.asInstanceOf[js.Dynamic].applyDynamic("newMap")(mappings.asInstanceOf[js.Any]).asInstanceOf[YamlMap]
  
  inline def newMapping(key: YAMLScalar, value: YAMLNode): YAMLMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("newMapping")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[YAMLMapping]
  
  inline def newScalar(): YAMLScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("newScalar")().asInstanceOf[YAMLScalar]
  inline def newScalar(v: String): YAMLScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("newScalar")(v.asInstanceOf[js.Any]).asInstanceOf[YAMLScalar]
  inline def newScalar(v: Boolean): YAMLScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("newScalar")(v.asInstanceOf[js.Any]).asInstanceOf[YAMLScalar]
  inline def newScalar(v: Double): YAMLScalar = ^.asInstanceOf[js.Dynamic].applyDynamic("newScalar")(v.asInstanceOf[js.Any]).asInstanceOf[YAMLScalar]
  
  inline def newSeq(): YAMLSequence = ^.asInstanceOf[js.Dynamic].applyDynamic("newSeq")().asInstanceOf[YAMLSequence]
  
  trait YAMLAnchorReference
    extends StObject
       with YAMLNode {
    
    var referencesAnchor: String
    
    @JSName("value")
    var value_YAMLAnchorReference: YAMLNode
  }
  object YAMLAnchorReference {
    
    inline def apply(
      endPosition: Double,
      errors: js.Array[typings.yamlAstParser.distSrcExceptionMod.^],
      kind: Kind,
      parent: YAMLNode,
      referencesAnchor: String,
      startPosition: Double,
      value: YAMLNode
    ): YAMLAnchorReference = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], referencesAnchor = referencesAnchor.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[YAMLAnchorReference]
    }
    
    extension [Self <: YAMLAnchorReference](x: Self) {
      
      inline def setReferencesAnchor(value: String): Self = StObject.set(x, "referencesAnchor", value.asInstanceOf[js.Any])
      
      inline def setValue(value: YAMLNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait YAMLDocument extends StObject {
    
    var endPosition: Double
    
    var errors: js.Array[typings.yamlAstParser.distSrcExceptionMod.^]
    
    var startPosition: Double
  }
  object YAMLDocument {
    
    inline def apply(
      endPosition: Double,
      errors: js.Array[typings.yamlAstParser.distSrcExceptionMod.^],
      startPosition: Double
    ): YAMLDocument = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[YAMLDocument]
    }
    
    extension [Self <: YAMLDocument](x: Self) {
      
      inline def setEndPosition(value: Double): Self = StObject.set(x, "endPosition", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[typings.yamlAstParser.distSrcExceptionMod.^]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: typings.yamlAstParser.distSrcExceptionMod.^ *): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setStartPosition(value: Double): Self = StObject.set(x, "startPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait YAMLMapping
    extends StObject
       with YAMLNode {
    
    @JSName("key")
    var key_YAMLMapping: YAMLScalar
    
    @JSName("value")
    var value_YAMLMapping: YAMLNode
  }
  object YAMLMapping {
    
    inline def apply(
      endPosition: Double,
      errors: js.Array[typings.yamlAstParser.distSrcExceptionMod.^],
      key: YAMLScalar,
      kind: Kind,
      parent: YAMLNode,
      startPosition: Double,
      value: YAMLNode
    ): YAMLMapping = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[YAMLMapping]
    }
    
    extension [Self <: YAMLMapping](x: Self) {
      
      inline def setKey(value: YAMLScalar): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: YAMLNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait YAMLNode
    extends StObject
       with YAMLDocument {
    
    var anchorId: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[Any] = js.undefined
    
    var kind: Kind
    
    var mappings: js.UndefOr[Any] = js.undefined
    
    var parent: YAMLNode
    
    var value: js.UndefOr[Any] = js.undefined
    
    var valueObject: js.UndefOr[Any] = js.undefined
  }
  object YAMLNode {
    
    inline def apply(
      endPosition: Double,
      errors: js.Array[typings.yamlAstParser.distSrcExceptionMod.^],
      kind: Kind,
      parent: YAMLNode,
      startPosition: Double
    ): YAMLNode = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[YAMLNode]
    }
    
    extension [Self <: YAMLNode](x: Self) {
      
      inline def setAnchorId(value: String): Self = StObject.set(x, "anchorId", value.asInstanceOf[js.Any])
      
      inline def setAnchorIdUndefined: Self = StObject.set(x, "anchorId", js.undefined)
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKind(value: Kind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMappings(value: Any): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
      
      inline def setParent(value: YAMLNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueObject(value: Any): Self = StObject.set(x, "valueObject", value.asInstanceOf[js.Any])
      
      inline def setValueObjectUndefined: Self = StObject.set(x, "valueObject", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait YAMLScalar
    extends StObject
       with YAMLNode {
    
    var doubleQuoted: js.UndefOr[Boolean] = js.undefined
    
    var plainScalar: js.UndefOr[Boolean] = js.undefined
    
    var rawValue: String
    
    var singleQuoted: js.UndefOr[Boolean] = js.undefined
    
    @JSName("value")
    var value_YAMLScalar: String
  }
  object YAMLScalar {
    
    inline def apply(
      endPosition: Double,
      errors: js.Array[typings.yamlAstParser.distSrcExceptionMod.^],
      kind: Kind,
      parent: YAMLNode,
      rawValue: String,
      startPosition: Double,
      value: String
    ): YAMLScalar = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rawValue = rawValue.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[YAMLScalar]
    }
    
    extension [Self <: YAMLScalar](x: Self) {
      
      inline def setDoubleQuoted(value: Boolean): Self = StObject.set(x, "doubleQuoted", value.asInstanceOf[js.Any])
      
      inline def setDoubleQuotedUndefined: Self = StObject.set(x, "doubleQuoted", js.undefined)
      
      inline def setPlainScalar(value: Boolean): Self = StObject.set(x, "plainScalar", value.asInstanceOf[js.Any])
      
      inline def setPlainScalarUndefined: Self = StObject.set(x, "plainScalar", js.undefined)
      
      inline def setRawValue(value: String): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
      
      inline def setSingleQuoted(value: Boolean): Self = StObject.set(x, "singleQuoted", value.asInstanceOf[js.Any])
      
      inline def setSingleQuotedUndefined: Self = StObject.set(x, "singleQuoted", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait YAMLSequence
    extends StObject
       with YAMLNode {
    
    var items: js.Array[YAMLNode]
  }
  object YAMLSequence {
    
    inline def apply(
      endPosition: Double,
      errors: js.Array[typings.yamlAstParser.distSrcExceptionMod.^],
      items: js.Array[YAMLNode],
      kind: Kind,
      parent: YAMLNode,
      startPosition: Double
    ): YAMLSequence = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[YAMLSequence]
    }
    
    extension [Self <: YAMLSequence](x: Self) {
      
      inline def setItems(value: js.Array[YAMLNode]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: YAMLNode*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait YamlMap
    extends StObject
       with YAMLNode {
    
    @JSName("mappings")
    var mappings_YamlMap: js.Array[YAMLMapping]
  }
  object YamlMap {
    
    inline def apply(
      endPosition: Double,
      errors: js.Array[typings.yamlAstParser.distSrcExceptionMod.^],
      kind: Kind,
      mappings: js.Array[YAMLMapping],
      parent: YAMLNode,
      startPosition: Double
    ): YamlMap = {
      val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[YamlMap]
    }
    
    extension [Self <: YamlMap](x: Self) {
      
      inline def setMappings(value: js.Array[YAMLMapping]): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
      
      inline def setMappingsVarargs(value: YAMLMapping*): Self = StObject.set(x, "mappings", js.Array(value*))
    }
  }
}
