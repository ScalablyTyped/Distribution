package typings.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapsTypeParameterCache extends js.Object {
  var _wrapsTypeParameterCache: js.Any
  def getWrapsTypeParameter(typeParameterArgumentMap: TypeArgumentMap): Double
  def setWrapsTypeParameter(typeParameterArgumentMap: TypeArgumentMap, wrappingTypeParameterID: Double): Unit
}

object WrapsTypeParameterCache {
  @scala.inline
  def apply(
    _wrapsTypeParameterCache: js.Any,
    getWrapsTypeParameter: TypeArgumentMap => Double,
    setWrapsTypeParameter: (TypeArgumentMap, Double) => Unit
  ): WrapsTypeParameterCache = {
    val __obj = js.Dynamic.literal(_wrapsTypeParameterCache = _wrapsTypeParameterCache.asInstanceOf[js.Any], getWrapsTypeParameter = js.Any.fromFunction1(getWrapsTypeParameter), setWrapsTypeParameter = js.Any.fromFunction2(setWrapsTypeParameter))
    __obj.asInstanceOf[WrapsTypeParameterCache]
  }
}

