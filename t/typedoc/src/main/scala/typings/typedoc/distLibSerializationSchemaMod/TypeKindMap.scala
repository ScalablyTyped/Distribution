package typings.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeKindMap extends StObject {
  
  var array: ArrayType
  
  var conditional: ConditionalType
  
  var indexedAccess: IndexedAccessType
  
  var inferred: InferredType
  
  var intersection: IntersectionType
  
  var intrinsic: IntrinsicType
  
  var literal: LiteralType
  
  var mapped: MappedType
  
  var `named-tuple-member`: NamedTupleMemberType
  
  var optional: OptionalType
  
  var predicate: PredicateType
  
  var query: QueryType
  
  var reference: ReferenceType
  
  var reflection: ReflectionType
  
  var rest: RestType
  
  var `template-literal`: TemplateLiteralType
  
  var tuple: TupleType
  
  var typeOperator: TypeOperatorType
  
  var union: UnionType
  
  var unknown: UnknownType
}
object TypeKindMap {
  
  inline def apply(
    array: ArrayType,
    conditional: ConditionalType,
    indexedAccess: IndexedAccessType,
    inferred: InferredType,
    intersection: IntersectionType,
    intrinsic: IntrinsicType,
    literal: LiteralType,
    mapped: MappedType,
    `named-tuple-member`: NamedTupleMemberType,
    optional: OptionalType,
    predicate: PredicateType,
    query: QueryType,
    reference: ReferenceType,
    reflection: ReflectionType,
    rest: RestType,
    `template-literal`: TemplateLiteralType,
    tuple: TupleType,
    typeOperator: TypeOperatorType,
    union: UnionType,
    unknown: UnknownType
  ): TypeKindMap = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], conditional = conditional.asInstanceOf[js.Any], indexedAccess = indexedAccess.asInstanceOf[js.Any], inferred = inferred.asInstanceOf[js.Any], intersection = intersection.asInstanceOf[js.Any], intrinsic = intrinsic.asInstanceOf[js.Any], literal = literal.asInstanceOf[js.Any], mapped = mapped.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], reflection = reflection.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], tuple = tuple.asInstanceOf[js.Any], typeOperator = typeOperator.asInstanceOf[js.Any], union = union.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
    __obj.updateDynamic("named-tuple-member")(`named-tuple-member`.asInstanceOf[js.Any])
    __obj.updateDynamic("template-literal")(`template-literal`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeKindMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeKindMap] (val x: Self) extends AnyVal {
    
    inline def setArray(value: ArrayType): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setConditional(value: ConditionalType): Self = StObject.set(x, "conditional", value.asInstanceOf[js.Any])
    
    inline def setIndexedAccess(value: IndexedAccessType): Self = StObject.set(x, "indexedAccess", value.asInstanceOf[js.Any])
    
    inline def setInferred(value: InferredType): Self = StObject.set(x, "inferred", value.asInstanceOf[js.Any])
    
    inline def setIntersection(value: IntersectionType): Self = StObject.set(x, "intersection", value.asInstanceOf[js.Any])
    
    inline def setIntrinsic(value: IntrinsicType): Self = StObject.set(x, "intrinsic", value.asInstanceOf[js.Any])
    
    inline def setLiteral(value: LiteralType): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
    
    inline def setMapped(value: MappedType): Self = StObject.set(x, "mapped", value.asInstanceOf[js.Any])
    
    inline def `setNamed-tuple-member`(value: NamedTupleMemberType): Self = StObject.set(x, "named-tuple-member", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: OptionalType): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setPredicate(value: PredicateType): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: QueryType): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReference(value: ReferenceType): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReflection(value: ReflectionType): Self = StObject.set(x, "reflection", value.asInstanceOf[js.Any])
    
    inline def setRest(value: RestType): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def `setTemplate-literal`(value: TemplateLiteralType): Self = StObject.set(x, "template-literal", value.asInstanceOf[js.Any])
    
    inline def setTuple(value: TupleType): Self = StObject.set(x, "tuple", value.asInstanceOf[js.Any])
    
    inline def setTypeOperator(value: TypeOperatorType): Self = StObject.set(x, "typeOperator", value.asInstanceOf[js.Any])
    
    inline def setUnion(value: UnionType): Self = StObject.set(x, "union", value.asInstanceOf[js.Any])
    
    inline def setUnknown(value: UnknownType): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
  }
}
