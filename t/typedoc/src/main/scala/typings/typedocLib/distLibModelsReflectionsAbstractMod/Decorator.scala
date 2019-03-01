package typings
package typedocLib.distLibModelsReflectionsAbstractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decorator extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var name: java.lang.String
  var `type`: js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.undefined
}

object Decorator {
  @scala.inline
  def apply(
    name: java.lang.String,
    arguments: js.Any = null,
    `type`: typedocLib.distLibModelsTypesMod.Type = null
  ): Decorator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Decorator]
  }
}

