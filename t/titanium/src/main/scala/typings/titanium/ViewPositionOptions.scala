package typings.titanium

import typings.titanium.Titanium.UI.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pass an object with the following key-value pairs:
  *   * `view` (Titanium.UI.View): View to insert
  *   * `position` (Number): Position in the [children](Titanium.UI.View.children) array of
  *     the view elment to replace.
  */
@js.native
trait ViewPositionOptions extends StObject {
  
  /**
    * Position in the [children](Titanium.UI.View.children) array of the view element to replace.
    */
  var position: js.UndefOr[Double] = js.native
  
  /**
    * View to insert. Required.
    */
  var view: View = js.native
}
object ViewPositionOptions {
  
  @scala.inline
  def apply(view: View): ViewPositionOptions = {
    val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewPositionOptions]
  }
  
  @scala.inline
  implicit class ViewPositionOptionsMutableBuilder[Self <: ViewPositionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setView(value: View): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
