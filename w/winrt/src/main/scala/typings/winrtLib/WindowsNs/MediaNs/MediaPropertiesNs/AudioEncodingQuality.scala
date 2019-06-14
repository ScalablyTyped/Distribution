package typings
package winrtLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioEncodingQuality extends js.Object

@JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
@js.native
object AudioEncodingQuality extends js.Object {
  @js.native
  sealed trait auto
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality
  
  @js.native
  sealed trait high
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality
  
  @js.native
  sealed trait low
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality
  
  @js.native
  sealed trait medium
    extends winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 1 */ val high: high with scala.Double = js.native
  /* 3 */ val low: low with scala.Double = js.native
  /* 2 */ val medium: medium with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality with scala.Double
  ] = js.native
}

