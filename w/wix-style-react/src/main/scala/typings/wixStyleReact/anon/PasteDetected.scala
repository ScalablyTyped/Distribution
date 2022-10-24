package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasteDetected extends StObject {
  
  var pasteDetected: Boolean
}
object PasteDetected {
  
  inline def apply(pasteDetected: Boolean): PasteDetected = {
    val __obj = js.Dynamic.literal(pasteDetected = pasteDetected.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasteDetected]
  }
  
  extension [Self <: PasteDetected](x: Self) {
    
    inline def setPasteDetected(value: Boolean): Self = StObject.set(x, "pasteDetected", value.asInstanceOf[js.Any])
  }
}
