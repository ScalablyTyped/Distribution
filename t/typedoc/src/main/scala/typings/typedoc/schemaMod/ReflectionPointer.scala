package typings.typedoc.schemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.Reflection, 'id'> */
@js.native
trait ReflectionPointer
  extends __ModelToObject[js.Any] {
  var id: ModelToObject[Double] | Double = js.native
}

object ReflectionPointer {
  @scala.inline
  def apply(id: ModelToObject[Double] | Double): ReflectionPointer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReflectionPointer]
  }
  @scala.inline
  implicit class ReflectionPointerOps[Self <: ReflectionPointer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdVarargs(value: _ModelToObject[js.Any]*): Self = this.set("id", js.Array(value :_*))
    @scala.inline
    def setId(value: ModelToObject[Double] | Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

