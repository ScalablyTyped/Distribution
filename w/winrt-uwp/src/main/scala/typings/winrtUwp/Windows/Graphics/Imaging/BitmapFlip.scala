package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BitmapFlip extends StObject
/** Specifies the flip operation to be performed on pixel data. */
@JSGlobal("Windows.Graphics.Imaging.BitmapFlip")
@js.native
object BitmapFlip extends StObject {
  
  /** Flip the bitmap around the y axis. */
  @js.native
  sealed trait horizontal
    extends StObject
       with BitmapFlip
  
  /** No flip operation will be performed. */
  @js.native
  sealed trait none
    extends StObject
       with BitmapFlip
  
  /** Flip the bitmap around the x axis. */
  @js.native
  sealed trait vertical
    extends StObject
       with BitmapFlip
}
