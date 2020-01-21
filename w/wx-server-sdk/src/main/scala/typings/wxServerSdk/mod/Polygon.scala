package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polygon extends js.Object {
  var coordinates: js.Array[js.Array[PointCoordinates]] = js.native
  var `type`: typings.wxServerSdk.wxServerSdkStrings.Polygon = js.native
  def apply(lineStrings: js.Array[LineString]): Polygon = js.native
}

