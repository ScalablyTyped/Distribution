package typings
package threeLib.srcCoreGeometryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MorphTarget extends js.Object {
  var name: java.lang.String
  var vertices: js.Array[threeLib.srcMathVector3Mod.Vector3]
}

object MorphTarget {
  @scala.inline
  def apply(name: java.lang.String, vertices: js.Array[threeLib.srcMathVector3Mod.Vector3]): MorphTarget = {
    val __obj = js.Dynamic.literal(name = name, vertices = vertices)
  
    __obj.asInstanceOf[MorphTarget]
  }
}

