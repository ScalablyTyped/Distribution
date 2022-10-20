package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionImageModel")
@js.native
open class QuestionImageModel protected () extends QuestionNonValue {
  def this(name: String) = this()
  
  /*
    * The image alt text.
    */
  def altText: String = js.native
  def altText_=(`val`: String): Unit = js.native
  
  /* protected */ def calculateRenderedMode(): Unit = js.native
  
  /*
    * The content mode.
    */
  def contentMode: String = js.native
  def contentMode_=(`val`: String): Unit = js.native
  
  def getImageCss(): String = js.native
  
  /*
    * The image fit mode.
    */
  def imageFit: String = js.native
  def imageFit_=(`val`: String): Unit = js.native
  
  /*
    * The image height.
    */
  def imageHeight: String = js.native
  def imageHeight_=(`val`: String): Unit = js.native
  
  /*
    * The image URL.
    */
  def imageLink: String = js.native
  def imageLink_=(`val`: String): Unit = js.native
  
  /*
    * The image width.
    */
  def imageWidth: String = js.native
  def imageWidth_=(`val`: String): Unit = js.native
  
  def locAltText: LocalizableString = js.native
  
  def locImageLink: LocalizableString = js.native
  
  def renderedHeight: String = js.native
  
  /*
    * The rendered mode.
    */
  def renderedMode: String = js.native
  
  def renderedWidth: String = js.native
}
