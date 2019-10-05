package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStandardPrintTaskOptionsStatic extends js.Object {
  var binding: String
  var collation: String
  var colorMode: String
  var copies: String
  var duplex: String
  var holePunch: String
  var inputBin: String
  var mediaSize: String
  var mediaType: String
  var nUp: String
  var orientation: String
  var printQuality: String
  var staple: String
}

object IStandardPrintTaskOptionsStatic {
  @scala.inline
  def apply(
    binding: String,
    collation: String,
    colorMode: String,
    copies: String,
    duplex: String,
    holePunch: String,
    inputBin: String,
    mediaSize: String,
    mediaType: String,
    nUp: String,
    orientation: String,
    printQuality: String,
    staple: String
  ): IStandardPrintTaskOptionsStatic = {
    val __obj = js.Dynamic.literal(binding = binding, collation = collation, colorMode = colorMode, copies = copies, duplex = duplex, holePunch = holePunch, inputBin = inputBin, mediaSize = mediaSize, mediaType = mediaType, nUp = nUp, orientation = orientation, printQuality = printQuality, staple = staple)
  
    __obj.asInstanceOf[IStandardPrintTaskOptionsStatic]
  }
}

