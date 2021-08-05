package typings.typedoc

import typings.typedoc.abstractMod.Reflection
import typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
import typings.typedoc.typedocStrings.keyof
import typings.typedoc.typedocStrings.readonly
import typings.typedoc.typedocStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsTypesMod {
  
  @JSImport("typedoc/dist/lib/models/types", "ArrayType")
  @js.native
  class ArrayType protected ()
    extends typings.typedoc.typesArrayMod.ArrayType {
    def this(elementType: Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "ConditionalType")
  @js.native
  class ConditionalType protected ()
    extends typings.typedoc.typesConditionalMod.ConditionalType {
    def this(
      checkType: typings.typedoc.typesAbstractMod.Type,
      extendsType: typings.typedoc.typesAbstractMod.Type,
      trueType: typings.typedoc.typesAbstractMod.Type,
      falseType: typings.typedoc.typesAbstractMod.Type
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "IndexedAccessType")
  @js.native
  class IndexedAccessType protected ()
    extends typings.typedoc.typesIndexedAccessMod.IndexedAccessType {
    def this(objectType: Type, indexType: Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "InferredType")
  @js.native
  class InferredType protected ()
    extends typings.typedoc.typesInferredMod.InferredType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "IntersectionType")
  @js.native
  class IntersectionType protected ()
    extends typings.typedoc.intersectionMod.IntersectionType {
    def this(types: js.Array[typings.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "IntrinsicType")
  @js.native
  class IntrinsicType protected ()
    extends typings.typedoc.typesIntrinsicMod.IntrinsicType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "NamedTupleMember")
  @js.native
  class NamedTupleMember protected ()
    extends typings.typedoc.typesTupleMod.NamedTupleMember {
    def this(name: String, isOptional: Boolean, element: typings.typedoc.typesAbstractMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "PredicateType")
  @js.native
  class PredicateType protected ()
    extends typings.typedoc.typesPredicateMod.PredicateType {
    def this(name: String, asserts: Boolean) = this()
    def this(name: String, asserts: Boolean, targetType: typings.typedoc.typesAbstractMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "QueryType")
  @js.native
  class QueryType protected ()
    extends typings.typedoc.typesQueryMod.QueryType {
    def this(reference: typings.typedoc.modelsTypesReferenceMod.ReferenceType) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "ReferenceType")
  @js.native
  class ReferenceType protected ()
    extends typings.typedoc.modelsTypesReferenceMod.ReferenceType {
    def this(name: String, symbolFQN: String) = this()
    def this(name: String, symbolFQN: String, reflection: Reflection) = this()
  }
  /* static members */
  object ReferenceType {
    
    @JSImport("typedoc/dist/lib/models/types", "ReferenceType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/models/types", "ReferenceType.SYMBOL_FQN_RESOLVED")
    @js.native
    def SYMBOL_FQN_RESOLVED: String = js.native
    inline def SYMBOL_FQN_RESOLVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVED")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/models/types", "ReferenceType.SYMBOL_FQN_RESOLVE_BY_NAME")
    @js.native
    def SYMBOL_FQN_RESOLVE_BY_NAME: String = js.native
    inline def SYMBOL_FQN_RESOLVE_BY_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVE_BY_NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/models/types", "ReflectionType")
  @js.native
  class ReflectionType protected ()
    extends typings.typedoc.reflectionMod.ReflectionType {
    def this(declaration: DeclarationReflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "StringLiteralType")
  @js.native
  class StringLiteralType protected ()
    extends typings.typedoc.typesStringLiteralMod.StringLiteralType {
    def this(value: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "TupleType")
  @js.native
  class TupleType protected ()
    extends typings.typedoc.typesTupleMod.TupleType {
    def this(elements: js.Array[typings.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "Type")
  @js.native
  abstract class Type ()
    extends typings.typedoc.typesAbstractMod.Type
  /* static members */
  object Type {
    
    @JSImport("typedoc/dist/lib/models/types", "Type")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isTypeListEqual(
      a: js.Array[typings.typedoc.typesAbstractMod.Type],
      b: js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeListEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isTypeListSimilar(
      a: js.Array[typings.typedoc.typesAbstractMod.Type],
      b: js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isTypeListSimilar")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("typedoc/dist/lib/models/types", "TypeOperatorType")
  @js.native
  class TypeOperatorType protected ()
    extends typings.typedoc.typesTypeOperatorMod.TypeOperatorType {
    def this(target: typings.typedoc.typesAbstractMod.Type, operator: keyof) = this()
    def this(target: typings.typedoc.typesAbstractMod.Type, operator: readonly) = this()
    def this(target: typings.typedoc.typesAbstractMod.Type, operator: unique) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "TypeParameterType")
  @js.native
  class TypeParameterType protected ()
    extends typings.typedoc.modelsTypesTypeParameterMod.TypeParameterType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "UnionType")
  @js.native
  class UnionType protected ()
    extends typings.typedoc.unionMod.UnionType {
    def this(types: js.Array[typings.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/types", "UnknownType")
  @js.native
  class UnknownType protected ()
    extends typings.typedoc.typesUnknownMod.UnknownType {
    def this(name: String) = this()
  }
}
