package typings.three.geometryMod

import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MorphTarget extends js.Object {
  var name: String = js.native
  var vertices: js.Array[Vector3] = js.native
}

object MorphTarget {
  @scala.inline
  def apply(name: String, vertices: js.Array[Vector3]): MorphTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[MorphTarget]
  }
  @scala.inline
  implicit class MorphTargetOps[Self <: MorphTarget] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticesVarargs(value: Vector3*): Self = this.set("vertices", js.Array(value :_*))
    @scala.inline
    def setVertices(value: js.Array[Vector3]): Self = this.set("vertices", value.asInstanceOf[js.Any])
  }
  
}

