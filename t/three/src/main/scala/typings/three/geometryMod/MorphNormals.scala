package typings.three.geometryMod

import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphNormals extends js.Object {
  var name: String
  var normals: js.Array[Vector3]
}

object MorphNormals {
  @scala.inline
  def apply(name: String, normals: js.Array[Vector3]): MorphNormals = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], normals = normals.asInstanceOf[js.Any])
    __obj.asInstanceOf[MorphNormals]
  }
}

