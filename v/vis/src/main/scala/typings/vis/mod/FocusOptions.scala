package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusOptions
  extends StObject
     with ViewPortOptions {
  
  /**
    * Locked denotes whether or not the view remains locked to
    * the node once the zoom-in animation is finished.
    * Default value is true.
    */
  var locked: js.UndefOr[Boolean] = js.undefined
}
object FocusOptions {
  
  inline def apply(): FocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusOptions]
  }
  
  extension [Self <: FocusOptions](x: Self) {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}
