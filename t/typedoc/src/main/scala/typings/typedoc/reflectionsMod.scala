package typings.typedoc

import typings.typedoc.abstractMod.ReflectionKind
import typings.typedoc.modelsTypesMod.TypeParameterType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionsMod {
  
  @JSImport("typedoc/dist/lib/models/reflections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/models/reflections", "ContainerReflection")
  @js.native
  class ContainerReflection protected ()
    extends typings.typedoc.containerMod.ContainerReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "DeclarationReflection")
  @js.native
  class DeclarationReflection protected ()
    extends typings.typedoc.reflectionsDeclarationMod.DeclarationReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ParameterReflection")
  @js.native
  class ParameterReflection protected ()
    extends typings.typedoc.reflectionsParameterMod.ParameterReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ProjectReflection")
  @js.native
  class ProjectReflection protected ()
    extends typings.typedoc.projectMod.ProjectReflection {
    def this(name: String) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReferenceReflection")
  @js.native
  class ReferenceReflection protected ()
    extends typings.typedoc.reflectionsReferenceMod.ReferenceReflection {
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
    
    /* 2048 */ val Abstract: typings.typedoc.abstractMod.ReflectionFlag.Abstract & Double = js.native
    
    /* 4096 */ val Const: typings.typedoc.abstractMod.ReflectionFlag.Const & Double = js.native
    
    /* 1024 */ val ConstructorProperty: typings.typedoc.abstractMod.ReflectionFlag.ConstructorProperty & Double = js.native
    
    /* 256 */ val DefaultValue: typings.typedoc.abstractMod.ReflectionFlag.DefaultValue & Double = js.native
    
    /* 32 */ val ExportAssignment: typings.typedoc.abstractMod.ReflectionFlag.ExportAssignment & Double = js.native
    
    /* 16 */ val Exported: typings.typedoc.abstractMod.ReflectionFlag.Exported & Double = js.native
    
    /* 64 */ val External: typings.typedoc.abstractMod.ReflectionFlag.External & Double = js.native
    
    /* 8192 */ val Let: typings.typedoc.abstractMod.ReflectionFlag.Let & Double = js.native
    
    /* 0 */ val None: typings.typedoc.abstractMod.ReflectionFlag.None & Double = js.native
    
    /* 128 */ val Optional: typings.typedoc.abstractMod.ReflectionFlag.Optional & Double = js.native
    
    /* 1 */ val Private: typings.typedoc.abstractMod.ReflectionFlag.Private & Double = js.native
    
    /* 2 */ val Protected: typings.typedoc.abstractMod.ReflectionFlag.Protected & Double = js.native
    
    /* 4 */ val Public: typings.typedoc.abstractMod.ReflectionFlag.Public & Double = js.native
    
    /* 16384 */ val Readonly: typings.typedoc.abstractMod.ReflectionFlag.Readonly & Double = js.native
    
    /* 512 */ val Rest: typings.typedoc.abstractMod.ReflectionFlag.Rest & Double = js.native
    
    /* 8 */ val Static: typings.typedoc.abstractMod.ReflectionFlag.Static & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionFlags")
  @js.native
  class ReflectionFlags ()
    extends typings.typedoc.abstractMod.ReflectionFlags
  
  @JSImport("typedoc/dist/lib/models/reflections", "ReflectionKind")
  @js.native
  object ReflectionKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typedoc.abstractMod.ReflectionKind & Double] = js.native
    
    /* 262144 */ val Accessor: typings.typedoc.abstractMod.ReflectionKind.Accessor & Double = js.native
    
    /* 4096 */ val CallSignature: typings.typedoc.abstractMod.ReflectionKind.CallSignature & Double = js.native
    
    /* 128 */ val Class: typings.typedoc.abstractMod.ReflectionKind.Class & Double = js.native
    
    /* 8654336 */ val ClassMember: typings.typedoc.abstractMod.ReflectionKind.ClassMember & Double = js.native
    
    /* 384 */ val ClassOrInterface: typings.typedoc.abstractMod.ReflectionKind.ClassOrInterface & Double = js.native
    
    /* 512 */ val Constructor: typings.typedoc.abstractMod.ReflectionKind.Constructor & Double = js.native
    
    /* 16384 */ val ConstructorSignature: typings.typedoc.abstractMod.ReflectionKind.ConstructorSignature & Double = js.native
    
    /* 4 */ val Enum: typings.typedoc.abstractMod.ReflectionKind.Enum & Double = js.native
    
    /* 16 */ val EnumMember: typings.typedoc.abstractMod.ReflectionKind.EnumMember & Double = js.native
    
    /* 8388608 */ val Event: typings.typedoc.abstractMod.ReflectionKind.Event & Double = js.native
    
    /* 64 */ val Function: typings.typedoc.abstractMod.ReflectionKind.Function & Double = js.native
    
    /* 2112 */ val FunctionOrMethod: typings.typedoc.abstractMod.ReflectionKind.FunctionOrMethod & Double = js.native
    
    /* 524288 */ val GetSignature: typings.typedoc.abstractMod.ReflectionKind.GetSignature & Double = js.native
    
    /* 0 */ val Global: typings.typedoc.abstractMod.ReflectionKind.Global & Double = js.native
    
    /* 8192 */ val IndexSignature: typings.typedoc.abstractMod.ReflectionKind.IndexSignature & Double = js.native
    
    /* 256 */ val Interface: typings.typedoc.abstractMod.ReflectionKind.Interface & Double = js.native
    
    /* 2048 */ val Method: typings.typedoc.abstractMod.ReflectionKind.Method & Double = js.native
    
    /* 1 */ val Module: typings.typedoc.abstractMod.ReflectionKind.Module & Double = js.native
    
    /* 2 */ val Namespace: typings.typedoc.abstractMod.ReflectionKind.Namespace & Double = js.native
    
    /* 2097152 */ val ObjectLiteral: typings.typedoc.abstractMod.ReflectionKind.ObjectLiteral & Double = js.native
    
    /* 32768 */ val Parameter: typings.typedoc.abstractMod.ReflectionKind.Parameter & Double = js.native
    
    /* 1024 */ val Property: typings.typedoc.abstractMod.ReflectionKind.Property & Double = js.native
    
    /* 16777216 */ val Reference: typings.typedoc.abstractMod.ReflectionKind.Reference & Double = js.native
    
    /* 1048576 */ val SetSignature: typings.typedoc.abstractMod.ReflectionKind.SetSignature & Double = js.native
    
    /* 3 */ val SomeModule: typings.typedoc.abstractMod.ReflectionKind.SomeModule & Double = js.native
    
    /* 1601536 */ val SomeSignature: typings.typedoc.abstractMod.ReflectionKind.SomeSignature & Double = js.native
    
    /* 4391168 */ val SomeType: typings.typedoc.abstractMod.ReflectionKind.SomeType & Double = js.native
    
    /* 2097248 */ val SomeValue: typings.typedoc.abstractMod.ReflectionKind.SomeValue & Double = js.native
    
    /* 4194304 */ val TypeAlias: typings.typedoc.abstractMod.ReflectionKind.TypeAlias & Double = js.native
    
    /* 65536 */ val TypeLiteral: typings.typedoc.abstractMod.ReflectionKind.TypeLiteral & Double = js.native
    
    /* 131072 */ val TypeParameter: typings.typedoc.abstractMod.ReflectionKind.TypeParameter & Double = js.native
    
    /* 32 */ val Variable: typings.typedoc.abstractMod.ReflectionKind.Variable & Double = js.native
    
    /* 1056 */ val VariableOrProperty: typings.typedoc.abstractMod.ReflectionKind.VariableOrProperty & Double = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/reflections", "SignatureReflection")
  @js.native
  class SignatureReflection protected ()
    extends typings.typedoc.reflectionsSignatureMod.SignatureReflection {
    def this(name: String, kind: ReflectionKind) = this()
    def this(name: String, kind: ReflectionKind, parent: typings.typedoc.abstractMod.Reflection) = this()
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
  class TypeParameterReflection protected ()
    extends typings.typedoc.reflectionsTypeParameterMod.TypeParameterReflection {
    def this(`type`: TypeParameterType) = this()
    def this(`type`: TypeParameterType, parent: typings.typedoc.abstractMod.Reflection) = this()
  }
  
  inline def splitUnquotedString(input: String, delimiter: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("splitUnquotedString")(input.asInstanceOf[js.Any], delimiter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
