package typings.stylus.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eot extends StObject {
  
  @JSName(".eot")
  var Doteot: String
  
  @JSName(".gif")
  var Dotgif: String
  
  @JSName(".jpeg")
  var Dotjpeg: String
  
  @JSName(".jpg")
  var Dotjpg: String
  
  @JSName(".png")
  var Dotpng: String
  
  @JSName(".svg")
  var Dotsvg: String
  
  @JSName(".ttf")
  var Dotttf: String
  
  @JSName(".woff")
  var Dotwoff: String
}
object Eot {
  
  inline def apply(
    Doteot: String,
    Dotgif: String,
    Dotjpeg: String,
    Dotjpg: String,
    Dotpng: String,
    Dotsvg: String,
    Dotttf: String,
    Dotwoff: String
  ): Eot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic(".eot")(Doteot.asInstanceOf[js.Any])
    __obj.updateDynamic(".gif")(Dotgif.asInstanceOf[js.Any])
    __obj.updateDynamic(".jpeg")(Dotjpeg.asInstanceOf[js.Any])
    __obj.updateDynamic(".jpg")(Dotjpg.asInstanceOf[js.Any])
    __obj.updateDynamic(".png")(Dotpng.asInstanceOf[js.Any])
    __obj.updateDynamic(".svg")(Dotsvg.asInstanceOf[js.Any])
    __obj.updateDynamic(".ttf")(Dotttf.asInstanceOf[js.Any])
    __obj.updateDynamic(".woff")(Dotwoff.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Eot] (val x: Self) extends AnyVal {
    
    inline def setDoteot(value: String): Self = StObject.set(x, ".eot", value.asInstanceOf[js.Any])
    
    inline def setDotgif(value: String): Self = StObject.set(x, ".gif", value.asInstanceOf[js.Any])
    
    inline def setDotjpeg(value: String): Self = StObject.set(x, ".jpeg", value.asInstanceOf[js.Any])
    
    inline def setDotjpg(value: String): Self = StObject.set(x, ".jpg", value.asInstanceOf[js.Any])
    
    inline def setDotpng(value: String): Self = StObject.set(x, ".png", value.asInstanceOf[js.Any])
    
    inline def setDotsvg(value: String): Self = StObject.set(x, ".svg", value.asInstanceOf[js.Any])
    
    inline def setDotttf(value: String): Self = StObject.set(x, ".ttf", value.asInstanceOf[js.Any])
    
    inline def setDotwoff(value: String): Self = StObject.set(x, ".woff", value.asInstanceOf[js.Any])
  }
}
