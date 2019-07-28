package typings.three.srcCoreGeometryMod

import typings.three.srcMathVector3Mod.Vector3
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
    val __obj = js.Dynamic.literal(name = name, vertices = vertices)
  
    __obj.asInstanceOf[MorphTarget]
  }
}

