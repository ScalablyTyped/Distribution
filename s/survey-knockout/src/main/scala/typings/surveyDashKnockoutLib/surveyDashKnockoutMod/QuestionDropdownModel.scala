package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionDropdownModel")
@js.native
class QuestionDropdownModel protected () extends QuestionSelectBase {
  def this(name: java.lang.String) = this()
  /**
    * Use this and choicesMax property to automatically add choices. For example choicesMin = 1 and choicesMax = 10 will generate ten additional choices from 1 to 10.
    * @see choicesMin
    * @see choicesStep
    */
  var choicesMax: scala.Double = js.native
  /**
    * Use this and choicesMax property to automatically add choices. For example choicesMin = 1 and choicesMax = 10 will generate ten additional choices from 1 to 10.
    * @see choicesMax
    * @see choicesStep
    */
  var choicesMin: scala.Double = js.native
  /**
    * The default value is 1. It tells the value of the iterator between choicesMin and choicesMax properties.
    * If choicesMin = 10, choicesMax = 30 and choicesStep = 10 then you will have only three additional choices: [10, 20, 30].
    * @see choicesMin
    * @see choicesMax
    */
  var choicesStep: scala.Double = js.native
  val locOptionsCaption: LocalizableString = js.native
  /**
    * Use this property to set the options caption different from the default value. The default value is taken from localization strings.
    */
  var optionsCaption: java.lang.String = js.native
  val selectedItem: ItemValue = js.native
  /**
    * This flag controls whether to show options caption item ('Choose...').
    */
  var showOptionsCaption: scala.Boolean = js.native
}

