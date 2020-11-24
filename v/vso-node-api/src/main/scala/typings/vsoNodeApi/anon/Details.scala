package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Details extends js.Object {
  
  var all: scala.Double = js.native
  
  var details: scala.Double = js.native
  
  var dropLocation: scala.Double = js.native
  
  var label: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var symbols: scala.Double = js.native
  
  var testResults: scala.Double = js.native
}
object Details {
  
  @scala.inline
  def apply(
    all: scala.Double,
    details: scala.Double,
    dropLocation: scala.Double,
    label: scala.Double,
    none: scala.Double,
    symbols: scala.Double,
    testResults: scala.Double
  ): Details = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], dropLocation = dropLocation.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], testResults = testResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    
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
    def setAll(value: scala.Double): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: scala.Double): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropLocation(value: scala.Double): Self = this.set("dropLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: scala.Double): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbols(value: scala.Double): Self = this.set("symbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestResults(value: scala.Double): Self = this.set("testResults", value.asInstanceOf[js.Any])
  }
}
