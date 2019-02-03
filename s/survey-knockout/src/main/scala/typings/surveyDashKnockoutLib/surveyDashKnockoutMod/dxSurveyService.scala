package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "dxSurveyService")
@js.native
class dxSurveyService () extends js.Object {
  def getResult(
    resultId: java.lang.String,
    name: java.lang.String,
    onGetResult: js.Function4[
      /* success */ scala.Boolean, 
      /* data */ js.Any, 
      /* dataList */ js.Array[_], 
      /* response */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getSurveyJsonAndIsCompleted(
    surveyId: java.lang.String,
    clientId: java.lang.String,
    onLoad: js.Function4[
      /* success */ scala.Boolean, 
      /* surveyJson */ js.Any, 
      /* result */ java.lang.String, 
      /* response */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def isCompleted(
    resultId: java.lang.String,
    clientId: java.lang.String,
    onIsCompleted: js.Function3[
      /* success */ scala.Boolean, 
      /* result */ java.lang.String, 
      /* response */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def loadSurvey(
    surveyId: java.lang.String,
    onLoad: js.Function3[
      /* success */ scala.Boolean, 
      /* result */ java.lang.String, 
      /* response */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def sendFile(
    postId: java.lang.String,
    file: stdLib.File,
    onSendFile: js.Function2[/* success */ scala.Boolean, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendResult(
    postId: java.lang.String,
    result: stdLib.JSON,
    onSendResult: js.Function2[/* success */ scala.Boolean, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def sendResult(
    postId: java.lang.String,
    result: stdLib.JSON,
    onSendResult: js.Function2[/* success */ scala.Boolean, /* response */ js.Any, scala.Unit],
    clientId: java.lang.String
  ): scala.Unit = js.native
  def sendResult(
    postId: java.lang.String,
    result: stdLib.JSON,
    onSendResult: js.Function2[/* success */ scala.Boolean, /* response */ js.Any, scala.Unit],
    clientId: java.lang.String,
    isPartialCompleted: scala.Boolean
  ): scala.Unit = js.native
}

/* static members */
@JSImport("survey-knockout", "dxSurveyService")
@js.native
object dxSurveyService extends js.Object {
  var serviceUrl: java.lang.String = js.native
}

