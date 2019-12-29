package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SelectionType with Double] = js.native
  /* 3 */ @js.native
  object inlineShape extends TopLevel[inlineShape with Double]
  
  /* 1 */ @js.native
  object insertionPoint extends TopLevel[insertionPoint with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  /* 4 */ @js.native
  object shape extends TopLevel[shape with Double]
  
}

