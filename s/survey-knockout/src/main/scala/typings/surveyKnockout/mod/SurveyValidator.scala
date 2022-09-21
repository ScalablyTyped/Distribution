package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyValidator")
@js.native
open class SurveyValidator () extends Base {
  
  /* protected */ def createCustomError(name: String): SurveyError = js.native
  
  var errorOwner: ISurveyErrorOwner = js.native
  
  /* protected */ def getDefaultErrorText(name: String): String = js.native
  
  /* protected */ def getErrorText(name: String): String = js.native
  
  def getMarkdownHtml(text: String, name: String): String = js.native
  
  def getProcessedText(text: String): String = js.native
  
  def getRenderer(name: String): String = js.native
  
  def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def isAsync: Boolean = js.native
  
  def isRunning: Boolean = js.native
  
  def isValidateAllValues: Boolean = js.native
  
  def locText: LocalizableString = js.native
  
  def onAsyncCompleted(result: ValidatorResult): Unit = js.native
  
  def text: String = js.native
  def text_=(`val`: String): Unit = js.native
  
  def validate(value: Any): ValidatorResult = js.native
  def validate(value: Any, name: String): ValidatorResult = js.native
  def validate(value: Any, name: String, values: Any): ValidatorResult = js.native
  def validate(value: Any, name: String, values: Any, properties: Any): ValidatorResult = js.native
  def validate(value: Any, name: String, values: Unit, properties: Any): ValidatorResult = js.native
  def validate(value: Any, name: Unit, values: Any): ValidatorResult = js.native
  def validate(value: Any, name: Unit, values: Any, properties: Any): ValidatorResult = js.native
  def validate(value: Any, name: Unit, values: Unit, properties: Any): ValidatorResult = js.native
}
