package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PngFilterMode extends js.Object

@JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
@js.native
object PngFilterMode extends js.Object {
  @js.native
  sealed trait adaptive extends PngFilterMode
  
  @js.native
  sealed trait automatic extends PngFilterMode
  
  @js.native
  sealed trait average extends PngFilterMode
  
  @js.native
  sealed trait none extends PngFilterMode
  
  @js.native
  sealed trait paeth extends PngFilterMode
  
  @js.native
  sealed trait sub extends PngFilterMode
  
  @js.native
  sealed trait up extends PngFilterMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PngFilterMode with Double] = js.native
  /* 6 */ @js.native
  object adaptive extends TopLevel[adaptive with Double]
  
  /* 0 */ @js.native
  object automatic extends TopLevel[automatic with Double]
  
  /* 4 */ @js.native
  object average extends TopLevel[average with Double]
  
  /* 1 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 5 */ @js.native
  object paeth extends TopLevel[paeth with Double]
  
  /* 2 */ @js.native
  object sub extends TopLevel[sub with Double]
  
  /* 3 */ @js.native
  object up extends TopLevel[up with Double]
  
}

