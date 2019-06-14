package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Print3DTaskDetail extends js.Object

/** Specifies the type of errors encountered during a 3D print request. */
@JSGlobal("Windows.Graphics.Printing3D.Print3DTaskDetail")
@js.native
object Print3DTaskDetail extends js.Object {
  /** An invalid printing material has been selected. */
  @js.native
  sealed trait invalidMaterialSelection
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail
  
  /** The 3D model is not valid. */
  @js.native
  sealed trait invalidModel
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail
  
  /** The print ticket is not valid. */
  @js.native
  sealed trait invalidPrintTicket
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail
  
  /** The 3D model exceeds the print bed. */
  @js.native
  sealed trait modelExceedsPrintBed
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail
  
  /** The 3d model does not have manifold edges. */
  @js.native
  sealed trait modelNotManifold
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail
  
  /** No additional information is available. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail
  
  /** The upload of the 3D print package failed. */
  @js.native
  sealed trait uploadFailed
    extends winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail
  
  /* 3 */ val invalidMaterialSelection: invalidMaterialSelection with scala.Double = js.native
  /* 4 */ val invalidModel: invalidModel with scala.Double = js.native
  /* 6 */ val invalidPrintTicket: invalidPrintTicket with scala.Double = js.native
  /* 1 */ val modelExceedsPrintBed: modelExceedsPrintBed with scala.Double = js.native
  /* 5 */ val modelNotManifold: modelNotManifold with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 2 */ val uploadFailed: uploadFailed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail with scala.Double
  ] = js.native
}

