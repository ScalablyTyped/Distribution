package typings.three

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTextures extends js.Object {
  var geometries: Double
  var textures: Double
}

object AnonTextures {
  @scala.inline
  def apply(geometries: Double, textures: Double): AnonTextures = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any], textures = textures.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTextures]
  }
}

