package typings.winrt.Windows.UI.Text

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
  
}

