package typings.winrtUwp.Windows.Devices.AllJoyn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information that identifies an advertising app that is no longer available. */
@js.native
trait AllJoynServiceInfoRemovedEventArgs extends StObject {
  
  /** The unique bus name of the advertising app that is no longer available. */
  var uniqueName: String = js.native
}
object AllJoynServiceInfoRemovedEventArgs {
  
  @scala.inline
  def apply(uniqueName: String): AllJoynServiceInfoRemovedEventArgs = {
    val __obj = js.Dynamic.literal(uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynServiceInfoRemovedEventArgs]
  }
  
  @scala.inline
  implicit class AllJoynServiceInfoRemovedEventArgsMutableBuilder[Self <: AllJoynServiceInfoRemovedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
  }
}
