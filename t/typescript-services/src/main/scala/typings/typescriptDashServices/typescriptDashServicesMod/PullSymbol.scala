package typings.typescriptDashServices.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSymbol")
@js.native
class PullSymbol protected ()
  extends typings.typescriptDashServices.TypeScriptNs.PullSymbol {
  def this(name: String, declKind: typings.typescriptDashServices.TypeScriptNs.PullElementKind) = this()
}

/* static members */
@JSImport("typescript-services", "PullSymbol")
@js.native
object PullSymbol extends js.Object {
  def _isExternalModuleReferenceAlias(aliasSymbol: typings.typescriptDashServices.TypeScriptNs.PullTypeAliasSymbol): Boolean = js.native
  /* private */ def getDefaultConstructorSymbolForDocComments(classSymbol: js.Any): js.Any = js.native
  def getIsExternallyVisible(
    symbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
    fromIsExternallyVisibleSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typings.typescriptDashServices.TypeScriptNs.PullSymbol]
  ): Boolean = js.native
  def getTypeParameterString(typars: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol]): String = js.native
  def getTypeParameterString(
    typars: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol
  ): String = js.native
  def getTypeParameterString(
    typars: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
    useContraintInName: Boolean
  ): String = js.native
  def getTypeParameterStringEx(typeParameters: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol]): typings.typescriptDashServices.TypeScriptNs.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol
  ): typings.typescriptDashServices.TypeScriptNs.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
    getTypeParamMarkerInfo: Boolean
  ): typings.typescriptDashServices.TypeScriptNs.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typings.typescriptDashServices.TypeScriptNs.MemberNameArray = js.native
  /* private */ def unqualifiedNameReferencesDifferentSymbolInScope(symbol: js.Any, scopePath: js.Any, endScopePathIndex: js.Any): js.Any = js.native
}

