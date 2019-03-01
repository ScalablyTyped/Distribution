package typings
package vegaDashTypingsLib.typesSpecMarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
}

object From {
  @scala.inline
  def apply(data: java.lang.String = null): From = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[From]
  }
}

