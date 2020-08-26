package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings._empty
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`date-time`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.binary
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.byte
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.date
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[_empty | byte | binary | date | `date-time` | password] = js.native
  var `type`: string = js.native
}

object StringFormat {
  @scala.inline
  def apply(`type`: string): StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormat]
  }
  @scala.inline
  implicit class StringFormatOps[Self <: StringFormat] (val x: Self) extends AnyVal {
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
    def setType(value: string): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: _empty | byte | binary | date | `date-time` | password): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
  
}

