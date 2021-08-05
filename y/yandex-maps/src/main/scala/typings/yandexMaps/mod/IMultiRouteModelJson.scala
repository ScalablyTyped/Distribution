package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMultiRouteModelJson extends StObject {
  
  var params: IMultiRouteParams
  
  var referencePoints: js.Array[IMultiRouteReferencePoint]
}
object IMultiRouteModelJson {
  
  inline def apply(params: IMultiRouteParams, referencePoints: js.Array[IMultiRouteReferencePoint]): IMultiRouteModelJson = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], referencePoints = referencePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiRouteModelJson]
  }
  
  extension [Self <: IMultiRouteModelJson](x: Self) {
    
    inline def setParams(value: IMultiRouteParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setReferencePoints(value: js.Array[IMultiRouteReferencePoint]): Self = StObject.set(x, "referencePoints", value.asInstanceOf[js.Any])
    
    inline def setReferencePointsVarargs(value: IMultiRouteReferencePoint*): Self = StObject.set(x, "referencePoints", js.Array(value :_*))
  }
}
