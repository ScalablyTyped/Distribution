package typings.victoryCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.victoryCore.anon.AnimationTimer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilTimerContextMod extends Shortcut {
  
  /**
    * The React context object consumers may use to access or override the global
    * timer.
    */
  @JSImport("victory-core/lib/victory-util/timer-context", JSImport.Default)
  @js.native
  val default: Context[AnimationTimer] = js.native
  
  type _To = Context[AnimationTimer]
  
  /* This means you don't have to write `default`, but can instead just say `libVictoryUtilTimerContextMod.foo` */
  override def _to: Context[AnimationTimer] = default
}
