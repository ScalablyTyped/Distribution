package typings.winrtUwp.Windows.Data.Pdf

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
  
}

