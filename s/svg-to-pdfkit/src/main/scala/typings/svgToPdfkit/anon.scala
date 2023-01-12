package typings.svgToPdfkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FauxBold extends StObject {
    
    var fauxBold: Boolean
    
    var fauxItalic: Boolean
  }
  object FauxBold {
    
    inline def apply(fauxBold: Boolean, fauxItalic: Boolean): FauxBold = {
      val __obj = js.Dynamic.literal(fauxBold = fauxBold.asInstanceOf[js.Any], fauxItalic = fauxItalic.asInstanceOf[js.Any])
      __obj.asInstanceOf[FauxBold]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FauxBold] (val x: Self) extends AnyVal {
      
      inline def setFauxBold(value: Boolean): Self = StObject.set(x, "fauxBold", value.asInstanceOf[js.Any])
      
      inline def setFauxItalic(value: Boolean): Self = StObject.set(x, "fauxItalic", value.asInstanceOf[js.Any])
    }
  }
}
