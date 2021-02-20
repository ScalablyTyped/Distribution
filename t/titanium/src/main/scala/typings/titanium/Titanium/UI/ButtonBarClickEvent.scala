package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when a button is clicked.
  */
@js.native
trait ButtonBarClickEvent extends ButtonBarBaseEvent {
  
  /**
    * Index of the clicked button.
    */
  var index: Double = js.native
}
object ButtonBarClickEvent {
  
  @scala.inline
  def apply(index: Double, source: ButtonBar): ButtonBarClickEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonBarClickEvent]
  }
  
  @scala.inline
  implicit class ButtonBarClickEventMutableBuilder[Self <: ButtonBarClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
