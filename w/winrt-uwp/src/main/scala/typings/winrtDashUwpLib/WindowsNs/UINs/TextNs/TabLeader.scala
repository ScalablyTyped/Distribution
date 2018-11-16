package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

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
  sealed trait dashes
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabLeader
  
  /** Dots are used. */
  @js.native
  sealed trait dots
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabLeader
  
  /** An equal sign is used. */
  @js.native
  sealed trait equals
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabLeader
  
  /** A solid line is used. */
  @js.native
  sealed trait lines
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabLeader
  
  /** Spaces are used. This is the default. */
  @js.native
  sealed trait spaces
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabLeader
  
  /** A thick line is used. */
  @js.native
  sealed trait thickLines
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.TabLeader
  
  val dashes: dashes with java.lang.String = js.native
  val dots: dots with java.lang.String = js.native
  @JSName("equals")
  val equals_FTabLeader: equals with java.lang.String = js.native
  val lines: lines with java.lang.String = js.native
  val spaces: spaces with java.lang.String = js.native
  val thickLines: thickLines with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.TabLeader with java.lang.String] = js.native
}

