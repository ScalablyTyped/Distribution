package typings.winrtUwp.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ServiceKindSupportedChanged event. */
trait RcsServiceKindSupportedChangedEventArgs extends StObject {
  
  /** Gets the type of the Rich Communication Services (RCS) service. */
  var serviceKind: RcsServiceKind
}
object RcsServiceKindSupportedChangedEventArgs {
  
  inline def apply(serviceKind: RcsServiceKind): RcsServiceKindSupportedChangedEventArgs = {
    val __obj = js.Dynamic.literal(serviceKind = serviceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsServiceKindSupportedChangedEventArgs]
  }
  
  extension [Self <: RcsServiceKindSupportedChangedEventArgs](x: Self) {
    
    inline def setServiceKind(value: RcsServiceKind): Self = StObject.set(x, "serviceKind", value.asInstanceOf[js.Any])
  }
}
