package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon extends js.Object {
  
  def apply(lineStrings: js.Array[LineString]): Polygon = js.native
  
  var coordinates: js.Array[js.Array[PointCoordinates]] = js.native
  
  var `type`: typings.wxServerSdk.wxServerSdkStrings.Polygon = js.native
}
