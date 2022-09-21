package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionSignaturePadModel")
@js.native
open class QuestionSignaturePadModel protected () extends Question {
  def this(name: String) = this()
  
  /*
    * Use it to clear content of the signature pad.
    */
  def allowClear: Boolean = js.native
  def allowClear_=(`val`: Boolean): Unit = js.native
  
  /*
    * Use it to set background color for the signature pad.
    */
  def backgroundColor: String = js.native
  def backgroundColor_=(`val`: String): Unit = js.native
  
  def canShowClearButton: Boolean = js.native
  
  /*
    * The clear signature button caption.
    */
  def clearButtonCaption: String = js.native
  
  /*
    * Use it to set the specific dataFormat for the signature pad image data.
    * formats: "" (default) - png, "image/jpeg" - jpeg, "image/svg+xml" - svg
    */
  var dataFormat: String = js.native
  
  def destroySignaturePad(el: Any): Unit = js.native
  
  def height: Double = js.native
  def height_=(`val`: Double): Unit = js.native
  
  def initSignaturePad(el: Any): Unit = js.native
  
  var isDrawingValue: Boolean = js.native
  
  def needShowPlaceholder(): Boolean = js.native
  
  /*
    * Use it to set pen color for the signature pad.
    */
  def penColor: String = js.native
  def penColor_=(`val`: String): Unit = js.native
  
  def placeHolderText: String = js.native
  
  /*
    * Use it to set the specific height for the signature pad.
    */
  def signatureHeight: Double = js.native
  def signatureHeight_=(`val`: Double): Unit = js.native
  
  /*
    * Use it to set the specific width for the signature pad.
    */
  def signatureWidth: Double = js.native
  def signatureWidth_=(`val`: Double): Unit = js.native
  
  /* protected */ def updateValue(): Unit = js.native
}
