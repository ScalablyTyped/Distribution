package typings.wxServerSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiPolygon extends js.Object {
  
  def apply(polygons: js.Array[Polygon]): MultiPolygon = js.native
  
  var coordinates: js.Array[js.Array[js.Array[PointCoordinates]]] = js.native
  
  var `type`: typings.wxServerSdk.wxServerSdkStrings.MultiPolygon = js.native
}
