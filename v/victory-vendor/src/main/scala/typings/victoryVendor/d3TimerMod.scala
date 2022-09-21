package typings.victoryVendor

import typings.d3Timer.mod.Timer_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object d3TimerMod {
  
  @JSImport("victory-vendor/d3-timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def interval(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("interval")(callback.asInstanceOf[js.Any]).asInstanceOf[Timer_]
  inline def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def interval(callback: js.Function1[/* elapsed */ Double, Unit], delay: Unit, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("interval")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def timeout(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(callback.asInstanceOf[js.Any]).asInstanceOf[Timer_]
  inline def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def timeout(callback: js.Function1[/* elapsed */ Double, Unit], delay: Unit, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  
  inline def timer(callback: js.Function1[/* elapsed */ Double, Unit]): Timer_ = ^.asInstanceOf[js.Dynamic].applyDynamic("timer")(callback.asInstanceOf[js.Any]).asInstanceOf[Timer_]
  inline def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Double, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  inline def timer(callback: js.Function1[/* elapsed */ Double, Unit], delay: Unit, time: Double): Timer_ = (^.asInstanceOf[js.Dynamic].applyDynamic("timer")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Timer_]
  
  inline def timerFlush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timerFlush")().asInstanceOf[Unit]
}
