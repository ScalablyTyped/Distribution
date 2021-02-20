package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetSizeOptions extends StObject {
  
  /** Contains an enumeration value of one of the following: AUTOMATIC, EXACTLY, RANGE, ATLEAST, and ATMOST. */
  var behavior: SheetSizeBehaviour = js.native
  
  /** This is only defined when behavior is EXACTLY, RANGE or ATMOST. */
  var maxSize: Double = js.native
  
  /** This is only defined when behavior is EXACTLY, RANGE, or ATLEAST. */
  var minSize: Double = js.native
}
object SheetSizeOptions {
  
  @scala.inline
  def apply(behavior: SheetSizeBehaviour, maxSize: Double, minSize: Double): SheetSizeOptions = {
    val __obj = js.Dynamic.literal(behavior = behavior.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetSizeOptions]
  }
  
  @scala.inline
  implicit class SheetSizeOptionsMutableBuilder[Self <: SheetSizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBehavior(value: SheetSizeBehaviour): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
  }
}
