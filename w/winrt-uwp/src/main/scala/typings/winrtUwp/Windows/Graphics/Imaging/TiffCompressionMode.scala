package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TiffCompressionMode extends StObject
/** Specifies the compression mode used for TIFF images. */
@JSGlobal("Windows.Graphics.Imaging.TiffCompressionMode")
@js.native
object TiffCompressionMode extends StObject {
  
  /** The compression will be automatically selected. */
  @js.native
  sealed trait automatic
    extends StObject
       with TiffCompressionMode
  
  /** CCITT3 compression will be applied. */
  @js.native
  sealed trait ccitt3
    extends StObject
       with TiffCompressionMode
  
  /** CCITT4compression will be applied. */
  @js.native
  sealed trait ccitt4
    extends StObject
       with TiffCompressionMode
  
  /** LZW compression will be applied. */
  @js.native
  sealed trait lzw
    extends StObject
       with TiffCompressionMode
  
  /** LZWH Differencing compression will be applied. */
  @js.native
  sealed trait lzwhDifferencing
    extends StObject
       with TiffCompressionMode
  
  /** No compression will be applied. */
  @js.native
  sealed trait none
    extends StObject
       with TiffCompressionMode
  
  /** RLE compression will be applied. */
  @js.native
  sealed trait rle
    extends StObject
       with TiffCompressionMode
  
  /** ZIP compression will be applied. */
  @js.native
  sealed trait zip
    extends StObject
       with TiffCompressionMode
}
