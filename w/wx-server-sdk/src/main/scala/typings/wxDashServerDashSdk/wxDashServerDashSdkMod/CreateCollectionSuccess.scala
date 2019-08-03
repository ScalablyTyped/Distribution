package typings.wxDashServerDashSdk.wxDashServerDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// interface GeoJSON<T> {
//     type: T;
//     coordinates: [];
// }
trait CreateCollectionSuccess extends js.Object {
  var errMsg: String
}

object CreateCollectionSuccess {
  @scala.inline
  def apply(errMsg: String): CreateCollectionSuccess = {
    val __obj = js.Dynamic.literal(errMsg = errMsg)
  
    __obj.asInstanceOf[CreateCollectionSuccess]
  }
}

