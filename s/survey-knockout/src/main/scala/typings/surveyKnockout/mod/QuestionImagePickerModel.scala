package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.checkbox
import typings.surveyKnockout.surveyKnockoutStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionImagePickerModel")
@js.native
open class QuestionImagePickerModel protected () extends QuestionCheckboxBase {
  def this(name: String) = this()
  
  var _width: Double = js.native
  
  /*
    * The content mode.
    */
  def contentMode: String = js.native
  def contentMode_=(`val`: String): Unit = js.native
  
  var gapBetweenItems: Double = js.native
  
  /*
    * The image fit mode.
    */
  def imageFit: String = js.native
  def imageFit_=(`val`: String): Unit = js.native
  
  /*
    * The image height.
    */
  def imageHeight: Double = js.native
  def imageHeight_=(`val`: Double): Unit = js.native
  
  /*
    * The image width.
    */
  def imageWidth: Double = js.native
  def imageWidth_=(`val`: Double): Unit = js.native
  
  def inputType: checkbox | radio = js.native
  
  var isResponsiveValue: Boolean = js.native
  
  var maxImageHeight: Double = js.native
  
  var maxImageWidth: Double = js.native
  
  var minImageHeight: Double = js.native
  
  var minImageWidth: Double = js.native
  
  /*
    * Multi select option. If set to true, then allows to select multiple images.
    */
  def multiSelect: Boolean = js.native
  def multiSelect_=(`val`: Boolean): Unit = js.native
  
  def onContentLoaded(item: ImageItemValue, event: Any): Unit = js.native
  
  def renderedImageHeight: String = js.native
  
  def renderedImageWidth: String = js.native
  
  var responsiveColCount: Double = js.native
  
  var responsiveImageHeight: Double = js.native
  
  var responsiveImageWidth: Double = js.native
  
  /*
    * Show label under the image.
    */
  def showLabel: Boolean = js.native
  def showLabel_=(`val`: Boolean): Unit = js.native
}
