package typings.vexflow.Vex.Flow

import typings.vexflow.Vex.IRenderContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  def getContext(): IRenderContext = js.native
  def resize(width: Double, height: Double): Renderer = js.native
}

@JSGlobal("Vex.Flow.Renderer")
@js.native
object Renderer extends js.Object {
  @js.native
  sealed trait Backends extends js.Object
  
  @js.native
  sealed trait LineEndType extends js.Object
  
  @js.native
  object Backends extends js.Object {
    @js.native
    sealed trait CANVAS extends Backends
    
    @js.native
    sealed trait RAPHAEL extends Backends
    
    @js.native
    sealed trait SVG extends Backends
    
    @js.native
    sealed trait VML extends Backends
    
  }
  
  @js.native
  object LineEndType extends js.Object {
    @js.native
    sealed trait DOWN extends LineEndType
    
    @js.native
    sealed trait NONE extends LineEndType
    
    @js.native
    sealed trait UP extends LineEndType
    
  }
  
}

