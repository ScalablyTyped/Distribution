package typings.uirouterAngularjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponent extends js.Object {
  var component: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object AnonComponent {
  @scala.inline
  def apply(component: String = null, template: String = null): AnonComponent = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponent]
  }
}

