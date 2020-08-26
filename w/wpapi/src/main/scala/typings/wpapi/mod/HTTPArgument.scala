package typings.wpapi.mod

import typings.wpapi.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTTPArgument extends js.Object {
  var default: js.UndefOr[String | Double] = js.native
  var description: js.UndefOr[String] = js.native
  var enum: js.UndefOr[js.Array[String]] = js.native
  var items: js.UndefOr[Type] = js.native
  var required: Boolean = js.native
  var `type`: js.UndefOr[HTTPArgumentType] = js.native
}

object HTTPArgument {
  @scala.inline
  def apply(required: Boolean): HTTPArgument = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPArgument]
  }
  @scala.inline
  implicit class HTTPArgumentOps[Self <: HTTPArgument] (val x: Self) extends AnyVal {
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
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefault(value: String | Double): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnumVarargs(value: String*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: js.Array[String]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    @scala.inline
    def setItems(value: Type): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setType(value: HTTPArgumentType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

