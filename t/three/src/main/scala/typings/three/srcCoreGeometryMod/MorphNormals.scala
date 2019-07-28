package typings.three.srcCoreGeometryMod

import typings.three.srcMathVector3Mod.Vector3
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
    val __obj = js.Dynamic.literal(name = name, normals = normals)
  
    __obj.asInstanceOf[MorphNormals]
  }
}

