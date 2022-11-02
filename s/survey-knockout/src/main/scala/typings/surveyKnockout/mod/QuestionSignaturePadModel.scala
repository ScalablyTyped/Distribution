package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionSignaturePadModel")
@js.native
open class QuestionSignaturePadModel protected () extends Question {
  def this(name: String) = this()
  
  /*
    * Specifies whether to display a button that clears the signature area.
    * 
    * Default value: `true`
    */
  def allowClear: Boolean = js.native
  def allowClear_=(`val`: Boolean): Unit = js.native
  
  /*
    * Specifies a color for the signature area background.  Accepts hexadecimal colors (`"#FF0000"`), RGB colors (`"rgb(255,0,0)"`), or color names (`"red"`).
    */
  def backgroundColor: String = js.native
  def backgroundColor_=(`val`: String): Unit = js.native
  
  def canShowClearButton: Boolean = js.native
  
  def clearButtonCaption: String = js.native
  
  /*
    * Specifies the format in which to store the signature image.
    * 
    * Possible values:
    * 
    * - `""` (default) - PNG
    * - `"image/jpeg"` - JPEG
    * - `"image/svg+xml"` - SVG
    */
  var dataFormat: String = js.native
  
  def destroySignaturePad(el: Any): Unit = js.native
  
  def height: Double = js.native
  def height_=(`val`: Double): Unit = js.native
  
  def initSignaturePad(el: Any): Unit = js.native
  
  var isDrawingValue: Boolean = js.native
  
  def needShowPlaceholder(): Boolean = js.native
  
  /*
    * Specifies a color for the pen. Accepts hexadecimal colors (`"#FF0000"`), RGB colors (`"rgb(255,0,0)"`), or color names (`"red"`).
    */
  def penColor: String = js.native
  def penColor_=(`val`: String): Unit = js.native
  
  def placeHolderText: String = js.native
  
  /*
    * Specifies the height of the signature area. Accepts positive integer numbers.
    */
  def signatureHeight: Double = js.native
  def signatureHeight_=(`val`: Double): Unit = js.native
  
  /*
    * Specifies the width of the signature area. Accepts positive integer numbers.
    */
  def signatureWidth: Double = js.native
  def signatureWidth_=(`val`: Double): Unit = js.native
  
  /* protected */ def updateValue(): Unit = js.native
}
