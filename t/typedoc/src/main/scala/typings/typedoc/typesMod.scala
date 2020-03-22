package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  class AliasConverter ()
    extends typings.typedoc.typesAliasMod.AliasConverter
  
  @js.native
  class ArrayConverter ()
    extends typings.typedoc.arrayMod.ArrayConverter
  
  @js.native
  class BindingArrayConverter ()
    extends typings.typedoc.bindingArrayMod.BindingArrayConverter
  
  @js.native
  class BindingObjectConverter ()
    extends typings.typedoc.bindingObjectMod.BindingObjectConverter
  
  @js.native
  class ConditionalConverter ()
    extends typings.typedoc.conditionalMod.ConditionalConverter
  
  @js.native
  class EnumConverter ()
    extends typings.typedoc.typesEnumMod.EnumConverter
  
  @js.native
  class IndexedAccessConverter ()
    extends typings.typedoc.indexedAccessMod.IndexedAccessConverter
  
  @js.native
  class InferredConverter ()
    extends typings.typedoc.inferredMod.InferredConverter
  
  @js.native
  class IntrinsicConverter ()
    extends typings.typedoc.intrinsicMod.IntrinsicConverter
  
  @js.native
  class PredicateConverter ()
    extends typings.typedoc.predicateMod.PredicateConverter
  
  @js.native
  class QueryConverter ()
    extends typings.typedoc.queryMod.QueryConverter
  
  @js.native
  class ReferenceConverter ()
    extends typings.typedoc.typesReferenceMod.ReferenceConverter
  
  @js.native
  class StringLiteralConverter ()
    extends typings.typedoc.stringLiteralMod.StringLiteralConverter
  
  @js.native
  class ThisConverter ()
    extends typings.typedoc.thisMod.ThisConverter
  
  @js.native
  class TupleConverter ()
    extends typings.typedoc.tupleMod.TupleConverter
  
  @js.native
  class TypeOperatorConverter ()
    extends typings.typedoc.typeOperatorMod.TypeOperatorConverter
  
  @js.native
  class TypeParameterConverter ()
    extends typings.typedoc.typesTypeParameterMod.TypeParameterConverter
  
  @js.native
  class UnionOrIntersectionConverter ()
    extends typings.typedoc.unionOrIntersectionMod.UnionOrIntersectionConverter
  
  @js.native
  class UnknownConverter ()
    extends typings.typedoc.unknownMod.UnknownConverter
  
}

