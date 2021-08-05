package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstantiableSymbol extends StObject {
  
  def getAllowedToReferenceTypeParameters(): js.Array[PullTypeParameterSymbol]
  
  def getIsSpecialized(): Boolean
  
  def getTypeParameterArgumentMap(): TypeArgumentMap
}
object InstantiableSymbol {
  
  inline def apply(
    getAllowedToReferenceTypeParameters: () => js.Array[PullTypeParameterSymbol],
    getIsSpecialized: () => Boolean,
    getTypeParameterArgumentMap: () => TypeArgumentMap
  ): InstantiableSymbol = {
    val __obj = js.Dynamic.literal(getAllowedToReferenceTypeParameters = js.Any.fromFunction0(getAllowedToReferenceTypeParameters), getIsSpecialized = js.Any.fromFunction0(getIsSpecialized), getTypeParameterArgumentMap = js.Any.fromFunction0(getTypeParameterArgumentMap))
    __obj.asInstanceOf[InstantiableSymbol]
  }
  
  extension [Self <: InstantiableSymbol](x: Self) {
    
    inline def setGetAllowedToReferenceTypeParameters(value: () => js.Array[PullTypeParameterSymbol]): Self = StObject.set(x, "getAllowedToReferenceTypeParameters", js.Any.fromFunction0(value))
    
    inline def setGetIsSpecialized(value: () => Boolean): Self = StObject.set(x, "getIsSpecialized", js.Any.fromFunction0(value))
    
    inline def setGetTypeParameterArgumentMap(value: () => TypeArgumentMap): Self = StObject.set(x, "getTypeParameterArgumentMap", js.Any.fromFunction0(value))
  }
}
