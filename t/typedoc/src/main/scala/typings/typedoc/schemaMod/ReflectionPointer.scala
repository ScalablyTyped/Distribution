package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.Reflection, 'id'> */
trait ReflectionPointer
  extends __ModelToObject[js.Any] {
  var id: ModelToObject[Double] | Double
}

object ReflectionPointer {
  @scala.inline
  def apply(id: ModelToObject[Double] | Double): ReflectionPointer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionPointer]
  }
}

