package typings.winrt.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskOptions")
@js.native
class PrintTaskOptions ()
  extends IPrintTaskOptionsCore
     with IPrintTaskOptionsCoreProperties
     with IPrintTaskOptionsCoreUIConfiguration {
  /* CompleteClass */
  override var binding: PrintBinding = js.native
  /* CompleteClass */
  override var collation: PrintCollation = js.native
  /* CompleteClass */
  override var colorMode: PrintColorMode = js.native
  /* CompleteClass */
  override var displayedOptions: IVector[String] = js.native
  /* CompleteClass */
  override var duplex: PrintDuplex = js.native
  /* CompleteClass */
  override var holePunch: PrintHolePunch = js.native
  /* CompleteClass */
  override var maxCopies: Double = js.native
  /* CompleteClass */
  override var mediaSize: PrintMediaSize = js.native
  /* CompleteClass */
  override var mediaType: PrintMediaType = js.native
  /* CompleteClass */
  override var minCopies: Double = js.native
  /* CompleteClass */
  override var numberOfCopies: Double = js.native
  /* CompleteClass */
  override var orientation: PrintOrientation = js.native
  /* CompleteClass */
  override var printQuality: PrintQuality = js.native
  /* CompleteClass */
  override var staple: PrintStaple = js.native
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
}

