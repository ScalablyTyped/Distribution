package typings.vexflow.Vex.Flow

import typings.vexflow.anon.Arrowheadangle
import typings.vexflow.anon.Family
import typings.vexflow.anon.Lastnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaveLine extends js.Object {
  //inconsistent API: this should be set via an options object in the constructor
  var render_options: Arrowheadangle
  def applyFontStyle(): Unit
  def applyLineStyle(): Unit
  def draw(): StaveLine
  def setContext(context: js.Object): StaveLine
  def setFont(font: Family): StaveLine
  def setNotes(notes: Lastnote): StaveLine
  def setText(text: String): StaveLine
}

@JSGlobal("Vex.Flow.StaveLine")
@js.native
object StaveLine extends js.Object {
  @js.native
  sealed trait TextJustification extends js.Object
  
  @js.native
  sealed trait TextVerticalPosition extends js.Object
  
  @js.native
  object TextJustification extends js.Object {
    @js.native
    sealed trait CENTER extends TextJustification
    
    @js.native
    sealed trait LEFT extends TextJustification
    
    @js.native
    sealed trait RIGHT extends TextJustification
    
  }
  
  @js.native
  object TextVerticalPosition extends js.Object {
    @js.native
    sealed trait BOTTOM extends TextVerticalPosition
    
    @js.native
    sealed trait TOP extends TextVerticalPosition
    
  }
  
}

