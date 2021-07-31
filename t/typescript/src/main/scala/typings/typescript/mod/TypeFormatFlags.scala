package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeFormatFlags extends StObject
@JSImport("typescript", "TypeFormatFlags")
@js.native
object TypeFormatFlags extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TypeFormatFlags & Double] = js.native
  
  @js.native
  sealed trait AddUndefined
    extends StObject
       with TypeFormatFlags
  /* 131072 */ val AddUndefined: typings.typescript.mod.TypeFormatFlags.AddUndefined & Double = js.native
  
  @js.native
  sealed trait AllowUniqueESSymbolType
    extends StObject
       with TypeFormatFlags
  /* 1048576 */ val AllowUniqueESSymbolType: typings.typescript.mod.TypeFormatFlags.AllowUniqueESSymbolType & Double = js.native
  
  @js.native
  sealed trait InArrayType
    extends StObject
       with TypeFormatFlags
  /* 524288 */ val InArrayType: typings.typescript.mod.TypeFormatFlags.InArrayType & Double = js.native
  
  @js.native
  sealed trait InElementType
    extends StObject
       with TypeFormatFlags
  /* 2097152 */ val InElementType: typings.typescript.mod.TypeFormatFlags.InElementType & Double = js.native
  
  @js.native
  sealed trait InFirstTypeArgument
    extends StObject
       with TypeFormatFlags
  /* 4194304 */ val InFirstTypeArgument: typings.typescript.mod.TypeFormatFlags.InFirstTypeArgument & Double = js.native
  
  @js.native
  sealed trait InTypeAlias
    extends StObject
       with TypeFormatFlags
  /* 8388608 */ val InTypeAlias: typings.typescript.mod.TypeFormatFlags.InTypeAlias & Double = js.native
  
  @js.native
  sealed trait MultilineObjectLiterals
    extends StObject
       with TypeFormatFlags
  /* 1024 */ val MultilineObjectLiterals: typings.typescript.mod.TypeFormatFlags.MultilineObjectLiterals & Double = js.native
  
  @js.native
  sealed trait NoTruncation
    extends StObject
       with TypeFormatFlags
  /* 1 */ val NoTruncation: typings.typescript.mod.TypeFormatFlags.NoTruncation & Double = js.native
  
  @js.native
  sealed trait NoTypeReduction
    extends StObject
       with TypeFormatFlags
  /* 536870912 */ val NoTypeReduction: typings.typescript.mod.TypeFormatFlags.NoTypeReduction & Double = js.native
  
  @js.native
  sealed trait NodeBuilderFlagsMask
    extends StObject
       with TypeFormatFlags
  /* 814775659 */ val NodeBuilderFlagsMask: typings.typescript.mod.TypeFormatFlags.NodeBuilderFlagsMask & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TypeFormatFlags
  /* 0 */ val None: typings.typescript.mod.TypeFormatFlags.None & Double = js.native
  
  @js.native
  sealed trait OmitParameterModifiers
    extends StObject
       with TypeFormatFlags
  /* 8192 */ val OmitParameterModifiers: typings.typescript.mod.TypeFormatFlags.OmitParameterModifiers & Double = js.native
  
  @js.native
  sealed trait SuppressAnyReturnType
    extends StObject
       with TypeFormatFlags
  /* 256 */ val SuppressAnyReturnType: typings.typescript.mod.TypeFormatFlags.SuppressAnyReturnType & Double = js.native
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope
    extends StObject
       with TypeFormatFlags
  /* 16384 */ val UseAliasDefinedOutsideCurrentScope: typings.typescript.mod.TypeFormatFlags.UseAliasDefinedOutsideCurrentScope & Double = js.native
  
  @js.native
  sealed trait UseFullyQualifiedType
    extends StObject
       with TypeFormatFlags
  /* 64 */ val UseFullyQualifiedType: typings.typescript.mod.TypeFormatFlags.UseFullyQualifiedType & Double = js.native
  
  @js.native
  sealed trait UseSingleQuotesForStringLiteralType
    extends StObject
       with TypeFormatFlags
  /* 268435456 */ val UseSingleQuotesForStringLiteralType: typings.typescript.mod.TypeFormatFlags.UseSingleQuotesForStringLiteralType & Double = js.native
  
  @js.native
  sealed trait UseStructuralFallback
    extends StObject
       with TypeFormatFlags
  /* 8 */ val UseStructuralFallback: typings.typescript.mod.TypeFormatFlags.UseStructuralFallback & Double = js.native
  
  @js.native
  sealed trait UseTypeOfFunction
    extends StObject
       with TypeFormatFlags
  /* 4096 */ val UseTypeOfFunction: typings.typescript.mod.TypeFormatFlags.UseTypeOfFunction & Double = js.native
  
  @js.native
  sealed trait WriteArrayAsGenericType
    extends StObject
       with TypeFormatFlags
  /* 2 */ val WriteArrayAsGenericType: typings.typescript.mod.TypeFormatFlags.WriteArrayAsGenericType & Double = js.native
  
  @js.native
  sealed trait WriteArrowStyleSignature
    extends StObject
       with TypeFormatFlags
  /* 262144 */ val WriteArrowStyleSignature: typings.typescript.mod.TypeFormatFlags.WriteArrowStyleSignature & Double = js.native
  
  @js.native
  sealed trait WriteClassExpressionAsTypeLiteral
    extends StObject
       with TypeFormatFlags
  /* 2048 */ val WriteClassExpressionAsTypeLiteral: typings.typescript.mod.TypeFormatFlags.WriteClassExpressionAsTypeLiteral & Double = js.native
  
  /** @deprecated */ @js.native
  sealed trait WriteOwnNameForAnyLike
    extends StObject
       with TypeFormatFlags
  /* 0 */ val WriteOwnNameForAnyLike: typings.typescript.mod.TypeFormatFlags.WriteOwnNameForAnyLike & Double = js.native
  
  @js.native
  sealed trait WriteTypeArgumentsOfSignature
    extends StObject
       with TypeFormatFlags
  /* 32 */ val WriteTypeArgumentsOfSignature: typings.typescript.mod.TypeFormatFlags.WriteTypeArgumentsOfSignature & Double = js.native
}
