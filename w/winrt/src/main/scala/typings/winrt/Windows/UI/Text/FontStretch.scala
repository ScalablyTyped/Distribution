package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStretch extends js.Object

@JSGlobal("Windows.UI.Text.FontStretch")
@js.native
object FontStretch extends js.Object {
  @js.native
  sealed trait condensed extends FontStretch
  
  @js.native
  sealed trait expanded extends FontStretch
  
  @js.native
  sealed trait extraCondensed extends FontStretch
  
  @js.native
  sealed trait extraExpanded extends FontStretch
  
  @js.native
  sealed trait normal extends FontStretch
  
  @js.native
  sealed trait semiCondensed extends FontStretch
  
  @js.native
  sealed trait semiExpanded extends FontStretch
  
  @js.native
  sealed trait ultraCondensed extends FontStretch
  
  @js.native
  sealed trait ultraExpanded extends FontStretch
  
  @js.native
  sealed trait undefined extends FontStretch
  
  /* 3 */ val condensed: typings.winrt.Windows.UI.Text.FontStretch.condensed with Double = js.native
  /* 7 */ val expanded: typings.winrt.Windows.UI.Text.FontStretch.expanded with Double = js.native
  /* 2 */ val extraCondensed: typings.winrt.Windows.UI.Text.FontStretch.extraCondensed with Double = js.native
  /* 8 */ val extraExpanded: typings.winrt.Windows.UI.Text.FontStretch.extraExpanded with Double = js.native
  /* 5 */ val normal: typings.winrt.Windows.UI.Text.FontStretch.normal with Double = js.native
  /* 4 */ val semiCondensed: typings.winrt.Windows.UI.Text.FontStretch.semiCondensed with Double = js.native
  /* 6 */ val semiExpanded: typings.winrt.Windows.UI.Text.FontStretch.semiExpanded with Double = js.native
  /* 1 */ val ultraCondensed: typings.winrt.Windows.UI.Text.FontStretch.ultraCondensed with Double = js.native
  /* 9 */ val ultraExpanded: typings.winrt.Windows.UI.Text.FontStretch.ultraExpanded with Double = js.native
  /* 0 */ val undefined: typings.winrt.Windows.UI.Text.FontStretch.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStretch with Double] = js.native
}

