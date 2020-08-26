package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.double
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.float
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[float | double] = js.native
  var `type`: number = js.native
}

object NumberFormat {
  @scala.inline
  def apply(`type`: number): NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormat]
  }
  @scala.inline
  implicit class NumberFormatOps[Self <: NumberFormat] (val x: Self) extends AnyVal {
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
    def setType(value: number): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: float | double): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

