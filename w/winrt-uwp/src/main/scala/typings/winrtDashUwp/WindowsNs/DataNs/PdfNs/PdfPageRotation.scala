package typings.winrtDashUwp.WindowsNs.DataNs.PdfNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PdfPageRotation extends js.Object

/** Specifies the number of degrees that a page in a Portable Document Format (PDF) document is rotated in the rendered output. */
@JSGlobal("Windows.Data.Pdf.PdfPageRotation")
@js.native
object PdfPageRotation extends js.Object {
  /** No rotation. */
  @js.native
  sealed trait normal extends PdfPageRotation
  
  /** A 180-degree rotation. */
  @js.native
  sealed trait rotate180 extends PdfPageRotation
  
  /** A 270-degree rotation. */
  @js.native
  sealed trait rotate270 extends PdfPageRotation
  
  /** A 90-degree rotation. */
  @js.native
  sealed trait rotate90 extends PdfPageRotation
  
  /* 0 */ val normal: typings.winrtDashUwp.WindowsNs.DataNs.PdfNs.PdfPageRotation.normal with Double = js.native
  /* 2 */ val rotate180: typings.winrtDashUwp.WindowsNs.DataNs.PdfNs.PdfPageRotation.rotate180 with Double = js.native
  /* 3 */ val rotate270: typings.winrtDashUwp.WindowsNs.DataNs.PdfNs.PdfPageRotation.rotate270 with Double = js.native
  /* 1 */ val rotate90: typings.winrtDashUwp.WindowsNs.DataNs.PdfNs.PdfPageRotation.rotate90 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PdfPageRotation with Double] = js.native
}

