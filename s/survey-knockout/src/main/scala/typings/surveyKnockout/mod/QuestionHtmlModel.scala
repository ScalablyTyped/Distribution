package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionHtmlModel")
@js.native
open class QuestionHtmlModel protected () extends QuestionNonValue {
  def this(name: String) = this()
  
  /*
    * Set html to display it
    */
  def html: String = js.native
  def html_=(`val`: String): Unit = js.native
  
  var ignoreHtmlProgressing: Boolean = js.native
  
  def locHtml: LocalizableString = js.native
  
  def processedHtml: String = js.native
}
