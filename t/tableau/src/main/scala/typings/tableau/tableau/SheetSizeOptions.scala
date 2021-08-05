package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetSizeOptions extends StObject {
  
  /** Contains an enumeration value of one of the following: AUTOMATIC, EXACTLY, RANGE, ATLEAST, and ATMOST. */
  var behavior: SheetSizeBehaviour
  
  /** This is only defined when behavior is EXACTLY, RANGE or ATMOST. */
  var maxSize: Double
  
  /** This is only defined when behavior is EXACTLY, RANGE, or ATLEAST. */
  var minSize: Double
}
object SheetSizeOptions {
  
  inline def apply(behavior: SheetSizeBehaviour, maxSize: Double, minSize: Double): SheetSizeOptions = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetSizeOptions]
  }
  
  extension [Self <: SheetSizeOptions](x: Self) {
    
    inline def setBehavior(value: SheetSizeBehaviour): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
  }
}
