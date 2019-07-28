package typings.typedoc.distLibModelsReflectionsAbstractMod

import typings.typedoc.distLibModelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decorator extends js.Object {
  var arguments: js.UndefOr[js.Any] = js.undefined
  var name: String
  var `type`: js.UndefOr[Type] = js.undefined
}

object Decorator {
  @scala.inline
  def apply(name: String, arguments: js.Any = null, `type`: Type = null): Decorator = {
    val __obj = js.Dynamic.literal(name = name)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Decorator]
  }
}

