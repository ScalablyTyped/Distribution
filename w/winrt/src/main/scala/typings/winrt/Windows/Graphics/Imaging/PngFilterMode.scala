package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PngFilterMode extends StObject
@JSGlobal("Windows.Graphics.Imaging.PngFilterMode")
@js.native
object PngFilterMode extends StObject {
  
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
