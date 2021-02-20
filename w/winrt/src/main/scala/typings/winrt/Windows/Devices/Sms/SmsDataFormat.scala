package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsDataFormat extends StObject
@JSGlobal("Windows.Devices.Sms.SmsDataFormat")
@js.native
object SmsDataFormat extends StObject {
  
  @js.native
  sealed trait cdmaDeliver extends SmsDataFormat
  
  @js.native
  sealed trait cdmaSubmit extends SmsDataFormat
  
  @js.native
  sealed trait gsmDeliver extends SmsDataFormat
  
  @js.native
  sealed trait gsmSubmit extends SmsDataFormat
  
  @js.native
  sealed trait unknown extends SmsDataFormat
}
