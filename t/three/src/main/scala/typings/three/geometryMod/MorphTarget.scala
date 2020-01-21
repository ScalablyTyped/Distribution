package typings.three.geometryMod

import typings.three.vector3Mod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphTarget extends js.Object {
  var name: String
  var vertices: js.Array[Vector3]
}

object MorphTarget {
  @scala.inline
  def apply(name: String, vertices: js.Array[Vector3]): MorphTarget = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MorphTarget]
  }
}

