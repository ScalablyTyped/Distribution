package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapBufferAccessMode extends js.Object

/** Specifies the access mode of a BitmapBuffer . */
@JSGlobal("Windows.Graphics.Imaging.BitmapBufferAccessMode")
@js.native
object BitmapBufferAccessMode extends js.Object {
  /** The buffer is read-only. */
  @js.native
  sealed trait read
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapBufferAccessMode
  
  /** The buffer can be read from and written to. */
  @js.native
  sealed trait readWrite
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapBufferAccessMode
  
  /** The buffer is write-only. */
  @js.native
  sealed trait write
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapBufferAccessMode
  
  val read: read with java.lang.String = js.native
  val readWrite: readWrite with java.lang.String = js.native
  val write: write with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapBufferAccessMode with java.lang.String
  ] = js.native
}

