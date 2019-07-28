package typings.winrt.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintQualityOptionDetails")
@js.native
class PrintQualityOptionDetails () extends IPrintItemListOptionDetails {
  /* CompleteClass */
  override var errorText: String = js.native
  /* CompleteClass */
  override var items: IVectorView[_] = js.native
  /* CompleteClass */
  override var optionId: String = js.native
  /* CompleteClass */
  override var optionType: PrintOptionType = js.native
  /* CompleteClass */
  override var state: PrintOptionStates = js.native
  /* CompleteClass */
  override var value: js.Any = js.native
  /* CompleteClass */
  override def trySetValue(value: js.Any): Boolean = js.native
}

