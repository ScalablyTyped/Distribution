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
  
  val auto: auto with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val medium: medium with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingQuality with java.lang.String
  ] = js.native
}

