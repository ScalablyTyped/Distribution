package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetSizeOptions extends js.Object {
  
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
  implicit class SheetSizeOptionsOps[Self <: SheetSizeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBehavior(value: SheetSizeBehaviour): Self = this.set("behavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
  }
}
