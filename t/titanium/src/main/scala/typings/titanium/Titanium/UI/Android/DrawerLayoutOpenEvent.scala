package typings.titanium.Titanium.UI.Android

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the drawer view is opened.
  */
@js.native
trait DrawerLayoutOpenEvent extends DrawerLayoutBaseEvent {
  
  /**
    * Contains the drawer frame type. Either `left` or `right`.
    */
  var drawer: String = js.native
}
object DrawerLayoutOpenEvent {
  
  @scala.inline
  def apply(drawer: String, source: DrawerLayout): DrawerLayoutOpenEvent = {
    val __obj = js.Dynamic.literal(drawer = drawer.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLayoutOpenEvent]
  }
  
  @scala.inline
  implicit class DrawerLayoutOpenEventMutableBuilder[Self <: DrawerLayoutOpenEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawer(value: String): Self = StObject.set(x, "drawer", value.asInstanceOf[js.Any])
  }
}
