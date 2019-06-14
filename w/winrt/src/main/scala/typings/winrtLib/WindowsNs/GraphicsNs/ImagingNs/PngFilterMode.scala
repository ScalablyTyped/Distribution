package typings
package winrtLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PngFilterMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
@js.native
object PngFilterMode extends js.Object {
  @js.native
  sealed trait adaptive
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  @js.native
  sealed trait automatic
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  @js.native
  sealed trait average
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  @js.native
  sealed trait paeth
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  @js.native
  sealed trait sub
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  @js.native
  sealed trait up
    extends winrtLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode
  
  /* 6 */ val adaptive: adaptive with scala.Double = js.native
  /* 0 */ val automatic: automatic with scala.Double = js.native
  /* 4 */ val average: average with scala.Double = js.native
  /* 1 */ val none: none with scala.Double = js.native
  /* 5 */ val paeth: paeth with scala.Double = js.native
  /* 2 */ val sub: sub with scala.Double = js.native
  /* 3 */ val up: up with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode with scala.Double] = js.native
}

