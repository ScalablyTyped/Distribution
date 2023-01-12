package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrapsTypeParameterCache extends StObject {
  
  /* private */ var _wrapsTypeParameterCache: Any
  
  def getWrapsTypeParameter(typeParameterArgumentMap: TypeArgumentMap): Double
  
  def setWrapsTypeParameter(typeParameterArgumentMap: TypeArgumentMap, wrappingTypeParameterID: Double): Unit
}
object WrapsTypeParameterCache {
  
  inline def apply(
    _wrapsTypeParameterCache: Any,
    getWrapsTypeParameter: TypeArgumentMap => Double,
    setWrapsTypeParameter: (TypeArgumentMap, Double) => Unit
  ): WrapsTypeParameterCache = {
    val __obj = js.Dynamic.literal(_wrapsTypeParameterCache = _wrapsTypeParameterCache.asInstanceOf[js.Any], getWrapsTypeParameter = js.Any.fromFunction1(getWrapsTypeParameter), setWrapsTypeParameter = js.Any.fromFunction2(setWrapsTypeParameter))
    __obj.asInstanceOf[WrapsTypeParameterCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WrapsTypeParameterCache] (val x: Self) extends AnyVal {
    
    inline def setGetWrapsTypeParameter(value: TypeArgumentMap => Double): Self = StObject.set(x, "getWrapsTypeParameter", js.Any.fromFunction1(value))
    
    inline def setSetWrapsTypeParameter(value: (TypeArgumentMap, Double) => Unit): Self = StObject.set(x, "setWrapsTypeParameter", js.Any.fromFunction2(value))
    
    inline def set_wrapsTypeParameterCache(value: Any): Self = StObject.set(x, "_wrapsTypeParameterCache", value.asInstanceOf[js.Any])
  }
}
