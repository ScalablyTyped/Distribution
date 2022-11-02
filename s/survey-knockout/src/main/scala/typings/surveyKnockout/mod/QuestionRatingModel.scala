package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.auto
import typings.surveyKnockout.surveyKnockoutStrings.buttons
import typings.surveyKnockout.surveyKnockoutStrings.dropdown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "QuestionRatingModel")
@js.native
open class QuestionRatingModel protected () extends Question {
  def this(name: String) = this()
  
  def allowClear: Boolean = js.native
  
  /*
    * Specifies how a Rating question displays rate values.
    * 
    * Possible values:
    * 
    * - `"buttons"` - Displays rate values as buttons in a row.
    * - `"dropdown"` - Displays rate values as items in a drop-down list.
    * - `"auto"` (default) - Selects between the `"buttons"` and `"dropdown"` modes based on the available width. When the width is insufficient to display buttons, the question displays a dropdown.
    */
  var displayMode: dropdown | auto | buttons = js.native
  
  /*
    * Specifies whether to display `minRateDescription` and `maxRateDescription` values as captions for buttons that correspond to the extreme (first and last) rate values.
    * 
    * Default value: `false`
    * 
    * If this property is disabled, the `minRateDescription` and `maxRateDescription` values are displayed as plain non-clickable texts.
    * 
    * If any of the `minRateDescription` and `maxRateDescription` properties is empty, the corresponding rate value's `value` or `text` is displayed as a button caption.
    */
  var displayRateDescriptionsAsExtremeItems: Boolean = js.native
  
  def getControlClass(): String = js.native
  
  def getInputId(index: Double): String = js.native
  
  def getItemClass(item: ItemValue): String = js.native
  
  def hasMaxLabel: Boolean = js.native
  
  var hasMaxRateDescription: Boolean = js.native
  
  def hasMinLabel: Boolean = js.native
  
  var hasMinRateDescription: Boolean = js.native
  
  def locMaxRateDescription: LocalizableString = js.native
  
  def locMinRateDescription: LocalizableString = js.native
  
  def locPlaceholder: LocalizableString = js.native
  
  /*
    * Specifies a description for the maximum (last) rate value.
    */
  def maxRateDescription: String = js.native
  def maxRateDescription_=(`val`: String): Unit = js.native
  
  /*
    * Specifies a description for the minimum (first) rate value.
    */
  def minRateDescription: String = js.native
  def minRateDescription_=(`val`: String): Unit = js.native
  
  def placeholder: String = js.native
  def placeholder_=(`val`: String): Unit = js.native
  
  /*
    * Specifies the last rate value in the generated sequence of rate values. Applies if the `rateValues` array is empty.
    * 
    * Default value: 5
    */
  def rateMax: Double = js.native
  def rateMax_=(`val`: Double): Unit = js.native
  
  /*
    * Specifies the first rate value in the generated sequence of rate values. Applies if the `rateValues` array is empty.
    * 
    * Default value: 1
    */
  def rateMin: Double = js.native
  def rateMin_=(`val`: Double): Unit = js.native
  
  /*
    * Specifies a step with which to generate rate values. Applies if the `rateValues` array is empty.
    * 
    * Default value: 1
    */
  def rateStep: Double = js.native
  def rateStep_=(`val`: Double): Unit = js.native
  
  /*
    * A list of rate values.
    * 
    * This property accepts an array of objects with the following structure:
    * 
    * ```js
    * {
    *   "value": any, // A value to be saved in survey results
    *   "text": String, // A display text. This property supports Markdown. When `text` is undefined, `value` is used.
    * }
    * ```
    * 
    * If you need to specify only the `value` property, you can set the `rateValues` property to an array of numbers, for example, `[ 3, 6, 10 ]`. These values are both saved in survey results and used as display text.
    * 
    * If you do not specify the `rateValues` property, rate values are generated automatically based upon the `rateMin`, `rateMax`, and `rateStep` property values.
    */
  def rateValues: Any = js.native
  def rateValues_=(`val`: Any): Unit = js.native
  
  def ratingRootCss: String = js.native
  
  def readOnlyText: Any = js.native
  
  var renderedRateItems: Any = js.native
  
  def renderedValue: Boolean = js.native
  def renderedValue_=(`val`: Boolean): Unit = js.native
  
  def setValueFromClick(value: Any): Unit = js.native
  
  def visibleChoices: Any = js.native
  
  def visibleRateValues: Any = js.native
}
