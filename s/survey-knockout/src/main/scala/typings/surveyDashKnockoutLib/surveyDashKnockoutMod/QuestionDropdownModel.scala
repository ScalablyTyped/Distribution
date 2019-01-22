package typings
package surveyDashKnockoutLib.surveyDashKnockoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("survey-knockout", "QuestionDropdownModel")
@js.native
class QuestionDropdownModel protected () extends QuestionSelectBase {
  def this(name: java.lang.String) = this()
  val locOptionsCaption: LocalizableString = js.native
  /**
    * Use this property to set the options caption different from the default value. The default value is taken from localization strings.
    */
  var optionsCaption: java.lang.String = js.native
  /**
    * This flag controls whether to show options caption item ('Choose...').
    */
  var showOptionsCaption: scala.Boolean = js.native
}

