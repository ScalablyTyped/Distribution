package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphStyle with Double] = js.native
  /* 3 */ @js.native
  object heading1 extends TopLevel[heading1 with Double]
  
  /* 4 */ @js.native
  object heading2 extends TopLevel[heading2 with Double]
  
  /* 5 */ @js.native
  object heading3 extends TopLevel[heading3 with Double]
  
  /* 6 */ @js.native
  object heading4 extends TopLevel[heading4 with Double]
  
  /* 7 */ @js.native
  object heading5 extends TopLevel[heading5 with Double]
  
  /* 8 */ @js.native
  object heading6 extends TopLevel[heading6 with Double]
  
  /* 9 */ @js.native
  object heading7 extends TopLevel[heading7 with Double]
  
  /* 10 */ @js.native
  object heading8 extends TopLevel[heading8 with Double]
  
  /* 11 */ @js.native
  object heading9 extends TopLevel[heading9 with Double]
  
  /* 1 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

