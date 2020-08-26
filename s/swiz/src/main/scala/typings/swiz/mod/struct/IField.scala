package typings.swiz.mod.struct

import typings.swiz.mod.IChain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IField extends js.Object {
  var attribute: Boolean = js.native
  var coerceTo: js.Any = js.native
  var desc: js.UndefOr[String] = js.native
  var enumerated: Boolean = js.native
  var filterFrom: js.Array[String] = js.native
  var ignorePublic: Boolean = js.native
  var name: String = js.native
  var options: IFieldOptions = js.native
  var plural: String = js.native
  var singular: String = js.native
  var src: String = js.native
  var `val`: js.UndefOr[IChain] = js.native
}

object IField {
  @scala.inline
  def apply(
    attribute: Boolean,
    coerceTo: js.Any,
    enumerated: Boolean,
    filterFrom: js.Array[String],
    ignorePublic: Boolean,
    name: String,
    options: IFieldOptions,
    plural: String,
    singular: String,
    src: String
  ): IField = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], coerceTo = coerceTo.asInstanceOf[js.Any], enumerated = enumerated.asInstanceOf[js.Any], filterFrom = filterFrom.asInstanceOf[js.Any], ignorePublic = ignorePublic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[IField]
  }
  @scala.inline
  implicit class IFieldOps[Self <: IField] (val x: Self) extends AnyVal {
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
    def setAttribute(value: Boolean): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setCoerceTo(value: js.Any): Self = this.set("coerceTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnumerated(value: Boolean): Self = this.set("enumerated", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterFromVarargs(value: String*): Self = this.set("filterFrom", js.Array(value :_*))
    @scala.inline
    def setFilterFrom(value: js.Array[String]): Self = this.set("filterFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnorePublic(value: Boolean): Self = this.set("ignorePublic", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: IFieldOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingular(value: String): Self = this.set("singular", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    @scala.inline
    def setVal(value: IChain): Self = this.set("val", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVal: Self = this.set("val", js.undefined)
  }
  
}

