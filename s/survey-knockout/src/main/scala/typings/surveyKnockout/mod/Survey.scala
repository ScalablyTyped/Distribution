package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Survey")
@js.native
class Survey () extends SurveyModel {
  def this(jsonObj: js.Any) = this()
  def this(jsonObj: js.Any, renderedElement: js.Any) = this()
  def this(jsonObj: Unit, renderedElement: js.Any) = this()
  def this(jsonObj: js.Any, renderedElement: js.Any, css: js.Any) = this()
  def this(jsonObj: js.Any, renderedElement: Unit, css: js.Any) = this()
  def this(jsonObj: Unit, renderedElement: js.Any, css: js.Any) = this()
  def this(jsonObj: Unit, renderedElement: Unit, css: js.Any) = this()
  
  var dummyObservable: js.Any = js.native
  
  /* protected */ def getHtmlTemplate(): String = js.native
  
  var koAfterRenderHeader: js.Any = js.native
  
  var koAfterRenderPage: js.Any = js.native
  
  var koCompletedState: js.Any = js.native
  
  var koCompletedStateCss: js.Any = js.native
  
  var koCompletedStateText: js.Any = js.native
  
  var koCurrentPage: js.Any = js.native
  
  def koEventAfterRender(element: js.Any, survey: js.Any): Unit = js.native
  
  var koIsFirstPage: js.Any = js.native
  
  var koIsLastPage: js.Any = js.native
  
  var koState: js.Any = js.native
  
  var koTimerInfoText: js.Any = js.native
  
  var koTitleTemplate: js.Any = js.native
  
  def loadSurveyFromService(surveyId: String, clientId: String, renderedElement: js.Any): Unit = js.native
  def loadSurveyFromService(surveyId: String, clientId: Unit, renderedElement: js.Any): Unit = js.native
  def loadSurveyFromService(surveyId: Unit, clientId: String, renderedElement: js.Any): Unit = js.native
  def loadSurveyFromService(surveyId: Unit, clientId: Unit, renderedElement: js.Any): Unit = js.native
  
  def nextPageMouseDown(): Boolean = js.native
  
  def nextPageUIClick(): Unit = js.native
  
  def render(): Unit = js.native
  def render(element: js.Any): Unit = js.native
  
  def updateSurvey(newProps: js.Any): Unit = js.native
  def updateSurvey(newProps: js.Any, oldProps: js.Any): Unit = js.native
}
/* static members */
object Survey {
  
  @JSImport("survey-knockout", "Survey")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "Survey.cssType")
  @js.native
  def cssType: String = js.native
  inline def cssType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cssType")(x.asInstanceOf[js.Any])
}
