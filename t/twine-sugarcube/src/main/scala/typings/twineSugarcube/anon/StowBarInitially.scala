package typings.twineSugarcube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StowBarInitially extends StObject {
  
  /**
    * Determines whether the UI bar (sidebar) starts in the stowed (shut) state initially. Valid values are boolean
    * true/false, which causes the UI bar to always/never start in the stowed state, or an integer, which causes the UI
    * bar to start in the stowed state if the viewport width is less-than-or-equal-to the specified number of pixels.
    *
    * @default 800
    * @since 2.11.0
    *
    * @example
    * // As a boolean; always start stowed
    * Config.ui.stowBarInitially = true;
    *
    * @example
    * // As a boolean; never start stowed
    * Config.ui.stowBarInitially = false;
    *
    * @example
    * // As an integer; start stowed if the viewport is 800px or less
    * Config.ui.stowBarInitially = 800;
    */
  var stowBarInitially: Boolean | Double
  
  /**
    * Determines whether certain elements within the UI bar are updated when passages are displayed. The affected
    * elements are the story: banner, subtitle, author, caption, and menu.
    *
    * **NOTE**: SugarCube uses the story's title as the basis for the key used to store and load data used when playing the
    * story and for saves. Because of this, the story title is not included in updates and it is strongly recommended
    * that you do not add any kind of dynamic code to it.
    *
    * @default true
    * @since 2.0.0
    * @example
    * // If you don't need those elements to update
    * Config.ui.updateStoryElements = false;
    */
  var updateStoryElements: Boolean
}
object StowBarInitially {
  
  inline def apply(stowBarInitially: Boolean | Double, updateStoryElements: Boolean): StowBarInitially = {
    val __obj = js.Dynamic.literal(stowBarInitially = stowBarInitially.asInstanceOf[js.Any], updateStoryElements = updateStoryElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[StowBarInitially]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StowBarInitially] (val x: Self) extends AnyVal {
    
    inline def setStowBarInitially(value: Boolean | Double): Self = StObject.set(x, "stowBarInitially", value.asInstanceOf[js.Any])
    
    inline def setUpdateStoryElements(value: Boolean): Self = StObject.set(x, "updateStoryElements", value.asInstanceOf[js.Any])
  }
}
