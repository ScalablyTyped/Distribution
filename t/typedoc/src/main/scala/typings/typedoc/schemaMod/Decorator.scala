package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.Decorator, 'name' | 'type' | 'arguments'> */
trait Decorator
  extends __ModelToObject[js.Any] {
  var arguments: js.UndefOr[ModelToObject[js.UndefOr[_]] | js.Any] = js.undefined
  var name: ModelToObject[String] | String
  var `type`: js.UndefOr[
    ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type
  ] = js.undefined
}

object Decorator {
  @scala.inline
  def apply(
    name: ModelToObject[String] | String,
    arguments: ModelToObject[js.UndefOr[_]] | js.Any = null,
    `type`: ModelToObject[js.UndefOr[typings.typedoc.modelsTypesMod.Type]] | typings.typedoc.modelsTypesMod.Type = null
  ): Decorator = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (arguments != null) __obj.updateDynamic("arguments")(arguments.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decorator]
  }
}

