package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPoint extends js.Object {
  
  def apply(points: js.Array[Point]): MultiPoint = js.native
  
  var coordinates: js.Array[PointCoordinates] = js.native
  
  var `type`: typings.wxServerSdk.wxServerSdkStrings.MultiPoint = js.native
}
