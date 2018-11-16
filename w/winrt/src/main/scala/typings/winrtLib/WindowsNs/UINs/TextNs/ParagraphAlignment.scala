package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphAlignment extends js.Object

@JSGlobal("Windows.UI.Text.ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  @js.native
  sealed trait center
    extends winrtLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  @js.native
  sealed trait justify
    extends winrtLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  @js.native
  sealed trait left
    extends winrtLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  @js.native
  sealed trait right
    extends winrtLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  @js.native
  sealed trait undefined
    extends winrtLib.WindowsNs.UINs.TextNs.ParagraphAlignment
  
  val center: center with java.lang.String = js.native
  val justify: justify with java.lang.String = js.native
  val left: left with java.lang.String = js.native
  val right: right with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.ParagraphAlignment with java.lang.String] = js.native
}

