package typings.three.raycasterMod

import typings.three.face3Mod.Face3
import typings.three.object3DMod.Object3D
import typings.three.vector2Mod.Vector2
import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Intersection extends js.Object {
  var distance: Double = js.native
  var distanceToRay: js.UndefOr[Double] = js.native
  var face: js.UndefOr[Face3 | Null] = js.native
  var faceIndex: js.UndefOr[Double] = js.native
  var index: js.UndefOr[Double] = js.native
  var instanceId: js.UndefOr[Double] = js.native
  var `object`: Object3D = js.native
  var point: Vector3 = js.native
  var uv: js.UndefOr[Vector2] = js.native
}

object Intersection {
  @scala.inline
  def apply(distance: Double, `object`: Object3D, point: Vector3): Intersection = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intersection]
  }
  @scala.inline
  implicit class IntersectionOps[Self <: Intersection] (val x: Self) extends AnyVal {
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: Object3D): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoint(value: Vector3): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def setDistanceToRay(value: Double): Self = this.set("distanceToRay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceToRay: Self = this.set("distanceToRay", js.undefined)
    @scala.inline
    def setFace(value: Face3): Self = this.set("face", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFace: Self = this.set("face", js.undefined)
    @scala.inline
    def setFaceNull: Self = this.set("face", null)
    @scala.inline
    def setFaceIndex(value: Double): Self = this.set("faceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceIndex: Self = this.set("faceIndex", js.undefined)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setInstanceId(value: Double): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setUv(value: Vector2): Self = this.set("uv", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUv: Self = this.set("uv", js.undefined)
  }
  
}

