package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeFormatFlags extends js.Object

@JSImport("typescript", "TypeFormatFlags")
@js.native
object TypeFormatFlags extends js.Object {
  @js.native
  sealed trait AddUndefined extends TypeFormatFlags
  
  @js.native
  sealed trait AllowUniqueESSymbolType extends TypeFormatFlags
  
  @js.native
  sealed trait InArrayType extends TypeFormatFlags
  
  @js.native
  sealed trait InElementType extends TypeFormatFlags
  
  @js.native
  sealed trait InFirstTypeArgument extends TypeFormatFlags
  
  @js.native
  sealed trait InTypeAlias extends TypeFormatFlags
  
  @js.native
  sealed trait MultilineObjectLiterals extends TypeFormatFlags
  
  @js.native
  sealed trait NoTruncation extends TypeFormatFlags
  
  @js.native
  sealed trait NodeBuilderFlagsMask extends TypeFormatFlags
  
  @js.native
  sealed trait None extends TypeFormatFlags
  
  @js.native
  sealed trait OmitParameterModifiers extends TypeFormatFlags
  
  @js.native
  sealed trait SuppressAnyReturnType extends TypeFormatFlags
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope extends TypeFormatFlags
  
  @js.native
  sealed trait UseFullyQualifiedType extends TypeFormatFlags
  
  @js.native
  sealed trait UseStructuralFallback extends TypeFormatFlags
  
  @js.native
  sealed trait UseTypeOfFunction extends TypeFormatFlags
  
  @js.native
  sealed trait WriteArrayAsGenericType extends TypeFormatFlags
  
  @js.native
  sealed trait WriteArrowStyleSignature extends TypeFormatFlags
  
  @js.native
  sealed trait WriteClassExpressionAsTypeLiteral extends TypeFormatFlags
  
  /** @deprecated */ @js.native
  sealed trait WriteOwnNameForAnyLike extends TypeFormatFlags
  
  @js.native
  sealed trait WriteTypeArgumentsOfSignature extends TypeFormatFlags
  
  /* 131072 */ val AddUndefined: typings.typescript.typescriptMod.TypeFormatFlags.AddUndefined with Double = js.native
  /* 1048576 */ val AllowUniqueESSymbolType: typings.typescript.typescriptMod.TypeFormatFlags.AllowUniqueESSymbolType with Double = js.native
  /* 524288 */ val InArrayType: typings.typescript.typescriptMod.TypeFormatFlags.InArrayType with Double = js.native
  /* 2097152 */ val InElementType: typings.typescript.typescriptMod.TypeFormatFlags.InElementType with Double = js.native
  /* 4194304 */ val InFirstTypeArgument: typings.typescript.typescriptMod.TypeFormatFlags.InFirstTypeArgument with Double = js.native
  /* 8388608 */ val InTypeAlias: typings.typescript.typescriptMod.TypeFormatFlags.InTypeAlias with Double = js.native
  /* 1024 */ val MultilineObjectLiterals: typings.typescript.typescriptMod.TypeFormatFlags.MultilineObjectLiterals with Double = js.native
  /* 1 */ val NoTruncation: typings.typescript.typescriptMod.TypeFormatFlags.NoTruncation with Double = js.native
  /* 9469291 */ val NodeBuilderFlagsMask: typings.typescript.typescriptMod.TypeFormatFlags.NodeBuilderFlagsMask with Double = js.native
  /* 0 */ val None: typings.typescript.typescriptMod.TypeFormatFlags.None with Double = js.native
  /* 8192 */ val OmitParameterModifiers: typings.typescript.typescriptMod.TypeFormatFlags.OmitParameterModifiers with Double = js.native
  /* 256 */ val SuppressAnyReturnType: typings.typescript.typescriptMod.TypeFormatFlags.SuppressAnyReturnType with Double = js.native
  /* 16384 */ val UseAliasDefinedOutsideCurrentScope: typings.typescript.typescriptMod.TypeFormatFlags.UseAliasDefinedOutsideCurrentScope with Double = js.native
  /* 64 */ val UseFullyQualifiedType: typings.typescript.typescriptMod.TypeFormatFlags.UseFullyQualifiedType with Double = js.native
  /* 8 */ val UseStructuralFallback: typings.typescript.typescriptMod.TypeFormatFlags.UseStructuralFallback with Double = js.native
  /* 4096 */ val UseTypeOfFunction: typings.typescript.typescriptMod.TypeFormatFlags.UseTypeOfFunction with Double = js.native
  /* 2 */ val WriteArrayAsGenericType: typings.typescript.typescriptMod.TypeFormatFlags.WriteArrayAsGenericType with Double = js.native
  /* 262144 */ val WriteArrowStyleSignature: typings.typescript.typescriptMod.TypeFormatFlags.WriteArrowStyleSignature with Double = js.native
  /* 2048 */ val WriteClassExpressionAsTypeLiteral: typings.typescript.typescriptMod.TypeFormatFlags.WriteClassExpressionAsTypeLiteral with Double = js.native
  /* 0 */ val WriteOwnNameForAnyLike: typings.typescript.typescriptMod.TypeFormatFlags.WriteOwnNameForAnyLike with Double = js.native
  /* 32 */ val WriteTypeArgumentsOfSignature: typings.typescript.typescriptMod.TypeFormatFlags.WriteTypeArgumentsOfSignature with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeFormatFlags with Double] = js.native
}

