package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ambient extends StObject {
  
  var ambient: js.Array[Double] = js.native
  
  var directional: js.Array[_] = js.native
  
  var directionalShadow: js.Array[_] = js.native
  
  var directionalShadowMap: js.Array[_] = js.native
  
  var directionalShadowMatrix: js.Array[_] = js.native
  
  var hash: DirectionalLength = js.native
  
  var hemi: js.Array[_] = js.native
  
  var point: js.Array[_] = js.native
  
  var pointShadow: js.Array[_] = js.native
  
  var pointShadowMap: js.Array[_] = js.native
  
  var pointShadowMatrix: js.Array[_] = js.native
  
  var probe: js.Array[_] = js.native
  
  var rectArea: js.Array[_] = js.native
  
  var spot: js.Array[_] = js.native
  
  var spotShadow: js.Array[_] = js.native
  
  var spotShadowMap: js.Array[_] = js.native
  
  var spotShadowMatrix: js.Array[_] = js.native
  
  var version: Double = js.native
}
object Ambient {
  
  @scala.inline
  def apply(
    ambient: js.Array[Double],
    directional: js.Array[_],
    directionalShadow: js.Array[_],
    directionalShadowMap: js.Array[_],
    directionalShadowMatrix: js.Array[_],
    hash: DirectionalLength,
    hemi: js.Array[_],
    point: js.Array[_],
    pointShadow: js.Array[_],
    pointShadowMap: js.Array[_],
    pointShadowMatrix: js.Array[_],
    probe: js.Array[_],
    rectArea: js.Array[_],
    spot: js.Array[_],
    spotShadow: js.Array[_],
    spotShadowMap: js.Array[_],
    spotShadowMatrix: js.Array[_],
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
    def setDirectional(value: js.Array[_]): Self = StObject.set(x, "directional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadow(value: js.Array[_]): Self = StObject.set(x, "directionalShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadowMap(value: js.Array[_]): Self = StObject.set(x, "directionalShadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadowMapVarargs(value: js.Any*): Self = StObject.set(x, "directionalShadowMap", js.Array(value :_*))
    
    @scala.inline
    def setDirectionalShadowMatrix(value: js.Array[_]): Self = StObject.set(x, "directionalShadowMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionalShadowMatrixVarargs(value: js.Any*): Self = StObject.set(x, "directionalShadowMatrix", js.Array(value :_*))
    
    @scala.inline
    def setDirectionalShadowVarargs(value: js.Any*): Self = StObject.set(x, "directionalShadow", js.Array(value :_*))
    
    @scala.inline
    def setDirectionalVarargs(value: js.Any*): Self = StObject.set(x, "directional", js.Array(value :_*))
    
    @scala.inline
    def setHash(value: DirectionalLength): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHemi(value: js.Array[_]): Self = StObject.set(x, "hemi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHemiVarargs(value: js.Any*): Self = StObject.set(x, "hemi", js.Array(value :_*))
    
    @scala.inline
    def setPoint(value: js.Array[_]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadow(value: js.Array[_]): Self = StObject.set(x, "pointShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadowMap(value: js.Array[_]): Self = StObject.set(x, "pointShadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadowMapVarargs(value: js.Any*): Self = StObject.set(x, "pointShadowMap", js.Array(value :_*))
    
    @scala.inline
    def setPointShadowMatrix(value: js.Array[_]): Self = StObject.set(x, "pointShadowMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointShadowMatrixVarargs(value: js.Any*): Self = StObject.set(x, "pointShadowMatrix", js.Array(value :_*))
    
    @scala.inline
    def setPointShadowVarargs(value: js.Any*): Self = StObject.set(x, "pointShadow", js.Array(value :_*))
    
    @scala.inline
    def setPointVarargs(value: js.Any*): Self = StObject.set(x, "point", js.Array(value :_*))
    
    @scala.inline
    def setProbe(value: js.Array[_]): Self = StObject.set(x, "probe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProbeVarargs(value: js.Any*): Self = StObject.set(x, "probe", js.Array(value :_*))
    
    @scala.inline
    def setRectArea(value: js.Array[_]): Self = StObject.set(x, "rectArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectAreaVarargs(value: js.Any*): Self = StObject.set(x, "rectArea", js.Array(value :_*))
    
    @scala.inline
    def setSpot(value: js.Array[_]): Self = StObject.set(x, "spot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotShadow(value: js.Array[_]): Self = StObject.set(x, "spotShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotShadowMap(value: js.Array[_]): Self = StObject.set(x, "spotShadowMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotShadowMapVarargs(value: js.Any*): Self = StObject.set(x, "spotShadowMap", js.Array(value :_*))
    
    @scala.inline
    def setSpotShadowMatrix(value: js.Array[_]): Self = StObject.set(x, "spotShadowMatrix", value.asInstanceOf[js.Any])
    
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
