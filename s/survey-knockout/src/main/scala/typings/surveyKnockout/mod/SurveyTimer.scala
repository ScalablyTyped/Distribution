package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyTimer")
@js.native
open class SurveyTimer () extends StObject {
  
  def doTimer(): Unit = js.native
  
  var listenerCounter: Double = js.native
  
  var onTimer: Event[js.Function0[Any], Any] = js.native
  
  def start(): Unit = js.native
  def start(func: Any): Unit = js.native
  
  def stop(): Unit = js.native
  def stop(func: Any): Unit = js.native
  
  var timerId: Double = js.native
}
/* static members */
object SurveyTimer {
  
  @JSImport("survey-knockout", "SurveyTimer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "SurveyTimer.instanceValue")
  @js.native
  def instanceValue: SurveyTimer = js.native
  inline def instanceValue_=(x: SurveyTimer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instanceValue")(x.asInstanceOf[js.Any])
}
