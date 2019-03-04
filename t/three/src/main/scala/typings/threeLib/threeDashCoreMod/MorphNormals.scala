package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphNormals extends js.Object {
  var name: java.lang.String
  var normals: js.Array[Vector3]
}

object MorphNormals {
  @scala.inline
  def apply(name: java.lang.String, normals: js.Array[Vector3]): MorphNormals = {
    val __obj = js.Dynamic.literal(name = name, normals = normals)
  
    __obj.asInstanceOf[MorphNormals]
  }
}

