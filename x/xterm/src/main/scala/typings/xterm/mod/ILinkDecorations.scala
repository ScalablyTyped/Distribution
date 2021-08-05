package typings.xterm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A set of decorations that can be applied to links.
  */
trait ILinkDecorations extends StObject {
  
  /**
    * Whether the cursor is set to pointer.
    */
  var pointerCursor: Boolean
  
  /**
    * Whether the underline is visible
    */
  var underline: Boolean
}
object ILinkDecorations {
  
  inline def apply(pointerCursor: Boolean, underline: Boolean): ILinkDecorations = {
    val __obj = js.Dynamic.literal(pointerCursor = pointerCursor.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkDecorations]
  }
  
  extension [Self <: ILinkDecorations](x: Self) {
    
    inline def setPointerCursor(value: Boolean): Self = StObject.set(x, "pointerCursor", value.asInstanceOf[js.Any])
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
  }
}
