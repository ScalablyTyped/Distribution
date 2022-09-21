package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "Survey")
@js.native
open class Survey () extends SurveyModel {
  def this(jsonObj: Any) = this()
  def this(jsonObj: Any, renderedElement: Any) = this()
  def this(jsonObj: Unit, renderedElement: Any) = this()
  
  def getHtmlTemplate(): String = js.native
  
  var implementor: SurveyImplementor = js.native
  
  def makeReactive(obj: Any): Unit = js.native
}
