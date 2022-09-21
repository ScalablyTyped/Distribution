package typings.typescriptServices.global.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("TypeScript.PullSymbol")
@js.native
open class PullSymbol protected ()
  extends StObject
     with typings.typescriptServices.TypeScript.PullSymbol {
  def this(name: String, declKind: typings.typescriptServices.TypeScript.PullElementKind) = this()
}
object PullSymbol {
  
  @JSGlobal("TypeScript.PullSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getDefaultConstructorSymbolForDocComments(classSymbol: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultConstructorSymbolForDocComments")(classSymbol.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /* static member */
  inline def getIsExternallyVisible(
    symbol: typings.typescriptServices.TypeScript.PullSymbol,
    fromIsExternallyVisibleSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    inIsExternallyVisibleSymbols: js.Array[typings.typescriptServices.TypeScript.PullSymbol]
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getIsExternallyVisible")(symbol.asInstanceOf[js.Any], fromIsExternallyVisibleSymbol.asInstanceOf[js.Any], inIsExternallyVisibleSymbols.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def getTypeParameterString(typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterString")(typars.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTypeParameterString(
    typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: Unit,
    useContraintInName: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterString")(typars.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getTypeParameterString(
    typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterString")(typars.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getTypeParameterString(
    typars: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    useContraintInName: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterString")(typars.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def getTypeParameterStringEx(typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol]): typings.typescriptServices.TypeScript.MemberNameArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any]).asInstanceOf[typings.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: Unit,
    getTypeParamMarkerInfo: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: Unit,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: Unit,
    getTypeParamMarkerInfo: Unit,
    useContraintInName: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol
  ): typings.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Boolean,
    useContraintInName: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.MemberNameArray]
  inline def getTypeParameterStringEx(
    typeParameters: js.Array[typings.typescriptServices.TypeScript.PullTypeSymbol],
    scopeSymbol: typings.typescriptServices.TypeScript.PullSymbol,
    getTypeParamMarkerInfo: Unit,
    useContraintInName: Boolean
  ): typings.typescriptServices.TypeScript.MemberNameArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getTypeParameterStringEx")(typeParameters.asInstanceOf[js.Any], scopeSymbol.asInstanceOf[js.Any], getTypeParamMarkerInfo.asInstanceOf[js.Any], useContraintInName.asInstanceOf[js.Any])).asInstanceOf[typings.typescriptServices.TypeScript.MemberNameArray]
  
  /* static member */
  inline def isExternalModuleReferenceAlias(aliasSymbol: typings.typescriptServices.TypeScript.PullTypeAliasSymbol): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isExternalModuleReferenceAlias")(aliasSymbol.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def unqualifiedNameReferencesDifferentSymbolInScope(symbol: Any, scopePath: Any, endScopePathIndex: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unqualifiedNameReferencesDifferentSymbolInScope")(symbol.asInstanceOf[js.Any], scopePath.asInstanceOf[js.Any], endScopePathIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
}
