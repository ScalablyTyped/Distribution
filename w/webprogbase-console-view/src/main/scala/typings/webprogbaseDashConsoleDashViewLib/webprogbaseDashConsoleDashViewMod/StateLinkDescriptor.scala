package typings
package webprogbaseDashConsoleDashViewLib.webprogbaseDashConsoleDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateLinkDescriptor extends js.Object {
  var data: BasicObject[_]
  var description: java.lang.String
}

object StateLinkDescriptor {
  @scala.inline
  def apply(data: BasicObject[_], description: java.lang.String): StateLinkDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[StateLinkDescriptor]
  }
}

