package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPrintTaskOptionsCoreProperties extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: IPrintTaskOptionsCoreProperties](x: Self) {
    
    inline def setBinding(value: PrintBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setCollation(value: PrintCollation): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    inline def setColorMode(value: PrintColorMode): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    inline def setDuplex(value: PrintDuplex): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
    
    inline def setHolePunch(value: PrintHolePunch): Self = StObject.set(x, "holePunch", value.asInstanceOf[js.Any])
    
    inline def setMaxCopies(value: Double): Self = StObject.set(x, "maxCopies", value.asInstanceOf[js.Any])
    
    inline def setMediaSize(value: PrintMediaSize): Self = StObject.set(x, "mediaSize", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: PrintMediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMinCopies(value: Double): Self = StObject.set(x, "minCopies", value.asInstanceOf[js.Any])
    
    inline def setNumberOfCopies(value: Double): Self = StObject.set(x, "numberOfCopies", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: PrintOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPrintQuality(value: PrintQuality): Self = StObject.set(x, "printQuality", value.asInstanceOf[js.Any])
    
    inline def setStaple(value: PrintStaple): Self = StObject.set(x, "staple", value.asInstanceOf[js.Any])
  }
}
