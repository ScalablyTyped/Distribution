package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionsCoreProperties extends js.Object {
  var binding: PrintBinding
  var collation: PrintCollation
  var colorMode: PrintColorMode
  var duplex: PrintDuplex
  var holePunch: PrintHolePunch
  var maxCopies: scala.Double
  var mediaSize: PrintMediaSize
  var mediaType: PrintMediaType
  var minCopies: scala.Double
  var numberOfCopies: scala.Double
  var orientation: PrintOrientation
  var printQuality: PrintQuality
  var staple: PrintStaple
}

object IPrintTaskOptionsCoreProperties {
  @scala.inline
  def apply(
    binding: PrintBinding,
    collation: PrintCollation,
    colorMode: PrintColorMode,
    duplex: PrintDuplex,
    holePunch: PrintHolePunch,
    maxCopies: scala.Double,
    mediaSize: PrintMediaSize,
    mediaType: PrintMediaType,
    minCopies: scala.Double,
    numberOfCopies: scala.Double,
    orientation: PrintOrientation,
    printQuality: PrintQuality,
    staple: PrintStaple
  ): IPrintTaskOptionsCoreProperties = {
    val __obj = js.Dynamic.literal(binding = binding, collation = collation, colorMode = colorMode, duplex = duplex, holePunch = holePunch, maxCopies = maxCopies, mediaSize = mediaSize, mediaType = mediaType, minCopies = minCopies, numberOfCopies = numberOfCopies, orientation = orientation, printQuality = printQuality, staple = staple)
  
    __obj.asInstanceOf[IPrintTaskOptionsCoreProperties]
  }
}

