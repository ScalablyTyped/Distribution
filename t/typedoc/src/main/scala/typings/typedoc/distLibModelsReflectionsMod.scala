package typings.typedoc

import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.CallSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ConstructorSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.GetSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.IndexSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.SetSignature
import typings.typedoc.distLibModelsReflectionsTypeParameterMod.VarianceModifier
import typings.typedoc.distLibModelsTypesMod.SomeType
import typings.typedoc.typedocStrings.`in out`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibModelsReflectionsMod {
  
  @JSImport("typedoc/dist/lib/models/reflections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/models/reflections", "ContainerReflection")
  @js.native
  open class ContainerReflection protected ()
    extends typings.typedoc.distLibModelsReflectionsContainerMod.ContainerReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ConversionFlags")
  @js.native
  object ConversionFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibModelsReflectionsDeclarationMod.ConversionFlags & Double] = js.native
    
    /* 0 */ val None: typings.typedoc.distLibModelsReflectionsDeclarationMod.ConversionFlags.None & Double = js.native
    
    /* 1 */ val VariableSource: typings.typedoc.distLibModelsReflectionsDeclarationMod.ConversionFlags.VariableSource & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "DeclarationReflection")
  @js.native
  open class DeclarationReflection protected ()
    extends typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ParameterReflection")
  @js.native
  open class ParameterReflection protected ()
    extends typings.typedoc.distLibModelsReflectionsParameterMod.ParameterReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ProjectReflection")
  @js.native
  open class ProjectReflection protected ()
    extends typings.typedoc.distLibModelsReflectionsProjectMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReferenceReflection")
  @js.native
  open class ReferenceReflection protected ()
    extends typings.typedoc.distLibModelsReflectionsReferenceMod.ReferenceReflection {
    /**
      * Creates a reference reflection. Should only be used within the factory function.
      * @param name
      * @param state
      * @param parent
      *
      * @internal
      */
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_target'] */ js.Any
    ) = this()
    def this(
      name: String,
      state: /* import warning: importer.ImportType#apply Failed type conversion: typedoc.typedoc/dist/lib/models/reflections/reference.ReferenceReflection['_target'] */ js.Any,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("typedoc/dist/lib/models/reflections", "Reflection")
  @js.native
  open class Reflection protected ()
    extends typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(
      name: String,
      kind: ReflectionKind,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlag")
  @js.native
  object ReflectionFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag & Double] = js.native
    
    /* 512 */ val Abstract: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Abstract & Double = js.native
    
    /* 1024 */ val Const: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Const & Double = js.native
    
    /* 128 */ val DefaultValue: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.DefaultValue & Double = js.native
    
    /* 16 */ val ExportAssignment: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.ExportAssignment & Double = js.native
    
    /* 32 */ val External: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.External & Double = js.native
    
    /* 2048 */ val Let: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Let & Double = js.native
    
    /* 0 */ val None: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.None & Double = js.native
    
    /* 64 */ val Optional: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Optional & Double = js.native
    
    /* 1 */ val Private: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Private & Double = js.native
    
    /* 2 */ val Protected: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Protected & Double = js.native
    
    /* 4 */ val Public: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Public & Double = js.native
    
    /* 4096 */ val Readonly: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Readonly & Double = js.native
    
    /* 256 */ val Rest: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Rest & Double = js.native
    
    /* 8 */ val Static: typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlag.Static & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlags")
  @js.native
  open class ReflectionFlags ()
    extends typings.typedoc.distLibModelsReflectionsAbstractMod.ReflectionFlags
  /* static members */
  object ReflectionFlags {
    
    @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlags.serializedFlags")
    @js.native
    def serializedFlags: Any = js.native
    inline def serializedFlags_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serializedFlags")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionKind")
  @js.native
  object ReflectionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind & Double] = js.native
    
    /* 262144 */ val Accessor: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Accessor & Double = js.native
    
    val All: Double = js.native
    
    /* 4096 */ val CallSignature: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.CallSignature & Double = js.native
    
    /* 128 */ val Class: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Class & Double = js.native
    
    val ClassMember: Double = js.native
    
    val ClassOrInterface: Double = js.native
    
    /* 512 */ val Constructor: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Constructor & Double = js.native
    
    /* 16384 */ val ConstructorSignature: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ConstructorSignature & Double = js.native
    
    /** @internal */
    val ContainsCallSignatures: Double = js.native
    
    /* 8 */ val Enum: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Enum & Double = js.native
    
    /* 16 */ val EnumMember: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.EnumMember & Double = js.native
    
    val ExportContainer: Double = js.native
    
    /* 64 */ val Function: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Function & Double = js.native
    
    val FunctionOrMethod: Double = js.native
    
    /* 524288 */ val GetSignature: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.GetSignature & Double = js.native
    
    /* 8192 */ val IndexSignature: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.IndexSignature & Double = js.native
    
    /** @internal */
    val Inheritable: Double = js.native
    
    /* 256 */ val Interface: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Interface & Double = js.native
    
    /* 2048 */ val Method: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Method & Double = js.native
    
    /* 2 */ val Module: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Module & Double = js.native
    
    /* 4 */ val Namespace: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Namespace & Double = js.native
    
    /* 2097152 */ val ObjectLiteral: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ObjectLiteral & Double = js.native
    
    /* 32768 */ val Parameter: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Parameter & Double = js.native
    
    /* 1 */ val Project: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Project & Double = js.native
    
    /* 1024 */ val Property: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Property & Double = js.native
    
    /* 8388608 */ val Reference: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Reference & Double = js.native
    
    /* 1048576 */ val SetSignature: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.SetSignature & Double = js.native
    
    /**
      * Note: This does not include Class/Interface, even though they technically could contain index signatures
      * @internal
      */
    val SignatureContainer: Double = js.native
    
    val SomeExport: Double = js.native
    
    val SomeMember: Double = js.native
    
    val SomeModule: Double = js.native
    
    val SomeSignature: Double = js.native
    
    val SomeType: Double = js.native
    
    val SomeValue: Double = js.native
    
    /* 4194304 */ val TypeAlias: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.TypeAlias & Double = js.native
    
    /* 65536 */ val TypeLiteral: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.TypeLiteral & Double = js.native
    
    /* 131072 */ val TypeParameter: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.TypeParameter & Double = js.native
    
    /* 32 */ val Variable: typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.Variable & Double = js.native
    
    val VariableOrProperty: Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "SignatureReflection")
  @js.native
  open class SignatureReflection protected ()
    extends typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection {
    def this(
      name: String,
      kind: CallSignature,
      parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
    def this(
      name: String,
      kind: ConstructorSignature,
      parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
    def this(
      name: String,
      kind: GetSignature,
      parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
    def this(
      name: String,
      kind: IndexSignature,
      parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
    def this(
      name: String,
      kind: SetSignature,
      parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "TraverseProperty")
  @js.native
  object TraverseProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty & Double] = js.native
    
    /* 0 */ val Children: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Children & Double = js.native
    
    /* 6 */ val GetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.GetSignature & Double = js.native
    
    /* 5 */ val IndexSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.IndexSignature & Double = js.native
    
    /* 1 */ val Parameters: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Parameters & Double = js.native
    
    /* 7 */ val SetSignature: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.SetSignature & Double = js.native
    
    /* 4 */ val Signatures: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.Signatures & Double = js.native
    
    /* 2 */ val TypeLiteral: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeLiteral & Double = js.native
    
    /* 3 */ val TypeParameter: typings.typedoc.distLibModelsReflectionsAbstractMod.TraverseProperty.TypeParameter & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "TypeParameterReflection")
  @js.native
  open class TypeParameterReflection protected ()
    extends typings.typedoc.distLibModelsReflectionsTypeParameterMod.TypeParameterReflection {
    def this(
      name: String,
      constraint: Unit,
      defaultType: Unit,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: SomeType,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: Unit,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: SomeType,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: Unit,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: SomeType,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: Unit,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: SomeType,
      parent: typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
  }
  
  object VarianceModifier {
    
    @JSImport("typedoc/dist/lib/models/reflections", "VarianceModifier.in")
    @js.native
    val in: typings.typedoc.typedocStrings.in = js.native
    
    @JSImport("typedoc/dist/lib/models/reflections", "VarianceModifier.inOut")
    @js.native
    val inOut: `in out` = js.native
    
    @JSImport("typedoc/dist/lib/models/reflections", "VarianceModifier.out")
    @js.native
    val out: typings.typedoc.typedocStrings.out = js.native
  }
  
  inline def splitUnquotedString(input: String, delimiter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitUnquotedString")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
