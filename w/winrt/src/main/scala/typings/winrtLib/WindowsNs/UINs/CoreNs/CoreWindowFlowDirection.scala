package typings
package winrtLib.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreWindowFlowDirection extends js.Object

@JSGlobal("Windows.UI.Core.CoreWindowFlowDirection")
@js.native
object CoreWindowFlowDirection extends js.Object {
  @js.native
  sealed trait leftToRight
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreWindowFlowDirection
  
  @js.native
  sealed trait rightToLeft
    extends winrtLib.WindowsNs.UINs.CoreNs.CoreWindowFlowDirection
  
  val leftToRight: leftToRight with java.lang.String = js.native
  val rightToLeft: rightToLeft with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.CoreNs.CoreWindowFlowDirection with java.lang.String] = js.native
}

