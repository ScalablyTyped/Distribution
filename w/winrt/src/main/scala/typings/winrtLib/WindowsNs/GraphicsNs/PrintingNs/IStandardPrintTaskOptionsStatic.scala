package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStandardPrintTaskOptionsStatic extends js.Object {
  var binding: java.lang.String
  var collation: java.lang.String
  var colorMode: java.lang.String
  var copies: java.lang.String
  var duplex: java.lang.String
  var holePunch: java.lang.String
  var inputBin: java.lang.String
  var mediaSize: java.lang.String
  var mediaType: java.lang.String
  var nUp: java.lang.String
  var orientation: java.lang.String
  var printQuality: java.lang.String
  var staple: java.lang.String
}

object IStandardPrintTaskOptionsStatic {
  @scala.inline
  def apply(
    binding: java.lang.String,
    collation: java.lang.String,
    colorMode: java.lang.String,
    copies: java.lang.String,
    duplex: java.lang.String,
    holePunch: java.lang.String,
    inputBin: java.lang.String,
    mediaSize: java.lang.String,
    mediaType: java.lang.String,
    nUp: java.lang.String,
    orientation: java.lang.String,
    printQuality: java.lang.String,
    staple: java.lang.String
  ): IStandardPrintTaskOptionsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("binding")(binding)
    __obj.updateDynamic("collation")(collation)
    __obj.updateDynamic("colorMode")(colorMode)
    __obj.updateDynamic("copies")(copies)
    __obj.updateDynamic("duplex")(duplex)
    __obj.updateDynamic("holePunch")(holePunch)
    __obj.updateDynamic("inputBin")(inputBin)
    __obj.updateDynamic("mediaSize")(mediaSize)
    __obj.updateDynamic("mediaType")(mediaType)
    __obj.updateDynamic("nUp")(nUp)
    __obj.updateDynamic("orientation")(orientation)
    __obj.updateDynamic("printQuality")(printQuality)
    __obj.updateDynamic("staple")(staple)
    __obj.asInstanceOf[IStandardPrintTaskOptionsStatic]
  }
}

