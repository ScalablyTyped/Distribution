package typings.unlDashCore.unlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("unl-core", "encode")
@js.native
object encode extends js.Object {
  def apply(latitude: Double, longitude: Double): String = js.native
  def apply(latitude: Double, longitude: Double, precision: Double): String = js.native
  def apply(latitude: Double, longitude: Double, precision: Double, options: EncodeOptions): String = js.native
}

