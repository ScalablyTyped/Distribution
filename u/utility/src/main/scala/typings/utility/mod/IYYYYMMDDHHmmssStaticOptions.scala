package typings.utility.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ----------------0_0-----------------
  * @description Defines For Date
  * @see https://github.com/node-modules/utility#date-utils
  * ---------------0^0------------------
  */
@js.native
trait IYYYYMMDDHHmmssStaticOptions extends js.Object {
  
  var dateSep: js.UndefOr[String] = js.native
  
  var timeSep: js.UndefOr[String] = js.native
}
object IYYYYMMDDHHmmssStaticOptions {
  
  @scala.inline
  def apply(): IYYYYMMDDHHmmssStaticOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IYYYYMMDDHHmmssStaticOptions]
  }
  
  @scala.inline
  implicit class IYYYYMMDDHHmmssStaticOptionsOps[Self <: IYYYYMMDDHHmmssStaticOptions] (val x: Self) extends AnyVal {
    
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
    def setDateSep(value: String): Self = this.set("dateSep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateSep: Self = this.set("dateSep", js.undefined)
    
    @scala.inline
    def setTimeSep(value: String): Self = this.set("timeSep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSep: Self = this.set("timeSep", js.undefined)
  }
}
