package typings.wonderJs

import typings.wonderJs.face3Mod.Face3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFaces extends js.Object {
  var faces: js.Array[Face3]
  var vertices: js.Array[_]
}

object AnonFaces {
  @scala.inline
  def apply(faces: js.Array[Face3], vertices: js.Array[_]): AnonFaces = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFaces]
  }
}

