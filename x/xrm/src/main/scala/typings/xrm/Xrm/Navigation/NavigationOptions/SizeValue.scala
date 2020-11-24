package typings.xrm.Xrm.Navigation.NavigationOptions

import typings.xrm.xrmStrings.Percentsign
import typings.xrm.xrmStrings.px
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeValue extends js.Object {
  
  /**
    * The unit of measurement. Specify "%" or "px". Default value is "px"
    * */
  var unit: Percentsign | px = js.native
  
  /**
    * The numerical value
    * */
  var value: Double = js.native
}
object SizeValue {
  
  @scala.inline
  def apply(unit: Percentsign | px, value: Double): SizeValue = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeValue]
  }
  
  @scala.inline
  implicit class SizeValueOps[Self <: SizeValue] (val x: Self) extends AnyVal {
    
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
    def setUnit(value: Percentsign | px): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
