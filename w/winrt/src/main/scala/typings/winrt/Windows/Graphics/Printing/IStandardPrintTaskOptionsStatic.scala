package typings.winrt.Windows.Graphics.Printing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStandardPrintTaskOptionsStatic extends StObject {
  
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
  implicit class IStandardPrintTaskOptionsStaticMutableBuilder[Self <: IStandardPrintTaskOptionsStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinding(value: String): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollation(value: String): Self = StObject.set(x, "collation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMode(value: String): Self = StObject.set(x, "colorMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopies(value: String): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplex(value: String): Self = StObject.set(x, "duplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolePunch(value: String): Self = StObject.set(x, "holePunch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputBin(value: String): Self = StObject.set(x, "inputBin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSize(value: String): Self = StObject.set(x, "mediaSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: String): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUp(value: String): Self = StObject.set(x, "nUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintQuality(value: String): Self = StObject.set(x, "printQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaple(value: String): Self = StObject.set(x, "staple", value.asInstanceOf[js.Any])
  }
}
