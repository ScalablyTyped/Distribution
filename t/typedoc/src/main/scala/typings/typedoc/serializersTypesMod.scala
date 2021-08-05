package typings.typedoc

import typings.typedoc.serializerMod.Serializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializersTypesMod {
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "ArrayTypeSerializer")
  @js.native
  class ArrayTypeSerializer protected ()
    extends typings.typedoc.serializersTypesArrayMod.ArrayTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "ConditionalTypeSerializer")
  @js.native
  class ConditionalTypeSerializer protected ()
    extends typings.typedoc.serializersTypesConditionalMod.ConditionalTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "IndexedAccessTypeSerializer")
  @js.native
  class IndexedAccessTypeSerializer protected ()
    extends typings.typedoc.serializersTypesIndexedAccessMod.IndexedAccessTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "InferredTypeSerializer")
  @js.native
  class InferredTypeSerializer protected ()
    extends typings.typedoc.serializersTypesInferredMod.InferredTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "IntersectionTypeSerializer")
  @js.native
  class IntersectionTypeSerializer protected ()
    extends typings.typedoc.typesIntersectionMod.IntersectionTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "IntrinsicTypeSerializer")
  @js.native
  class IntrinsicTypeSerializer protected ()
    extends typings.typedoc.serializersTypesIntrinsicMod.IntrinsicTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "NamedTupleMemberTypeSerializer")
  @js.native
  class NamedTupleMemberTypeSerializer protected ()
    extends typings.typedoc.serializersTypesTupleMod.NamedTupleMemberTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "PredicateTypeSerializer")
  @js.native
  class PredicateTypeSerializer protected ()
    extends typings.typedoc.serializersTypesPredicateMod.PredicateTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "QueryTypeSerializer")
  @js.native
  class QueryTypeSerializer protected ()
    extends typings.typedoc.serializersTypesQueryMod.QueryTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "ReferenceTypeSerializer")
  @js.native
  class ReferenceTypeSerializer protected ()
    extends typings.typedoc.serializersTypesReferenceMod.ReferenceTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "ReflectionTypeSerializer")
  @js.native
  class ReflectionTypeSerializer protected ()
    extends typings.typedoc.typesReflectionMod.ReflectionTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "StringLiteralTypeSerializer")
  @js.native
  class StringLiteralTypeSerializer protected ()
    extends typings.typedoc.serializersTypesStringLiteralMod.StringLiteralTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "TupleTypeSerializer")
  @js.native
  class TupleTypeSerializer protected ()
    extends typings.typedoc.serializersTypesTupleMod.TupleTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "TypeOperatorTypeSerializer")
  @js.native
  class TypeOperatorTypeSerializer protected ()
    extends typings.typedoc.serializersTypesTypeOperatorMod.TypeOperatorTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "TypeParameterTypeSerializer")
  @js.native
  class TypeParameterTypeSerializer protected ()
    extends typings.typedoc.serializersTypesTypeParameterMod.TypeParameterTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "TypeSerializer")
  @js.native
  class TypeSerializer protected ()
    extends typings.typedoc.serializersTypesAbstractMod.TypeSerializer {
    def this(owner: Serializer) = this()
  }
  /* static members */
  object TypeSerializer {
    
    @JSImport("typedoc/dist/lib/serialization/serializers/types", "TypeSerializer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/serialization/serializers/types", "TypeSerializer.PRIORITY")
    @js.native
    def PRIORITY: Double = js.native
    inline def PRIORITY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIORITY")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "UnionTypeSerializer")
  @js.native
  class UnionTypeSerializer protected ()
    extends typings.typedoc.typesUnionMod.UnionTypeSerializer {
    def this(owner: Serializer) = this()
  }
  
  @JSImport("typedoc/dist/lib/serialization/serializers/types", "UnknownTypeSerializer")
  @js.native
  class UnknownTypeSerializer protected ()
    extends typings.typedoc.serializersTypesUnknownMod.UnknownTypeSerializer {
    def this(owner: Serializer) = this()
  }
}
