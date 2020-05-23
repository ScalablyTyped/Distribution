package typings.three.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Textures extends js.Object {
  var geometries: Double
  var textures: Double
}

object Textures {
  @scala.inline
  def apply(geometries: Double, textures: Double): Textures = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Textures]
  }
}

