package typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs

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
  sealed trait read extends BitmapBufferAccessMode
  
  /** The buffer can be read from and written to. */
  @js.native
  sealed trait readWrite extends BitmapBufferAccessMode
  
  /** The buffer is write-only. */
  @js.native
  sealed trait write extends BitmapBufferAccessMode
  
  /* 0 */ val read: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapBufferAccessMode.read with Double = js.native
  /* 1 */ val readWrite: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapBufferAccessMode.readWrite with Double = js.native
  /* 2 */ val write: typings.winrtDashUwp.WindowsNs.GraphicsNs.ImagingNs.BitmapBufferAccessMode.write with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapBufferAccessMode with Double] = js.native
}

