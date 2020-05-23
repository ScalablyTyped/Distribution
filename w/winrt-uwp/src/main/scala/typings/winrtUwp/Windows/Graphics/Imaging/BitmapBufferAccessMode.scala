package typings.winrtUwp.Windows.Graphics.Imaging

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
  
}

