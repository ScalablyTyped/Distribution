package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskOptionsCoreProperties extends StObject {
  
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
  implicit class IPrintTaskOptionsCorePropertiesMutableBuilder[Self <: IPrintTaskOptionsCoreProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: PrintBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollation(value: PrintCollation): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMode(value: PrintColorMode): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplex(value: PrintDuplex): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolePunch(value: PrintHolePunch): Self = StObject.set(x, "holePunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCopies(value: Double): Self = StObject.set(x, "maxCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSize(value: PrintMediaSize): Self = StObject.set(x, "mediaSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: PrintMediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCopies(value: Double): Self = StObject.set(x, "minCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfCopies(value: Double): Self = StObject.set(x, "numberOfCopies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: PrintOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintQuality(value: PrintQuality): Self = StObject.set(x, "printQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaple(value: PrintStaple): Self = StObject.set(x, "staple", value.asInstanceOf[js.Any])
  }
}
