package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeParams extends _FormatterParams {
  
  // datetime
  var inputFormat: js.UndefOr[String] = js.native
  
  var invalidPlaceholder: js.UndefOr[`true` | String | Double | ValueStringCallback] = js.native
  
  var outputFormat: js.UndefOr[String] = js.native
  
  var timezone: js.UndefOr[String] = js.native
}
object DateTimeParams {
  
  @scala.inline
  def apply(): DateTimeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeParams]
  }
  
  @scala.inline
  implicit class DateTimeParamsOps[Self <: DateTimeParams] (val x: Self) extends AnyVal {
    
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
    def setInputFormat(value: String): Self = this.set("inputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFormat: Self = this.set("inputFormat", js.undefined)
    
    @scala.inline
    def setInvalidPlaceholderFunction1(value: /* value */ js.Any => String): Self = this.set("invalidPlaceholder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvalidPlaceholder(value: `true` | String | Double | ValueStringCallback): Self = this.set("invalidPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidPlaceholder: Self = this.set("invalidPlaceholder", js.undefined)
    
    @scala.inline
    def setOutputFormat(value: String): Self = this.set("outputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputFormat: Self = this.set("outputFormat", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
}
