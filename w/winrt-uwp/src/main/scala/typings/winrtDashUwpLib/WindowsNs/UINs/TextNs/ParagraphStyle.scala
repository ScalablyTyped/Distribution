package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphStyle extends js.Object

/** Specifies the paragraph style. */
@JSGlobal("Windows.UI.Text.ParagraphStyle")
@js.native
object ParagraphStyle extends js.Object {
  /** The top level heading. */
  @js.native
  sealed trait heading1
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** The second level heading. */
  @js.native
  sealed trait heading2
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** Third level heading. */
  @js.native
  sealed trait heading3
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** Fourth level heading. */
  @js.native
  sealed trait heading4
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** Fifth level heading. */
  @js.native
  sealed trait heading5
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** Sixth level heading. */
  @js.native
  sealed trait heading6
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** Seventh level heading. */
  @js.native
  sealed trait heading7
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** Eighth level heading. */
  @js.native
  sealed trait heading8
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** Ninth level heading. */
  @js.native
  sealed trait heading9
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** There is no paragraph style. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** The paragraph style is normal. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  /** The paragraph style is undefined. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle
  
  val heading1: heading1 with java.lang.String = js.native
  val heading2: heading2 with java.lang.String = js.native
  val heading3: heading3 with java.lang.String = js.native
  val heading4: heading4 with java.lang.String = js.native
  val heading5: heading5 with java.lang.String = js.native
  val heading6: heading6 with java.lang.String = js.native
  val heading7: heading7 with java.lang.String = js.native
  val heading8: heading8 with java.lang.String = js.native
  val heading9: heading9 with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.ParagraphStyle with java.lang.String] = js.native
}

