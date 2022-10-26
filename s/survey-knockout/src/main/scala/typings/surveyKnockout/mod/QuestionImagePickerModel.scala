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
    * Specifies the type of content that choice items display.
    * 
    * Possible values:
    * 
    * - `"image"` - Images in one of the following formats: JPEG, GIF, PNG, APNG, SVG, BMP, ICO.
    * - `"video"` - Videos in one of the following formats: MP4, MOV, WMV, FLV, AVI, MKV.
    * - `"youtube"` - Links to YouTube videos.
    * - `"auto"` (default) - Selects one of the above based on the `imageLink` property value of each choice item.
    */
  def contentMode: String = js.native
  def contentMode_=(`val`: String): Unit = js.native
  
  var gapBetweenItems: Double = js.native
  
  /*
    * Specifies how to resize images or videos to fit them into their containers.
    * 
    * Refer to the [`object-fit`](https://developer.mozilla.org/en-US/docs/Web/CSS/object-fit) CSS property description for information on accepted values.
    */
  def imageFit: String = js.native
  def imageFit_=(`val`: String): Unit = js.native
  
  /*
    * Specifies the height of containers for images or videos. Accepts positive numbers and CSS values.
    * 
    * Default value: undefined
    * 
    * Use the `imageFit` property to specify how to fit the images or videos into their containers.
    */
  def imageHeight: Double = js.native
  def imageHeight_=(`val`: Double): Unit = js.native
  
  /*
    * Specifies the width of containers for images or videos. Accepts positive numbers and CSS values.
    * 
    * Default value: 200
    * 
    * Use the `imageFit` property to specify how to fit the images or videos into their containers.
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
    * Specifies whether users can select multiple images or videos.
    * 
    * Default value: `false`
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
    * Specifies whether to display labels under images or videos. Labels text are taken from the `text` property of each object in the `choices` array.
    */
  def showLabel: Boolean = js.native
  def showLabel_=(`val`: Boolean): Unit = js.native
}
