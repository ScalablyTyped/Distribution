package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BitmapPixelFormat extends js.Object

@JSGlobal("Windows.Graphics.Imaging.BitmapPixelFormat")
@js.native
object BitmapPixelFormat extends js.Object {
  @js.native
  sealed trait bgra8 extends BitmapPixelFormat
  
  @js.native
  sealed trait rgba16 extends BitmapPixelFormat
  
  @js.native
  sealed trait rgba8 extends BitmapPixelFormat
  
  @js.native
  sealed trait unknown extends BitmapPixelFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BitmapPixelFormat with Double] = js.native
  /* 3 */ @js.native
  object bgra8 extends TopLevel[bgra8 with Double]
  
  /* 1 */ @js.native
  object rgba16 extends TopLevel[rgba16 with Double]
  
  /* 2 */ @js.native
  object rgba8 extends TopLevel[rgba8 with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

