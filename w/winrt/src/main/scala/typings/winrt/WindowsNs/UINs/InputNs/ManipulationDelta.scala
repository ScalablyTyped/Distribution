package typings.winrt.WindowsNs.UINs.InputNs

import typings.winrt.WindowsNs.FoundationNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManipulationDelta extends js.Object {
  var expansion: Double
  var rotation: Double
  var scale: Double
  var translation: Point
}

object ManipulationDelta {
  @scala.inline
  def apply(expansion: Double, rotation: Double, scale: Double, translation: Point): ManipulationDelta = {
    val __obj = js.Dynamic.literal(expansion = expansion, rotation = rotation, scale = scale, translation = translation)
  
    __obj.asInstanceOf[ManipulationDelta]
  }
}

