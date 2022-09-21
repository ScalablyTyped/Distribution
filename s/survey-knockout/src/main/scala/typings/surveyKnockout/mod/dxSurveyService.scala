package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "dxSurveyService")
@js.native
open class dxSurveyService () extends StObject {
  
  def getResult(
    resultId: String,
    name: String,
    onGetResult: js.Function4[/* success */ Boolean, /* data */ Any, /* dataList */ Any, /* response */ Any, Unit]
  ): Unit = js.native
  
  def getSurveyJsonAndIsCompleted(
    surveyId: String,
    clientId: String,
    onLoad: js.Function4[
      /* success */ Boolean, 
      /* surveyJson */ Any, 
      /* result */ String, 
      /* response */ Any, 
      Unit
    ]
  ): Unit = js.native
  
  def isCompleted(
    resultId: String,
    clientId: String,
    onIsCompleted: js.Function3[/* success */ Boolean, /* result */ String, /* response */ Any, Unit]
  ): Unit = js.native
  
  def loadSurvey(
    surveyId: String,
    onLoad: js.Function3[/* success */ Boolean, /* result */ String, /* response */ Any, Unit]
  ): Unit = js.native
  
  def sendFile(
    postId: String,
    file: Any,
    onSendFile: js.Function2[/* success */ Boolean, /* response */ Any, Unit]
  ): Unit = js.native
  
  def sendResult(
    postId: String,
    result: Any,
    onSendResult: js.Function3[/* success */ Boolean, /* response */ Any, /* request */ js.UndefOr[Any], Unit]
  ): Unit = js.native
  def sendResult(
    postId: String,
    result: Any,
    onSendResult: js.Function3[/* success */ Boolean, /* response */ Any, /* request */ js.UndefOr[Any], Unit],
    clientId: String
  ): Unit = js.native
  def sendResult(
    postId: String,
    result: Any,
    onSendResult: js.Function3[/* success */ Boolean, /* response */ Any, /* request */ js.UndefOr[Any], Unit],
    clientId: String,
    isPartialCompleted: Boolean
  ): Unit = js.native
  def sendResult(
    postId: String,
    result: Any,
    onSendResult: js.Function3[/* success */ Boolean, /* response */ Any, /* request */ js.UndefOr[Any], Unit],
    clientId: Unit,
    isPartialCompleted: Boolean
  ): Unit = js.native
}
