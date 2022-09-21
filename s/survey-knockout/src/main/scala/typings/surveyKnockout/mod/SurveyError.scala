package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "SurveyError")
@js.native
open class SurveyError () extends StObject {
  def this(text: String) = this()
  def this(text: String, errorOwner: ISurveyErrorOwner) = this()
  def this(text: Unit, errorOwner: ISurveyErrorOwner) = this()
  
  def equalsTo(error: SurveyError): Boolean = js.native
  
  /* protected */ def getDefaultText(): String = js.native
  
  def getErrorType(): String = js.native
  
  /* protected */ def getLocale(): String = js.native
  
  /* protected */ def getLocalizationString(locStrName: String): String = js.native
  
  def getText(): String = js.native
  
  def locText: LocalizableString = js.native
  
  var locTextValue: LocalizableString = js.native
  
  def onUpdateErrorTextCallback(error: SurveyError): Unit = js.native
  
  var text: String = js.native
  
  def updateText(): Unit = js.native
  
  var visible: Boolean = js.native
}
