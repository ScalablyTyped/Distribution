package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionOptions extends js.Object
@JSGlobal("Windows.UI.Text.SelectionOptions")
@js.native
object SelectionOptions extends js.Object {
  
  @js.native
  sealed trait active extends SelectionOptions
  
  @js.native
  sealed trait atEndOfLine extends SelectionOptions
  
  @js.native
  sealed trait overtype extends SelectionOptions
  
  @js.native
  sealed trait replace extends SelectionOptions
  
  @js.native
  sealed trait startActive extends SelectionOptions
}
