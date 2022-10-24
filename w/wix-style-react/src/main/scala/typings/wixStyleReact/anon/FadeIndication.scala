package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FadeIndication extends StObject {
  
  var fadeIndication: Boolean
  
  var showIndication: Boolean
}
object FadeIndication {
  
  inline def apply(fadeIndication: Boolean, showIndication: Boolean): FadeIndication = {
    val __obj = js.Dynamic.literal(fadeIndication = fadeIndication.asInstanceOf[js.Any], showIndication = showIndication.asInstanceOf[js.Any])
    __obj.asInstanceOf[FadeIndication]
  }
  
  extension [Self <: FadeIndication](x: Self) {
    
    inline def setFadeIndication(value: Boolean): Self = StObject.set(x, "fadeIndication", value.asInstanceOf[js.Any])
    
    inline def setShowIndication(value: Boolean): Self = StObject.set(x, "showIndication", value.asInstanceOf[js.Any])
  }
}
