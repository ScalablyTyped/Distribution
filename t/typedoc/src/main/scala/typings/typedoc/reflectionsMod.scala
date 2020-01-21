package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.modelsTypesMod.TypeParameterType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections", JSImport.Namespace)
@js.native
object reflectionsMod extends js.Object {
  @js.native
  class ContainerReflection ()
    extends typings.typedoc.containerMod.ContainerReflection
  
  @js.native
  class DeclarationReflection ()
    extends typings.typedoc.reflectionsDeclarationMod.DeclarationReflection
  
  @js.native
  class ParameterReflection ()
    extends typings.typedoc.reflectionsParameterMod.ParameterReflection
  
  @js.native
  class ProjectReflection protected ()
    extends typings.typedoc.projectMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @js.native
  abstract class Reflection protected ()
    extends typings.typedoc.abstractMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @js.native
  class SignatureReflection ()
    extends typings.typedoc.reflectionsSignatureMod.SignatureReflection
  
  @js.native
  class TypeParameterReflection protected ()
    extends typings.typedoc.reflectionsTypeParameterMod.TypeParameterReflection {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  def splitUnquotedString(input: String, delimiter: String): js.Array[String] = js.native
  @js.native
  object ReflectionFlag extends js.Object {
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
    /* 512 */ val Rest: typings.typedoc.abstractMod.ReflectionFlag.Rest with Double = js.native
    /* 8 */ val Static: typings.typedoc.abstractMod.ReflectionFlag.Static with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.abstractMod.ReflectionFlag with Double] = js.native
  }
  
  @js.native
  object ReflectionKind extends js.Object {
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
    /* 1 */ val ExternalModule: typings.typedoc.abstractMod.ReflectionKind.ExternalModule with Double = js.native
    /* 64 */ val Function: typings.typedoc.abstractMod.ReflectionKind.Function with Double = js.native
    /* 2112 */ val FunctionOrMethod: typings.typedoc.abstractMod.ReflectionKind.FunctionOrMethod with Double = js.native
    /* 524288 */ val GetSignature: typings.typedoc.abstractMod.ReflectionKind.GetSignature with Double = js.native
    /* 0 */ val Global: typings.typedoc.abstractMod.ReflectionKind.Global with Double = js.native
    /* 8192 */ val IndexSignature: typings.typedoc.abstractMod.ReflectionKind.IndexSignature with Double = js.native
    /* 256 */ val Interface: typings.typedoc.abstractMod.ReflectionKind.Interface with Double = js.native
    /* 2048 */ val Method: typings.typedoc.abstractMod.ReflectionKind.Method with Double = js.native
    /* 2 */ val Module: typings.typedoc.abstractMod.ReflectionKind.Module with Double = js.native
    /* 2097152 */ val ObjectLiteral: typings.typedoc.abstractMod.ReflectionKind.ObjectLiteral with Double = js.native
    /* 32768 */ val Parameter: typings.typedoc.abstractMod.ReflectionKind.Parameter with Double = js.native
    /* 1024 */ val Property: typings.typedoc.abstractMod.ReflectionKind.Property with Double = js.native
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
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.abstractMod.ReflectionKind with Double] = js.native
  }
  
  @js.native
  object TraverseProperty extends js.Object {
    /* 0 */ val Children: typings.typedoc.abstractMod.TraverseProperty.Children with Double = js.native
    /* 6 */ val GetSignature: typings.typedoc.abstractMod.TraverseProperty.GetSignature with Double = js.native
    /* 5 */ val IndexSignature: typings.typedoc.abstractMod.TraverseProperty.IndexSignature with Double = js.native
    /* 1 */ val Parameters: typings.typedoc.abstractMod.TraverseProperty.Parameters with Double = js.native
    /* 7 */ val SetSignature: typings.typedoc.abstractMod.TraverseProperty.SetSignature with Double = js.native
    /* 4 */ val Signatures: typings.typedoc.abstractMod.TraverseProperty.Signatures with Double = js.native
    /* 2 */ val TypeLiteral: typings.typedoc.abstractMod.TraverseProperty.TypeLiteral with Double = js.native
    /* 3 */ val TypeParameter: typings.typedoc.abstractMod.TraverseProperty.TypeParameter with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.abstractMod.TraverseProperty with Double] = js.native
  }
  
}

