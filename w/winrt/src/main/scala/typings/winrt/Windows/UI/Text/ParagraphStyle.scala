package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Text.ParagraphStyle.heading1
import typings.winrt.Windows.UI.Text.ParagraphStyle.heading2
import typings.winrt.Windows.UI.Text.ParagraphStyle.heading3
import typings.winrt.Windows.UI.Text.ParagraphStyle.heading4
import typings.winrt.Windows.UI.Text.ParagraphStyle.heading5
import typings.winrt.Windows.UI.Text.ParagraphStyle.heading6
import typings.winrt.Windows.UI.Text.ParagraphStyle.heading7
import typings.winrt.Windows.UI.Text.ParagraphStyle.heading8
import typings.winrt.Windows.UI.Text.ParagraphStyle.heading9
import typings.winrt.Windows.UI.Text.ParagraphStyle.none
import typings.winrt.Windows.UI.Text.ParagraphStyle.normal
import typings.winrt.Windows.UI.Text.ParagraphStyle.undefined
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphStyle extends js.Object

@JSGlobal("Windows.UI.Text.ParagraphStyle")
@js.native
object ParagraphStyle extends js.Object {
  @js.native
  sealed trait heading1 extends ParagraphStyle
  
  @js.native
  sealed trait heading2 extends ParagraphStyle
  
  @js.native
  sealed trait heading3 extends ParagraphStyle
  
  @js.native
  sealed trait heading4 extends ParagraphStyle
  
  @js.native
  sealed trait heading5 extends ParagraphStyle
  
  @js.native
  sealed trait heading6 extends ParagraphStyle
  
  @js.native
  sealed trait heading7 extends ParagraphStyle
  
  @js.native
  sealed trait heading8 extends ParagraphStyle
  
  @js.native
  sealed trait heading9 extends ParagraphStyle
  
  @js.native
  sealed trait none extends ParagraphStyle
  
  @js.native
  sealed trait normal extends ParagraphStyle
  
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

