package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SelectionType extends StObject
@JSGlobal("Windows.UI.Text.SelectionType")
@js.native
object SelectionType extends StObject {
  
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
