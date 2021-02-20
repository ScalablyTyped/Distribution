package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapRotation extends StObject
@JSGlobal("Windows.Graphics.Imaging.BitmapRotation")
@js.native
object BitmapRotation extends StObject {
  
  @js.native
  sealed trait clockwise180Degrees extends BitmapRotation
  
  @js.native
  sealed trait clockwise270Degrees extends BitmapRotation
  
  @js.native
  sealed trait clockwise90Degrees extends BitmapRotation
  
  @js.native
  sealed trait none extends BitmapRotation
}
