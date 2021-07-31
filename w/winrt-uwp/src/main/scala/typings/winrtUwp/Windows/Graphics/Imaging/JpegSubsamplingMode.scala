package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JpegSubsamplingMode extends StObject
/** Specifies which chroma subsampling mode will be used for image compression in JPEG images. */
@JSGlobal("Windows.Graphics.Imaging.JpegSubsamplingMode")
@js.native
object JpegSubsamplingMode extends StObject {
  
  /** The default mode will be used. */
  @js.native
  sealed trait default
    extends StObject
       with JpegSubsamplingMode
  
  /** 4:2:0 (2x2) chroma subsampling will be used. */
  @js.native
  sealed trait y4Cb2Cr0
    extends StObject
       with JpegSubsamplingMode
  
  /** 4:2:2 (2x1) chroma subsampling will be used. */
  @js.native
  sealed trait y4Cb2Cr2
    extends StObject
       with JpegSubsamplingMode
  
  /** 4:4:4 (1x1) chroma subsampling will be used. */
  @js.native
  sealed trait y4Cb4Cr4
    extends StObject
       with JpegSubsamplingMode
}
