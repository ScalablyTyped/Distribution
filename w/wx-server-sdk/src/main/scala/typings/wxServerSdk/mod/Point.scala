package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point extends js.Object {
  
  def apply(longitude: Double, latitude: Double): Point = js.native
  
  var coordinates: PointCoordinates = js.native
  
  var `type`: typings.wxServerSdk.wxServerSdkStrings.Point = js.native
}
