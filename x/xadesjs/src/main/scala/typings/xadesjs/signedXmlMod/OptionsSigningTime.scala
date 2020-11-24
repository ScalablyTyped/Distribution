package typings.xadesjs.signedXmlMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsSigningTime extends js.Object {
  
  /**
    * Format of the signing time. Default format is ISO
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * Signing time value. Default value if now
    */
  var value: js.UndefOr[Date] = js.native
}
object OptionsSigningTime {
  
  @scala.inline
  def apply(): OptionsSigningTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSigningTime]
  }
  
  @scala.inline
  implicit class OptionsSigningTimeOps[Self <: OptionsSigningTime] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
