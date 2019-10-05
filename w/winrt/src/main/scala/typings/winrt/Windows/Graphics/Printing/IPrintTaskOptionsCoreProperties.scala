package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionsCoreProperties extends js.Object {
  var binding: PrintBinding
  var collation: PrintCollation
  var colorMode: PrintColorMode
  var duplex: PrintDuplex
  var holePunch: PrintHolePunch
  var maxCopies: Double
  var mediaSize: PrintMediaSize
  var mediaType: PrintMediaType
  var minCopies: Double
  var numberOfCopies: Double
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
    maxCopies: Double,
    mediaSize: PrintMediaSize,
    mediaType: PrintMediaType,
    minCopies: Double,
    numberOfCopies: Double,
    orientation: PrintOrientation,
    printQuality: PrintQuality,
    staple: PrintStaple
  ): IPrintTaskOptionsCoreProperties = {
    val __obj = js.Dynamic.literal(binding = binding, collation = collation, colorMode = colorMode, duplex = duplex, holePunch = holePunch, maxCopies = maxCopies, mediaSize = mediaSize, mediaType = mediaType, minCopies = minCopies, numberOfCopies = numberOfCopies, orientation = orientation, printQuality = printQuality, staple = staple)
  
    __obj.asInstanceOf[IPrintTaskOptionsCoreProperties]
  }
}

