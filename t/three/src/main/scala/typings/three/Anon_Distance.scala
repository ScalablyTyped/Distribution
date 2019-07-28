package typings.three

import typings.three.srcCoreObject3DMod.Object3D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Distance extends js.Object {
  var distance: Double
  var `object`: Object3D
}

object Anon_Distance {
  @scala.inline
  def apply(distance: Double, `object`: Object3D): Anon_Distance = {
    val __obj = js.Dynamic.literal(distance = distance)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_Distance]
  }
}

