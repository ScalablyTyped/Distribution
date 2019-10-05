package typings.typescriptDashServices.typescriptDashServicesMod

import typings.typescriptDashServices.TypeScript.InstantiableSymbol
import typings.typescriptDashServices.TypeScript.TypeArgumentMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiationHelpers")
@js.native
object PullInstantiationHelpers extends js.Object {
  @js.native
  class MutableTypeArgumentMap protected ()
    extends typings.typescriptDashServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: TypeArgumentMap) = this()
  }
  
  def cleanUpTypeArgumentMap(
    symbol: InstantiableSymbol,
    mutableTypeArgumentMap: typings.typescriptDashServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  def createTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol]
  ): TypeArgumentMap = js.native
  def getAllowedToReferenceTypeParametersFromDecl(decl: typings.typescriptDashServices.TypeScript.PullDecl): js.Array[typings.typescriptDashServices.TypeScript.PullTypeParameterSymbol] = js.native
  def instantiateTypeArgument(
    resolver: typings.typescriptDashServices.TypeScript.PullTypeResolver,
    symbol: InstantiableSymbol,
    mutableTypeParameterMap: typings.typescriptDashServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typings.typescriptDashServices.TypeScript.PullTypeSymbol,
    type2: typings.typescriptDashServices.TypeScript.PullTypeSymbol
  ): Boolean = js.native
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol],
    mutableMap: typings.typescriptDashServices.TypeScript.PullInstantiationHelpers.MutableTypeArgumentMap
  ): Unit = js.native
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typings.typescriptDashServices.TypeScript.PullTypeParameterSymbol],
    typeArguments: js.Array[typings.typescriptDashServices.TypeScript.PullTypeSymbol],
    typeParameterArgumentMap: TypeArgumentMap
  ): TypeArgumentMap = js.native
}

