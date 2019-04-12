package typings
package threeLib.srcCoreGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphNormals extends js.Object {
  var name: java.lang.String
  var normals: js.Array[threeLib.srcMathVector3Mod.Vector3]
}

object MorphNormals {
  @scala.inline
  def apply(name: java.lang.String, normals: js.Array[threeLib.srcMathVector3Mod.Vector3]): MorphNormals = {
    val __obj = js.Dynamic.literal(name = name, normals = normals)
  
    __obj.asInstanceOf[MorphNormals]
  }
}

