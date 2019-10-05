package typings.winrt.Windows.Graphics.Printing.OptionDetails

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintHolePunchOptionDetails")
@js.native
class PrintHolePunchOptionDetails () extends IPrintItemListOptionDetails {
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

