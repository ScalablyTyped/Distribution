package typings.winrtUwp.Windows.Graphics.Printing3D

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Print3DTaskDetail extends StObject
/** Specifies the type of errors encountered during a 3D print request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskDetail")
@js.native
object Print3DTaskDetail extends StObject {
  
  /** An invalid printing material has been selected. */
  @js.native
  sealed trait invalidMaterialSelection
    extends StObject
       with Print3DTaskDetail
  
  /** The 3D model is not valid. */
  @js.native
  sealed trait invalidModel
    extends StObject
       with Print3DTaskDetail
  
  /** The print ticket is not valid. */
  @js.native
  sealed trait invalidPrintTicket
    extends StObject
       with Print3DTaskDetail
  
  /** The 3D model exceeds the print bed. */
  @js.native
  sealed trait modelExceedsPrintBed
    extends StObject
       with Print3DTaskDetail
  
  /** The 3d model does not have manifold edges. */
  @js.native
  sealed trait modelNotManifold
    extends StObject
       with Print3DTaskDetail
  
  /** No additional information is available. */
  @js.native
  sealed trait unknown
    extends StObject
       with Print3DTaskDetail
  
  /** The upload of the 3D print package failed. */
  @js.native
  sealed trait uploadFailed
    extends StObject
       with Print3DTaskDetail
}
