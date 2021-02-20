package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the `userInterfaceStyle` changes.
  */
@js.native
trait UIUserinterfacestyleEvent extends UIBaseEvent {
  
  /**
    * The new userInterfaceStyle value.
    */
  var value: Double = js.native
}
object UIUserinterfacestyleEvent {
  
  @scala.inline
  def apply(source: UI, value: Double): UIUserinterfacestyleEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIUserinterfacestyleEvent]
  }
  
  @scala.inline
  implicit class UIUserinterfacestyleEventMutableBuilder[Self <: UIUserinterfacestyleEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
