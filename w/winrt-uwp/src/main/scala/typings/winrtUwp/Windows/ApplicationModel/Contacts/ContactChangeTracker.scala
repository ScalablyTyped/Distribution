package typings.winrtUwp.Windows.ApplicationModel.Contacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for monitoring changes to Contact objects in the ContactStore . */
trait ContactChangeTracker extends StObject {
  
  /** Call this method to enable change tracking. */
  def enable(): Unit
  
  /**
    * Gets a ContactChangeReader that can be used to process changes.
    * @return A ContactChangeReader that can be used to process changes.
    */
  def getChangeReader(): ContactChangeReader
  
  /** Call this method to reset the change tracker if your app receives ContactChangeType.ChangeTrackingLost . */
  def reset(): Unit
}
object ContactChangeTracker {
  
  inline def apply(enable: () => Unit, getChangeReader: () => ContactChangeReader, reset: () => Unit): ContactChangeTracker = {
    val __obj = js.Dynamic.literal(enable = js.Any.fromFunction0(enable), getChangeReader = js.Any.fromFunction0(getChangeReader), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[ContactChangeTracker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactChangeTracker] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetChangeReader(value: () => ContactChangeReader): Self = StObject.set(x, "getChangeReader", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
