package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "ImageItemValue")
@js.native
open class ImageItemValue protected () extends ItemValue {
  def this(value: Any) = this()
  def this(value: Any, text: String) = this()
  def this(value: Any, text: String, typeName: String) = this()
  def this(value: Any, text: Unit, typeName: String) = this()
  
  var aspectRatio: Double = js.native
  
  /*
    * The image or video link property.
    */
  def imageLink: String = js.native
  def imageLink_=(`val`: String): Unit = js.native
  
  def locImageLink: LocalizableString = js.native
}
