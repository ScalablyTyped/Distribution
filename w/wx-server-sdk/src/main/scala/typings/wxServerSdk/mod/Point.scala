package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point extends js.Object {
  var coordinates: PointCoordinates = js.native
  var `type`: typings.wxServerSdk.wxServerSdkStrings.Point = js.native
  def apply(longitude: Double, latitude: Double): Point = js.native
}

