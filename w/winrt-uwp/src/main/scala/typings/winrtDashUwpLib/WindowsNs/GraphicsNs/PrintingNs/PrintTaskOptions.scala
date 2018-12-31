package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of methods and properties for managing the options which define how the content is to be printed. */
@JSGlobal("Windows.Graphics.Printing.PrintTaskOptions")
@js.native
abstract class PrintTaskOptions () extends js.Object {
  /** Gets or sets the binding option for the print task. */
  var binding: PrintBinding = js.native
  /** Gets or sets the collation option of the print tasks. */
  var collation: PrintCollation = js.native
  /** Gets or sets the color mode option of the print task. */
  var colorMode: PrintColorMode = js.native
  /** Gets the list of options displayed for the print experience. */
  var displayedOptions: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the duplex option of the print task. */
  var duplex: PrintDuplex = js.native
  /** Gets or sets the hole punch option of the print task. */
  var holePunch: PrintHolePunch = js.native
  /** Gets the maximum number of copies supported for the print task. */
  var maxCopies: scala.Double = js.native
  /** Gets or sets the media size option of the print task. */
  var mediaSize: PrintMediaSize = js.native
  /** Gets or sets the media type option for the print task. */
  var mediaType: PrintMediaType = js.native
  /** Gets the minimum number of copies allowed for the print task. */
  var minCopies: scala.Double = js.native
  /** Gets or sets the value for the number of copies for the print task. */
  var numberOfCopies: scala.Double = js.native
  /** Gets or sets the orientation option for the print task. */
  var orientation: PrintOrientation = js.native
  /** Gets or sets the print quality option for the print task. */
  var printQuality: PrintQuality = js.native
  /** Gets or sets the staple option for the print task. */
  var staple: PrintStaple = js.native
  /**
    * Retrieves the physical dimensions of the printed page.
    * @param jobPageNumber The page number.
    * @return The page description data.
    */
  def getPageDescription(jobPageNumber: scala.Double): PrintPageDescription = js.native
}

