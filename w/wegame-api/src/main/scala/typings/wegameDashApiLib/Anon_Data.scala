package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: java.lang.String | stdLib.ArrayBuffer
}

object Anon_Data {
  @scala.inline
  def apply(data: java.lang.String | stdLib.ArrayBuffer): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

