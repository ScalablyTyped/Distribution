package typings.webgme.GmeClasses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetaRule extends js.Object {
  var enum: js.Array[String] = js.native
  var `type`: String | Double | Boolean = js.native
}

object MetaRule {
  @scala.inline
  def apply(enum: js.Array[String], `type`: String | Double | Boolean): MetaRule = {
    val __obj = js.Dynamic.literal(enum = enum.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaRule]
  }
  @scala.inline
  implicit class MetaRuleOps[Self <: MetaRule] (val x: Self) extends AnyVal {
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
    def setEnumVarargs(value: String*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: js.Array[String]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String | Double | Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

