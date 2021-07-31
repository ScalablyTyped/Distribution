package typings.winrtUwp.Windows.System

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LaunchUriStatus extends StObject
/** Specifies the result of activating an application. */
@JSGlobal("Windows.System.LaunchUriStatus")
@js.native
object LaunchUriStatus extends StObject {
  
  /** The application cannot be activated which may be because it is being updated by the store, it was installed on a removable device that is not available, and so on. */
  @js.native
  sealed trait appUnavailable
    extends StObject
       with LaunchUriStatus
  
  /** The application you are trying to activate does not support this URI. */
  @js.native
  sealed trait protocolUnavailable
    extends StObject
       with LaunchUriStatus
  
  /** The application activated successfully. */
  @js.native
  sealed trait success
    extends StObject
       with LaunchUriStatus
  
  /** An unknown error was encountered while activating the application. */
  @js.native
  sealed trait unknown
    extends StObject
       with LaunchUriStatus
}
