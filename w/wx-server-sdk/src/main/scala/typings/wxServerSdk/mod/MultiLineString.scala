package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiLineString extends js.Object {
  
  def apply(polygons: js.Array[LineString]): MultiLineString = js.native
  
  var coordinates: js.Array[js.Array[PointCoordinates]] = js.native
  
  var `type`: typings.wxServerSdk.wxServerSdkStrings.MultiLineString = js.native
}
