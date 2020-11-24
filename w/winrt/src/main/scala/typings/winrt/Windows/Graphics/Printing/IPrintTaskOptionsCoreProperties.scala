package typings.winrt.Windows.Graphics.Printing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskOptionsCoreProperties extends js.Object {
  
  var binding: PrintBinding = js.native
  
  var collation: PrintCollation = js.native
  
  var colorMode: PrintColorMode = js.native
  
  var duplex: PrintDuplex = js.native
  
  var holePunch: PrintHolePunch = js.native
  
  var maxCopies: Double = js.native
  
  var mediaSize: PrintMediaSize = js.native
  
  var mediaType: PrintMediaType = js.native
  
  var minCopies: Double = js.native
  
  var numberOfCopies: Double = js.native
  
  var orientation: PrintOrientation = js.native
  
  var printQuality: PrintQuality = js.native
  
  var staple: PrintStaple = js.native
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
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], collation = collation.asInstanceOf[js.Any], colorMode = colorMode.asInstanceOf[js.Any], duplex = duplex.asInstanceOf[js.Any], holePunch = holePunch.asInstanceOf[js.Any], maxCopies = maxCopies.asInstanceOf[js.Any], mediaSize = mediaSize.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], minCopies = minCopies.asInstanceOf[js.Any], numberOfCopies = numberOfCopies.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], printQuality = printQuality.asInstanceOf[js.Any], staple = staple.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskOptionsCoreProperties]
  }
  
  @scala.inline
  implicit class IPrintTaskOptionsCorePropertiesOps[Self <: IPrintTaskOptionsCoreProperties] (val x: Self) extends AnyVal {
    
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
    def setDuplex(value: PrintDuplex): Self = this.set("duplex", value.asInstanceOf[js.Any])
    
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
