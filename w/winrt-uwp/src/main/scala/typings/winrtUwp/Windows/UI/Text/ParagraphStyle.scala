package typings.winrtUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
