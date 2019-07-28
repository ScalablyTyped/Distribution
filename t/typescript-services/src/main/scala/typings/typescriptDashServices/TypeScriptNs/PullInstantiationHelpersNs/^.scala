package typings.typescriptDashServices.TypeScriptNs.PullInstantiationHelpersNs

import typings.typescriptDashServices.TypeScriptNs.InstantiableSymbol
import typings.typescriptDashServices.TypeScriptNs.PullDecl
import typings.typescriptDashServices.TypeScriptNs.PullTypeParameterSymbol
import typings.typescriptDashServices.TypeScriptNs.PullTypeResolver
import typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol
import typings.typescriptDashServices.TypeScriptNs.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.PullInstantiationHelpers")
@js.native
object ^ extends js.Object {
  def cleanUpTypeArgumentMap(symbol: InstantiableSymbol, mutableTypeArgumentMap: MutableTypeArgumentMap): Unit = js.native
  def createTypeParameterArgumentMap(typeParameters: js.Array[PullTypeParameterSymbol], typeArguments: js.Array[PullTypeSymbol]): TypeArgumentMap = js.native
  def getAllowedToReferenceTypeParametersFromDecl(decl: PullDecl): js.Array[PullTypeParameterSymbol] = js.native
  def instantiateTypeArgument(
    resolver: PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: MutableTypeArgumentMap
  ): Unit = js.native
  def twoTypesAreInstantiationsOfSameNamedGenericType(type1: PullTypeSymbol, type2: PullTypeSymbol): Boolean = js.native
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[PullTypeParameterSymbol],
    typeArguments: js.Array[PullTypeSymbol],
    mutableMap: MutableTypeArgumentMap
  ): Unit = js.native
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[PullTypeParameterSymbol],
    typeArguments: js.Array[PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = js.native
}

