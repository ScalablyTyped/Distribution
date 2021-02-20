package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeFormatFlags extends StObject
@JSImport("typescript", "TypeFormatFlags")
@js.native
object TypeFormatFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeFormatFlags with Double] = js.native
  
  @js.native
  sealed trait AddUndefined extends TypeFormatFlags
  /* 131072 */ val AddUndefined: typings.typescript.mod.TypeFormatFlags.AddUndefined with Double = js.native
  
  @js.native
  sealed trait AllowUniqueESSymbolType extends TypeFormatFlags
  /* 1048576 */ val AllowUniqueESSymbolType: typings.typescript.mod.TypeFormatFlags.AllowUniqueESSymbolType with Double = js.native
  
  @js.native
  sealed trait InArrayType extends TypeFormatFlags
  /* 524288 */ val InArrayType: typings.typescript.mod.TypeFormatFlags.InArrayType with Double = js.native
  
  @js.native
  sealed trait InElementType extends TypeFormatFlags
  /* 2097152 */ val InElementType: typings.typescript.mod.TypeFormatFlags.InElementType with Double = js.native
  
  @js.native
  sealed trait InFirstTypeArgument extends TypeFormatFlags
  /* 4194304 */ val InFirstTypeArgument: typings.typescript.mod.TypeFormatFlags.InFirstTypeArgument with Double = js.native
  
  @js.native
  sealed trait InTypeAlias extends TypeFormatFlags
  /* 8388608 */ val InTypeAlias: typings.typescript.mod.TypeFormatFlags.InTypeAlias with Double = js.native
  
  @js.native
  sealed trait MultilineObjectLiterals extends TypeFormatFlags
  /* 1024 */ val MultilineObjectLiterals: typings.typescript.mod.TypeFormatFlags.MultilineObjectLiterals with Double = js.native
  
  @js.native
  sealed trait NoTruncation extends TypeFormatFlags
  /* 1 */ val NoTruncation: typings.typescript.mod.TypeFormatFlags.NoTruncation with Double = js.native
  
  @js.native
  sealed trait NoTypeReduction extends TypeFormatFlags
  /* 536870912 */ val NoTypeReduction: typings.typescript.mod.TypeFormatFlags.NoTypeReduction with Double = js.native
  
  @js.native
  sealed trait NodeBuilderFlagsMask extends TypeFormatFlags
  /* 814775659 */ val NodeBuilderFlagsMask: typings.typescript.mod.TypeFormatFlags.NodeBuilderFlagsMask with Double = js.native
  
  @js.native
  sealed trait None extends TypeFormatFlags
  /* 0 */ val None: typings.typescript.mod.TypeFormatFlags.None with Double = js.native
  
  @js.native
  sealed trait OmitParameterModifiers extends TypeFormatFlags
  /* 8192 */ val OmitParameterModifiers: typings.typescript.mod.TypeFormatFlags.OmitParameterModifiers with Double = js.native
  
  @js.native
  sealed trait SuppressAnyReturnType extends TypeFormatFlags
  /* 256 */ val SuppressAnyReturnType: typings.typescript.mod.TypeFormatFlags.SuppressAnyReturnType with Double = js.native
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope extends TypeFormatFlags
  /* 16384 */ val UseAliasDefinedOutsideCurrentScope: typings.typescript.mod.TypeFormatFlags.UseAliasDefinedOutsideCurrentScope with Double = js.native
  
  @js.native
  sealed trait UseFullyQualifiedType extends TypeFormatFlags
  /* 64 */ val UseFullyQualifiedType: typings.typescript.mod.TypeFormatFlags.UseFullyQualifiedType with Double = js.native
  
  @js.native
  sealed trait UseSingleQuotesForStringLiteralType extends TypeFormatFlags
  /* 268435456 */ val UseSingleQuotesForStringLiteralType: typings.typescript.mod.TypeFormatFlags.UseSingleQuotesForStringLiteralType with Double = js.native
  
  @js.native
  sealed trait UseStructuralFallback extends TypeFormatFlags
  /* 8 */ val UseStructuralFallback: typings.typescript.mod.TypeFormatFlags.UseStructuralFallback with Double = js.native
  
  @js.native
  sealed trait UseTypeOfFunction extends TypeFormatFlags
  /* 4096 */ val UseTypeOfFunction: typings.typescript.mod.TypeFormatFlags.UseTypeOfFunction with Double = js.native
  
  @js.native
  sealed trait WriteArrayAsGenericType extends TypeFormatFlags
  /* 2 */ val WriteArrayAsGenericType: typings.typescript.mod.TypeFormatFlags.WriteArrayAsGenericType with Double = js.native
  
  @js.native
  sealed trait WriteArrowStyleSignature extends TypeFormatFlags
  /* 262144 */ val WriteArrowStyleSignature: typings.typescript.mod.TypeFormatFlags.WriteArrowStyleSignature with Double = js.native
  
  @js.native
  sealed trait WriteClassExpressionAsTypeLiteral extends TypeFormatFlags
  /* 2048 */ val WriteClassExpressionAsTypeLiteral: typings.typescript.mod.TypeFormatFlags.WriteClassExpressionAsTypeLiteral with Double = js.native
  
  /** @deprecated */ @js.native
  sealed trait WriteOwnNameForAnyLike extends TypeFormatFlags
  /* 0 */ val WriteOwnNameForAnyLike: typings.typescript.mod.TypeFormatFlags.WriteOwnNameForAnyLike with Double = js.native
  
  @js.native
  sealed trait WriteTypeArgumentsOfSignature extends TypeFormatFlags
  /* 32 */ val WriteTypeArgumentsOfSignature: typings.typescript.mod.TypeFormatFlags.WriteTypeArgumentsOfSignature with Double = js.native
}
