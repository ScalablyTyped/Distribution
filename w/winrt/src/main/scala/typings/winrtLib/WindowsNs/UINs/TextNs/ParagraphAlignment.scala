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
  
  /* 2 */ val center: center with scala.Double = js.native
  /* 4 */ val justify: justify with scala.Double = js.native
  /* 1 */ val left: left with scala.Double = js.native
  /* 3 */ val right: right with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.ParagraphAlignment with scala.Double] = js.native
}

