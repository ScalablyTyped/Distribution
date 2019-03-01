package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ButtonButtonCollapsed extends js.Object {
  var button: java.lang.String
  var buttonCollapsed: java.lang.String
  var buttonExpanded: java.lang.String
  var root: java.lang.String
  var title: java.lang.String
}

object Anon_ButtonButtonCollapsed {
  @scala.inline
  def apply(
    button: java.lang.String,
    buttonCollapsed: java.lang.String,
    buttonExpanded: java.lang.String,
    root: java.lang.String,
    title: java.lang.String
  ): Anon_ButtonButtonCollapsed = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("button")(button)
    __obj.updateDynamic("buttonCollapsed")(buttonCollapsed)
    __obj.updateDynamic("buttonExpanded")(buttonExpanded)
    __obj.updateDynamic("root")(root)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_ButtonButtonCollapsed]
  }
}

