package typings.titanium.Titanium.UI.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the drawer view changes it's position.
  */
@js.native
trait DrawerLayoutSlideEvent extends DrawerLayoutBaseEvent {
  
  /**
    * Contains the drawer frame type. Either `left` or `right`.
    */
  var drawer: String = js.native
  
  /**
    * The current drawer offset.
    */
  var offset: Double = js.native
}
object DrawerLayoutSlideEvent {
  
  @scala.inline
  def apply(drawer: String, offset: Double, source: DrawerLayout): DrawerLayoutSlideEvent = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutSlideEvent]
  }
  
  @scala.inline
  implicit class DrawerLayoutSlideEventMutableBuilder[Self <: DrawerLayoutSlideEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawer(value: String): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
