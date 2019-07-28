package typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Print3DWorkflowDetail extends js.Object

/** Specifies the types of errors that may be encountered by the Print3DWorkflow class. */
@JSGlobal("Windows.Devices.Printers.Extensions.Print3DWorkflowDetail")
@js.native
object Print3DWorkflowDetail extends js.Object {
  /** An invalid printing material has been selected. */
  @js.native
  sealed trait invalidMaterialSelection extends Print3DWorkflowDetail
  
  /** The 3D model is not valid. */
  @js.native
  sealed trait invalidModel extends Print3DWorkflowDetail
  
  /** The print ticket is not valid. */
  @js.native
  sealed trait invalidPrintTicket extends Print3DWorkflowDetail
  
  /** The 3D model exceeds the print bed. */
  @js.native
  sealed trait modelExceedsPrintBed extends Print3DWorkflowDetail
  
  /** The 3D model does not have manifold edges. */
  @js.native
  sealed trait modelNotManifold extends Print3DWorkflowDetail
  
  /** No known error has been encountered. */
  @js.native
  sealed trait unknown extends Print3DWorkflowDetail
  
  /** The upload failed. */
  @js.native
  sealed trait uploadFailed extends Print3DWorkflowDetail
  
  /* 3 */ val invalidMaterialSelection: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail.invalidMaterialSelection with Double = js.native
  /* 4 */ val invalidModel: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail.invalidModel with Double = js.native
  /* 6 */ val invalidPrintTicket: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail.invalidPrintTicket with Double = js.native
  /* 1 */ val modelExceedsPrintBed: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail.modelExceedsPrintBed with Double = js.native
  /* 5 */ val modelNotManifold: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail.modelNotManifold with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail.unknown with Double = js.native
  /* 2 */ val uploadFailed: typings.winrtDashUwp.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail.uploadFailed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Print3DWorkflowDetail with Double] = js.native
}

