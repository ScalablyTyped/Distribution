package typings.winrt.WindowsNs.UINs.TextNs

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
  
  /* 3 */ val inlineShape: typings.winrt.WindowsNs.UINs.TextNs.SelectionType.inlineShape with Double = js.native
  /* 1 */ val insertionPoint: typings.winrt.WindowsNs.UINs.TextNs.SelectionType.insertionPoint with Double = js.native
  /* 0 */ val none: typings.winrt.WindowsNs.UINs.TextNs.SelectionType.none with Double = js.native
  /* 2 */ val normal: typings.winrt.WindowsNs.UINs.TextNs.SelectionType.normal with Double = js.native
  /* 4 */ val shape: typings.winrt.WindowsNs.UINs.TextNs.SelectionType.shape with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
}

