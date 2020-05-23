package typings.winrtUwp.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of methods and properties for managing the options which define how the content is to be printed. */
trait PrintTaskOptions extends js.Object {
  /** Gets or sets the binding option for the print task. */
  var binding: PrintBinding
  /** Gets or sets the collation option of the print tasks. */
  var collation: PrintCollation
  /** Gets or sets the color mode option of the print task. */
  var colorMode: PrintColorMode
  /** Gets the list of options displayed for the print experience. */
  var displayedOptions: IVector[String]
  /** Gets or sets the duplex option of the print task. */
  var duplex: PrintDuplex
  /** Gets or sets the hole punch option of the print task. */
  var holePunch: PrintHolePunch
  /** Gets the maximum number of copies supported for the print task. */
  var maxCopies: Double
  /** Gets or sets the media size option of the print task. */
  var mediaSize: PrintMediaSize
  /** Gets or sets the media type option for the print task. */
  var mediaType: PrintMediaType
  /** Gets the minimum number of copies allowed for the print task. */
  var minCopies: Double
  /** Gets or sets the value for the number of copies for the print task. */
  var numberOfCopies: Double
  /** Gets or sets the orientation option for the print task. */
  var orientation: PrintOrientation
  /** Gets or sets the print quality option for the print task. */
  var printQuality: PrintQuality
  /** Gets or sets the staple option for the print task. */
  var staple: PrintStaple
  /**
    * Retrieves the physical dimensions of the printed page.
    * @param jobPageNumber The page number.
    * @return The page description data.
    */
  def getPageDescription(jobPageNumber: Double): PrintPageDescription
}

object PrintTaskOptions {
  @scala.inline
  def apply(
    binding: PrintBinding,
    collation: PrintCollation,
    colorMode: PrintColorMode,
    displayedOptions: IVector[String],
    duplex: PrintDuplex,
    getPageDescription: Double => PrintPageDescription,
    holePunch: PrintHolePunch,
    maxCopies: Double,
    mediaSize: PrintMediaSize,
    mediaType: PrintMediaType,
    minCopies: Double,
    numberOfCopies: Double,
    orientation: PrintOrientation,
    printQuality: PrintQuality,
    staple: PrintStaple
  ): PrintTaskOptions = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], displayedOptions = displayedOptions.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], getPageDescription = js.Any.fromFunction1(getPageDescription), holePunch = holePunch.asInstanceOf[js.Any], maxCopies = maxCopies.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], minCopies = minCopies.asInstanceOf[js.Any], numberOfCopies = numberOfCopies.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], printQuality = printQuality.asInstanceOf[js.Any], staple = staple.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintTaskOptions]
  }
}

