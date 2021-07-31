package typings.winrtUwp.Windows.ApplicationModel.Calls.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneLineProperties extends StObject
/** Indicates a set of property flags that are part of a phone line changed trigger. Multiple properties can be set at one time. */
@JSGlobal("Windows.ApplicationModel.Calls.Background.PhoneLineProperties")
@js.native
object PhoneLineProperties extends StObject {
  
  /** The branding options for the phone line. */
  @js.native
  sealed trait brandingOptions
    extends StObject
       with PhoneLineProperties
  
  /** The ability to dial outgoing calls on the phone line. */
  @js.native
  sealed trait canDial
    extends StObject
       with PhoneLineProperties
  
  /** The cellular details for the phone line. */
  @js.native
  sealed trait cellularDetails
    extends StObject
       with PhoneLineProperties
  
  /** The preferred display color for the phone line. */
  @js.native
  sealed trait displayColor
    extends StObject
       with PhoneLineProperties
  
  /** The user assigned friendly name of the phone line. */
  @js.native
  sealed trait displayName
    extends StObject
       with PhoneLineProperties
  
  /** The name of the current network that is being used by the phone line. */
  @js.native
  sealed trait networkName
    extends StObject
       with PhoneLineProperties
  
  /** The current network status of the phone line. */
  @js.native
  sealed trait networkState
    extends StObject
       with PhoneLineProperties
  
  /** No property. */
  @js.native
  sealed trait none
    extends StObject
       with PhoneLineProperties
  
  /** The transport (cellular or voice over IP) for the phone line. */
  @js.native
  sealed trait transport
    extends StObject
       with PhoneLineProperties
  
  /** The voice mail account associated with the phone line. */
  @js.native
  sealed trait voicemail
    extends StObject
       with PhoneLineProperties
}
