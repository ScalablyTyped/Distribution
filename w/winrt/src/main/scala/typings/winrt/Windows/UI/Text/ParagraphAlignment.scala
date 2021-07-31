package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphAlignment extends StObject
@JSGlobal("Windows.UI.Text.ParagraphAlignment")
@js.native
object ParagraphAlignment extends StObject {
  
  @js.native
  sealed trait center
    extends StObject
       with ParagraphAlignment
  
  @js.native
  sealed trait justify
    extends StObject
       with ParagraphAlignment
  
  @js.native
  sealed trait left
    extends StObject
       with ParagraphAlignment
  
  @js.native
  sealed trait right
    extends StObject
       with ParagraphAlignment
  
  @js.native
  sealed trait undefined
    extends StObject
       with ParagraphAlignment
}
