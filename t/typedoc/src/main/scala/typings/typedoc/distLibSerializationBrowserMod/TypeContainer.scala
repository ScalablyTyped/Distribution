package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeContainer extends js.Object {
  var `type`: TypeObject
}

object TypeContainer {
  @scala.inline
  def apply(`type`: TypeObject): TypeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeContainer]
  }
}

