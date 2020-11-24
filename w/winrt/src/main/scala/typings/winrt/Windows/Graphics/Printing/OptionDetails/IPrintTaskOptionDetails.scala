package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskOptionDetails extends js.Object {
  
  def createItemListOption(optionId: String, displayName: String): PrintCustomItemListOptionDetails = js.native
  
  def createTextOption(optionId: String, displayName: String): PrintCustomTextOptionDetails = js.native
  
  var onbeginvalidation: js.Any = js.native
  
  var onoptionchanged: js.Any = js.native
  
  var options: IMapView[String, IPrintOptionDetails] = js.native
}
object IPrintTaskOptionDetails {
  
  @scala.inline
  def apply(
    createItemListOption: (String, String) => PrintCustomItemListOptionDetails,
    createTextOption: (String, String) => PrintCustomTextOptionDetails,
    onbeginvalidation: js.Any,
    onoptionchanged: js.Any,
    options: IMapView[String, IPrintOptionDetails]
  ): IPrintTaskOptionDetails = {
    val __obj = js.Dynamic.literal(createItemListOption = js.Any.fromFunction2(createItemListOption), createTextOption = js.Any.fromFunction2(createTextOption), onbeginvalidation = onbeginvalidation.asInstanceOf[js.Any], onoptionchanged = onoptionchanged.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionDetails]
  }
  
  @scala.inline
  implicit class IPrintTaskOptionDetailsOps[Self <: IPrintTaskOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setCreateItemListOption(value: (String, String) => PrintCustomItemListOptionDetails): Self = this.set("createItemListOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreateTextOption(value: (String, String) => PrintCustomTextOptionDetails): Self = this.set("createTextOption", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnbeginvalidation(value: js.Any): Self = this.set("onbeginvalidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnoptionchanged(value: js.Any): Self = this.set("onoptionchanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: IMapView[String, IPrintOptionDetails]): Self = this.set("options", value.asInstanceOf[js.Any])
  }
}
