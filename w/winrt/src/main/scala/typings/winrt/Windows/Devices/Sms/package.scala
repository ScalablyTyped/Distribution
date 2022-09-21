package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type SmsDeviceStatusChangedEventHandler = js.Function1[/* sender */ SmsDevice, Unit]

type SmsMessageReceivedEventHandler = js.Function2[/* sender */ SmsDevice, /* e */ SmsMessageReceivedEventArgs, Unit]
