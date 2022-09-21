package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyTimerModel")
@js.native
open class SurveyTimerModel protected () extends Base {
  def this(survey: ISurvey) = this()
  
  def isRunning: Boolean = js.native
  
  def onCreating(): Unit = js.native
  
  def onTimer(page: PageModel): Unit = js.native
  
  var spent: Double = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
  
  def survey: ISurvey = js.native
  
  var surveyValue: ISurvey = js.native
  
  var text: String = js.native
  
  var timerFunc: Any = js.native
}
