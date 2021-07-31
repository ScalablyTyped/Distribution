package typings.winrt.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TiffCompressionMode extends StObject
@JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
@js.native
object TiffCompressionMode extends StObject {
  
  @js.native
  sealed trait automatic
    extends StObject
       with TiffCompressionMode
  
  @js.native
  sealed trait ccitt3
    extends StObject
       with TiffCompressionMode
  
  @js.native
  sealed trait ccitt4
    extends StObject
       with TiffCompressionMode
  
  @js.native
  sealed trait lzw
    extends StObject
       with TiffCompressionMode
  
  @js.native
  sealed trait lzwhDifferencing
    extends StObject
       with TiffCompressionMode
  
  @js.native
  sealed trait none
    extends StObject
       with TiffCompressionMode
  
  @js.native
  sealed trait rle
    extends StObject
       with TiffCompressionMode
  
  @js.native
  sealed trait zip
    extends StObject
       with TiffCompressionMode
}
