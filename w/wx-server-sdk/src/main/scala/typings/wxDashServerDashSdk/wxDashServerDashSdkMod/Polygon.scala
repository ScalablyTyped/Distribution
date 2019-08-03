package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polygon extends js.Object {
  var coordinates: js.Array[js.Array[PointCoordinates]] = js.native
  var `type`: typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.Polygon = js.native
  def apply(lineStrings: js.Array[LineString]): Polygon = js.native
}

