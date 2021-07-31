package typings.winrtUwp.Windows.UI.Text

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphAlignment extends StObject
/** Specifies values for aligning paragraphs. */
@JSGlobal("Windows.UI.Text.ParagraphAlignment")
@js.native
object ParagraphAlignment extends StObject {
  
  /** Text is centered between the margins. */
  @js.native
  sealed trait center
    extends StObject
       with ParagraphAlignment
  
  /** Text is equally distributed between the margins so that each line of the paragraph, other than the last, is identical in length. */
  @js.native
  sealed trait justify
    extends StObject
       with ParagraphAlignment
  
  /** Text aligns with the left margin. */
  @js.native
  sealed trait left
    extends StObject
       with ParagraphAlignment
  
  /** Text aligns with the right margin. */
  @js.native
  sealed trait right
    extends StObject
       with ParagraphAlignment
  
  /** No paragraph alignment is defined. */
  @js.native
  sealed trait undefined
    extends StObject
       with ParagraphAlignment
}
