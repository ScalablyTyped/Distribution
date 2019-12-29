package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SmsDataFormat extends js.Object

@JSGlobal("Windows.Devices.Sms.SmsDataFormat")
@js.native
object SmsDataFormat extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SmsDataFormat with Double] = js.native
  /* 3 */ @js.native
  object cdmaDeliver extends TopLevel[cdmaDeliver with Double]
  
  /* 1 */ @js.native
  object cdmaSubmit extends TopLevel[cdmaSubmit with Double]
  
  /* 4 */ @js.native
  object gsmDeliver extends TopLevel[gsmDeliver with Double]
  
  /* 2 */ @js.native
  object gsmSubmit extends TopLevel[gsmSubmit with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

