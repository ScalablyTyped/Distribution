package typings.swiz.mod.struct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObj extends js.Object {
  var fields: js.Array[IField] = js.native
  var name: String = js.native
  var options: IObjOptions = js.native
  var plural: String = js.native
  var singular: String = js.native
}

object IObj {
  @scala.inline
  def apply(fields: js.Array[IField], name: String, options: IObjOptions, plural: String, singular: String): IObj = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObj]
  }
  @scala.inline
  implicit class IObjOps[Self <: IObj] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: IField*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[IField]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: IObjOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingular(value: String): Self = this.set("singular", value.asInstanceOf[js.Any])
  }
  
}

