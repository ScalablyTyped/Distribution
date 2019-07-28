package typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMapView
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.GraphicsNs.PrintingNs.IPrintTaskOptionsCore
import typings.winrt.WindowsNs.GraphicsNs.PrintingNs.IPrintTaskOptionsCoreUIConfiguration
import typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintPageDescription
import typings.winrt.WindowsNs.GraphicsNs.PrintingNs.PrintTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
class PrintTaskOptionDetails ()
  extends IPrintTaskOptionDetails
     with IPrintTaskOptionsCore
     with IPrintTaskOptionsCoreUIConfiguration {
  /* CompleteClass */
  override var displayedOptions: IVector[String] = js.native
  /* CompleteClass */
  override var onbeginvalidation: js.Any = js.native
  /* CompleteClass */
  override var onoptionchanged: js.Any = js.native
  /* CompleteClass */
  override var options: IMapView[String, IPrintOptionDetails] = js.native
  /* CompleteClass */
  override def createItemListOption(optionId: String, displayName: String): PrintCustomItemListOptionDetails = js.native
  /* CompleteClass */
  override def createTextOption(optionId: String, displayName: String): PrintCustomTextOptionDetails = js.native
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails")
@js.native
object PrintTaskOptionDetails extends js.Object {
  def getFromPrintTaskOptions(printTaskOptions: PrintTaskOptions): PrintTaskOptionDetails = js.native
}

