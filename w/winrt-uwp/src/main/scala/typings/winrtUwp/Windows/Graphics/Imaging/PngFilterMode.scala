package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PngFilterMode extends StObject
/** Specifies the filter used to optimize the image prior to image compression in PNG images. */
@JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
@js.native
object PngFilterMode extends StObject {
  
  /** The Adaptive type filter is applied. */
  @js.native
  sealed trait adaptive
    extends StObject
       with PngFilterMode
  
  /** The filter type will be chosen automatically. */
  @js.native
  sealed trait automatic
    extends StObject
       with PngFilterMode
  
  /** The Average type filter is applied. */
  @js.native
  sealed trait average
    extends StObject
       with PngFilterMode
  
  /** The image is unmodified. */
  @js.native
  sealed trait none
    extends StObject
       with PngFilterMode
  
  /** The Paeth type filter is applied. */
  @js.native
  sealed trait paeth
    extends StObject
       with PngFilterMode
  
  /** The Sub type filter is applied. */
  @js.native
  sealed trait sub
    extends StObject
       with PngFilterMode
  
  /** The Up filter type is applied. */
  @js.native
  sealed trait up
    extends StObject
       with PngFilterMode
}
