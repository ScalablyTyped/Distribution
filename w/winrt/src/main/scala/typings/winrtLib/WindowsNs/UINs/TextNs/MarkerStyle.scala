package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerStyle extends js.Object

@JSGlobal("Windows.UI.Text.MarkerStyle")
@js.native
object MarkerStyle extends js.Object {
  @js.native
  sealed trait minus
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait noNumber
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait parentheses
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait parenthesis
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait period
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait plain
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  @js.native
  sealed trait undefined
    extends winrtLib.WindowsNs.UINs.TextNs.MarkerStyle
  
  val minus: minus with java.lang.String = js.native
  val noNumber: noNumber with java.lang.String = js.native
  val parentheses: parentheses with java.lang.String = js.native
  val parenthesis: parenthesis with java.lang.String = js.native
  val period: period with java.lang.String = js.native
  val plain: plain with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.MarkerStyle with java.lang.String] = js.native
}

