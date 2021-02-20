package typings.titanium.Titanium.UI.iOS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a button is clicked.
  */
@js.native
trait TabbedBarClickEvent extends TabbedBarBaseEvent {
  
  /**
    * Index of the clicked button.
    */
  var index: Double = js.native
}
object TabbedBarClickEvent {
  
  @scala.inline
  def apply(index: Double, source: TabbedBar): TabbedBarClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbedBarClickEvent]
  }
  
  @scala.inline
  implicit class TabbedBarClickEventMutableBuilder[Self <: TabbedBarClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
