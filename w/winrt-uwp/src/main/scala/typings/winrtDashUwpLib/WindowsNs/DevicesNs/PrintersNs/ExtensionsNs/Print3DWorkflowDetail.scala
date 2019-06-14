package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs

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
  sealed trait invalidMaterialSelection
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail
  
  /** The 3D model is not valid. */
  @js.native
  sealed trait invalidModel
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail
  
  /** The print ticket is not valid. */
  @js.native
  sealed trait invalidPrintTicket
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail
  
  /** The 3D model exceeds the print bed. */
  @js.native
  sealed trait modelExceedsPrintBed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail
  
  /** The 3D model does not have manifold edges. */
  @js.native
  sealed trait modelNotManifold
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail
  
  /** No known error has been encountered. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail
  
  /** The upload failed. */
  @js.native
  sealed trait uploadFailed
    extends winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail
  
  /* 3 */ val invalidMaterialSelection: invalidMaterialSelection with scala.Double = js.native
  /* 4 */ val invalidModel: invalidModel with scala.Double = js.native
  /* 6 */ val invalidPrintTicket: invalidPrintTicket with scala.Double = js.native
  /* 1 */ val modelExceedsPrintBed: modelExceedsPrintBed with scala.Double = js.native
  /* 5 */ val modelNotManifold: modelNotManifold with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  /* 2 */ val uploadFailed: uploadFailed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail with scala.Double
  ] = js.native
}

