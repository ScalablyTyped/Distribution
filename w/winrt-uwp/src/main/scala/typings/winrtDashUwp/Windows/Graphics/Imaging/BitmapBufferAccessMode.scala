package typings.winrtDashUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode.read
import typings.winrtDashUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode.readWrite
import typings.winrtDashUwp.Windows.Graphics.Imaging.BitmapBufferAccessMode.write
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapBufferAccessMode with Double] = js.native
  /* 0 */ @js.native
  object read extends TopLevel[read with Double]
  
  /* 1 */ @js.native
  object readWrite extends TopLevel[readWrite with Double]
  
  /* 2 */ @js.native
  object write extends TopLevel[write with Double]
  
}

