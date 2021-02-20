package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullSymbol")
@js.native
class PullSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullSymbol {
  def this(name: String, declKind: typings.typescriptServices.TypeScript.PullElementKind) = this()
}
object PullSymbol {
  
  /* static member */
  @JSGlobal("TypeScript.PullSymbol.getDefaultConstructorSymbolForDocComments")
  @js.native
  def getDefaultConstructorSymbolForDocComments(classSymbol: js.Any): js.Any = js.native
  
  /* static member */
  @JSGlobal("TypeScript.PullSymbol.getIsExternallyVisible")
  @js.native
  def getIsExternallyVisible(
    symbol: typings.typescriptServices.TypeScript.PullSymbol,
    fromIsExternallyVisibleSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typings.typescriptServices.TypeScript.PullSymbol]
  ): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterString")
  @js.native
  def getTypeParameterString(typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol]): String = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterString")
  @js.native
  def getTypeParameterString(
    typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: js.UndefOr[scala.Nothing],
    useContraintInName: Boolean
  ): String = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterString")
  @js.native
  def getTypeParameterString(
    typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): String = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterString")
  @js.native
  def getTypeParameterString(
    typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    useContraintInName: Boolean
  ): String = js.native
  
  /* static member */
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterStringEx")
  @js.native
  def getTypeParameterStringEx(typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol]): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterStringEx")
  @js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: js.UndefOr[scala.Nothing],
    getTypeParamMarkerInfo: js.UndefOr[scala.Nothing],
    useContraintInName: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterStringEx")
  @js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: js.UndefOr[scala.Nothing],
    getTypeParamMarkerInfo: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterStringEx")
  @js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: js.UndefOr[scala.Nothing],
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterStringEx")
  @js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterStringEx")
  @js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: js.UndefOr[scala.Nothing],
    useContraintInName: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterStringEx")
  @js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  @JSGlobal("TypeScript.PullSymbol.getTypeParameterStringEx")
  @js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  
  /* static member */
  @JSGlobal("TypeScript.PullSymbol._isExternalModuleReferenceAlias")
  @js.native
  def isExternalModuleReferenceAlias(aliasSymbol: typings.typescriptServices.TypeScript.PullTypeAliasSymbol): Boolean = js.native
  
  /* static member */
  @JSGlobal("TypeScript.PullSymbol.unqualifiedNameReferencesDifferentSymbolInScope")
  @js.native
  def unqualifiedNameReferencesDifferentSymbolInScope(symbol: js.Any, scopePath: js.Any, endScopePathIndex: js.Any): js.Any = js.native
}
