package typings
package winrtDashUwpLib.WindowsNs.DataNs.PdfNs

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
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.DataNs.PdfNs.PdfPageRotation
  
  /** A 180-degree rotation. */
  @js.native
  sealed trait rotate180
    extends winrtDashUwpLib.WindowsNs.DataNs.PdfNs.PdfPageRotation
  
  /** A 270-degree rotation. */
  @js.native
  sealed trait rotate270
    extends winrtDashUwpLib.WindowsNs.DataNs.PdfNs.PdfPageRotation
  
  /** A 90-degree rotation. */
  @js.native
  sealed trait rotate90
    extends winrtDashUwpLib.WindowsNs.DataNs.PdfNs.PdfPageRotation
  
  val normal: normal with java.lang.String = js.native
  val rotate180: rotate180 with java.lang.String = js.native
  val rotate270: rotate270 with java.lang.String = js.native
  val rotate90: rotate90 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.DataNs.PdfNs.PdfPageRotation with java.lang.String] = js.native
}

