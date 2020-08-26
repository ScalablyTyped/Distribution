package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStandardPrintTaskOptionsStatic extends js.Object {
  var binding: String = js.native
  var collation: String = js.native
  var colorMode: String = js.native
  var copies: String = js.native
  var duplex: String = js.native
  var holePunch: String = js.native
  var inputBin: String = js.native
  var mediaSize: String = js.native
  var mediaType: String = js.native
  var nUp: String = js.native
  var orientation: String = js.native
  var printQuality: String = js.native
  var staple: String = js.native
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
  @scala.inline
  implicit class IStandardPrintTaskOptionsStaticOps[Self <: IStandardPrintTaskOptionsStatic] (val x: Self) extends AnyVal {
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
    def setBinding(value: String): Self = this.set("binding", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollation(value: String): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def setColorMode(value: String): Self = this.set("colorMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopies(value: String): Self = this.set("copies", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuplex(value: String): Self = this.set("duplex", value.asInstanceOf[js.Any])
    @scala.inline
    def setHolePunch(value: String): Self = this.set("holePunch", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputBin(value: String): Self = this.set("inputBin", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaSize(value: String): Self = this.set("mediaSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setNUp(value: String): Self = this.set("nUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrintQuality(value: String): Self = this.set("printQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def setStaple(value: String): Self = this.set("staple", value.asInstanceOf[js.Any])
  }
  
}

