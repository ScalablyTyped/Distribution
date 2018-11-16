package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

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
  override var displayedOptions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /* CompleteClass */
  override var duplex: PrintDuplex = js.native
  /* CompleteClass */
  override var holePunch: PrintHolePunch = js.native
  /* CompleteClass */
  override var maxCopies: scala.Double = js.native
  /* CompleteClass */
  override var mediaSize: PrintMediaSize = js.native
  /* CompleteClass */
  override var mediaType: PrintMediaType = js.native
  /* CompleteClass */
  override var minCopies: scala.Double = js.native
  /* CompleteClass */
  override var numberOfCopies: scala.Double = js.native
  /* CompleteClass */
  override var orientation: PrintOrientation = js.native
  /* CompleteClass */
  override var printQuality: PrintQuality = js.native
  /* CompleteClass */
  override var staple: PrintStaple = js.native
  /* CompleteClass */
  override def getPageDescription(jobPageNumber: scala.Double): PrintPageDescription = js.native
}

