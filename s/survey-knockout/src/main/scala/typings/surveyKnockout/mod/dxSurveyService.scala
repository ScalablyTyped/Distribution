package typings.surveyKnockout.mod

import typings.std.File
import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "dxSurveyService")
@js.native
class dxSurveyService () extends StObject {
  
  def getResult(
    resultId: String,
    name: String,
    onGetResult: js.Function4[
      /* success */ Boolean, 
      /* data */ js.Any, 
      /* dataList */ js.Array[js.Any], 
      /* response */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  
  def getSurveyJsonAndIsCompleted(
    surveyId: String,
    clientId: String,
    onLoad: js.Function4[
      /* success */ Boolean, 
      /* surveyJson */ js.Any, 
      /* result */ String, 
      /* response */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  
  def isCompleted(
    resultId: String,
    clientId: String,
    onIsCompleted: js.Function3[/* success */ Boolean, /* result */ String, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def loadSurvey(
    surveyId: String,
    onLoad: js.Function3[/* success */ Boolean, /* result */ String, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def sendFile(
    postId: String,
    file: File,
    onSendFile: js.Function2[/* success */ Boolean, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def sendResult(
    postId: String,
    result: JSON,
    onSendResult: js.Function3[/* success */ Boolean, /* response */ js.Any, /* request */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def sendResult(
    postId: String,
    result: JSON,
    onSendResult: js.Function3[/* success */ Boolean, /* response */ js.Any, /* request */ js.UndefOr[js.Any], Unit],
    clientId: String
  ): Unit = js.native
  def sendResult(
    postId: String,
    result: JSON,
    onSendResult: js.Function3[/* success */ Boolean, /* response */ js.Any, /* request */ js.UndefOr[js.Any], Unit],
    clientId: String,
    isPartialCompleted: Boolean
  ): Unit = js.native
  def sendResult(
    postId: String,
    result: JSON,
    onSendResult: js.Function3[/* success */ Boolean, /* response */ js.Any, /* request */ js.UndefOr[js.Any], Unit],
    clientId: Unit,
    isPartialCompleted: Boolean
  ): Unit = js.native
}
/* static members */
object dxSurveyService {
  
  @JSImport("survey-knockout", "dxSurveyService")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("survey-knockout", "dxSurveyService.serviceUrl")
  @js.native
  def serviceUrl: String = js.native
  inline def serviceUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceUrl")(x.asInstanceOf[js.Any])
}
