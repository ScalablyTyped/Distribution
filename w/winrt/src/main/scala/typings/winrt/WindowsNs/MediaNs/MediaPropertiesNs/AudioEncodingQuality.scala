package typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioEncodingQuality extends js.Object

@JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
@js.native
object AudioEncodingQuality extends js.Object {
  @js.native
  sealed trait auto extends AudioEncodingQuality
  
  @js.native
  sealed trait high extends AudioEncodingQuality
  
  @js.native
  sealed trait low extends AudioEncodingQuality
  
  @js.native
  sealed trait medium extends AudioEncodingQuality
  
  /* 0 */ val auto: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality.auto with Double = js.native
  /* 1 */ val high: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality.high with Double = js.native
  /* 3 */ val low: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality.low with Double = js.native
  /* 2 */ val medium: typings.winrt.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality.medium with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioEncodingQuality with Double] = js.native
}

