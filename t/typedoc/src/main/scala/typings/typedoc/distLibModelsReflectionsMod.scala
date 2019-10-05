package typings.typedoc

import typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind
import typings.typedoc.distLibModelsTypesMod.TypeParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections", JSImport.Namespace)
@js.native
object distLibModelsReflectionsMod extends js.Object {
  @js.native
  class ContainerReflection ()
    extends typings.typedoc.distLibModelsReflectionsContainerMod.ContainerReflection
  
  @js.native
  class DeclarationReflection ()
    extends typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
  
  @js.native
  class ParameterReflection ()
    extends typings.typedoc.distLibModelsReflectionsParameterMod.ParameterReflection
  
  @js.native
  class ProjectReflection protected ()
    extends typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @js.native
  abstract class Reflection protected ()
    extends typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @js.native
  class SignatureReflection ()
    extends typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection
  
  @js.native
  class TypeParameterReflection protected ()
    extends typings.typedoc.distLibModelsReflectionsTypeDashParameterMod.TypeParameterReflection {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection) = this()
  }
  
  @js.native
  object ReflectionFlag extends js.Object {
    /* 2048 */ val Abstract: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Abstract with Double = js.native
    /* 4096 */ val Const: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Const with Double = js.native
    /* 1024 */ val ConstructorProperty: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.ConstructorProperty with Double = js.native
    /* 256 */ val DefaultValue: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.DefaultValue with Double = js.native
    /* 32 */ val ExportAssignment: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.ExportAssignment with Double = js.native
    /* 16 */ val Exported: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Exported with Double = js.native
    /* 64 */ val External: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.External with Double = js.native
    /* 8192 */ val Let: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Let with Double = js.native
    /* 0 */ val None: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.None with Double = js.native
    /* 128 */ val Optional: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Optional with Double = js.native
    /* 1 */ val Private: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Private with Double = js.native
    /* 2 */ val Protected: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Protected with Double = js.native
    /* 4 */ val Public: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Public with Double = js.native
    /* 512 */ val Rest: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Rest with Double = js.native
    /* 8 */ val Static: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Static with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag with Double] = js.native
  }
  
  @js.native
  object ReflectionKind extends js.Object {
    /* 262144 */ val Accessor: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Accessor with Double = js.native
    /* 4096 */ val CallSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.CallSignature with Double = js.native
    /* 128 */ val Class: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Class with Double = js.native
    /* 384 */ val ClassOrInterface: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.ClassOrInterface with Double = js.native
    /* 512 */ val Constructor: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Constructor with Double = js.native
    /* 16384 */ val ConstructorSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.ConstructorSignature with Double = js.native
    /* 4 */ val Enum: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Enum with Double = js.native
    /* 16 */ val EnumMember: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.EnumMember with Double = js.native
    /* 8388608 */ val Event: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Event with Double = js.native
    /* 1 */ val ExternalModule: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.ExternalModule with Double = js.native
    /* 64 */ val Function: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Function with Double = js.native
    /* 2112 */ val FunctionOrMethod: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.FunctionOrMethod with Double = js.native
    /* 524288 */ val GetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.GetSignature with Double = js.native
    /* 0 */ val Global: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Global with Double = js.native
    /* 8192 */ val IndexSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.IndexSignature with Double = js.native
    /* 256 */ val Interface: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Interface with Double = js.native
    /* 2048 */ val Method: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Method with Double = js.native
    /* 2 */ val Module: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Module with Double = js.native
    /* 2097152 */ val ObjectLiteral: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.ObjectLiteral with Double = js.native
    /* 32768 */ val Parameter: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Parameter with Double = js.native
    /* 1024 */ val Property: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Property with Double = js.native
    /* 1048576 */ val SetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SetSignature with Double = js.native
    /* 3 */ val SomeModule: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SomeModule with Double = js.native
    /* 1601536 */ val SomeSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SomeSignature with Double = js.native
    /* 4391168 */ val SomeType: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SomeType with Double = js.native
    /* 2097248 */ val SomeValue: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.SomeValue with Double = js.native
    /* 4194304 */ val TypeAlias: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.TypeAlias with Double = js.native
    /* 65536 */ val TypeLiteral: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.TypeLiteral with Double = js.native
    /* 131072 */ val TypeParameter: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.TypeParameter with Double = js.native
    /* 32 */ val Variable: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.Variable with Double = js.native
    /* 1056 */ val VariableOrProperty: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind.VariableOrProperty with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionKind with Double] = js.native
  }
  
  @js.native
  object TraverseProperty extends js.Object {
    /* 0 */ val Children: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Children with Double = js.native
    /* 6 */ val GetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.GetSignature with Double = js.native
    /* 5 */ val IndexSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.IndexSignature with Double = js.native
    /* 1 */ val Parameters: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Parameters with Double = js.native
    /* 7 */ val SetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.SetSignature with Double = js.native
    /* 4 */ val Signatures: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Signatures with Double = js.native
    /* 2 */ val TypeLiteral: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeLiteral with Double = js.native
    /* 3 */ val TypeParameter: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeParameter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty with Double] = js.native
  }
  
}

