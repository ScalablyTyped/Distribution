package typings.surveyKnockout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionImagePickerModel")
@js.native
class QuestionImagePickerModel protected () extends QuestionCheckboxBase {
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
    * The image width.
    */
  var imageWidth: String = js.native
  /**
    * Multi select option. If set to true, then allows to select multiple images.
    */
  var multiSelect: Boolean = js.native
  /**
    * Show label under the image.
    */
  var showLabel: Boolean = js.native
  /**
    * Returns true if item is checked
    * @param item image picker item value
    */
  def isItemSelected(item: ItemValue): Boolean = js.native
}

