package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Graphics.Printing.IPrintTaskOptionsCore
import typings.winrt.Windows.Graphics.Printing.IPrintTaskOptionsCoreUIConfiguration
import typings.winrt.Windows.Graphics.Printing.PrintPageDescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTaskOptionDetails
  extends StObject
     with IPrintTaskOptionDetails
     with IPrintTaskOptionsCore
     with IPrintTaskOptionsCoreUIConfiguration
object PrintTaskOptionDetails {
  
  inline def apply(
    createItemListOption: (String, String) => PrintCustomItemListOptionDetails,
    createTextOption: (String, String) => PrintCustomTextOptionDetails,
    displayedOptions: IVector[String],
    getPageDescription: Double => PrintPageDescription,
    onbeginvalidation: Any,
    onoptionchanged: Any,
    options: IMapView[String, IPrintOptionDetails]
  ): PrintTaskOptionDetails = {
    val __obj = js.Dynamic.literal(createItemListOption = js.Any.fromFunction2(createItemListOption), createTextOption = js.Any.fromFunction2(createTextOption), displayedOptions = displayedOptions.asInstanceOf[js.Any], getPageDescription = js.Any.fromFunction1(getPageDescription), onbeginvalidation = onbeginvalidation.asInstanceOf[js.Any], onoptionchanged = onoptionchanged.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptionDetails]
  }
}
