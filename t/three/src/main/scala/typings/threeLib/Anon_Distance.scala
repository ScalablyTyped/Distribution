package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Distance extends js.Object {
  var distance: scala.Double
  var `object`: threeLib.threeDashCoreMod.Object3D
}

object Anon_Distance {
  @scala.inline
  def apply(distance: scala.Double, `object`: threeLib.threeDashCoreMod.Object3D): Anon_Distance = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("distance")(distance)
    __obj.asInstanceOf[Anon_Distance]
  }
}

