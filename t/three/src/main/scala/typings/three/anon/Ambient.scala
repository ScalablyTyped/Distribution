package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ambient extends StObject {
  
  var ambient: js.Array[Double]
  
  var directional: js.Array[Any]
  
  var directionalShadow: js.Array[Any]
  
  var directionalShadowMap: js.Array[Any]
  
  var directionalShadowMatrix: js.Array[Any]
  
  var hash: DirectionalLength
  
  var hemi: js.Array[Any]
  
  var point: js.Array[Any]
  
  var pointShadow: js.Array[Any]
  
  var pointShadowMap: js.Array[Any]
  
  var pointShadowMatrix: js.Array[Any]
  
  var probe: js.Array[Any]
  
  var rectArea: js.Array[Any]
  
  var spot: js.Array[Any]
  
  var spotShadow: js.Array[Any]
  
  var spotShadowMap: js.Array[Any]
  
  var spotShadowMatrix: js.Array[Any]
  
  var version: Double
}
object Ambient {
  
  inline def apply(
    ambient: js.Array[Double],
    directional: js.Array[Any],
    directionalShadow: js.Array[Any],
    directionalShadowMap: js.Array[Any],
    directionalShadowMatrix: js.Array[Any],
    hash: DirectionalLength,
    hemi: js.Array[Any],
    point: js.Array[Any],
    pointShadow: js.Array[Any],
    pointShadowMap: js.Array[Any],
    pointShadowMatrix: js.Array[Any],
    probe: js.Array[Any],
    rectArea: js.Array[Any],
    spot: js.Array[Any],
    spotShadow: js.Array[Any],
    spotShadowMap: js.Array[Any],
    spotShadowMatrix: js.Array[Any],
    version: Double
  ): Ambient = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], directional = directional.asInstanceOf[js.Any], directionalShadow = directionalShadow.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hemi = hemi.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointShadow = pointShadow.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], probe = probe.asInstanceOf[js.Any], rectArea = rectArea.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any], spotShadow = spotShadow.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any], spotShadowMatrix = spotShadowMatrix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ambient]
  }
  
  extension [Self <: Ambient](x: Self) {
    
    inline def setAmbient(value: js.Array[Double]): Self = StObject.set(x, "ambient", value.asInstanceOf[js.Any])
    
    inline def setAmbientVarargs(value: Double*): Self = StObject.set(x, "ambient", js.Array(value*))
    
    inline def setDirectional(value: js.Array[Any]): Self = StObject.set(x, "directional", value.asInstanceOf[js.Any])
    
    inline def setDirectionalShadow(value: js.Array[Any]): Self = StObject.set(x, "directionalShadow", value.asInstanceOf[js.Any])
    
    inline def setDirectionalShadowMap(value: js.Array[Any]): Self = StObject.set(x, "directionalShadowMap", value.asInstanceOf[js.Any])
    
    inline def setDirectionalShadowMapVarargs(value: Any*): Self = StObject.set(x, "directionalShadowMap", js.Array(value*))
    
    inline def setDirectionalShadowMatrix(value: js.Array[Any]): Self = StObject.set(x, "directionalShadowMatrix", value.asInstanceOf[js.Any])
    
    inline def setDirectionalShadowMatrixVarargs(value: Any*): Self = StObject.set(x, "directionalShadowMatrix", js.Array(value*))
    
    inline def setDirectionalShadowVarargs(value: Any*): Self = StObject.set(x, "directionalShadow", js.Array(value*))
    
    inline def setDirectionalVarargs(value: Any*): Self = StObject.set(x, "directional", js.Array(value*))
    
    inline def setHash(value: DirectionalLength): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHemi(value: js.Array[Any]): Self = StObject.set(x, "hemi", value.asInstanceOf[js.Any])
    
    inline def setHemiVarargs(value: Any*): Self = StObject.set(x, "hemi", js.Array(value*))
    
    inline def setPoint(value: js.Array[Any]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointShadow(value: js.Array[Any]): Self = StObject.set(x, "pointShadow", value.asInstanceOf[js.Any])
    
    inline def setPointShadowMap(value: js.Array[Any]): Self = StObject.set(x, "pointShadowMap", value.asInstanceOf[js.Any])
    
    inline def setPointShadowMapVarargs(value: Any*): Self = StObject.set(x, "pointShadowMap", js.Array(value*))
    
    inline def setPointShadowMatrix(value: js.Array[Any]): Self = StObject.set(x, "pointShadowMatrix", value.asInstanceOf[js.Any])
    
    inline def setPointShadowMatrixVarargs(value: Any*): Self = StObject.set(x, "pointShadowMatrix", js.Array(value*))
    
    inline def setPointShadowVarargs(value: Any*): Self = StObject.set(x, "pointShadow", js.Array(value*))
    
    inline def setPointVarargs(value: Any*): Self = StObject.set(x, "point", js.Array(value*))
    
    inline def setProbe(value: js.Array[Any]): Self = StObject.set(x, "probe", value.asInstanceOf[js.Any])
    
    inline def setProbeVarargs(value: Any*): Self = StObject.set(x, "probe", js.Array(value*))
    
    inline def setRectArea(value: js.Array[Any]): Self = StObject.set(x, "rectArea", value.asInstanceOf[js.Any])
    
    inline def setRectAreaVarargs(value: Any*): Self = StObject.set(x, "rectArea", js.Array(value*))
    
    inline def setSpot(value: js.Array[Any]): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
    
    inline def setSpotShadow(value: js.Array[Any]): Self = StObject.set(x, "spotShadow", value.asInstanceOf[js.Any])
    
    inline def setSpotShadowMap(value: js.Array[Any]): Self = StObject.set(x, "spotShadowMap", value.asInstanceOf[js.Any])
    
    inline def setSpotShadowMapVarargs(value: Any*): Self = StObject.set(x, "spotShadowMap", js.Array(value*))
    
    inline def setSpotShadowMatrix(value: js.Array[Any]): Self = StObject.set(x, "spotShadowMatrix", value.asInstanceOf[js.Any])
    
    inline def setSpotShadowMatrixVarargs(value: Any*): Self = StObject.set(x, "spotShadowMatrix", js.Array(value*))
    
    inline def setSpotShadowVarargs(value: Any*): Self = StObject.set(x, "spotShadow", js.Array(value*))
    
    inline def setSpotVarargs(value: Any*): Self = StObject.set(x, "spot", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
