package typings.winrt.WindowsNs.UINs.TextNs

import typings.winrt.WindowsNs.UINs.TextNs.TabLeader.equals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabLeader extends js.Object

@JSGlobal("Windows.UI.Text.TabLeader")
@js.native
object TabLeader extends js.Object {
  @js.native
  sealed trait dashes extends TabLeader
  
  @js.native
  sealed trait dots extends TabLeader
  
  @js.native
  sealed trait equals extends TabLeader
  
  @js.native
  sealed trait lines extends TabLeader
  
  @js.native
  sealed trait spaces extends TabLeader
  
  @js.native
  sealed trait thickLines extends TabLeader
  
  /* 2 */ val dashes: typings.winrt.WindowsNs.UINs.TextNs.TabLeader.dashes with Double = js.native
  /* 1 */ val dots: typings.winrt.WindowsNs.UINs.TextNs.TabLeader.dots with Double = js.native
  /* 5 */ @JSName("equals")
  val equals_FTabLeader: equals with Double = js.native
  /* 3 */ val lines: typings.winrt.WindowsNs.UINs.TextNs.TabLeader.lines with Double = js.native
  /* 0 */ val spaces: typings.winrt.WindowsNs.UINs.TextNs.TabLeader.spaces with Double = js.native
  /* 4 */ val thickLines: typings.winrt.WindowsNs.UINs.TextNs.TabLeader.thickLines with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabLeader with Double] = js.native
}

