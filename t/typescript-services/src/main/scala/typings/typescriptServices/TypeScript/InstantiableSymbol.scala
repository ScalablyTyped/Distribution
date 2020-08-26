package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstantiableSymbol extends js.Object {
  def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol] = js.native
  def getIsSpecialized(): Boolean = js.native
  def getTypeParameterArgumentMap(): TypeArgumentMap = js.native
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
  @scala.inline
  implicit class InstantiableSymbolOps[Self <: InstantiableSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetAllowedToReferenceTypeParameters(value: () => js.Array[PullTypeParameterSymbol]): Self = this.set("getAllowedToReferenceTypeParameters", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsSpecialized(value: () => Boolean): Self = this.set("getIsSpecialized", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTypeParameterArgumentMap(value: () => TypeArgumentMap): Self = this.set("getTypeParameterArgumentMap", js.Any.fromFunction0(value))
  }
  
}

