package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorObject extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var name: String
  var `type`: js.UndefOr[TypeObject] = js.undefined
}

object DecoratorObject {
  @scala.inline
  def apply(name: String, arguments: js.Any = null, `type`: TypeObject = null): DecoratorObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratorObject]
  }
}

