package typings.typedoc

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined typedoc.typedoc/dist/lib/serialization/schema.Type & std.Pick<typedoc.typedoc/dist/lib/serialization/schema.InferredType, 'type'> */
trait TypePickInferredTypetype extends js.Object {
  var `type`: ModelToObject[String] | String
}

object TypePickInferredTypetype {
  @scala.inline
  def apply(`type`: ModelToObject[String] | String): TypePickInferredTypetype = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypePickInferredTypetype]
  }
}

