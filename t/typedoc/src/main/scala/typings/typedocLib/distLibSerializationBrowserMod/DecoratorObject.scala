package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecoratorObject extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var name: java.lang.String
  var `type`: js.UndefOr[TypeObject] = js.undefined
}

object DecoratorObject {
  @scala.inline
  def apply(name: java.lang.String, arguments: js.Any = null, `type`: TypeObject = null): DecoratorObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DecoratorObject]
  }
}

