package typings.typedoc.anon

import typings.typedoc.distLibModelsTypesMod.ArrayType
import typings.typedoc.distLibModelsTypesMod.ConditionalType
import typings.typedoc.distLibModelsTypesMod.IndexedAccessType
import typings.typedoc.distLibModelsTypesMod.InferredType
import typings.typedoc.distLibModelsTypesMod.IntersectionType
import typings.typedoc.distLibModelsTypesMod.IntrinsicType
import typings.typedoc.distLibModelsTypesMod.LiteralType
import typings.typedoc.distLibModelsTypesMod.MappedType
import typings.typedoc.distLibModelsTypesMod.NamedTupleMember
import typings.typedoc.distLibModelsTypesMod.OptionalType
import typings.typedoc.distLibModelsTypesMod.PredicateType
import typings.typedoc.distLibModelsTypesMod.QueryType
import typings.typedoc.distLibModelsTypesMod.ReferenceType
import typings.typedoc.distLibModelsTypesMod.ReflectionType
import typings.typedoc.distLibModelsTypesMod.RestType
import typings.typedoc.distLibModelsTypesMod.TemplateLiteralType
import typings.typedoc.distLibModelsTypesMod.TupleType
import typings.typedoc.distLibModelsTypesMod.TypeOperatorType
import typings.typedoc.distLibModelsTypesMod.UnionType
import typings.typedoc.distLibModelsTypesMod.UnknownType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<typedoc.typedoc/dist/lib/models/types.TypeVisitor<void>> */
trait PartialTypeVisitorvoid extends StObject {
  
  var array: js.UndefOr[js.Function1[/* type */ ArrayType, Unit]] = js.undefined
  
  var conditional: js.UndefOr[js.Function1[/* type */ ConditionalType, Unit]] = js.undefined
  
  var indexedAccess: js.UndefOr[js.Function1[/* type */ IndexedAccessType, Unit]] = js.undefined
  
  var inferred: js.UndefOr[js.Function1[/* type */ InferredType, Unit]] = js.undefined
  
  var intersection: js.UndefOr[js.Function1[/* type */ IntersectionType, Unit]] = js.undefined
  
  var intrinsic: js.UndefOr[js.Function1[/* type */ IntrinsicType, Unit]] = js.undefined
  
  var literal: js.UndefOr[js.Function1[/* type */ LiteralType, Unit]] = js.undefined
  
  var mapped: js.UndefOr[js.Function1[/* type */ MappedType, Unit]] = js.undefined
  
  var `named-tuple-member`: js.UndefOr[js.Function1[/* type */ NamedTupleMember, Unit]] = js.undefined
  
  var optional: js.UndefOr[js.Function1[/* type */ OptionalType, Unit]] = js.undefined
  
  var predicate: js.UndefOr[js.Function1[/* type */ PredicateType, Unit]] = js.undefined
  
  var query: js.UndefOr[js.Function1[/* type */ QueryType, Unit]] = js.undefined
  
  var reference: js.UndefOr[js.Function1[/* type */ ReferenceType, Unit]] = js.undefined
  
  var reflection: js.UndefOr[js.Function1[/* type */ ReflectionType, Unit]] = js.undefined
  
  var rest: js.UndefOr[js.Function1[/* type */ RestType, Unit]] = js.undefined
  
  var `template-literal`: js.UndefOr[js.Function1[/* type */ TemplateLiteralType, Unit]] = js.undefined
  
  var tuple: js.UndefOr[js.Function1[/* type */ TupleType, Unit]] = js.undefined
  
  var typeOperator: js.UndefOr[js.Function1[/* type */ TypeOperatorType, Unit]] = js.undefined
  
  var union: js.UndefOr[js.Function1[/* type */ UnionType, Unit]] = js.undefined
  
  var unknown: js.UndefOr[js.Function1[/* type */ UnknownType, Unit]] = js.undefined
}
object PartialTypeVisitorvoid {
  
