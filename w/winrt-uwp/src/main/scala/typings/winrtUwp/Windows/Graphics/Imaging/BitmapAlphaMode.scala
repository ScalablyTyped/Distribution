package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapAlphaMode extends StObject
/** Specifies the alpha mode of pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapAlphaMode")
@js.native
object BitmapAlphaMode extends StObject {
  
  /** The alpha value is ignored. */
  @js.native
  sealed trait ignore
    extends StObject
       with BitmapAlphaMode
  
  /** The alpha value has been premultiplied. Each color is first scaled by the alpha value. */
  @js.native
  sealed trait premultiplied
    extends StObject
       with BitmapAlphaMode
  
  /** The alpha value has not been premultiplied. The alpha channel indicates the transparency of the color. */
  @js.native
  sealed trait straight
    extends StObject
       with BitmapAlphaMode
}
