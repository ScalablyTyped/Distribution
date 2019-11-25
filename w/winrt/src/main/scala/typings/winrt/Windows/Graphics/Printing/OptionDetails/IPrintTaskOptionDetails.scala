package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Foundation.Collections.IMapView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionDetails extends js.Object {
  var onbeginvalidation: js.Any
  var onoptionchanged: js.Any
  var options: IMapView[String, IPrintOptionDetails]
  def createItemListOption(optionId: String, displayName: String): PrintCustomItemListOptionDetails
  def createTextOption(optionId: String, displayName: String): PrintCustomTextOptionDetails
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
}