  inline def apply(): PartialTypeVisitorvoid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTypeVisitorvoid]
  }
  
  extension [Self <: PartialTypeVisitorvoid](x: Self) {
    
    inline def setArray(value: /* type */ ArrayType => Unit): Self = StObject.set(x, "array", js.Any.fromFunction1(value))
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setConditional(value: /* type */ ConditionalType => Unit): Self = StObject.set(x, "conditional", js.Any.fromFunction1(value))
    
    inline def setConditionalUndefined: Self = StObject.set(x, "conditional", js.undefined)
    
    inline def setIndexedAccess(value: /* type */ IndexedAccessType => Unit): Self = StObject.set(x, "indexedAccess", js.Any.fromFunction1(value))
    
    inline def setIndexedAccessUndefined: Self = StObject.set(x, "indexedAccess", js.undefined)
    
    inline def setInferred(value: /* type */ InferredType => Unit): Self = StObject.set(x, "inferred", js.Any.fromFunction1(value))
    
    inline def setInferredUndefined: Self = StObject.set(x, "inferred", js.undefined)
    
    inline def setIntersection(value: /* type */ IntersectionType => Unit): Self = StObject.set(x, "intersection", js.Any.fromFunction1(value))
    
    inline def setIntersectionUndefined: Self = StObject.set(x, "intersection", js.undefined)
    
    inline def setIntrinsic(value: /* type */ IntrinsicType => Unit): Self = StObject.set(x, "intrinsic", js.Any.fromFunction1(value))
    
    inline def setIntrinsicUndefined: Self = StObject.set(x, "intrinsic", js.undefined)
    
    inline def setLiteral(value: /* type */ LiteralType => Unit): Self = StObject.set(x, "literal", js.Any.fromFunction1(value))
    
    inline def setLiteralUndefined: Self = StObject.set(x, "literal", js.undefined)
    
    inline def setMapped(value: /* type */ MappedType => Unit): Self = StObject.set(x, "mapped", js.Any.fromFunction1(value))
    
    inline def setMappedUndefined: Self = StObject.set(x, "mapped", js.undefined)
    
    inline def `setNamed-tuple-member`(value: /* type */ NamedTupleMember => Unit): Self = StObject.set(x, "named-tuple-member", js.Any.fromFunction1(value))
    
    inline def `setNamed-tuple-memberUndefined`: Self = StObject.set(x, "named-tuple-member", js.undefined)
    
    inline def setOptional(value: /* type */ OptionalType => Unit): Self = StObject.set(x, "optional", js.Any.fromFunction1(value))
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setPredicate(value: /* type */ PredicateType => Unit): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    inline def setQuery(value: /* type */ QueryType => Unit): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setReference(value: /* type */ ReferenceType => Unit): Self = StObject.set(x, "reference", js.Any.fromFunction1(value))
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setReflection(value: /* type */ ReflectionType => Unit): Self = StObject.set(x, "reflection", js.Any.fromFunction1(value))
    
    inline def setReflectionUndefined: Self = StObject.set(x, "reflection", js.undefined)
    
    inline def setRest(value: /* type */ RestType => Unit): Self = StObject.set(x, "rest", js.Any.fromFunction1(value))
    
    inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    inline def `setTemplate-literal`(value: /* type */ TemplateLiteralType => Unit): Self = StObject.set(x, "template-literal", js.Any.fromFunction1(value))
    
    inline def `setTemplate-literalUndefined`: Self = StObject.set(x, "template-literal", js.undefined)
    
    inline def setTuple(value: /* type */ TupleType => Unit): Self = StObject.set(x, "tuple", js.Any.fromFunction1(value))
    
    inline def setTupleUndefined: Self = StObject.set(x, "tuple", js.undefined)
    
    inline def setTypeOperator(value: /* type */ TypeOperatorType => Unit): Self = StObject.set(x, "typeOperator", js.Any.fromFunction1(value))
    
    inline def setTypeOperatorUndefined: Self = StObject.set(x, "typeOperator", js.undefined)
    
    inline def setUnion(value: /* type */ UnionType => Unit): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
    
    inline def setUnionUndefined: Self = StObject.set(x, "union", js.undefined)
    
    inline def setUnknown(value: /* type */ UnknownType => Unit): Self = StObject.set(x, "unknown", js.Any.fromFunction1(value))
    
    inline def setUnknownUndefined: Self = StObject.set(x, "unknown", js.undefined)
  }
}
