package typings.wxServerSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoNearOptions extends StObject {
  
  def geometry(longitude: Double, latitude: Double): Point = js.native
  @JSName("geometry")
  var geometry_Original: Point = js.native
  
  // 点的地理位置
  var maxDistance: js.UndefOr[Double] = js.native
  
  // 选填，最大距离，单位为米
  var minDistance: js.UndefOr[Double] = js.native
}
