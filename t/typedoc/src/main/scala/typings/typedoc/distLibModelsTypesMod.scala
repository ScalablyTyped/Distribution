package typings.typedoc

import typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typings.typedoc.distLibModelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types", JSImport.Namespace)
@js.native
object distLibModelsTypesMod extends js.Object {
  @js.native
  class ArrayType protected ()
    extends typings.typedoc.distLibModelsTypesArrayMod.ArrayType {
    def this(elementType: Type) = this()
  }
  
  @js.native
  class IntersectionType protected ()
    extends typings.typedoc.distLibModelsTypesIntersectionMod.IntersectionType {
    def this(types: js.Array[typings.typedoc.distLibModelsTypesAbstractMod.Type]) = this()
  }
  
  @js.native
  class IntrinsicType protected ()
    extends typings.typedoc.distLibModelsTypesIntrinsicMod.IntrinsicType {
    def this(name: String) = this()
  }
  
  @js.native
  class ReferenceType protected ()
    extends typings.typedoc.distLibModelsTypesReferenceMod.ReferenceType {
    def this(name: String, symbolID: Double) = this()
    def this(name: String, symbolID: Double, reflection: Reflection) = this()
  }
  
  @js.native
  class ReflectionType protected ()
    extends typings.typedoc.distLibModelsTypesReflectionMod.ReflectionType {
    def this(declaration: DeclarationReflection) = this()
  }
  
  @js.native
  class StringLiteralType protected ()
    extends typings.typedoc.distLibModelsTypesStringDashLiteralMod.StringLiteralType {
    def this(value: String) = this()
  }
  
  @js.native
  class TupleType protected ()
    extends typings.typedoc.distLibModelsTypesTupleMod.TupleType {
    def this(elements: js.Array[typings.typedoc.distLibModelsTypesAbstractMod.Type]) = this()
  }
  
  @js.native
  abstract class Type ()
    extends typings.typedoc.distLibModelsTypesAbstractMod.Type
  
  @js.native
  class TypeOperatorType protected ()
    extends typings.typedoc.distLibModelsTypesTypeDashOperatorMod.TypeOperatorType {
    def this(target: typings.typedoc.distLibModelsTypesAbstractMod.Type) = this()
  }
  
  @js.native
  class TypeParameterType protected ()
    extends typings.typedoc.distLibModelsTypesTypeDashParameterMod.TypeParameterType {
    def this(name: String) = this()
  }
  
  @js.native
  class UnionType protected ()
    extends typings.typedoc.distLibModelsTypesUnionMod.UnionType {
    def this(types: js.Array[typings.typedoc.distLibModelsTypesAbstractMod.Type]) = this()
  }
  
  @js.native
  class UnknownType protected ()
    extends typings.typedoc.distLibModelsTypesUnknownMod.UnknownType {
    def this(name: String) = this()
  }
  
  /* static members */
  @js.native
  object ReferenceType extends js.Object {
    var SYMBOL_ID_RESOLVED: Double = js.native
    var SYMBOL_ID_RESOLVE_BY_NAME: Double = js.native
  }
  
  /* static members */
  @js.native
  object Type extends js.Object {
    def isTypeListEqual(
      a: js.Array[typings.typedoc.distLibModelsTypesAbstractMod.Type],
      b: js.Array[typings.typedoc.distLibModelsTypesAbstractMod.Type]
    ): Boolean = js.native
    def isTypeListSimilar(
      a: js.Array[typings.typedoc.distLibModelsTypesAbstractMod.Type],
      b: js.Array[typings.typedoc.distLibModelsTypesAbstractMod.Type]
    ): Boolean = js.native
  }
  
}

