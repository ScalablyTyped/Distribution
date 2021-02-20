package typings.titanium.Titanium.UI.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the motion state of the drawer view changes.
  */
@js.native
trait DrawerLayoutChangeEvent extends DrawerLayoutBaseEvent {
  
  /**
    * Whether or not the drawer is currently dragging.
    */
  var dragging: Boolean = js.native
  
  /**
    * Contains the drawer frame type. Either `left` or `right`.
    */
  var drawer: String = js.native
  
  /**
    * Whether or not the drawer is currently idle.
    */
  var idle: Boolean = js.native
  
  /**
    * Whether or not the drawer is currently settling.
    */
  var settling: Boolean = js.native
  
  /**
    * The current drawer state.
    */
  var state: Double = js.native
}
object DrawerLayoutChangeEvent {
  
  @scala.inline
  def apply(
    dragging: Boolean,
    drawer: String,
    idle: Boolean,
    settling: Boolean,
    source: DrawerLayout,
    state: Double
  ): DrawerLayoutChangeEvent = {
    val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], settling = settling.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutChangeEvent]
  }
  
  @scala.inline
  implicit class DrawerLayoutChangeEventMutableBuilder[Self <: DrawerLayoutChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawer(value: String): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdle(value: Boolean): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettling(value: Boolean): Self = StObject.set(x, "settling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
