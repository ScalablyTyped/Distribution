package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionType extends js.Object

@JSGlobal("Windows.UI.Text.SelectionType")
@js.native
object SelectionType extends js.Object {
  @js.native
  sealed trait inlineShape extends SelectionType
  
  @js.native
  sealed trait insertionPoint extends SelectionType
  
  @js.native
  sealed trait none extends SelectionType
  
  @js.native
  sealed trait normal extends SelectionType
  
  @js.native
  sealed trait shape extends SelectionType
  
}

