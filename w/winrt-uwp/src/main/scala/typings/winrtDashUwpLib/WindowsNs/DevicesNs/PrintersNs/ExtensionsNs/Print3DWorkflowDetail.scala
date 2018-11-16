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
  
  val invalidMaterialSelection: invalidMaterialSelection with java.lang.String = js.native
  val invalidModel: invalidModel with java.lang.String = js.native
  val invalidPrintTicket: invalidPrintTicket with java.lang.String = js.native
  val modelExceedsPrintBed: modelExceedsPrintBed with java.lang.String = js.native
  val modelNotManifold: modelNotManifold with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val uploadFailed: uploadFailed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.PrintersNs.ExtensionsNs.Print3DWorkflowDetail with java.lang.String
  ] = js.native
}

