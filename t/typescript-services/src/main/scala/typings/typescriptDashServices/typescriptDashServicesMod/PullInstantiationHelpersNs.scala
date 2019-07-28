package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScriptNs.InstantiableSymbol
import typings.typescriptDashServices.TypeScriptNs.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiationHelpers")
@js.native
object PullInstantiationHelpersNs extends js.Object {
  @js.native
  class MutableTypeArgumentMap protected ()
    extends typings.typescriptDashServices.TypeScriptNs.PullInstantiationHelpersNs.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
  }
  
  def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typings.typescriptDashServices.TypeScriptNs.PullInstantiationHelpersNs.MutableTypeArgumentMap
  ): Unit = js.native
  def createTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol]
  ): TypeArgumentMap = js.native
  def getAllowedToReferenceTypeParametersFromDecl(decl: typings.typescriptDashServices.TypeScriptNs.PullDecl): js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeParameterSymbol] = js.native
  def instantiateTypeArgument(
    resolver: typings.typescriptDashServices.TypeScriptNs.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typings.typescriptDashServices.TypeScriptNs.PullInstantiationHelpersNs.MutableTypeArgumentMap
  ): Unit = js.native
  def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol,
    type2: typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol
  ): Boolean = js.native
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol],
    mutableMap: typings.typescriptDashServices.TypeScriptNs.PullInstantiationHelpersNs.MutableTypeArgumentMap
  ): Unit = js.native
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptDashServices.TypeScriptNs.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = js.native
}

