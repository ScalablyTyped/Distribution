package typings.typescript.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SymbolFlags extends js.Object
@JSImport("typescript", "SymbolFlags")
@js.native
object SymbolFlags extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SymbolFlags with Double] = js.native
  
  @js.native
  sealed trait Accessor extends SymbolFlags
  /* 98304 */ @js.native
  object Accessor extends TopLevel[Accessor with Double]
  
  @js.native
  sealed trait Alias extends SymbolFlags
  /* 2097152 */ @js.native
  object Alias extends TopLevel[Alias with Double]
  
  @js.native
  sealed trait AliasExcludes extends SymbolFlags
  /* 2097152 */ @js.native
  object AliasExcludes extends TopLevel[AliasExcludes with Double]
  
  @js.native
  sealed trait Assignment extends SymbolFlags
  /* 67108864 */ @js.native
  object Assignment extends TopLevel[Assignment with Double]
  
  @js.native
  sealed trait BlockScoped extends SymbolFlags
  /* 418 */ @js.native
  object BlockScoped extends TopLevel[BlockScoped with Double]
  
  @js.native
  sealed trait BlockScopedVariable extends SymbolFlags
  /* 2 */ @js.native
  object BlockScopedVariable extends TopLevel[BlockScopedVariable with Double]
  
  @js.native
  sealed trait BlockScopedVariableExcludes extends SymbolFlags
  /* 111551 */ @js.native
  object BlockScopedVariableExcludes extends TopLevel[BlockScopedVariableExcludes with Double]
  
  @js.native
  sealed trait Class extends SymbolFlags
  /* 32 */ @js.native
  object Class extends TopLevel[Class with Double]
  
  @js.native
  sealed trait ClassExcludes extends SymbolFlags
  /* 899503 */ @js.native
  object ClassExcludes extends TopLevel[ClassExcludes with Double]
  
  @js.native
  sealed trait ClassMember extends SymbolFlags
  /* 106500 */ @js.native
  object ClassMember extends TopLevel[ClassMember with Double]
  
  @js.native
  sealed trait ConstEnum extends SymbolFlags
  /* 128 */ @js.native
  object ConstEnum extends TopLevel[ConstEnum with Double]
  
  @js.native
  sealed trait ConstEnumExcludes extends SymbolFlags
  /* 899967 */ @js.native
  object ConstEnumExcludes extends TopLevel[ConstEnumExcludes with Double]
  
  @js.native
  sealed trait Constructor extends SymbolFlags
  /* 16384 */ @js.native
  object Constructor extends TopLevel[Constructor with Double]
  
  @js.native
  sealed trait Enum extends SymbolFlags
  /* 384 */ @js.native
  object Enum extends TopLevel[Enum with Double]
  
  @js.native
  sealed trait EnumMember extends SymbolFlags
  /* 8 */ @js.native
  object EnumMember
    extends TopLevel[typings.typescript.mod.SymbolFlags.EnumMember with Double]
  
  @js.native
  sealed trait EnumMemberExcludes extends SymbolFlags
  /* 900095 */ @js.native
  object EnumMemberExcludes extends TopLevel[EnumMemberExcludes with Double]
  
  @js.native
  sealed trait ExportHasLocal extends SymbolFlags
  /* 944 */ @js.native
  object ExportHasLocal extends TopLevel[ExportHasLocal with Double]
  
  @js.native
  sealed trait ExportStar extends SymbolFlags
  /* 8388608 */ @js.native
  object ExportStar extends TopLevel[ExportStar with Double]
  
  @js.native
  sealed trait ExportValue extends SymbolFlags
  /* 1048576 */ @js.native
  object ExportValue extends TopLevel[ExportValue with Double]
  
  @js.native
  sealed trait Function extends SymbolFlags
  /* 16 */ @js.native
  object Function extends TopLevel[Function with Double]
  
  @js.native
  sealed trait FunctionExcludes extends SymbolFlags
  /* 110991 */ @js.native
  object FunctionExcludes extends TopLevel[FunctionExcludes with Double]
  
  @js.native
  sealed trait FunctionScopedVariable extends SymbolFlags
  /* 1 */ @js.native
  object FunctionScopedVariable extends TopLevel[FunctionScopedVariable with Double]
  
  @js.native
  sealed trait FunctionScopedVariableExcludes extends SymbolFlags
  /* 111550 */ @js.native
  object FunctionScopedVariableExcludes extends TopLevel[FunctionScopedVariableExcludes with Double]
  
  @js.native
  sealed trait GetAccessor extends SymbolFlags
  /* 32768 */ @js.native
  object GetAccessor extends TopLevel[GetAccessor with Double]
  
  @js.native
  sealed trait GetAccessorExcludes extends SymbolFlags
  /* 46015 */ @js.native
  object GetAccessorExcludes extends TopLevel[GetAccessorExcludes with Double]
  
  @js.native
  sealed trait Interface extends SymbolFlags
  /* 64 */ @js.native
  object Interface extends TopLevel[Interface with Double]
  
  @js.native
  sealed trait InterfaceExcludes extends SymbolFlags
  /* 788872 */ @js.native
  object InterfaceExcludes extends TopLevel[InterfaceExcludes with Double]
  
  @js.native
  sealed trait Method extends SymbolFlags
  /* 8192 */ @js.native
  object Method extends TopLevel[Method with Double]
  
  @js.native
  sealed trait MethodExcludes extends SymbolFlags
  /* 103359 */ @js.native
  object MethodExcludes extends TopLevel[MethodExcludes with Double]
  
  @js.native
  sealed trait Module extends SymbolFlags
  /* 1536 */ @js.native
  object Module extends TopLevel[Module with Double]
  
  @js.native
  sealed trait ModuleExports extends SymbolFlags
  /* 134217728 */ @js.native
  object ModuleExports extends TopLevel[ModuleExports with Double]
  
  @js.native
  sealed trait ModuleMember extends SymbolFlags
  /* 2623475 */ @js.native
  object ModuleMember extends TopLevel[ModuleMember with Double]
  
  @js.native
  sealed trait Namespace extends SymbolFlags
  /* 1920 */ @js.native
  object Namespace extends TopLevel[Namespace with Double]
  
  @js.native
  sealed trait NamespaceModule extends SymbolFlags
  /* 1024 */ @js.native
  object NamespaceModule extends TopLevel[NamespaceModule with Double]
  
  @js.native
  sealed trait NamespaceModuleExcludes extends SymbolFlags
  /* 0 */ @js.native
  object NamespaceModuleExcludes extends TopLevel[NamespaceModuleExcludes with Double]
  
  @js.native
  sealed trait None extends SymbolFlags
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait ObjectLiteral extends SymbolFlags
  /* 4096 */ @js.native
  object ObjectLiteral extends TopLevel[ObjectLiteral with Double]
  
  @js.native
  sealed trait Optional extends SymbolFlags
  /* 16777216 */ @js.native
  object Optional extends TopLevel[Optional with Double]
  
  @js.native
  sealed trait ParameterExcludes extends SymbolFlags
  /* 111551 */ @js.native
  object ParameterExcludes extends TopLevel[ParameterExcludes with Double]
  
  @js.native
  sealed trait Property extends SymbolFlags
  /* 4 */ @js.native
  object Property extends TopLevel[Property with Double]
  
  @js.native
  sealed trait PropertyExcludes extends SymbolFlags
  /* 0 */ @js.native
  object PropertyExcludes extends TopLevel[PropertyExcludes with Double]
  
  @js.native
  sealed trait PropertyOrAccessor extends SymbolFlags
  /* 98308 */ @js.native
  object PropertyOrAccessor extends TopLevel[PropertyOrAccessor with Double]
  
  @js.native
  sealed trait Prototype extends SymbolFlags
  /* 4194304 */ @js.native
  object Prototype extends TopLevel[Prototype with Double]
  
  @js.native
  sealed trait RegularEnum extends SymbolFlags
  /* 256 */ @js.native
  object RegularEnum extends TopLevel[RegularEnum with Double]
  
  @js.native
  sealed trait RegularEnumExcludes extends SymbolFlags
  /* 899327 */ @js.native
  object RegularEnumExcludes extends TopLevel[RegularEnumExcludes with Double]
  
  @js.native
  sealed trait SetAccessor extends SymbolFlags
  /* 65536 */ @js.native
  object SetAccessor extends TopLevel[SetAccessor with Double]
  
  @js.native
  sealed trait SetAccessorExcludes extends SymbolFlags
  /* 78783 */ @js.native
  object SetAccessorExcludes extends TopLevel[SetAccessorExcludes with Double]
  
  @js.native
  sealed trait Signature extends SymbolFlags
  /* 131072 */ @js.native
  object Signature
    extends TopLevel[typings.typescript.mod.SymbolFlags.Signature with Double]
  
  @js.native
  sealed trait Transient extends SymbolFlags
  /* 33554432 */ @js.native
  object Transient extends TopLevel[Transient with Double]
  
  @js.native
  sealed trait Type extends SymbolFlags
  /* 788968 */ @js.native
  object Type
    extends TopLevel[typings.typescript.mod.SymbolFlags.Type with Double]
  
  @js.native
  sealed trait TypeAlias extends SymbolFlags
  /* 524288 */ @js.native
  object TypeAlias extends TopLevel[TypeAlias with Double]
  
  @js.native
  sealed trait TypeAliasExcludes extends SymbolFlags
  /* 788968 */ @js.native
  object TypeAliasExcludes extends TopLevel[TypeAliasExcludes with Double]
  
  @js.native
  sealed trait TypeLiteral extends SymbolFlags
  /* 2048 */ @js.native
  object TypeLiteral extends TopLevel[TypeLiteral with Double]
  
  @js.native
  sealed trait TypeParameter extends SymbolFlags
  /* 262144 */ @js.native
  object TypeParameter
    extends TopLevel[typings.typescript.mod.SymbolFlags.TypeParameter with Double]
  
  @js.native
  sealed trait TypeParameterExcludes extends SymbolFlags
  /* 526824 */ @js.native
  object TypeParameterExcludes extends TopLevel[TypeParameterExcludes with Double]
  
  @js.native
  sealed trait Value extends SymbolFlags
  /* 111551 */ @js.native
  object Value extends TopLevel[Value with Double]
  
  @js.native
  sealed trait ValueModule extends SymbolFlags
  /* 512 */ @js.native
  object ValueModule extends TopLevel[ValueModule with Double]
  
  @js.native
  sealed trait ValueModuleExcludes extends SymbolFlags
  /* 110735 */ @js.native
  object ValueModuleExcludes extends TopLevel[ValueModuleExcludes with Double]
  
  @js.native
  sealed trait Variable extends SymbolFlags
  /* 3 */ @js.native
  object Variable extends TopLevel[Variable with Double]
}
