package typings.typescriptServices.global.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullSymbol")
@js.native
class PullSymbol protected ()
  extends typings.typescriptServices.TypeScript.PullSymbol {
  def this(name: String, declKind: typings.typescriptServices.TypeScript.PullElementKind) = this()
}

/* static members */
@JSGlobal("TypeScript.PullSymbol")
@js.native
object PullSymbol extends js.Object {
  def _isExternalModuleReferenceAlias(aliasSymbol: typings.typescriptServices.TypeScript.PullTypeAliasSymbol): Boolean = js.native
  /* private */ def getDefaultConstructorSymbolForDocComments(classSymbol: js.Any): js.Any = js.native
  def getIsExternallyVisible(
    symbol: typings.typescriptServices.TypeScript.PullSymbol,
    fromIsExternallyVisibleSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typings.typescriptServices.TypeScript.PullSymbol]
  ): Boolean = js.native
  def getTypeParameterString(typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol]): String = js.native
  def getTypeParameterString(
    typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): String = js.native
  def getTypeParameterString(
    typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    useContraintInName: Boolean
  ): String = js.native
  def getTypeParameterStringEx(typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol]): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = js.native
  /* private */ def unqualifiedNameReferencesDifferentSymbolInScope(symbol: js.Any, scopePath: js.Any, endScopePathIndex: js.Any): js.Any = js.native
}

