package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.typedocStrings.keyof
import typings.typedoc.typedocStrings.readonly
import typings.typedoc.typedocStrings.unique
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMod {
  
  @JSImport("typedoc/dist/lib/models", "ArrayType")
  @js.native
  class ArrayType protected ()
    extends typings.typedoc.modelsTypesMod.ArrayType {
    def this(elementType: typings.typedoc.modelsTypesMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "Comment")
  @js.native
  class Comment ()
    extends typings.typedoc.commentsMod.Comment {
    def this(shortText: String) = this()
    def this(shortText: js.UndefOr[scala.Nothing], text: String) = this()
    def this(shortText: String, text: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "CommentTag")
  @js.native
  class CommentTag protected ()
    extends typings.typedoc.commentsMod.CommentTag {
    def this(tagName: String) = this()
    def this(tagName: String, paramName: String) = this()
    def this(tagName: String, paramName: js.UndefOr[scala.Nothing], text: String) = this()
    def this(tagName: String, paramName: String, text: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ConditionalType")
  @js.native
  class ConditionalType protected ()
    extends typings.typedoc.modelsTypesMod.ConditionalType {
    def this(
      checkType: typings.typedoc.typesAbstractMod.Type,
      extendsType: typings.typedoc.typesAbstractMod.Type,
      trueType: typings.typedoc.typesAbstractMod.Type,
      falseType: typings.typedoc.typesAbstractMod.Type
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ContainerReflection")
  @js.native
  class ContainerReflection protected ()
    extends typings.typedoc.reflectionsMod.ContainerReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "DeclarationReflection")
  @js.native
  class DeclarationReflection protected ()
    extends typings.typedoc.reflectionsMod.DeclarationReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "IndexedAccessType")
  @js.native
  class IndexedAccessType protected ()
    extends typings.typedoc.modelsTypesMod.IndexedAccessType {
    def this(objectType: typings.typedoc.modelsTypesMod.Type, indexType: typings.typedoc.modelsTypesMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "InferredType")
  @js.native
  class InferredType protected ()
    extends typings.typedoc.modelsTypesMod.InferredType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "IntersectionType")
  @js.native
  class IntersectionType protected ()
    extends typings.typedoc.modelsTypesMod.IntersectionType {
    def this(types: js.Array[typings.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "IntrinsicType")
  @js.native
  class IntrinsicType protected ()
    extends typings.typedoc.modelsTypesMod.IntrinsicType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "NamedTupleMember")
  @js.native
  class NamedTupleMember protected ()
    extends typings.typedoc.modelsTypesMod.NamedTupleMember {
    def this(name: String, isOptional: Boolean, element: typings.typedoc.typesAbstractMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ParameterReflection")
  @js.native
  class ParameterReflection protected ()
    extends typings.typedoc.reflectionsMod.ParameterReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "PredicateType")
  @js.native
  class PredicateType protected ()
    extends typings.typedoc.modelsTypesMod.PredicateType {
    def this(name: String, asserts: Boolean) = this()
    def this(name: String, asserts: Boolean, targetType: typings.typedoc.typesAbstractMod.Type) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ProjectReflection")
  @js.native
  class ProjectReflection protected ()
    extends typings.typedoc.reflectionsMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "QueryType")
  @js.native
  class QueryType protected ()
    extends typings.typedoc.modelsTypesMod.QueryType {
    def this(reference: typings.typedoc.modelsTypesReferenceMod.ReferenceType) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReferenceReflection")
  @js.native
  class ReferenceReflection protected ()
    extends typings.typedoc.reflectionsMod.ReferenceReflection {
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_state'] */ js.Any
    ) = this()
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_state'] */ js.Any,
      parent: typings.typedoc.abstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReferenceType")
  @js.native
  class ReferenceType protected ()
    extends typings.typedoc.modelsTypesMod.ReferenceType {
    def this(name: String, symbolFQN: String) = this()
    def this(name: String, symbolFQN: String, reflection: typings.typedoc.abstractMod.Reflection) = this()
  }
  /* static members */
  object ReferenceType {
    
    @JSImport("typedoc/dist/lib/models", "ReferenceType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/models", "ReferenceType.SYMBOL_FQN_RESOLVED")
    @js.native
    def SYMBOL_FQN_RESOLVED: String = js.native
    @scala.inline
    def SYMBOL_FQN_RESOLVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVED")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/models", "ReferenceType.SYMBOL_FQN_RESOLVE_BY_NAME")
    @js.native
    def SYMBOL_FQN_RESOLVE_BY_NAME: String = js.native
    @scala.inline
    def SYMBOL_FQN_RESOLVE_BY_NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYMBOL_FQN_RESOLVE_BY_NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/models", "Reflection")
  @js.native
  abstract class Reflection protected ()
    extends typings.typedoc.reflectionsMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionCategory")
  @js.native
  class ReflectionCategory protected ()
    extends typings.typedoc.reflectionCategoryMod.ReflectionCategory {
    def this(title: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionFlag")
  @js.native
  object ReflectionFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.abstractMod.ReflectionFlag with Double] = js.native
    
    /* 2048 */ val Abstract: typings.typedoc.abstractMod.ReflectionFlag.Abstract with Double = js.native
    
    /* 4096 */ val Const: typings.typedoc.abstractMod.ReflectionFlag.Const with Double = js.native
    
    /* 1024 */ val ConstructorProperty: typings.typedoc.abstractMod.ReflectionFlag.ConstructorProperty with Double = js.native
    
    /* 256 */ val DefaultValue: typings.typedoc.abstractMod.ReflectionFlag.DefaultValue with Double = js.native
    
    /* 32 */ val ExportAssignment: typings.typedoc.abstractMod.ReflectionFlag.ExportAssignment with Double = js.native
    
    /* 16 */ val Exported: typings.typedoc.abstractMod.ReflectionFlag.Exported with Double = js.native
    
    /* 64 */ val External: typings.typedoc.abstractMod.ReflectionFlag.External with Double = js.native
    
    /* 8192 */ val Let: typings.typedoc.abstractMod.ReflectionFlag.Let with Double = js.native
    
    /* 0 */ val None: typings.typedoc.abstractMod.ReflectionFlag.None with Double = js.native
    
    /* 128 */ val Optional: typings.typedoc.abstractMod.ReflectionFlag.Optional with Double = js.native
    
    /* 1 */ val Private: typings.typedoc.abstractMod.ReflectionFlag.Private with Double = js.native
    
    /* 2 */ val Protected: typings.typedoc.abstractMod.ReflectionFlag.Protected with Double = js.native
    
    /* 4 */ val Public: typings.typedoc.abstractMod.ReflectionFlag.Public with Double = js.native
    
    /* 16384 */ val Readonly: typings.typedoc.abstractMod.ReflectionFlag.Readonly with Double = js.native
    
    /* 512 */ val Rest: typings.typedoc.abstractMod.ReflectionFlag.Rest with Double = js.native
    
    /* 8 */ val Static: typings.typedoc.abstractMod.ReflectionFlag.Static with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionFlags")
  @js.native
  class ReflectionFlags ()
    extends typings.typedoc.reflectionsMod.ReflectionFlags
  
  @JSImport("typedoc/dist/lib/models", "ReflectionGroup")
  @js.native
  class ReflectionGroup protected ()
    extends typings.typedoc.reflectionGroupMod.ReflectionGroup {
    def this(title: String, kind: ReflectionKind) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionKind")
  @js.native
  object ReflectionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.abstractMod.ReflectionKind with Double] = js.native
    
    /* 262144 */ val Accessor: typings.typedoc.abstractMod.ReflectionKind.Accessor with Double = js.native
    
    /* 4096 */ val CallSignature: typings.typedoc.abstractMod.ReflectionKind.CallSignature with Double = js.native
    
    /* 128 */ val Class: typings.typedoc.abstractMod.ReflectionKind.Class with Double = js.native
    
    /* 8654336 */ val ClassMember: typings.typedoc.abstractMod.ReflectionKind.ClassMember with Double = js.native
    
    /* 384 */ val ClassOrInterface: typings.typedoc.abstractMod.ReflectionKind.ClassOrInterface with Double = js.native
    
    /* 512 */ val Constructor: typings.typedoc.abstractMod.ReflectionKind.Constructor with Double = js.native
    
    /* 16384 */ val ConstructorSignature: typings.typedoc.abstractMod.ReflectionKind.ConstructorSignature with Double = js.native
    
    /* 4 */ val Enum: typings.typedoc.abstractMod.ReflectionKind.Enum with Double = js.native
    
    /* 16 */ val EnumMember: typings.typedoc.abstractMod.ReflectionKind.EnumMember with Double = js.native
    
    /* 8388608 */ val Event: typings.typedoc.abstractMod.ReflectionKind.Event with Double = js.native
    
    /* 64 */ val Function: typings.typedoc.abstractMod.ReflectionKind.Function with Double = js.native
    
    /* 2112 */ val FunctionOrMethod: typings.typedoc.abstractMod.ReflectionKind.FunctionOrMethod with Double = js.native
    
    /* 524288 */ val GetSignature: typings.typedoc.abstractMod.ReflectionKind.GetSignature with Double = js.native
    
    /* 0 */ val Global: typings.typedoc.abstractMod.ReflectionKind.Global with Double = js.native
    
    /* 8192 */ val IndexSignature: typings.typedoc.abstractMod.ReflectionKind.IndexSignature with Double = js.native
    
    /* 256 */ val Interface: typings.typedoc.abstractMod.ReflectionKind.Interface with Double = js.native
    
    /* 2048 */ val Method: typings.typedoc.abstractMod.ReflectionKind.Method with Double = js.native
    
    /* 1 */ val Module: typings.typedoc.abstractMod.ReflectionKind.Module with Double = js.native
    
    /* 2 */ val Namespace: typings.typedoc.abstractMod.ReflectionKind.Namespace with Double = js.native
    
    /* 2097152 */ val ObjectLiteral: typings.typedoc.abstractMod.ReflectionKind.ObjectLiteral with Double = js.native
    
    /* 32768 */ val Parameter: typings.typedoc.abstractMod.ReflectionKind.Parameter with Double = js.native
    
    /* 1024 */ val Property: typings.typedoc.abstractMod.ReflectionKind.Property with Double = js.native
    
    /* 16777216 */ val Reference: typings.typedoc.abstractMod.ReflectionKind.Reference with Double = js.native
    
    /* 1048576 */ val SetSignature: typings.typedoc.abstractMod.ReflectionKind.SetSignature with Double = js.native
    
    /* 3 */ val SomeModule: typings.typedoc.abstractMod.ReflectionKind.SomeModule with Double = js.native
    
    /* 1601536 */ val SomeSignature: typings.typedoc.abstractMod.ReflectionKind.SomeSignature with Double = js.native
    
    /* 4391168 */ val SomeType: typings.typedoc.abstractMod.ReflectionKind.SomeType with Double = js.native
    
    /* 2097248 */ val SomeValue: typings.typedoc.abstractMod.ReflectionKind.SomeValue with Double = js.native
    
    /* 4194304 */ val TypeAlias: typings.typedoc.abstractMod.ReflectionKind.TypeAlias with Double = js.native
    
    /* 65536 */ val TypeLiteral: typings.typedoc.abstractMod.ReflectionKind.TypeLiteral with Double = js.native
    
    /* 131072 */ val TypeParameter: typings.typedoc.abstractMod.ReflectionKind.TypeParameter with Double = js.native
    
    /* 32 */ val Variable: typings.typedoc.abstractMod.ReflectionKind.Variable with Double = js.native
    
    /* 1056 */ val VariableOrProperty: typings.typedoc.abstractMod.ReflectionKind.VariableOrProperty with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models", "ReflectionType")
  @js.native
  class ReflectionType protected ()
    extends typings.typedoc.modelsTypesMod.ReflectionType {
    def this(declaration: typings.typedoc.reflectionsDeclarationMod.DeclarationReflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "SignatureReflection")
  @js.native
  class SignatureReflection protected ()
    extends typings.typedoc.reflectionsMod.SignatureReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "SourceDirectory")
  @js.native
  class SourceDirectory ()
    extends typings.typedoc.sourcesMod.SourceDirectory {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], parent: typings.typedoc.directoryMod.SourceDirectory) = this()
    def this(name: String, parent: typings.typedoc.directoryMod.SourceDirectory) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "SourceFile")
  @js.native
  class SourceFile protected ()
    extends typings.typedoc.sourcesMod.SourceFile {
    def this(fullFileName: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "StringLiteralType")
  @js.native
  class StringLiteralType protected ()
    extends typings.typedoc.modelsTypesMod.StringLiteralType {
    def this(value: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "TraverseProperty")
  @js.native
  object TraverseProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.abstractMod.TraverseProperty with Double] = js.native
    
    /* 0 */ val Children: typings.typedoc.abstractMod.TraverseProperty.Children with Double = js.native
    
    /* 6 */ val GetSignature: typings.typedoc.abstractMod.TraverseProperty.GetSignature with Double = js.native
    
    /* 5 */ val IndexSignature: typings.typedoc.abstractMod.TraverseProperty.IndexSignature with Double = js.native
    
    /* 1 */ val Parameters: typings.typedoc.abstractMod.TraverseProperty.Parameters with Double = js.native
    
    /* 7 */ val SetSignature: typings.typedoc.abstractMod.TraverseProperty.SetSignature with Double = js.native
    
    /* 4 */ val Signatures: typings.typedoc.abstractMod.TraverseProperty.Signatures with Double = js.native
    
    /* 2 */ val TypeLiteral: typings.typedoc.abstractMod.TraverseProperty.TypeLiteral with Double = js.native
    
    /* 3 */ val TypeParameter: typings.typedoc.abstractMod.TraverseProperty.TypeParameter with Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models", "TupleType")
  @js.native
  class TupleType protected ()
    extends typings.typedoc.modelsTypesMod.TupleType {
    def this(elements: js.Array[typings.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "Type")
  @js.native
  abstract class Type ()
    extends typings.typedoc.modelsTypesMod.Type
  /* static members */
  object Type {
    
    @JSImport("typedoc/dist/lib/models", "Type.isTypeListEqual")
    @js.native
    def isTypeListEqual(
      a: js.Array[typings.typedoc.typesAbstractMod.Type],
      b: js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
    
    @JSImport("typedoc/dist/lib/models", "Type.isTypeListSimilar")
    @js.native
    def isTypeListSimilar(
      a: js.Array[typings.typedoc.typesAbstractMod.Type],
      b: js.Array[typings.typedoc.typesAbstractMod.Type]
    ): Boolean = js.native
  }
  
  @JSImport("typedoc/dist/lib/models", "TypeOperatorType")
  @js.native
  class TypeOperatorType protected ()
    extends typings.typedoc.modelsTypesMod.TypeOperatorType {
    def this(target: typings.typedoc.typesAbstractMod.Type, operator: keyof) = this()
    def this(target: typings.typedoc.typesAbstractMod.Type, operator: readonly) = this()
    def this(target: typings.typedoc.typesAbstractMod.Type, operator: unique) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "TypeParameterReflection")
  @js.native
  class TypeParameterReflection protected ()
    extends typings.typedoc.reflectionsMod.TypeParameterReflection {
    def this(`type`: typings.typedoc.modelsTypesMod.TypeParameterType) = this()
    def this(
      `type`: typings.typedoc.modelsTypesMod.TypeParameterType,
      parent: typings.typedoc.abstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "TypeParameterType")
  @js.native
  class TypeParameterType protected ()
    extends typings.typedoc.modelsTypesMod.TypeParameterType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "UnionType")
  @js.native
  class UnionType protected ()
    extends typings.typedoc.modelsTypesMod.UnionType {
    def this(types: js.Array[typings.typedoc.typesAbstractMod.Type]) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "UnknownType")
  @js.native
  class UnknownType protected ()
    extends typings.typedoc.modelsTypesMod.UnknownType {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models", "splitUnquotedString")
  @js.native
  def splitUnquotedString(input: String, delimiter: String): js.Array[String] = js.native
}
