package typings.winrtUwp.Windows.Graphics.Printing

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a collection of methods and properties for managing the options which define how the content is to be printed. */
@js.native
trait PrintTaskOptions extends js.Object {
  /** Gets or sets the binding option for the print task. */
  var binding: PrintBinding = js.native
  /** Gets or sets the collation option of the print tasks. */
  var collation: PrintCollation = js.native
  /** Gets or sets the color mode option of the print task. */
  var colorMode: PrintColorMode = js.native
  /** Gets the list of options displayed for the print experience. */
  var displayedOptions: IVector[String] = js.native
  /** Gets or sets the duplex option of the print task. */
  var duplex: PrintDuplex = js.native
  /** Gets or sets the hole punch option of the print task. */
  var holePunch: PrintHolePunch = js.native
  /** Gets the maximum number of copies supported for the print task. */
  var maxCopies: Double = js.native
  /** Gets or sets the media size option of the print task. */
  var mediaSize: PrintMediaSize = js.native
  /** Gets or sets the media type option for the print task. */
  var mediaType: PrintMediaType = js.native
  /** Gets the minimum number of copies allowed for the print task. */
  var minCopies: Double = js.native
  /** Gets or sets the value for the number of copies for the print task. */
  var numberOfCopies: Double = js.native
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
  def getPageDescription(jobPageNumber: Double): PrintPageDescription = js.native
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
  @scala.inline
  implicit class PrintTaskOptionsOps[Self <: PrintTaskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBinding(value: PrintBinding): Self = this.set("binding", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollation(value: PrintCollation): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorMode(value: PrintColorMode): Self = this.set("colorMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayedOptions(value: IVector[String]): Self = this.set("displayedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuplex(value: PrintDuplex): Self = this.set("duplex", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPageDescription(value: Double => PrintPageDescription): Self = this.set("getPageDescription", js.Any.fromFunction1(value))
    @scala.inline
    def setHolePunch(value: PrintHolePunch): Self = this.set("holePunch", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxCopies(value: Double): Self = this.set("maxCopies", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaSize(value: PrintMediaSize): Self = this.set("mediaSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: PrintMediaType): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinCopies(value: Double): Self = this.set("minCopies", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberOfCopies(value: Double): Self = this.set("numberOfCopies", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: PrintOrientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintQuality(value: PrintQuality): Self = this.set("printQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaple(value: PrintStaple): Self = this.set("staple", value.asInstanceOf[js.Any])
  }
  
}

