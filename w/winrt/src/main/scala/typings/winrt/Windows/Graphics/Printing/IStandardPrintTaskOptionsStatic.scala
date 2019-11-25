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
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], copies = copies.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], holePunch = holePunch.asInstanceOf[js.Any], inputBin = inputBin.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], nUp = nUp.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], printQuality = printQuality.asInstanceOf[js.Any], staple = staple.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IStandardPrintTaskOptionsStatic]
  }
}

