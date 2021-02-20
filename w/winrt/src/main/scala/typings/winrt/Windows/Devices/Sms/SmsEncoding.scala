package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SmsEncoding extends StObject
@JSGlobal("Windows.Devices.Sms.SmsEncoding")
@js.native
object SmsEncoding extends StObject {
  
  @js.native
  sealed trait gsmSevenBit extends SmsEncoding
  
  @js.native
  sealed trait optimal extends SmsEncoding
  
  @js.native
  sealed trait sevenBitAscii extends SmsEncoding
  
  @js.native
  sealed trait unicode extends SmsEncoding
  
  @js.native
  sealed trait unknown extends SmsEncoding
}
