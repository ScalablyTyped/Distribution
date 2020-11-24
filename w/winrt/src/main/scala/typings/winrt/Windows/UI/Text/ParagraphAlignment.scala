package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphAlignment extends js.Object
@JSGlobal("Windows.UI.Text.ParagraphAlignment")
@js.native
object ParagraphAlignment extends js.Object {
  
  @js.native
  sealed trait center extends ParagraphAlignment
  
  @js.native
  sealed trait justify extends ParagraphAlignment
  
  @js.native
  sealed trait left extends ParagraphAlignment
  
  @js.native
  sealed trait right extends ParagraphAlignment
  
  @js.native
  sealed trait undefined extends ParagraphAlignment
}
