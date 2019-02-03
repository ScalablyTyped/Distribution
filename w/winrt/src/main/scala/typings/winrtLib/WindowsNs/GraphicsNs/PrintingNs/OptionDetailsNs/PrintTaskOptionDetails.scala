package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
class PrintTaskOptionDetails ()
  extends IPrintTaskOptionDetails
     with winrtLib.WindowsNs.GraphicsNs.PrintingNs.IPrintTaskOptionsCore
     with winrtLib.WindowsNs.GraphicsNs.PrintingNs.IPrintTaskOptionsCoreUIConfiguration {
  /* CompleteClass */
  override var displayedOptions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /* CompleteClass */
  override var onbeginvalidation: js.Any = js.native
  /* CompleteClass */
  override var onoptionchanged: js.Any = js.native
  /* CompleteClass */
  override var options: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[java.lang.String, IPrintOptionDetails] = js.native
  /* CompleteClass */
  override def createItemListOption(optionId: java.lang.String, displayName: java.lang.String): PrintCustomItemListOptionDetails = js.native
  /* CompleteClass */
  override def createTextOption(optionId: java.lang.String, displayName: java.lang.String): PrintCustomTextOptionDetails = js.native
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: scala.Double): winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintPageDescription = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
object PrintTaskOptionDetails extends js.Object {
  def getFromPrintTaskOptions(printTaskOptions: winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintTaskOptions): winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs.PrintTaskOptionDetails = js.native
}

