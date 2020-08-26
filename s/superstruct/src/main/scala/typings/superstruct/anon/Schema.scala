package typings.superstruct.anon

import typings.superstruct.indexEsMod.StructContext
import typings.superstruct.indexEsMod.StructResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema[S, T] extends js.Object {
  var coercer: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  var refiner: js.UndefOr[js.Function2[/* value */ T, /* context */ StructContext, StructResult]] = js.native
  var schema: S = js.native
  var `type`: String = js.native
  var validator: js.UndefOr[js.Function2[/* value */ js.Any, /* context */ StructContext, StructResult]] = js.native
}

object Schema {
  @scala.inline
  def apply[S, T](schema: S, `type`: String): Schema[S, T] = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema[S, T]]
  }
  @scala.inline
  implicit class SchemaOps[Self <: Schema[_, _], S, T] (val x: Self with (Schema[S, T])) extends AnyVal {
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
    def setSchema(value: S): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoercer(value: /* value */ js.Any => _): Self = this.set("coercer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCoercer: Self = this.set("coercer", js.undefined)
    @scala.inline
    def setRefiner(value: (/* value */ T, /* context */ StructContext) => StructResult): Self = this.set("refiner", js.Any.fromFunction2(value))
    @scala.inline
    def deleteRefiner: Self = this.set("refiner", js.undefined)
    @scala.inline
    def setValidator(value: (/* value */ js.Any, /* context */ StructContext) => StructResult): Self = this.set("validator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
  }
  
}

