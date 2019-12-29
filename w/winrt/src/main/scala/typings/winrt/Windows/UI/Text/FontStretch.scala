package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FontStretch with Double] = js.native
  /* 3 */ @js.native
  object condensed extends TopLevel[condensed with Double]
  
  /* 7 */ @js.native
  object expanded extends TopLevel[expanded with Double]
  
  /* 2 */ @js.native
  object extraCondensed extends TopLevel[extraCondensed with Double]
  
  /* 8 */ @js.native
  object extraExpanded extends TopLevel[extraExpanded with Double]
  
  /* 5 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 4 */ @js.native
  object semiCondensed extends TopLevel[semiCondensed with Double]
  
  /* 6 */ @js.native
  object semiExpanded extends TopLevel[semiExpanded with Double]
  
  /* 1 */ @js.native
  object ultraCondensed extends TopLevel[ultraCondensed with Double]
  
  /* 9 */ @js.native
  object ultraExpanded extends TopLevel[ultraExpanded with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}

