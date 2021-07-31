package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ServiceKindSupportedChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsServiceKindSupportedChangedEventArgs")
@js.native
abstract class RcsServiceKindSupportedChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Chat.RcsServiceKindSupportedChangedEventArgs {
  
  /** Gets the type of the Rich Communication Services (RCS) service. */
  /* CompleteClass */
  var serviceKind: typings.winrtUwp.Windows.ApplicationModel.Chat.RcsServiceKind = js.native
}
