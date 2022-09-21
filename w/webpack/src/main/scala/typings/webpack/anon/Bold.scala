package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bold extends StObject {
  
  /**
  				 * Custom color for bold text.
  				 */
  var bold: js.UndefOr[String] = js.undefined
  
  /**
  				 * Custom color for cyan text.
  				 */
  var cyan: js.UndefOr[String] = js.undefined
  
  /**
  				 * Custom color for green text.
  				 */
  var green: js.UndefOr[String] = js.undefined
  
  /**
  				 * Custom color for magenta text.
  				 */
  var magenta: js.UndefOr[String] = js.undefined
  
  /**
  				 * Custom color for red text.
  				 */
  var red: js.UndefOr[String] = js.undefined
  
  /**
  				 * Custom color for yellow text.
  				 */
  var yellow: js.UndefOr[String] = js.undefined
}
object Bold {
  
  inline def apply(): Bold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bold]
  }
  
  extension [Self <: Bold](x: Self) {
    
    inline def setBold(value: String): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setCyan(value: String): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
    
    inline def setCyanUndefined: Self = StObject.set(x, "cyan", js.undefined)
    
    inline def setGreen(value: String): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setMagenta(value: String): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    inline def setMagentaUndefined: Self = StObject.set(x, "magenta", js.undefined)
    
    inline def setRed(value: String): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
    
    inline def setYellow(value: String): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
    
    inline def setYellowUndefined: Self = StObject.set(x, "yellow", js.undefined)
  }
}
