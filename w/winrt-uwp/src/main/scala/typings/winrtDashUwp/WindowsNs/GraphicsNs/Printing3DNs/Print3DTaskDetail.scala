package typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs

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
  sealed trait invalidMaterialSelection extends Print3DTaskDetail
  
  /** The 3D model is not valid. */
  @js.native
  sealed trait invalidModel extends Print3DTaskDetail
  
  /** The print ticket is not valid. */
  @js.native
  sealed trait invalidPrintTicket extends Print3DTaskDetail
  
  /** The 3D model exceeds the print bed. */
  @js.native
  sealed trait modelExceedsPrintBed extends Print3DTaskDetail
  
  /** The 3d model does not have manifold edges. */
  @js.native
  sealed trait modelNotManifold extends Print3DTaskDetail
  
  /** No additional information is available. */
  @js.native
  sealed trait unknown extends Print3DTaskDetail
  
  /** The upload of the 3D print package failed. */
  @js.native
  sealed trait uploadFailed extends Print3DTaskDetail
  
  /* 3 */ val invalidMaterialSelection: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail.invalidMaterialSelection with Double = js.native
  /* 4 */ val invalidModel: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail.invalidModel with Double = js.native
  /* 6 */ val invalidPrintTicket: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail.invalidPrintTicket with Double = js.native
  /* 1 */ val modelExceedsPrintBed: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail.modelExceedsPrintBed with Double = js.native
  /* 5 */ val modelNotManifold: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail.modelNotManifold with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail.unknown with Double = js.native
  /* 2 */ val uploadFailed: typings.winrtDashUwp.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail.uploadFailed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Print3DTaskDetail with Double] = js.native
}

