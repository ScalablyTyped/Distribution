package typings.surveyKnockout.mod

import typings.std.File
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "dxSurveyService")
@js.native
class dxSurveyService () extends js.Object {
  def getResult(
    resultId: String,
    name: String,
    onGetResult: js.Function4[
      /* success */ Boolean, 
      /* data */ js.Any, 
      /* dataList */ js.Array[_], 
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
}

/* static members */
@JSImport("survey-knockout", "dxSurveyService")
@js.native
object dxSurveyService extends js.Object {
  var serviceUrl: String = js.native
}

