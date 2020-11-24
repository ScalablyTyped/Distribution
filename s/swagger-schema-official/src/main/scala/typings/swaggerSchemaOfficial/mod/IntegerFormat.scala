package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int32
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int64
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegerFormat extends SchemaFormatConstraints {
  
  var format: js.UndefOr[int32 | int64] = js.native
  
  var `type`: integer = js.native
}
object IntegerFormat {
  
  @scala.inline
  def apply(`type`: integer): IntegerFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerFormat]
  }
  
  @scala.inline
  implicit class IntegerFormatOps[Self <: IntegerFormat] (val x: Self) extends AnyVal {
    
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
    def setType(value: integer): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: int32 | int64): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
  }
}
