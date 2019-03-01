package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: java.lang.String
  var description: java.lang.String
  var title: java.lang.String
}

object Anon_Container {
  @scala.inline
  def apply(container: java.lang.String, description: java.lang.String, title: java.lang.String): Anon_Container = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Container]
  }
}

