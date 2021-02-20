package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusOptions extends ViewPortOptions {
  
  /**
    * Locked denotes whether or not the view remains locked to
    * the node once the zoom-in animation is finished.
    * Default value is true.
    */
  var locked: js.UndefOr[Boolean] = js.native
}
object FocusOptions {
  
  @scala.inline
  def apply(): FocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusOptions]
  }
  
  @scala.inline
  implicit class FocusOptionsMutableBuilder[Self <: FocusOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
  }
}
