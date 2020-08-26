package typings.typedoc.anon

import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.schemaMod.ModelToObject
import typings.typedoc.schemaMod._ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.Decorator> */
@js.native
trait PartialDecorator extends js.Object {
  var arguments: js.UndefOr[ModelToObject[js.UndefOr[_]] | js.Any] = js.native
  var name: js.UndefOr[ModelToObject[String] | String] = js.native
  var `type`: js.UndefOr[ModelToObject[js.UndefOr[Type]] | Type] = js.native
}

object PartialDecorator {
  @scala.inline
  def apply(): PartialDecorator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDecorator]
  }
  @scala.inline
  implicit class PartialDecoratorOps[Self <: PartialDecorator] (val x: Self) extends AnyVal {
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
    def setArgumentsVarargs(value: _ModelToObject[js.Any]*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: ModelToObject[js.UndefOr[_]] | js.Any): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setNameVarargs(value: _ModelToObject[js.Any]*): Self = this.set("name", js.Array(value :_*))
    @scala.inline
    def setName(value: ModelToObject[String] | String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTypeVarargs(value: _ModelToObject[js.Any]*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: ModelToObject[js.UndefOr[Type]] | Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

