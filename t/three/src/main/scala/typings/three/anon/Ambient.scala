package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ambient extends js.Object {
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
  implicit class AmbientOps[Self <: Ambient] (val x: Self) extends AnyVal {
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
    def setAmbientVarargs(value: Double*): Self = this.set("ambient", js.Array(value :_*))
    @scala.inline
    def setAmbient(value: js.Array[Double]): Self = this.set("ambient", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalVarargs(value: js.Any*): Self = this.set("directional", js.Array(value :_*))
    @scala.inline
    def setDirectional(value: js.Array[_]): Self = this.set("directional", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalShadowVarargs(value: js.Any*): Self = this.set("directionalShadow", js.Array(value :_*))
    @scala.inline
    def setDirectionalShadow(value: js.Array[_]): Self = this.set("directionalShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalShadowMapVarargs(value: js.Any*): Self = this.set("directionalShadowMap", js.Array(value :_*))
    @scala.inline
    def setDirectionalShadowMap(value: js.Array[_]): Self = this.set("directionalShadowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectionalShadowMatrixVarargs(value: js.Any*): Self = this.set("directionalShadowMatrix", js.Array(value :_*))
    @scala.inline
    def setDirectionalShadowMatrix(value: js.Array[_]): Self = this.set("directionalShadowMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: DirectionalLength): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setHemiVarargs(value: js.Any*): Self = this.set("hemi", js.Array(value :_*))
    @scala.inline
    def setHemi(value: js.Array[_]): Self = this.set("hemi", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointVarargs(value: js.Any*): Self = this.set("point", js.Array(value :_*))
    @scala.inline
    def setPoint(value: js.Array[_]): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointShadowVarargs(value: js.Any*): Self = this.set("pointShadow", js.Array(value :_*))
    @scala.inline
    def setPointShadow(value: js.Array[_]): Self = this.set("pointShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointShadowMapVarargs(value: js.Any*): Self = this.set("pointShadowMap", js.Array(value :_*))
    @scala.inline
    def setPointShadowMap(value: js.Array[_]): Self = this.set("pointShadowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setPointShadowMatrixVarargs(value: js.Any*): Self = this.set("pointShadowMatrix", js.Array(value :_*))
    @scala.inline
    def setPointShadowMatrix(value: js.Array[_]): Self = this.set("pointShadowMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setProbeVarargs(value: js.Any*): Self = this.set("probe", js.Array(value :_*))
    @scala.inline
    def setProbe(value: js.Array[_]): Self = this.set("probe", value.asInstanceOf[js.Any])
    @scala.inline
    def setRectAreaVarargs(value: js.Any*): Self = this.set("rectArea", js.Array(value :_*))
    @scala.inline
    def setRectArea(value: js.Array[_]): Self = this.set("rectArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotVarargs(value: js.Any*): Self = this.set("spot", js.Array(value :_*))
    @scala.inline
    def setSpot(value: js.Array[_]): Self = this.set("spot", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotShadowVarargs(value: js.Any*): Self = this.set("spotShadow", js.Array(value :_*))
    @scala.inline
    def setSpotShadow(value: js.Array[_]): Self = this.set("spotShadow", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotShadowMapVarargs(value: js.Any*): Self = this.set("spotShadowMap", js.Array(value :_*))
    @scala.inline
    def setSpotShadowMap(value: js.Array[_]): Self = this.set("spotShadowMap", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpotShadowMatrixVarargs(value: js.Any*): Self = this.set("spotShadowMatrix", js.Array(value :_*))
    @scala.inline
    def setSpotShadowMatrix(value: js.Array[_]): Self = this.set("spotShadowMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

