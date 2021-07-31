package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ambient extends StObject {
  
  var ambient: js.Array[Double]
  
  var directional: js.Array[js.Any]
  
  var directionalShadow: js.Array[js.Any]
  
  var directionalShadowMap: js.Array[js.Any]
  
  var directionalShadowMatrix: js.Array[js.Any]
  
  var hash: DirectionalLength
  
  var hemi: js.Array[js.Any]
  
  var point: js.Array[js.Any]
  
  var pointShadow: js.Array[js.Any]
  
  var pointShadowMap: js.Array[js.Any]
  
  var pointShadowMatrix: js.Array[js.Any]
  
  var probe: js.Array[js.Any]
  
  var rectArea: js.Array[js.Any]
  
  var spot: js.Array[js.Any]
  
  var spotShadow: js.Array[js.Any]
  
  var spotShadowMap: js.Array[js.Any]
  
  var spotShadowMatrix: js.Array[js.Any]
  
  var version: Double
}
object Ambient {
  
  @scala.inline
  def apply(
    ambient: js.Array[Double],
    directional: js.Array[js.Any],
    directionalShadow: js.Array[js.Any],
    directionalShadowMap: js.Array[js.Any],
    directionalShadowMatrix: js.Array[js.Any],
    hash: DirectionalLength,
    hemi: js.Array[js.Any],
    point: js.Array[js.Any],
    pointShadow: js.Array[js.Any],
    pointShadowMap: js.Array[js.Any],
    pointShadowMatrix: js.Array[js.Any],
    probe: js.Array[js.Any],
    rectArea: js.Array[js.Any],
    spot: js.Array[js.Any],
    spotShadow: js.Array[js.Any],
    spotShadowMap: js.Array[js.Any],
    spotShadowMatrix: js.Array[js.Any],
    version: Double
  ): Ambient = {
    val __obj = js.Dynamic.literal(ambient = ambient.asInstanceOf[js.Any], directional = directional.asInstanceOf[js.Any], directionalShadow = directionalShadow.asInstanceOf[js.Any], directionalShadowMap = directionalShadowMap.asInstanceOf[js.Any], directionalShadowMatrix = directionalShadowMatrix.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], hemi = hemi.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], pointShadow = pointShadow.asInstanceOf[js.Any], pointShadowMap = pointShadowMap.asInstanceOf[js.Any], pointShadowMatrix = pointShadowMatrix.asInstanceOf[js.Any], probe = probe.asInstanceOf[js.Any], rectArea = rectArea.asInstanceOf[js.Any], spot = spot.asInstanceOf[js.Any], spotShadow = spotShadow.asInstanceOf[js.Any], spotShadowMap = spotShadowMap.asInstanceOf[js.Any], spotShadowMatrix = spotShadowMatrix.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ambient]
  }
  
  @scala.inline
  implicit class AmbientMutableBuilder[Self <: Ambient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmbient(value: js.Array[Double]): Self = StObject.set(x, "ambient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmbientVarargs(value: Double*): Self = StObject.set(x, "ambient", js.Array(value :_*))
    
    @scala.inline
    def setDirectional(value: js.Array[js.Any]): Self = StObject.set(x, "directional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadow(value: js.Array[js.Any]): Self = StObject.set(x, "directionalShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadowMap(value: js.Array[js.Any]): Self = StObject.set(x, "directionalShadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadowMapVarargs(value: js.Any*): Self = StObject.set(x, "directionalShadowMap", js.Array(value :_*))
    
    @scala.inline
    def setDirectionalShadowMatrix(value: js.Array[js.Any]): Self = StObject.set(x, "directionalShadowMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadowMatrixVarargs(value: js.Any*): Self = StObject.set(x, "directionalShadowMatrix", js.Array(value :_*))
    
    @scala.inline
    def setDirectionalShadowVarargs(value: js.Any*): Self = StObject.set(x, "directionalShadow", js.Array(value :_*))
    
    @scala.inline
    def setDirectionalVarargs(value: js.Any*): Self = StObject.set(x, "directional", js.Array(value :_*))
    
    @scala.inline
    def setHash(value: DirectionalLength): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHemi(value: js.Array[js.Any]): Self = StObject.set(x, "hemi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHemiVarargs(value: js.Any*): Self = StObject.set(x, "hemi", js.Array(value :_*))
    
    @scala.inline
    def setPoint(value: js.Array[js.Any]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadow(value: js.Array[js.Any]): Self = StObject.set(x, "pointShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadowMap(value: js.Array[js.Any]): Self = StObject.set(x, "pointShadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadowMapVarargs(value: js.Any*): Self = StObject.set(x, "pointShadowMap", js.Array(value :_*))
    
    @scala.inline
    def setPointShadowMatrix(value: js.Array[js.Any]): Self = StObject.set(x, "pointShadowMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadowMatrixVarargs(value: js.Any*): Self = StObject.set(x, "pointShadowMatrix", js.Array(value :_*))
    
    @scala.inline
    def setPointShadowVarargs(value: js.Any*): Self = StObject.set(x, "pointShadow", js.Array(value :_*))
    
    @scala.inline
    def setPointVarargs(value: js.Any*): Self = StObject.set(x, "point", js.Array(value :_*))
    
    @scala.inline
    def setProbe(value: js.Array[js.Any]): Self = StObject.set(x, "probe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbeVarargs(value: js.Any*): Self = StObject.set(x, "probe", js.Array(value :_*))
    
    @scala.inline
    def setRectArea(value: js.Array[js.Any]): Self = StObject.set(x, "rectArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectAreaVarargs(value: js.Any*): Self = StObject.set(x, "rectArea", js.Array(value :_*))
    
    @scala.inline
    def setSpot(value: js.Array[js.Any]): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotShadow(value: js.Array[js.Any]): Self = StObject.set(x, "spotShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotShadowMap(value: js.Array[js.Any]): Self = StObject.set(x, "spotShadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotShadowMapVarargs(value: js.Any*): Self = StObject.set(x, "spotShadowMap", js.Array(value :_*))
    
    @scala.inline
    def setSpotShadowMatrix(value: js.Array[js.Any]): Self = StObject.set(x, "spotShadowMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotShadowMatrixVarargs(value: js.Any*): Self = StObject.set(x, "spotShadowMatrix", js.Array(value :_*))
    
    @scala.inline
    def setSpotShadowVarargs(value: js.Any*): Self = StObject.set(x, "spotShadow", js.Array(value :_*))
    
    @scala.inline
    def setSpotVarargs(value: js.Any*): Self = StObject.set(x, "spot", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
