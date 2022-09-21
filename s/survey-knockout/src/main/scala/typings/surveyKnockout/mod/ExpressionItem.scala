package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ExpressionItem")
@js.native
open class ExpressionItem ()
  extends Base
     with ILocalizableOwner {
  def this(expression: String) = this()
  
  /*
    * The expression property. If this expression returns true, then survey will use html property to show on complete page.
    */
  def expression: String = js.native
  def expression_=(`val`: String): Unit = js.native
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String, name: String): String = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /* CompleteClass */
  override def getRenderer(name: String): String = js.native
  
  /* CompleteClass */
  override def getRendererContext(locStr: LocalizableString): Any = js.native
  
  def locHtml: LocalizableString = js.native
  
  var locOwner: ILocalizableOwner = js.native
  
  def runCondition(values: Any, properties: Any): Boolean = js.native
}
