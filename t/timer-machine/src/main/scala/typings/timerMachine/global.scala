package typings.timerMachine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Timer {
    
    @JSGlobal("Timer")
    @js.native
    class ^ ()
      extends typings.timerMachine.mod.^ {
      def this(started: Boolean) = this()
    }
    
    @JSGlobal("Timer")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def destroy(reference: String): typings.timerMachine.mod.Timer = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(reference.asInstanceOf[js.Any]).asInstanceOf[typings.timerMachine.mod.Timer]
    
    /* static member */
    inline def get(reference: String): typings.timerMachine.mod.Timer = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(reference.asInstanceOf[js.Any]).asInstanceOf[typings.timerMachine.mod.Timer]
  }
}
