package typings
package atUirouterAngularjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var component: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Component {
  @scala.inline
  def apply(component: java.lang.String = null, template: java.lang.String = null): Anon_Component = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[Anon_Component]
  }
}

