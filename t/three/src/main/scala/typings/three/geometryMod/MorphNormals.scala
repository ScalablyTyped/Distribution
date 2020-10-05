package typings.three.geometryMod

import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MorphNormals extends js.Object {
  var name: String = js.native
  var normals: js.Array[Vector3] = js.native
}

object MorphNormals {
  @scala.inline
  def apply(name: String, normals: js.Array[Vector3]): MorphNormals = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any])
    __obj.asInstanceOf[MorphNormals]
  }
  @scala.inline
  implicit class MorphNormalsOps[Self <: MorphNormals] (val x: Self) extends AnyVal {
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
    def setNormalsVarargs(value: Vector3*): Self = this.set("normals", js.Array(value :_*))
    @scala.inline
    def setNormals(value: js.Array[Vector3]): Self = this.set("normals", value.asInstanceOf[js.Any])
  }
  
}

