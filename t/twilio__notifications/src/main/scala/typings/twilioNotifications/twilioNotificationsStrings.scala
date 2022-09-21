package typings.twilioNotifications

import typings.twilioNotifications.mod.ChannelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object twilioNotificationsStrings {
  
  @js.native
  sealed trait apn
    extends StObject
       with ChannelType
  inline def apn: apn = "apn".asInstanceOf[apn]
  
  @js.native
  sealed trait fcm
    extends StObject
       with ChannelType
  inline def fcm: fcm = "fcm".asInstanceOf[fcm]
  
  @js.native
  sealed trait twilsock
    extends StObject
       with ChannelType
  inline def twilsock: twilsock = "twilsock".asInstanceOf[twilsock]
}
