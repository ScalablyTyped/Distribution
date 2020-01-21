package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiLineString extends js.Object {
  var coordinates: js.Array[js.Array[PointCoordinates]] = js.native
  var `type`: typings.wxServerSdk.wxServerSdkStrings.MultiLineString = js.native
  def apply(polygons: js.Array[LineString]): MultiLineString = js.native
}

