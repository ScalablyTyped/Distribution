package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntrospectionField extends js.Object {
  var args: js.Array[IntrospectionInputValue] = js.native
  var deprecationReason: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var isDeprecated: Boolean = js.native
  var name: String = js.native
  var `type`: IntrospectionTypeRef = js.native
}

object IntrospectionField {
  @scala.inline
  def apply(
    args: js.Array[IntrospectionInputValue],
    isDeprecated: Boolean,
    name: String,
    `type`: IntrospectionTypeRef
  ): IntrospectionField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], isDeprecated = isDeprecated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionField]
  }
  @scala.inline
  implicit class IntrospectionFieldOps[Self <: IntrospectionField] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: IntrospectionInputValue*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[IntrospectionInputValue]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDeprecated(value: Boolean): Self = this.set("isDeprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: IntrospectionTypeRef): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeprecationReason(value: String): Self = this.set("deprecationReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecationReason: Self = this.set("deprecationReason", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

