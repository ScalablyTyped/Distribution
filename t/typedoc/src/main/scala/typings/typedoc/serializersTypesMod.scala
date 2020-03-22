package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types", JSImport.Namespace)
@js.native
object serializersTypesMod extends js.Object {
  @js.native
  class ArrayTypeSerializer ()
    extends typings.typedoc.serializersTypesArrayMod.ArrayTypeSerializer
  
  @js.native
  class ConditionalTypeSerializer ()
    extends typings.typedoc.serializersTypesConditionalMod.ConditionalTypeSerializer
  
  @js.native
  class IndexedAccessTypeSerializer ()
    extends typings.typedoc.serializersTypesIndexedAccessMod.IndexedAccessTypeSerializer
  
  @js.native
  class InferredTypeSerializer ()
    extends typings.typedoc.serializersTypesInferredMod.InferredTypeSerializer
  
  @js.native
  class IntersectionTypeSerializer ()
    extends typings.typedoc.typesIntersectionMod.IntersectionTypeSerializer
  
  @js.native
  class IntrinsicTypeSerializer ()
    extends typings.typedoc.serializersTypesIntrinsicMod.IntrinsicTypeSerializer
  
  @js.native
  class PredicateTypeSerializer ()
    extends typings.typedoc.serializersTypesPredicateMod.PredicateTypeSerializer
  
  @js.native
  class QueryTypeSerializer ()
    extends typings.typedoc.serializersTypesQueryMod.QueryTypeSerializer
  
  @js.native
  class ReferenceTypeSerializer ()
    extends typings.typedoc.serializersTypesReferenceMod.ReferenceTypeSerializer
  
  @js.native
  class ReflectionTypeSerializer ()
    extends typings.typedoc.typesReflectionMod.ReflectionTypeSerializer
  
  @js.native
  class StringLiteralTypeSerializer ()
    extends typings.typedoc.serializersTypesStringLiteralMod.StringLiteralTypeSerializer
  
  @js.native
  class TupleTypeSerializer ()
    extends typings.typedoc.serializersTypesTupleMod.TupleTypeSerializer
  
  @js.native
  class TypeOperatorTypeSerializer ()
    extends typings.typedoc.serializersTypesTypeOperatorMod.TypeOperatorTypeSerializer
  
  @js.native
  class TypeParameterTypeSerializer ()
    extends typings.typedoc.serializersTypesTypeParameterMod.TypeParameterTypeSerializer
  
  @js.native
  class TypeSerializer ()
    extends typings.typedoc.serializersTypesAbstractMod.TypeSerializer
  
  @js.native
  class UnionTypeSerializer ()
    extends typings.typedoc.typesUnionMod.UnionTypeSerializer
  
  @js.native
  class UnknownTypeSerializer ()
    extends typings.typedoc.serializersTypesUnknownMod.UnknownTypeSerializer
  
  /* static members */
  @js.native
  object TypeSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

