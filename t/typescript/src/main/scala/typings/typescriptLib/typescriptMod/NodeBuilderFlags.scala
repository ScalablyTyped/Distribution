package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeBuilderFlags extends js.Object

@JSImport("typescript", "NodeBuilderFlags")
@js.native
object NodeBuilderFlags extends js.Object {
  @js.native
  sealed trait AllowAnonymousIdentifier
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait AllowEmptyIndexInfoType
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait AllowEmptyTuple
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait AllowEmptyUnionOrIntersection
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait AllowNodeModulesRelativePaths
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait AllowQualifedNameInPlaceOfIdentifier
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait AllowThisInObjectLiteral
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait AllowUniqueESSymbolType
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait ForbidIndexedAccessSymbolReferences
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait GenerateNamesForShadowedTypeParams
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait IgnoreErrors
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait InInitialEntityName
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait InObjectTypeLiteral
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait InReverseMappedType
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait InTypeAlias
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait MultilineObjectLiterals
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait NoTruncation
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait None
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait OmitParameterModifiers
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait SuppressAnyReturnType
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait UseAliasDefinedOutsideCurrentScope
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait UseFullyQualifiedType
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait UseOnlyExternalAliasing
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait UseStructuralFallback
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait UseTypeOfFunction
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait WriteArrayAsGenericType
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait WriteClassExpressionAsTypeLiteral
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait WriteTypeArgumentsOfSignature
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  @js.native
  sealed trait WriteTypeParametersInQualifiedName
    extends typescriptLib.typescriptMod.NodeBuilderFlags
  
  /* 131072 */ val AllowAnonymousIdentifier: AllowAnonymousIdentifier with scala.Double = js.native
  /* 2097152 */ val AllowEmptyIndexInfoType: AllowEmptyIndexInfoType with scala.Double = js.native
  /* 524288 */ val AllowEmptyTuple: AllowEmptyTuple with scala.Double = js.native
  /* 262144 */ val AllowEmptyUnionOrIntersection: AllowEmptyUnionOrIntersection with scala.Double = js.native
  /* 67108864 */ val AllowNodeModulesRelativePaths: AllowNodeModulesRelativePaths with scala.Double = js.native
  /* 65536 */ val AllowQualifedNameInPlaceOfIdentifier: AllowQualifedNameInPlaceOfIdentifier with scala.Double = js.native
  /* 32768 */ val AllowThisInObjectLiteral: AllowThisInObjectLiteral with scala.Double = js.native
  /* 1048576 */ val AllowUniqueESSymbolType: AllowUniqueESSymbolType with scala.Double = js.native
  /* 16 */ val ForbidIndexedAccessSymbolReferences: ForbidIndexedAccessSymbolReferences with scala.Double = js.native
  /* 4 */ val GenerateNamesForShadowedTypeParams: GenerateNamesForShadowedTypeParams with scala.Double = js.native
  /* 70221824 */ val IgnoreErrors: IgnoreErrors with scala.Double = js.native
  /* 16777216 */ val InInitialEntityName: InInitialEntityName with scala.Double = js.native
  /* 4194304 */ val InObjectTypeLiteral: InObjectTypeLiteral with scala.Double = js.native
  /* 33554432 */ val InReverseMappedType: InReverseMappedType with scala.Double = js.native
  /* 8388608 */ val InTypeAlias: InTypeAlias with scala.Double = js.native
  /* 1024 */ val MultilineObjectLiterals: MultilineObjectLiterals with scala.Double = js.native
  /* 1 */ val NoTruncation: NoTruncation with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 8192 */ val OmitParameterModifiers: OmitParameterModifiers with scala.Double = js.native
  /* 256 */ val SuppressAnyReturnType: SuppressAnyReturnType with scala.Double = js.native
  /* 16384 */ val UseAliasDefinedOutsideCurrentScope: UseAliasDefinedOutsideCurrentScope with scala.Double = js.native
  /* 64 */ val UseFullyQualifiedType: UseFullyQualifiedType with scala.Double = js.native
  /* 128 */ val UseOnlyExternalAliasing: UseOnlyExternalAliasing with scala.Double = js.native
  /* 8 */ val UseStructuralFallback: UseStructuralFallback with scala.Double = js.native
  /* 4096 */ val UseTypeOfFunction: UseTypeOfFunction with scala.Double = js.native
  /* 2 */ val WriteArrayAsGenericType: WriteArrayAsGenericType with scala.Double = js.native
  /* 2048 */ val WriteClassExpressionAsTypeLiteral: WriteClassExpressionAsTypeLiteral with scala.Double = js.native
  /* 32 */ val WriteTypeArgumentsOfSignature: WriteTypeArgumentsOfSignature with scala.Double = js.native
  /* 512 */ val WriteTypeParametersInQualifiedName: WriteTypeParametersInQualifiedName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.NodeBuilderFlags with scala.Double] = js.native
}

