package typings.typedoc

import typings.typedoc.kindMod.ReflectionKind
import typings.typedoc.kindMod.ReflectionKind.CallSignature
import typings.typedoc.kindMod.ReflectionKind.ConstructorSignature
import typings.typedoc.kindMod.ReflectionKind.GetSignature
import typings.typedoc.kindMod.ReflectionKind.IndexSignature
import typings.typedoc.kindMod.ReflectionKind.SetSignature
import typings.typedoc.modelsTypesMod.SomeType
import typings.typedoc.typeParameterMod.VarianceModifier
import typings.typedoc.typedocStrings.`in out`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsReflectionsMod {
  
  @JSImport("typedoc/dist/lib/models/reflections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/models/reflections", "ContainerReflection")
  @js.native
  open class ContainerReflection protected ()
    extends typings.typedoc.containerMod.ContainerReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ConversionFlags")
  @js.native
  object ConversionFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.declarationMod.ConversionFlags & Double] = js.native
    
    /* 0 */ val None: typings.typedoc.declarationMod.ConversionFlags.None & Double = js.native
    
    /* 1 */ val VariableSource: typings.typedoc.declarationMod.ConversionFlags.VariableSource & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "DeclarationReflection")
  @js.native
  open class DeclarationReflection protected ()
    extends typings.typedoc.declarationMod.DeclarationReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ParameterReflection")
  @js.native
  open class ParameterReflection protected ()
    extends typings.typedoc.parameterMod.ParameterReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ProjectReflection")
  @js.native
  open class ProjectReflection protected ()
    extends typings.typedoc.projectMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReferenceReflection")
  @js.native
  open class ReferenceReflection protected ()
    extends typings.typedoc.referenceMod.ReferenceReflection {
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
      parent: typings.typedoc.abstractMod.Reflection
    ) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "Reflection")
  @js.native
  abstract class Reflection protected ()
    extends typings.typedoc.abstractMod.Reflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlag")
  @js.native
  object ReflectionFlag extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.abstractMod.ReflectionFlag & Double] = js.native
    
    /* 512 */ val Abstract: typings.typedoc.abstractMod.ReflectionFlag.Abstract & Double = js.native
    
    /* 1024 */ val Const: typings.typedoc.abstractMod.ReflectionFlag.Const & Double = js.native
    
    /* 128 */ val DefaultValue: typings.typedoc.abstractMod.ReflectionFlag.DefaultValue & Double = js.native
    
    /* 16 */ val ExportAssignment: typings.typedoc.abstractMod.ReflectionFlag.ExportAssignment & Double = js.native
    
    /* 32 */ val External: typings.typedoc.abstractMod.ReflectionFlag.External & Double = js.native
    
    /* 2048 */ val Let: typings.typedoc.abstractMod.ReflectionFlag.Let & Double = js.native
    
    /* 0 */ val None: typings.typedoc.abstractMod.ReflectionFlag.None & Double = js.native
    
    /* 64 */ val Optional: typings.typedoc.abstractMod.ReflectionFlag.Optional & Double = js.native
    
    /* 1 */ val Private: typings.typedoc.abstractMod.ReflectionFlag.Private & Double = js.native
    
    /* 2 */ val Protected: typings.typedoc.abstractMod.ReflectionFlag.Protected & Double = js.native
    
    /* 4 */ val Public: typings.typedoc.abstractMod.ReflectionFlag.Public & Double = js.native
    
    /* 4096 */ val Readonly: typings.typedoc.abstractMod.ReflectionFlag.Readonly & Double = js.native
    
    /* 256 */ val Rest: typings.typedoc.abstractMod.ReflectionFlag.Rest & Double = js.native
    
    /* 8 */ val Static: typings.typedoc.abstractMod.ReflectionFlag.Static & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlags")
  @js.native
  open class ReflectionFlags ()
    extends typings.typedoc.abstractMod.ReflectionFlags
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
    def apply(value: Double): js.UndefOr[typings.typedoc.kindMod.ReflectionKind & Double] = js.native
    
    /* 262144 */ val Accessor: typings.typedoc.kindMod.ReflectionKind.Accessor & Double = js.native
    
    val All: Double = js.native
    
    /* 4096 */ val CallSignature: typings.typedoc.kindMod.ReflectionKind.CallSignature & Double = js.native
    
    /* 128 */ val Class: typings.typedoc.kindMod.ReflectionKind.Class & Double = js.native
    
    val ClassMember: Double = js.native
    
    val ClassOrInterface: Double = js.native
    
    /* 512 */ val Constructor: typings.typedoc.kindMod.ReflectionKind.Constructor & Double = js.native
    
    /* 16384 */ val ConstructorSignature: typings.typedoc.kindMod.ReflectionKind.ConstructorSignature & Double = js.native
    
    /** @internal */
    val ContainsCallSignatures: Double = js.native
    
    /* 8 */ val Enum: typings.typedoc.kindMod.ReflectionKind.Enum & Double = js.native
    
    /* 16 */ val EnumMember: typings.typedoc.kindMod.ReflectionKind.EnumMember & Double = js.native
    
    val ExportContainer: Double = js.native
    
    /* 64 */ val Function: typings.typedoc.kindMod.ReflectionKind.Function & Double = js.native
    
    val FunctionOrMethod: Double = js.native
    
    /* 524288 */ val GetSignature: typings.typedoc.kindMod.ReflectionKind.GetSignature & Double = js.native
    
    /* 8192 */ val IndexSignature: typings.typedoc.kindMod.ReflectionKind.IndexSignature & Double = js.native
    
    /** @internal */
    val Inheritable: Double = js.native
    
    /* 256 */ val Interface: typings.typedoc.kindMod.ReflectionKind.Interface & Double = js.native
    
    /* 2048 */ val Method: typings.typedoc.kindMod.ReflectionKind.Method & Double = js.native
    
    /* 2 */ val Module: typings.typedoc.kindMod.ReflectionKind.Module & Double = js.native
    
    /* 4 */ val Namespace: typings.typedoc.kindMod.ReflectionKind.Namespace & Double = js.native
    
    /* 2097152 */ val ObjectLiteral: typings.typedoc.kindMod.ReflectionKind.ObjectLiteral & Double = js.native
    
    /* 32768 */ val Parameter: typings.typedoc.kindMod.ReflectionKind.Parameter & Double = js.native
    
    /* 1 */ val Project: typings.typedoc.kindMod.ReflectionKind.Project & Double = js.native
    
    /* 1024 */ val Property: typings.typedoc.kindMod.ReflectionKind.Property & Double = js.native
    
    /* 8388608 */ val Reference: typings.typedoc.kindMod.ReflectionKind.Reference & Double = js.native
    
    /* 1048576 */ val SetSignature: typings.typedoc.kindMod.ReflectionKind.SetSignature & Double = js.native
    
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
    
    /* 4194304 */ val TypeAlias: typings.typedoc.kindMod.ReflectionKind.TypeAlias & Double = js.native
    
    /* 65536 */ val TypeLiteral: typings.typedoc.kindMod.ReflectionKind.TypeLiteral & Double = js.native
    
    /* 131072 */ val TypeParameter: typings.typedoc.kindMod.ReflectionKind.TypeParameter & Double = js.native
    
    /* 32 */ val Variable: typings.typedoc.kindMod.ReflectionKind.Variable & Double = js.native
    
    val VariableOrProperty: Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "SignatureReflection")
  @js.native
  open class SignatureReflection protected ()
    extends typings.typedoc.reflectionsSignatureMod.SignatureReflection {
    def this(name: String, kind: CallSignature, parent: typings.typedoc.declarationMod.DeclarationReflection) = this()
    def this(
      name: String,
      kind: ConstructorSignature,
      parent: typings.typedoc.declarationMod.DeclarationReflection
    ) = this()
    def this(name: String, kind: GetSignature, parent: typings.typedoc.declarationMod.DeclarationReflection) = this()
    def this(name: String, kind: IndexSignature, parent: typings.typedoc.declarationMod.DeclarationReflection) = this()
    def this(name: String, kind: SetSignature, parent: typings.typedoc.declarationMod.DeclarationReflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "TraverseProperty")
  @js.native
  object TraverseProperty extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.abstractMod.TraverseProperty & Double] = js.native
    
    /* 0 */ val Children: typings.typedoc.abstractMod.TraverseProperty.Children & Double = js.native
    
    /* 6 */ val GetSignature: typings.typedoc.abstractMod.TraverseProperty.GetSignature & Double = js.native
    
    /* 5 */ val IndexSignature: typings.typedoc.abstractMod.TraverseProperty.IndexSignature & Double = js.native
    
    /* 1 */ val Parameters: typings.typedoc.abstractMod.TraverseProperty.Parameters & Double = js.native
    
    /* 7 */ val SetSignature: typings.typedoc.abstractMod.TraverseProperty.SetSignature & Double = js.native
    
    /* 4 */ val Signatures: typings.typedoc.abstractMod.TraverseProperty.Signatures & Double = js.native
    
    /* 2 */ val TypeLiteral: typings.typedoc.abstractMod.TraverseProperty.TypeLiteral & Double = js.native
    
    /* 3 */ val TypeParameter: typings.typedoc.abstractMod.TraverseProperty.TypeParameter & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "TypeParameterReflection")
  @js.native
  open class TypeParameterReflection protected ()
    extends typings.typedoc.typeParameterMod.TypeParameterReflection {
    def this(name: String, constraint: Unit, defaultType: Unit, parent: typings.typedoc.abstractMod.Reflection) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: SomeType,
      parent: typings.typedoc.abstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: Unit,
      parent: typings.typedoc.abstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: SomeType,
      parent: typings.typedoc.abstractMod.Reflection
    ) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: Unit,
      parent: typings.typedoc.abstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: Unit,
      defaultType: SomeType,
      parent: typings.typedoc.abstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: Unit,
      parent: typings.typedoc.abstractMod.Reflection,
      varianceModifier: VarianceModifier
    ) = this()
    def this(
      name: String,
      constraint: SomeType,
      defaultType: SomeType,
      parent: typings.typedoc.abstractMod.Reflection,
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
