package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiLineString extends js.Object {
  var coordinates: js.Array[js.Array[PointCoordinates]] = js.native
  var `type`: typings.wxDashServerDashSdk.wxDashServerDashSdkStrings.MultiLineString = js.native
  def apply(polygons: js.Array[LineString]): MultiLineString = js.native
}

