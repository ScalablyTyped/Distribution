package typings.vexflow.Vex.Flow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stroke extends Modifier {
  def addEndNote(note: Note): Stroke = js.native
}

@JSGlobal("Vex.Flow.Stroke")
@js.native
object Stroke extends js.Object {
  @js.native
  sealed trait Type extends js.Object
  
  @js.native
  object Type extends js.Object {
    @js.native
    sealed trait ARPEGGIO_DIRECTIONLESS extends Type
    
    @js.native
    sealed trait BRUSH_DOWN extends Type
    
    @js.native
    sealed trait BRUSH_UP extends Type
    
    @js.native
    sealed trait RASQUEDO_DOWN extends Type
    
    @js.native
    sealed trait RASQUEDO_UP extends Type
    
    @js.native
    sealed trait ROLL_DOWN extends Type
    
    @js.native
    sealed trait ROLL_UP extends Type
    
  }
  
}

