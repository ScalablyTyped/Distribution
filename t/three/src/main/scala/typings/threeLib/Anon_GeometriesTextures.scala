package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GeometriesTextures extends js.Object {
  var geometries: scala.Double
  var textures: scala.Double
}

object Anon_GeometriesTextures {
  @scala.inline
  def apply(geometries: scala.Double, textures: scala.Double): Anon_GeometriesTextures = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("geometries")(geometries)
    __obj.updateDynamic("textures")(textures)
    __obj.asInstanceOf[Anon_GeometriesTextures]
  }
}

