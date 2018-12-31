package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionImagePickerModel")
@js.native
class QuestionImagePickerModel protected () extends QuestionCheckboxBase {
  def this(name: java.lang.String) = this()
  /**
    * The content mode.
    */
  var contentMode: java.lang.String = js.native
  /**
    * The image fit mode.
    */
  var imageFit: java.lang.String = js.native
  /**
    * The image height.
    */
  var imageHeight: java.lang.String = js.native
  /**
    * The image width.
    */
  var imageWidth: java.lang.String = js.native
  /**
    * Multi select option. If set to true, then allows to select multiple images.
    */
  var multiSelect: scala.Boolean = js.native
  /**
    * Show label under the image.
    */
  var showLabel: scala.Boolean = js.native
}

