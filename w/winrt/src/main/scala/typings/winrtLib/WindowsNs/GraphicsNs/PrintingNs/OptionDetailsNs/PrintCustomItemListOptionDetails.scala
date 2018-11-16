package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs.OptionDetailsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.OptionDetails.PrintCustomItemListOptionDetails")
@js.native
class PrintCustomItemListOptionDetails () extends IPrintCustomItemListOptionDetails {
  var displayName: java.lang.String = js.native
  /* CompleteClass */
  override var errorText: java.lang.String = js.native
  /* CompleteClass */
  override var items: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_] = js.native
  /* CompleteClass */
  override var optionId: java.lang.String = js.native
  /* CompleteClass */
  override var optionType: PrintOptionType = js.native
  /* CompleteClass */
  override var state: PrintOptionStates = js.native
  /* CompleteClass */
  override var value: js.Any = js.native
  /* CompleteClass */
  override def addItem(itemId: java.lang.String, displayName: java.lang.String): scala.Unit = js.native
  /* CompleteClass */
  override def trySetValue(value: js.Any): scala.Boolean = js.native
}

