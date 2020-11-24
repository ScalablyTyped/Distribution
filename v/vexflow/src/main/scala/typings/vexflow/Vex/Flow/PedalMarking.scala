package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.Flow.PedalMarking.Styles
import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PedalMarking extends js.Object {
  
  def draw(): Unit = js.native
  
  def drawBracketed(): Unit = js.native
  
  def drawText(): Unit = js.native
  
  def setContext(context: IRenderContext): PedalMarking = js.native
  
  def setCustomText(): PedalMarking = js.native
  def setCustomText(depress: js.UndefOr[scala.Nothing], release: String): PedalMarking = js.native
  def setCustomText(depress: String): PedalMarking = js.native
  def setCustomText(depress: String, release: String): PedalMarking = js.native
  
  def setLine(line: Double): PedalMarking = js.native
  
  def setStyle(style: Styles): PedalMarking = js.native
}
@JSGlobal("Vex.Flow.PedalMarking")
@js.native
object PedalMarking extends js.Object {
  
  @js.native
  sealed trait Styles extends js.Object
  @js.native
  object Styles extends js.Object {
    
    @js.native
    sealed trait BRACKET extends Styles
    
    @js.native
    sealed trait MIXED extends Styles
    
    @js.native
    sealed trait TEXT extends Styles
  }
}
