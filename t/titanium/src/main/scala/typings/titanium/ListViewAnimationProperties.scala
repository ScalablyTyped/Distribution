package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A simple object for specifying the animation properties to use when inserting or deleting
  * sections or cells, or scrolling the list.
  */
@js.native
trait ListViewAnimationProperties extends StObject {
  
  /**
    * Whether this list change should be animated. Ignored if any `animationStyle` value is specified.
    */
  var animated: js.UndefOr[Boolean] = js.native
  
  /**
    * Type of animation to use for cell insertions and deletions.
    */
  var animationStyle: js.UndefOr[Double] = js.native
  
  /**
    * Specifies what position to scroll the selected cell to.
    */
  var position: js.UndefOr[Double] = js.native
}
object ListViewAnimationProperties {
  
  @scala.inline
  def apply(): ListViewAnimationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListViewAnimationProperties]
  }
  
  @scala.inline
  implicit class ListViewAnimationPropertiesMutableBuilder[Self <: ListViewAnimationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    @scala.inline
    def setAnimationStyle(value: Double): Self = StObject.set(x, "animationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationStyleUndefined: Self = StObject.set(x, "animationStyle", js.undefined)
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
