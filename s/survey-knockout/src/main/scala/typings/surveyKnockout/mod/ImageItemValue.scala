package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ImageItemValue")
@js.native
class ImageItemValue protected ()
  extends ItemValue
     with ILocalizableOwner {
  def this(value: js.Any) = this()
  def this(value: js.Any, text: String) = this()
  def this(value: js.Any, text: String, typeName: String) = this()
  def this(value: js.Any, text: Unit, typeName: String) = this()
  
  /* InferMemberOverrides */
  override def getLocale(): String = js.native
  
  /* CompleteClass */
  override def getMarkdownHtml(text: String): String = js.native
  
  /* CompleteClass */
  override def getProcessedText(text: String): String = js.native
  
  /**
    * The image or video link property.
    */
  var imageLink: String = js.native
  
  val locImageLink: LocalizableString = js.native
}
