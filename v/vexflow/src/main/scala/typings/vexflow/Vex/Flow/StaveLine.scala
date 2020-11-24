package typings.vexflow.Vex.Flow

import typings.vexflow.anon.Arrowheadangle
import typings.vexflow.anon.Family
import typings.vexflow.anon.Lastnote
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StaveLine extends js.Object {
  
  def applyFontStyle(): Unit = js.native
  
  def applyLineStyle(): Unit = js.native
  
  def draw(): StaveLine = js.native
  
  //inconsistent API: this should be set via an options object in the constructor
  var render_options: Arrowheadangle = js.native
  
  def setContext(context: js.Object): StaveLine = js.native
  
  def setFont(font: Family): StaveLine = js.native
  
  def setNotes(notes: Lastnote): StaveLine = js.native
  
  def setText(text: String): StaveLine = js.native
}
@JSGlobal("Vex.Flow.StaveLine")
@js.native
object StaveLine extends js.Object {
  
  @js.native
  sealed trait TextJustification extends js.Object
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
  sealed trait TextVerticalPosition extends js.Object
  @js.native
  object TextVerticalPosition extends js.Object {
    
    @js.native
    sealed trait BOTTOM extends TextVerticalPosition
    
    @js.native
    sealed trait TOP extends TextVerticalPosition
  }
}
