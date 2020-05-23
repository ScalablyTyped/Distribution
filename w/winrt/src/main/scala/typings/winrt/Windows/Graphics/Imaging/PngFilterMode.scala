package typings.winrt.Windows.Graphics.Imaging

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
  
}

