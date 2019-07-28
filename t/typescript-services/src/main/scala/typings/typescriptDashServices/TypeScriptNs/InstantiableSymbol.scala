package typings.typescriptDashServices.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantiableSymbol extends js.Object {
  def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol]
  def getIsSpecialized(): Boolean
  def getTypeParameterArgumentMap(): TypeArgumentMap
}

object InstantiableSymbol {
  @scala.inline
  def apply(
    getAllowedToReferenceTypeParameters: () => js.Array[PullTypeParameterSymbol],
    getIsSpecialized: () => Boolean,
    getTypeParameterArgumentMap: () => TypeArgumentMap
  ): InstantiableSymbol = {
    val __obj = js.Dynamic.literal(getAllowedToReferenceTypeParameters = js.Any.fromFunction0(getAllowedToReferenceTypeParameters), getIsSpecialized = js.Any.fromFunction0(getIsSpecialized), getTypeParameterArgumentMap = js.Any.fromFunction0(getTypeParameterArgumentMap))
  
    __obj.asInstanceOf[InstantiableSymbol]
  }
}

