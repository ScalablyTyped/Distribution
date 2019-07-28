package typings.winrt.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatEffect extends js.Object

@JSGlobal("Windows.UI.Text.FormatEffect")
@js.native
object FormatEffect extends js.Object {
  @js.native
  sealed trait off extends FormatEffect
  
  @js.native
  sealed trait on extends FormatEffect
  
  @js.native
  sealed trait toggle extends FormatEffect
  
  @js.native
  sealed trait undefined extends FormatEffect
  
  /* 0 */ val off: typings.winrt.WindowsNs.UINs.TextNs.FormatEffect.off with Double = js.native
  /* 1 */ val on: typings.winrt.WindowsNs.UINs.TextNs.FormatEffect.on with Double = js.native
  /* 2 */ val toggle: typings.winrt.WindowsNs.UINs.TextNs.FormatEffect.toggle with Double = js.native
  /* 3 */ val undefined: typings.winrt.WindowsNs.UINs.TextNs.FormatEffect.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormatEffect with Double] = js.native
}

