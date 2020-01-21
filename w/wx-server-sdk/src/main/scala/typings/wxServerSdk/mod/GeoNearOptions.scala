package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoNearOptions extends js.Object {
  @JSName("geometry")
  var geometry_Original: Point = js.native
   // 点的地理位置
  var maxDistance: js.UndefOr[Double] = js.native
   // 选填，最大距离，单位为米
  var minDistance: js.UndefOr[Double] = js.native
  def geometry(longitude: Double, latitude: Double): Point = js.native
}

