package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/serialization/serializers/types", JSImport.Namespace)
@js.native
object distLibSerializationSerializersTypesMod extends js.Object {
  @js.native
  class ArrayTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesArrayMod.ArrayTypeSerializer
  
  @js.native
  class IntersectionTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesIntersectionDashUnionMod.IntersectionTypeSerializer
  
  @js.native
  class IntrinsicTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesIntrinsicMod.IntrinsicTypeSerializer
  
  @js.native
  class ReferenceTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesReferenceMod.ReferenceTypeSerializer
  
  @js.native
  class ReflectionTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesReflectionMod.ReflectionTypeSerializer
  
  @js.native
  class StringLiteralTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesStringDashLiteralMod.StringLiteralTypeSerializer
  
  @js.native
  class TupleTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesTupleMod.TupleTypeSerializer
  
  @js.native
  class TypeOperatorTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesTypeDashOperatorMod.TypeOperatorTypeSerializer
  
  @js.native
  class TypeParameterTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesTypeDashParameterMod.TypeParameterTypeSerializer
  
  @js.native
  class TypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesAbstractMod.TypeSerializer
  
  @js.native
  class UnknownTypeSerializer ()
    extends typings.typedoc.distLibSerializationSerializersTypesUnknownMod.UnknownTypeSerializer
  
  /* static members */
  @js.native
  object TypeSerializer extends js.Object {
    var PRIORITY: Double = js.native
  }
  
}

