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
  
  val invalidMaterialSelection: invalidMaterialSelection with java.lang.String = js.native
  val invalidModel: invalidModel with java.lang.String = js.native
  val invalidPrintTicket: invalidPrintTicket with java.lang.String = js.native
  val modelExceedsPrintBed: modelExceedsPrintBed with java.lang.String = js.native
  val modelNotManifold: modelNotManifold with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  val uploadFailed: uploadFailed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs.Print3DTaskDetail with java.lang.String
  ] = js.native
}

