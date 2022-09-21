package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorOffset extends StObject {
  
  var anchorOffset: js.UndefOr[Double] = js.undefined
  
  var focusOffset: Double
}
object AnchorOffset {
  
  inline def apply(focusOffset: Double): AnchorOffset = {
    val __obj = js.Dynamic.literal(focusOffset = focusOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorOffset]
  }
  
  extension [Self <: AnchorOffset](x: Self) {
    
    inline def setAnchorOffset(value: Double): Self = StObject.set(x, "anchorOffset", value.asInstanceOf[js.Any])
    
    inline def setAnchorOffsetUndefined: Self = StObject.set(x, "anchorOffset", js.undefined)
    
    inline def setFocusOffset(value: Double): Self = StObject.set(x, "focusOffset", value.asInstanceOf[js.Any])
  }
}
