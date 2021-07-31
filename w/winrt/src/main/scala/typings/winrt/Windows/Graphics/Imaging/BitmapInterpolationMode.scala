package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapInterpolationMode extends StObject
@JSGlobal("Windows.Graphics.Imaging.BitmapInterpolationMode")
@js.native
object BitmapInterpolationMode extends StObject {
  
  @js.native
  sealed trait cubic
    extends StObject
       with BitmapInterpolationMode
  
  @js.native
  sealed trait fant
    extends StObject
       with BitmapInterpolationMode
  
  @js.native
  sealed trait linear
    extends StObject
       with BitmapInterpolationMode
  
  @js.native
  sealed trait nearestNeighbor
    extends StObject
       with BitmapInterpolationMode
}
