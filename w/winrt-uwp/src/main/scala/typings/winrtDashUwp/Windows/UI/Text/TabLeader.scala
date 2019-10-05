package typings.winrtDashUwp.Windows.UI.Text

import typings.winrtDashUwp.Windows.UI.Text.TabLeader.equals
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabLeader extends js.Object

/** The character that is used to fill the space taken by a tab character. */
@JSGlobal("Windows.UI.Text.TabLeader")
@js.native
object TabLeader extends js.Object {
  /** A dashed line is used. */
  @js.native
  sealed trait dashes extends TabLeader
  
  /** Dots are used. */
  @js.native
  sealed trait dots extends TabLeader
  
  /** An equal sign is used. */
  @js.native
  sealed trait equals extends TabLeader
  
  /** A solid line is used. */
  @js.native
  sealed trait lines extends TabLeader
  
  /** Spaces are used. This is the default. */
  @js.native
  sealed trait spaces extends TabLeader
  
  /** A thick line is used. */
  @js.native
  sealed trait thickLines extends TabLeader
  
  /* 2 */ val dashes: typings.winrtDashUwp.Windows.UI.Text.TabLeader.dashes with Double = js.native
  /* 1 */ val dots: typings.winrtDashUwp.Windows.UI.Text.TabLeader.dots with Double = js.native
  /* 5 */ @JSName("equals")
  val equals_FTabLeader: equals with Double = js.native
  /* 3 */ val lines: typings.winrtDashUwp.Windows.UI.Text.TabLeader.lines with Double = js.native
  /* 0 */ val spaces: typings.winrtDashUwp.Windows.UI.Text.TabLeader.spaces with Double = js.native
  /* 4 */ val thickLines: typings.winrtDashUwp.Windows.UI.Text.TabLeader.thickLines with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabLeader with Double] = js.native
}

