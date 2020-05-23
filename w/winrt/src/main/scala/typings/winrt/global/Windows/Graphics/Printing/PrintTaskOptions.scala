package typings.winrt.global.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Graphics.Printing.PrintPageDescription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskOptions")
@js.native
class PrintTaskOptions ()
  extends typings.winrt.Windows.Graphics.Printing.PrintTaskOptions {
  /* CompleteClass */
  override var binding: typings.winrt.Windows.Graphics.Printing.PrintBinding = js.native
  /* CompleteClass */
  override var collation: typings.winrt.Windows.Graphics.Printing.PrintCollation = js.native
  /* CompleteClass */
  override var colorMode: typings.winrt.Windows.Graphics.Printing.PrintColorMode = js.native
  /* CompleteClass */
  override var displayedOptions: IVector[String] = js.native
  /* CompleteClass */
  override var duplex: typings.winrt.Windows.Graphics.Printing.PrintDuplex = js.native
  /* CompleteClass */
  override var holePunch: typings.winrt.Windows.Graphics.Printing.PrintHolePunch = js.native
  /* CompleteClass */
  override var maxCopies: Double = js.native
  /* CompleteClass */
  override var mediaSize: typings.winrt.Windows.Graphics.Printing.PrintMediaSize = js.native
  /* CompleteClass */
  override var mediaType: typings.winrt.Windows.Graphics.Printing.PrintMediaType = js.native
  /* CompleteClass */
  override var minCopies: Double = js.native
  /* CompleteClass */
  override var numberOfCopies: Double = js.native
  /* CompleteClass */
  override var orientation: typings.winrt.Windows.Graphics.Printing.PrintOrientation = js.native
  /* CompleteClass */
  override var printQuality: typings.winrt.Windows.Graphics.Printing.PrintQuality = js.native
  /* CompleteClass */
  override var staple: typings.winrt.Windows.Graphics.Printing.PrintStaple = js.native
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
}

