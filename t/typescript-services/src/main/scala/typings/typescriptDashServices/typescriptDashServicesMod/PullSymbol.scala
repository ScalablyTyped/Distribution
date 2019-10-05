package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.PullElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSymbol")
@js.native
class PullSymbol protected ()
  extends typings.typescriptDashServices.TypeScript.PullSymbol {
  def this(name: String, declKind: PullElementKind) = this()
}

/* static members */
@JSImport("typescript-services", "PullSymbol")
@js.native
object PullSymbol extends js.Object {
  def _isExternalModuleReferenceAlias(aliasSymbol: typings.typescriptDashServices.TypeScript.PullTypeAliasSymbol): Boolean = js.native
  /* private */ def getDefaultConstructorSymbolForDocComments(classSymbol: js.Any): js.Any = js.native
  def getIsExternallyVisible(
    symbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    fromIsExternallyVisibleSymbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typings.typescriptDashServices.TypeScript.PullSymbol]
  ): Boolean = js.native
  def getTypeParameterString(typars: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol]): String = js.native
  def getTypeParameterString(
    typars: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol
  ): String = js.native
  def getTypeParameterString(
    typars: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    useContraintInName: Boolean
  ): String = js.native
  def getTypeParameterStringEx(typeParameters: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol]): typings.typescriptDashServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol
  ): typings.typescriptDashServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean
  ): typings.typescriptDashServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typings.typescriptDashServices.TypeScript.MemberNameArray = js.native
  /* private */ def unqualifiedNameReferencesDifferentSymbolInScope(symbol: js.Any, scopePath: js.Any, endScopePathIndex: js.Any): js.Any = js.native
}

