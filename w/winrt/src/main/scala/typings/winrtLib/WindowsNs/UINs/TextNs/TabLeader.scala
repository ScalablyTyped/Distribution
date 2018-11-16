package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabLeader extends js.Object

@JSGlobal("Windows.UI.Text.TabLeader")
@js.native
object TabLeader extends js.Object {
  @js.native
  sealed trait dashes
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait dots
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait equals
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait lines
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait spaces
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  @js.native
  sealed trait thickLines
    extends winrtLib.WindowsNs.UINs.TextNs.TabLeader
  
  val dashes: dashes with java.lang.String = js.native
  val dots: dots with java.lang.String = js.native
  @JSName("equals")
  val equals_FTabLeader: equals with java.lang.String = js.native
  val lines: lines with java.lang.String = js.native
  val spaces: spaces with java.lang.String = js.native
  val thickLines: thickLines with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.TabLeader with java.lang.String] = js.native
}

