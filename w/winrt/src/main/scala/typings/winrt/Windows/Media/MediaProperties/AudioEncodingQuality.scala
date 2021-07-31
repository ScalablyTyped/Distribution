package typings.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AudioEncodingQuality extends StObject
@JSGlobal("Windows.Media.MediaProperties.AudioEncodingQuality")
@js.native
object AudioEncodingQuality extends StObject {
  
  @js.native
  sealed trait auto
    extends StObject
       with AudioEncodingQuality
  
  @js.native
  sealed trait high
    extends StObject
       with AudioEncodingQuality
  
  @js.native
  sealed trait low
    extends StObject
       with AudioEncodingQuality
  
  @js.native
  sealed trait medium
    extends StObject
       with AudioEncodingQuality
}
