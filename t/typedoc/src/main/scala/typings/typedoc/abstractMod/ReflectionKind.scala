package typings.typedoc.abstractMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReflectionKind extends js.Object
@JSImport("typedoc/dist/lib/models/reflections/abstract", "ReflectionKind")
@js.native
object ReflectionKind extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReflectionKind with Double] = js.native
  
  @js.native
  sealed trait Accessor extends ReflectionKind
  /* 262144 */ @js.native
  object Accessor extends TopLevel[Accessor with Double]
  
  @js.native
  sealed trait CallSignature extends ReflectionKind
  /* 4096 */ @js.native
  object CallSignature extends TopLevel[CallSignature with Double]
  
  @js.native
  sealed trait Class extends ReflectionKind
  /* 128 */ @js.native
  object Class extends TopLevel[Class with Double]
  
  @js.native
  sealed trait ClassMember extends ReflectionKind
  /* 8654336 */ @js.native
  object ClassMember extends TopLevel[ClassMember with Double]
  
  @js.native
  sealed trait ClassOrInterface extends ReflectionKind
  /* 384 */ @js.native
  object ClassOrInterface extends TopLevel[ClassOrInterface with Double]
  
  @js.native
  sealed trait Constructor extends ReflectionKind
  /* 512 */ @js.native
  object Constructor extends TopLevel[Constructor with Double]
  
  @js.native
  sealed trait ConstructorSignature extends ReflectionKind
  /* 16384 */ @js.native
  object ConstructorSignature extends TopLevel[ConstructorSignature with Double]
  
  @js.native
  sealed trait Enum extends ReflectionKind
  /* 4 */ @js.native
  object Enum extends TopLevel[Enum with Double]
  
  @js.native
  sealed trait EnumMember extends ReflectionKind
  /* 16 */ @js.native
  object EnumMember extends TopLevel[EnumMember with Double]
  
  @js.native
  sealed trait Event extends ReflectionKind
  /* 8388608 */ @js.native
  object Event extends TopLevel[Event with Double]
  
  @js.native
  sealed trait Function extends ReflectionKind
  /* 64 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  @js.native
  sealed trait FunctionOrMethod extends ReflectionKind
  /* 2112 */ @js.native
  object FunctionOrMethod extends TopLevel[FunctionOrMethod with Double]
  
  @js.native
  sealed trait GetSignature extends ReflectionKind
  /* 524288 */ @js.native
  object GetSignature extends TopLevel[GetSignature with Double]
  
  @js.native
  sealed trait Global extends ReflectionKind
  /* 0 */ @js.native
  object Global extends TopLevel[Global with Double]
  
  @js.native
  sealed trait IndexSignature extends ReflectionKind
  /* 8192 */ @js.native
  object IndexSignature extends TopLevel[IndexSignature with Double]
  
  @js.native
  sealed trait Interface extends ReflectionKind
  /* 256 */ @js.native
  object Interface extends TopLevel[Interface with Double]
  
  @js.native
  sealed trait Method extends ReflectionKind
  /* 2048 */ @js.native
  object Method extends TopLevel[Method with Double]
  
  @js.native
  sealed trait Module extends ReflectionKind
  /* 1 */ @js.native
  object Module extends TopLevel[Module with Double]
  
  @js.native
  sealed trait Namespace extends ReflectionKind
  /* 2 */ @js.native
  object Namespace extends TopLevel[Namespace with Double]
  
  @js.native
  sealed trait ObjectLiteral extends ReflectionKind
  /* 2097152 */ @js.native
  object ObjectLiteral extends TopLevel[ObjectLiteral with Double]
  
  @js.native
  sealed trait Parameter extends ReflectionKind
  /* 32768 */ @js.native
  object Parameter extends TopLevel[Parameter with Double]
  
  @js.native
  sealed trait Property extends ReflectionKind
  /* 1024 */ @js.native
  object Property extends TopLevel[Property with Double]
  
  @js.native
  sealed trait Reference extends ReflectionKind
  /* 16777216 */ @js.native
  object Reference extends TopLevel[Reference with Double]
  
  @js.native
  sealed trait SetSignature extends ReflectionKind
  /* 1048576 */ @js.native
  object SetSignature extends TopLevel[SetSignature with Double]
  
  @js.native
  sealed trait SomeModule extends ReflectionKind
  /* 3 */ @js.native
  object SomeModule extends TopLevel[SomeModule with Double]
  
  @js.native
  sealed trait SomeSignature extends ReflectionKind
  /* 1601536 */ @js.native
  object SomeSignature extends TopLevel[SomeSignature with Double]
  
  @js.native
  sealed trait SomeType extends ReflectionKind
  /* 4391168 */ @js.native
  object SomeType extends TopLevel[SomeType with Double]
  
  @js.native
  sealed trait SomeValue extends ReflectionKind
  /* 2097248 */ @js.native
  object SomeValue extends TopLevel[SomeValue with Double]
  
  @js.native
  sealed trait TypeAlias extends ReflectionKind
  /* 4194304 */ @js.native
  object TypeAlias extends TopLevel[TypeAlias with Double]
  
  @js.native
  sealed trait TypeLiteral extends ReflectionKind
  /* 65536 */ @js.native
  object TypeLiteral extends TopLevel[TypeLiteral with Double]
  
  @js.native
  sealed trait TypeParameter extends ReflectionKind
  /* 131072 */ @js.native
  object TypeParameter extends TopLevel[TypeParameter with Double]
  
  @js.native
  sealed trait Variable extends ReflectionKind
  /* 32 */ @js.native
  object Variable extends TopLevel[Variable with Double]
  
  @js.native
  sealed trait VariableOrProperty extends ReflectionKind
  /* 1056 */ @js.native
  object VariableOrProperty extends TopLevel[VariableOrProperty with Double]
}
