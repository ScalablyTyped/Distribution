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
  
}

