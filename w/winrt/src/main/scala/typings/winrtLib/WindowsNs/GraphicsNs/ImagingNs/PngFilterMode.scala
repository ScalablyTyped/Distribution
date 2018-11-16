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
  
  val adaptive: adaptive with java.lang.String = js.native
  val automatic: automatic with java.lang.String = js.native
  val average: average with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val paeth: paeth with java.lang.String = js.native
  val sub: sub with java.lang.String = js.native
  val up: up with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.GraphicsNs.ImagingNs.PngFilterMode with java.lang.String] = js.native
}

