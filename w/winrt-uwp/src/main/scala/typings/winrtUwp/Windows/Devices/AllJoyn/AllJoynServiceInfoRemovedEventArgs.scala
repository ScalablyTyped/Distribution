package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information that identifies an advertising app that is no longer available. */
trait AllJoynServiceInfoRemovedEventArgs extends StObject {
  
  /** The unique bus name of the advertising app that is no longer available. */
  var uniqueName: String
}
object AllJoynServiceInfoRemovedEventArgs {
  
  inline def apply(uniqueName: String): AllJoynServiceInfoRemovedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynServiceInfoRemovedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllJoynServiceInfoRemovedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
