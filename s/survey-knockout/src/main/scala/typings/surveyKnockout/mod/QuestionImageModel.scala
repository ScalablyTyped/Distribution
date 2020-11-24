package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionImageModel")
@js.native
class QuestionImageModel protected () extends QuestionNonValue {
  def this(name: String) = this()
  
  /**
    * The content mode.
    */
  var contentMode: String = js.native
  
  /**
    * The image fit mode.
    */
  var imageFit: String = js.native
  
  /**
    * The image height.
    */
  var imageHeight: String = js.native
  
  /**
    * The image URL.
    */
  var imageLink: String = js.native
  
  /**
    * The image width.
    */
  var imageWidth: String = js.native
  
  val locImageLink: LocalizableString = js.native
}
