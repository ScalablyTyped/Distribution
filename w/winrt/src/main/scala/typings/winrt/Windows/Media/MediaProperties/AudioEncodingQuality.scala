package typings.winrt.Windows.Media.MediaProperties

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
  
}

