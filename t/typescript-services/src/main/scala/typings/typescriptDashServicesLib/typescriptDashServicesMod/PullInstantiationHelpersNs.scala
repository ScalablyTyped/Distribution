package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "PullInstantiationHelpers")
@js.native
object PullInstantiationHelpersNs extends js.Object {
  @js.native
  class MutableTypeArgumentMap protected ()
    extends typescriptDashServicesLib.TypeScriptNs.PullInstantiationHelpersNs.MutableTypeArgumentMap {
    def this(typeParameterArgumentMap: typescriptDashServicesLib.TypeScriptNs.TypeArgumentMap) = this()
  }
  
  def cleanUpTypeArgumentMap(
    symbol: typescriptDashServicesLib.TypeScriptNs.InstantiableSymbol,
    mutableTypeArgumentMap: typescriptDashServicesLib.TypeScriptNs.PullInstantiationHelpersNs.MutableTypeArgumentMap
  ): scala.Unit = js.native
  def createTypeParameterArgumentMap(
    typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeParameterSymbol],
    typeArguments: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol]
  ): typescriptDashServicesLib.TypeScriptNs.TypeArgumentMap = js.native
  def getAllowedToReferenceTypeParametersFromDecl(decl: typescriptDashServicesLib.TypeScriptNs.PullDecl): js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeParameterSymbol] = js.native
  def instantiateTypeArgument(
    resolver: typescriptDashServicesLib.TypeScriptNs.PullTypeResolver,
    symbol: typescriptDashServicesLib.TypeScriptNs.InstantiableSymbol,
    mutableTypeParameterMap: typescriptDashServicesLib.TypeScriptNs.PullInstantiationHelpersNs.MutableTypeArgumentMap
  ): scala.Unit = js.native
  def twoTypesAreInstantiationsOfSameNamedGenericType(
    type1: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol,
    type2: typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol
  ): scala.Boolean = js.native
  def updateMutableTypeParameterArgumentMap(
    typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeParameterSymbol],
    typeArguments: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    mutableMap: typescriptDashServicesLib.TypeScriptNs.PullInstantiationHelpersNs.MutableTypeArgumentMap
  ): scala.Unit = js.native
  def updateTypeParameterArgumentMap(
    typeParameters: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeParameterSymbol],
    typeArguments: js.Array[typescriptDashServicesLib.TypeScriptNs.PullTypeSymbol],
    typeParameterArgumentMap: typescriptDashServicesLib.TypeScriptNs.TypeArgumentMap
  ): typescriptDashServicesLib.TypeScriptNs.TypeArgumentMap = js.native
}

