package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionImageModel")
@js.native
open class QuestionImageModel protected () extends QuestionNonValue {
  def this(name: String) = this()
  
  /*
    * Specifies a value for the `alt` attribute of the underlying `<img>` element.
    */
  def altText: String = js.native
  def altText_=(`val`: String): Unit = js.native
  
  /* protected */ def calculateRenderedMode(): Unit = js.native
  
  /*
    * Specifies the type of content that the Image question displays.
    * 
    * Possible values:
    * 
    * - `"image"` - An image in one of the following formats: JPEG, GIF, PNG, APNG, SVG, BMP, ICO.
    * - `"video"` - A video in one of the following formats: MP4, MOV, WMV, FLV, AVI, MKV.
    * - `"youtube"` - A link to a YouTube video.
    * - `"auto"` (default) - Selects one of the above based on the [`imageLink`](https://surveyjs.io/form-library/documentation/questionimagemodel#imageLink) property.
    */
  def contentMode: String = js.native
  def contentMode_=(`val`: String): Unit = js.native
  
  def getImageCss(): String = js.native
  
  /*
    * Specifies how to resize the image or video to fit it into its container.
    * 
    * Refer to the [`object-fit`](https://developer.mozilla.org/en-US/docs/Web/CSS/object-fit) CSS property description for information on accepted values.
    */
  def imageFit: String = js.native
  def imageFit_=(`val`: String): Unit = js.native
  
  /*
    * Specifies the height of a container for the image or video. Accepts positive numbers and CSS values.
    * 
    * Default value: 150
    * 
    * Use the `imageFit` property to specify how to fit the image or video into the container.
    */
  def imageHeight: String = js.native
  def imageHeight_=(`val`: String): Unit = js.native
  
  /*
    * Specifies an image or video URL.
    */
  def imageLink: String = js.native
  def imageLink_=(`val`: String): Unit = js.native
  
  /*
    * Specifies the width of a container for the image or video. Accepts positive numbers and CSS values.
    * 
    * Default value: 200
    * 
    * Use the `imageFit` property to specify how to fit the image or video into the container.
    */
  def imageWidth: String = js.native
  def imageWidth_=(`val`: String): Unit = js.native
  
  def locAltText: LocalizableString = js.native
  
  def locImageLink: LocalizableString = js.native
  
  def renderedHeight: String = js.native
  
  /*
    * Returns the type of content that the Image question displays: `"image"`, `"video"`, or `"youtube"`.
    */
  def renderedMode: String = js.native
  
  def renderedWidth: String = js.native
}
