package typings.vextab.mod.Vex.Flow

import typings.vexflow.anon.Beatvalue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vextab", "Vex.Flow.Voice")
@js.native
open class Voice protected ()
  extends typings.vexflow.mod.Flow.Voice {
  def this(time: Beatvalue) = this()
}
object Voice {
  
  @JSImport("vextab", "Vex.Flow.Voice.Mode")
  @js.native
  object Mode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.vexflow.Vex.Flow.Voice.Mode & Double] = js.native
    
    /* 1 */ val FULL: typings.vexflow.Vex.Flow.Voice.Mode.FULL & Double = js.native
    
    /* 0 */ val SOFT: typings.vexflow.Vex.Flow.Voice.Mode.SOFT & Double = js.native
    
    /* 1 */ val STRICT: typings.vexflow.Vex.Flow.Voice.Mode.STRICT & Double = js.native
  }
}
