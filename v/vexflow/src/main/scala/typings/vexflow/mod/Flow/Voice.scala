package typings.vexflow.mod.Flow

import typings.vexflow.anon.Beatvalue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexflow", "Flow.Voice")
@js.native
class Voice protected ()
  extends typings.vexflow.Vex.Flow.Voice {
  def this(time: Beatvalue) = this()
}
object Voice {
  
  @JSImport("vexflow", "Flow.Voice.Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Voice.Mode with Double] = js.native
    
    /* 1 */ val FULL: typings.vexflow.Vex.Flow.Voice.Mode.FULL with Double = js.native
    
    /* 0 */ val SOFT: typings.vexflow.Vex.Flow.Voice.Mode.SOFT with Double = js.native
    
    /* 1 */ val STRICT: typings.vexflow.Vex.Flow.Voice.Mode.STRICT with Double = js.native
  }
}
