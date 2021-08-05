package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object surveyTimerFunctions {
  
  @JSImport("survey-knockout", "surveyTimerFunctions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearTimeout(timerId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(timerId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTimeout(func: js.Function0[js.Any]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(func.asInstanceOf[js.Any]).asInstanceOf[Double]
}
