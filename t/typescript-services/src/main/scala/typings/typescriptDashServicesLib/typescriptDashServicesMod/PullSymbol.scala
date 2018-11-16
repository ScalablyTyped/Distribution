package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullSymbol")
@js.native
class PullSymbol protected ()
  extends typescriptDashServicesLib.TypeScriptNs.PullSymbol {
  def this(name: java.lang.String, declKind: typescriptDashServicesLib.TypeScriptNs.PullElementKind) = this()
}

@JSImport("typescript-services", "PullSymbol")
@js.native
object PullSymbol extends js.Object {
  def _isExternalModuleReferenceAlias(aliasSymbol: typescriptDashServicesLib.TypeScriptNs.PullTypeAliasSymbol): scala.Boolean = js.native
  /* private */ def getDefaultConstructorSymbolForDocComments(classSymbol: js.Any): js.Any = js.native
  def getIsExternallyVisible(
    symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    fromIsExternallyVisibleSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSymbol]
  ): scala.Boolean = js.native
  def getTypeParameterString(typars: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol]): java.lang.String = js.native
  def getTypeParameterString(
    typars: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): java.lang.String = js.native
  def getTypeParameterString(
    typars: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    useContraintInName: scala.Boolean
  ): java.lang.String = js.native
  def getTypeParameterStringEx(typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol]): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
  ): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    getTypeParamMarkerInfo: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    scopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
    getTypeParamMarkerInfo: scala.Boolean,
    useContraintInName: scala.Boolean
  ): typescriptDashServicesLib.TypeScriptNs.MemberNameArray = js.native
  /* private */ def unqualifiedNameReferencesDifferentSymbolInScope(symbol: js.Any, scopePath: js.Any, endScopePathIndex: js.Any): js.Any = js.native
}

