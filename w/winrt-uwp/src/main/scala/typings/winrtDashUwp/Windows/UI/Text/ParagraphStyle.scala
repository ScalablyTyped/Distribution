package typings.winrtDashUwp.Windows.UI.Text

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
  sealed trait heading1 extends ParagraphStyle
  
  /** The second level heading. */
  @js.native
  sealed trait heading2 extends ParagraphStyle
  
  /** Third level heading. */
  @js.native
  sealed trait heading3 extends ParagraphStyle
  
  /** Fourth level heading. */
  @js.native
  sealed trait heading4 extends ParagraphStyle
  
  /** Fifth level heading. */
  @js.native
  sealed trait heading5 extends ParagraphStyle
  
  /** Sixth level heading. */
  @js.native
  sealed trait heading6 extends ParagraphStyle
  
  /** Seventh level heading. */
  @js.native
  sealed trait heading7 extends ParagraphStyle
  
  /** Eighth level heading. */
  @js.native
  sealed trait heading8 extends ParagraphStyle
  
  /** Ninth level heading. */
  @js.native
  sealed trait heading9 extends ParagraphStyle
  
  /** There is no paragraph style. */
  @js.native
  sealed trait none extends ParagraphStyle
  
  /** The paragraph style is normal. */
  @js.native
  sealed trait normal extends ParagraphStyle
  
  /** The paragraph style is undefined. */
  @js.native
  sealed trait undefined extends ParagraphStyle
  
  /* 3 */ val heading1: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.heading1 with Double = js.native
  /* 4 */ val heading2: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.heading2 with Double = js.native
  /* 5 */ val heading3: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.heading3 with Double = js.native
  /* 6 */ val heading4: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.heading4 with Double = js.native
  /* 7 */ val heading5: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.heading5 with Double = js.native
  /* 8 */ val heading6: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.heading6 with Double = js.native
  /* 9 */ val heading7: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.heading7 with Double = js.native
  /* 10 */ val heading8: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.heading8 with Double = js.native
  /* 11 */ val heading9: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.heading9 with Double = js.native
  /* 1 */ val none: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.none with Double = js.native
  /* 2 */ val normal: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.normal with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.Windows.UI.Text.ParagraphStyle.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphStyle with Double] = js.native
}

