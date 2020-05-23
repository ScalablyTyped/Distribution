package typings.wonderJs.anon

import typings.wonderJs.face3Mod.Face3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Faces extends js.Object {
  var faces: js.Array[Face3]
  var vertices: js.Array[_]
}

object Faces {
  @scala.inline
  def apply(faces: js.Array[Face3], vertices: js.Array[_]): Faces = {
    val __obj = js.Dynamic.literal(faces = faces.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Faces]
  }
}

