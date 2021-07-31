package typings.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information for the DialRequested event. */
@JSGlobal("Windows.Media.Devices.DialRequestedEventArgs")
@js.native
abstract class DialRequestedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Devices.DialRequestedEventArgs {
  
  /** Returns the contact that was dialed. */
  /* CompleteClass */
  var contact: js.Any = js.native
  
  /** Indicates that the DialRequested event has been handled. */
  /* CompleteClass */
  override def handled(): Unit = js.native
}
