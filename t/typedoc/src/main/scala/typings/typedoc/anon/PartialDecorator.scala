package typings.typedoc.anon

import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.Decorator> */
trait PartialDecorator extends js.Object {
  var arguments: js.UndefOr[ModelToObject[js.UndefOr[_]] | js.Any] = js.undefined
  var name: js.UndefOr[ModelToObject[String] | String] = js.undefined
  var `type`: js.UndefOr[ModelToObject[js.UndefOr[Type]] | Type] = js.undefined
}

object PartialDecorator {
  @scala.inline
  def apply(
    arguments: ModelToObject[js.UndefOr[_]] | js.Any = null,
    name: ModelToObject[String] | String = null,
    `type`: ModelToObject[js.UndefOr[Type]] | Type = null
  ): PartialDecorator = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDecorator]
  }
}

