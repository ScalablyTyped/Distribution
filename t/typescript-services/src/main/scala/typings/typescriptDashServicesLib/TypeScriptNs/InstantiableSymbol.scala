package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantiableSymbol extends js.Object {
  def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol]
  def getIsSpecialized(): scala.Boolean
  def getTypeParameterArgumentMap(): TypeArgumentMap
}

object InstantiableSymbol {
  @scala.inline
  def apply(
    getAllowedToReferenceTypeParameters: js.Function0[js.Array[PullTypeParameterSymbol]],
    getIsSpecialized: js.Function0[scala.Boolean],
    getTypeParameterArgumentMap: js.Function0[TypeArgumentMap]
  ): InstantiableSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAllowedToReferenceTypeParameters")(getAllowedToReferenceTypeParameters)
    __obj.updateDynamic("getIsSpecialized")(getIsSpecialized)
    __obj.updateDynamic("getTypeParameterArgumentMap")(getTypeParameterArgumentMap)
    __obj.asInstanceOf[InstantiableSymbol]
  }
}

